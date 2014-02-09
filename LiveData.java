import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class LiveData {
	private ByteArrayOutputStream outStream;

	public static void main(String[] args) {
		LiveData app = new LiveData();
		// In real life situation, the createData() would
		// belong to a server process and the readData() to a
		// client program
		app.createData();
		app.readData();
		app.writeData();
	}

	/*
	 * creates an instance of ByteArrayOutputStream and copies its reference to
	 * a class variable for use by the readData method. We then build a
	 * DataOutputStream on top of outStream.
	 */
	private void createData() {
		try {

			outStream = new ByteArrayOutputStream();
			DataOutputStream writer = new DataOutputStream(outStream);
			for (int i = 0; i < 10; i++) {
				Trade lastTrade = new Trade(i);
				writer.writeInt(lastTrade.scripCode);
				writer.write(lastTrade.time);
				writer.writeDouble(lastTrade.bid);
				writer.writeDouble(lastTrade.offer);
				writer.writeDouble(lastTrade.high);
				writer.writeDouble(lastTrade.low);
				writer.writeDouble(lastTrade.quantity);
			}
		} catch (Exception e) {
			System.out.println("Error while writing data to buffer");
		}
	}

	/*
	 * create an instance of the ByteArrayInputStream on the byte array obtained
	 * from the outstream. Open a DataInputStream on top of it to read the data
	 * by using the higher-level data-read functions
	 */
	private void readData() {
		byte[] timeBuffer = new byte[8];
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb, Locale.US);
		ByteArrayInputStream inStream = new ByteArrayInputStream(
				outStream.toByteArray());
		DataInputStream reader = new DataInputStream(inStream);
		try {
			for (int i = 0; i < 10; i++) {
				int scripCode = reader.readInt();
				reader.read(timeBuffer);
				String time = new String(timeBuffer);
				double bid = reader.readDouble();
				double offer = reader.readDouble();
				double high = reader.readDouble();
				double low = reader.readDouble();
				long volume = reader.readLong();

				formatter.format("ScripCode: %2d" + "\tTime: %s "
						+ "\tBid:$  %05.2f" + "\tOffer:$  %05.2f"
						+ "\tHigh:$  %05.2f" + "\tLow:$  %05.2f"
						+ "\tVolume: %d ", scripCode, time, bid, offer, high,
						low, volume);
				System.out.println(sb);
				sb.delete(0, sb.length());

			}
		} catch (Exception e) {
			System.out.println("Error while reading data");
		}
	}

	private void writeData() {
		try {
			FileOutputStream f = new FileOutputStream("TradeData.dat");
			outStream.writeTo(f);
			f.close();
			System.out.println("Successfully create and write data to: TradeData.dat ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private class Trade {
		private int scripCode;
		private byte[] time;
		private double bid, offer, high, low;
		private long quantity;

		public Trade(int i) {
			scripCode = i + 1;
			time = now("hh:mm:ss").getBytes();
			bid = Math.random() * 100;
			offer = Math.random() * 100;
			high = Math.random() * 100;
			low = Math.random() * 100;
			quantity = (long) (Math.random() * 100000000);
		}

		private String now(String dateFormat) {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			return sdf.format(cal.getTime());
		}

	}
}
