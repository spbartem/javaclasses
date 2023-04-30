package level1.linux.myls.com.company;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		String path;
		if (args.length == 0) {
			path = System.getProperty("user.dir");
		} else {
			path = args[0];
		}
		showListOfFiles(path);
	}

	public static void showListOfFiles(String path) {
		File folder = new File(path);
		for (File file : folder.listFiles()) {
			System.out.println(file.getName());
		}
	}
}
