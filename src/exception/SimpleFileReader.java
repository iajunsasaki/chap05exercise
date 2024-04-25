package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SimpleFileReader {
	private ArrayList<String> lines = new ArrayList<>();
	
	public void readTextFile(String path) {
		try {
			String line;
			FileReader fileReader = new FileReader("users.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			line = bufferedReader.readLine();
			while (line != null) {
				lines.add(line);
				line = bufferedReader.readLine();
			}
		}
		catch (Exception exception) {
			// 例外が発生した場所を表示
			exception.printStackTrace();
		}
	}
	
	public ArrayList<String> getLines() {
		return this.lines;
	}

	/**
	 * 
	 * @param path 出力先
	 */
	public void writeTextFile(String path) {
		// ワンモアマイル。中身を書いてください
	}
}
