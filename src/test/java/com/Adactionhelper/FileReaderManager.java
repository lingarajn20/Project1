package com.Adactionhelper;

public class FileReaderManager {

	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstanceFR() {
		FileReaderManager helper = new FileReaderManager();
		return helper;
	}
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}
}
