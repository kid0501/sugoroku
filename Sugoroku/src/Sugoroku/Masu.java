package Sugoroku;
/**
 * すごろくに使用される升目を表現する抽象基底クラス
 * @author 3d156
 *
 */
public abstract class Masu {

	
	/**
	 * コンストラクタ new	できないのでprotectedにしておく
	 */
	protected  Masu() {

	}
	
	/**
	 * なにかしらのイベントを実行できる予定
	 * 
	 */
	public abstract void doEvent();
	/**
	 * このマス目を表示名
	 * @return 表示文字列
	 */
	public abstract String getCaption();

	public boolean doEvent(Coma coma) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}
