package controller;

import java.io.File;

public class DatabaseController {
	
	private void verifMainDir() {
		String path = "C:\\CRUD";
		File dir = new File(path);
		if(!dir.exists() && !dir.isDirectory()) {
			if(dir.mkdir()) {
				System.out.println("Dir create success!");
			}else {
				System.err.println("Error in dir create!");
			}
		}
	}
}
