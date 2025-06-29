package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "E:\\Programação//in.txt";
		
		try (BufferedReader bufferReader = new BufferedReader(new FileReader(path))){
			
			//bufferReader = new BufferedReader(new FileReader(path));
			
			String line = bufferReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferReader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}
}