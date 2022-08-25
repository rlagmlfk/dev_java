package com.test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest_test {

	public void output() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("test.txt", true);
			fw.write(97);
			fw.write(65);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		FileTest_test ft = new FileTest_test();
		ft.output();
	}

}
