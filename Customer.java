import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/*
 * This class is used by ExternalizableTestApp
 */

class Customer implements Externalizable {
	private int id;
	private String creditCard;
	private static Cipher cipher;
	private static SecretKeySpec skeySpec;

	static {
		try {
			createCipher();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public String getCreditCard() {
		return creditCard;
	}

	public int getId() {
		return id;
	}

	public Customer() {
		id = 0;
		creditCard = "";
	}

	public Customer(int id, String ccNumber) {
		this.id = id;
		this.creditCard = ccNumber;
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		try {
			out.write(id);
			encrypt();
			out.writeUTF(creditCard);
			System.out.println("After ecryption: ");
			System.out.println("ID: " + id + " CC:" + creditCard);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		try {
			id = in.read();
			String str = in.readUTF();
			decrypt(str);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static void createCipher() throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		kgen.init(128);
		// Generate the secret key specs.
		SecretKey skey = kgen.generateKey();
		byte[] raw = skey.getEncoded();
		skeySpec = new SecretKeySpec(raw, "AES");
		// Instantiate the cipher
		cipher = Cipher.getInstance("AES");
	}

	private void encrypt() throws Exception {
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
		byte[] buff = cipher.doFinal(creditCard.getBytes());
		creditCard = new String(buff);
	}

	private void decrypt(String str) throws Exception {
		cipher.init(Cipher.DECRYPT_MODE, skeySpec);
		byte[] buff = cipher.doFinal(str.getBytes());
		creditCard = new String(buff);

	}

}
