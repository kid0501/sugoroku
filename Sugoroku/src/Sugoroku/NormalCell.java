/**
 * 
 */
package Sugoroku;

/**
 * 普通なマスの実装クラス
 * @author 3d156
 *
 */
public class NormalCell extends Masu {

	/**
	 *コンストラクタ 
	 */
	public NormalCell() {
		
	}

	@Override
	public boolean doEvent(Coma coma) {
		coma.addPoint(100);
		return true;
	}

	@Override
	public String getCaption() {
		return "風が吹いている・・・・・・	";
	}

	@Override
	public void doEvent() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
