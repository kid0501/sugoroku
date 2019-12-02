/**
 * 
 */
package Sugoroku;

/**
 * すごろくの位置を表すコマクラス
 * @author 3d156
 *
 */
public class Coma {
	/**
	 * プレイヤーの名前
	 */
	private String name;
	/**
	 * 現在の位置
	 */
	private int position;
	/**
	 * コンストラクタ
	 */
	public Coma(String name) {
		this.name = name;
		this.position = 0;
	}
	/*
	 * このコマの現在の位置を返します
	 * 位置を表す数値
	 */
	public int getPosition() {
		return this.position;
	}
	/**
	 * このコマが指定された分量 進みます
	 * @param amount 進む量
	 */
	public void proceed(int amount) {
		this.position += amount;
	}
	
	
	/**
	 * なにかしらのイベントを実行できる予定
	 * イベントの対象となるコマ
	 * イベント処理の結果何かが
	 */
	public boolean doEvent(Coma coma) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
	public void addPoint(int i) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	public void showProfile() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
