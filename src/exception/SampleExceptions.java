package exception;

import java.util.ArrayList;

public class SampleExceptions {
	public static void main(String[] args) {
		// 演習１－４：色んな種類のException、try/catch
		// 演習１：try/catch。演習２－４のコードをtry/catch文で囲んでみてください。
		// 演習２：なぜ例外が起きるか原因を調べてください。そして8行目を変更することにより
		//         エラーが発生しないようにしてください
		try {
			//String nullString = null;
			// null以外の２文字以上にするとエラー回避
			// 中身がnullの変数でメソッド呼び出し、変数アクセスするとNullPointerException!
			String nullString = "XXここから表示される";
			System.out.println(cookString(nullString));
			
			// 演習３：なぜ例外が起きるか原因を調べてください。そして13行目を変更することにより
			//         エラーが発生しないようにしてください
			// null以外の２文字以上にするとエラー回避
			//String oneCharString = "a";
			String oneCharString = "aaエラー起きません";
			System.out.println(cookString(oneCharString));
			
			// 演習４．１：以下のコード（「ワンモアマイル」まで）、そしてSimpleFileReaderクラス内で何がどのような順番で
			//         処理されているかコメント文を書いてみましょう
			// 演習４．２：テキスト１－４　リソース付try文を使ってSimpleFileReaderのreadTextFileメソッドを書き直してください
			// int型の割り算はゼロで割ると例外発生する
			// int number = 0;
			int number = -1;
			System.out.println("割り算結果：" + (10 / number));
		}
		catch (Exception exception) {
			// こうすることでコンソールにエラー詳細が出力される
			exception.printStackTrace();
		}

		// ファイル処理
		SimpleFileReader fileReader = new SimpleFileReader();
		
		// 引数にファイルの場所を指定する。
		// このメソッド内でファイルを開き、読み込みを行う。例外が発生するとすればここが怪しい
		fileReader.readTextFile("users.txt");
		
		// すでにこの時点で読み込みは終了。読み込んだデータをgetterで取得する
		ArrayList<String> lines = fileReader.getLines();
		
		int lineCount = 1;
		for (String line : lines) {
			System.out.print(lineCount+"行目：");
			System.out.println(line);
			lineCount++;
		}
		
		// ワンモアマイル：テキストの内容やネットでのリサーチ情報を活用して、
		// SimpleFileReaderクラスにあるwriteTextFileを書いてみてください。
		fileReader.writeTextFile("usersver2.txt");
	}

	/**
	 * 3文字目からのデータを返す。例えばparamが"inactive"であれば"active"が戻り値になる。
	 * paramが"sasaki"であれば"saki"が戻り値。
	 * @param param 
	 * @return
	 */
	public static String cookString(String param) {
		return param.substring(2);
	}
}
