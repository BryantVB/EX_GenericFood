package view;

import java.io.IOException;

import controller.LeitorDados;

public class main {
	public static void main(String[] args) {
		String path = "C:\\TEMP\\";
		String file_name = "generic_food.csv";
		LeitorDados leitor = new LeitorDados();
		try {
			leitor.readFile(path, file_name);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}