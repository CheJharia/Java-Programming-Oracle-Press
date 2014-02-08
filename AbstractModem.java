
// an abstract class allow us to provide the partial implementation
// of the implementing interface
// therefore, leaving the rest of the implementation to another
// Since the class has not implemented all necessary implementations
// we can't instantiate this class
abstract class AbstractModem implements Modem {

	public int read() {
		int bytesRead = 0;
		// some implementation
		return bytesRead;
	}

	public int write(byte[] buffer) {
		int bytesWritten = 0;
		// some implementation
		return bytesWritten;
	}
	
	

}
