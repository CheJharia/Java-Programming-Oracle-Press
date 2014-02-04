public class Asset {
	private int id;
	private String type;

	public Asset() {
		System.out.println("Creating Asset ...");
	}

	public Asset(int id, String type) {
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void printDescription() {
		System.out.println("\tAsset ID: " + id);
		System.out.println("\tAsset type: " + type);
	}

	public float getNetWorth() {
		return 0;
	}

}
