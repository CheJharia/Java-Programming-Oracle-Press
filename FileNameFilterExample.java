import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilterExample {

	public static void main(String[] args) {
		File folder = new File("/Users/afiqjohari/Documents/workspace/JavaProgrammingOraclePress/src");
		String[] list = folder.list(new FilenameFilter() {
			
			public boolean accept(File folder, String fileName) {
				return fileName.endsWith(".java");
			}
		});
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
