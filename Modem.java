interface Modem {
	public boolean open();

	public boolean close();

	public int read();

	public int write(byte[] buffer);
}
