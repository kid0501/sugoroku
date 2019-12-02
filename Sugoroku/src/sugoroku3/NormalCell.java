/**
 * 
 */
package sugoroku3;

/**
 * ふつうなマス の実装クラス
 * @author 講師
 *
 */
public class NormalCell extends Cell {

	/**
	 * コンストラクタ
	 */
	public NormalCell() {
	}

	@Override
	public boolean doEvent(Coma coma) {
		coma.addPoint(100); // とりあえずてきとーに。
		return true;
	}

	@Override
	public String getCaption() {
		return "風が吹いている……";
	}
	
	@Override
	public String getMark() {
		return "~";
	}

}
