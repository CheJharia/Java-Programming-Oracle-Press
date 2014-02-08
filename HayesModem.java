public class HayesModem implements Modem {

	public boolean open() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}

	public int read() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int write(byte[] buffer) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		Modem modem = new HayesModem();
		modem.open();
		byte[] buffer = null;
		modem.write(buffer);
		modem.read();
		modem.close();
	}
}
