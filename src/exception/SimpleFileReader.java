package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SimpleFileReader {
	private ArrayList<String> lines = new ArrayList<>();
	
	public void readTextFile(String path) {
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {//closeを自動的にするようにリソースを宣言
			String line;//line宣言
			line = bufferedReader.readLine();//読み込んだ文字列をlineに入れてる、ilneをnullにしないようにする。
			while (line != null) {//linesリストにlineをすべて代入
				lines.add(line);
				line = bufferedReader.readLine();
			}
		}
		catch (Exception exception) {
			// 例外が発生した場所を表示
			exception.printStackTrace();//エラーの場所内容
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
