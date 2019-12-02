/**
 * 
 */
package sugoroku3;

/**
 * すごろくの プレイヤーと位置を表す コマクラス
 * @author 講師
 */
public class Coma {
	/**
	 * プレイヤーの名前
	 */
	private String name;
	/**
	 * 現在位置
	 */
	private int position;
	/**
	 * ポイント
	 */
	private int point;
	
	/**
	 * コンストラクタ 
	 * @param name プレイヤー名
	 */
	public Coma( String name ) {
		this.name = name;
		this.position = 0;
	}
	/**
	 * このコマの現在位置を返します 
	 * @return 位置を表す数値
	 */
	public int getPosition() {
		return this.position;
	}
	/**
	 * このコマが 指定された分量 進みます
	 * @param amount すすむ量
	 */
	public void proceed(int amount) {
		this.position += amount;
	}
	/**
	 * ポイントがふえるよ！
	 * @param amount 増えるポイント数
	 */
	public void addPoint( int amount ) {
		System.out.println(name + " は " + amount + "ポイントをゲットした！"); 
		this.point += amount;
	}
	/**
	 * このコマの 現在の状態を表示します
	 */
	public void showProfile( ) {
		System.out.println( name 
					+ " の げんざいのぽいんとは " + point + " で、" 
					+ position + " コマ目にいます");
	}

}
