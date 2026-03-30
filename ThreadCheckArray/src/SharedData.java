import java.util.ArrayList;

/**
 * SharedData is a class made to check if a given integer sum is reachable by
 * adding the elements of a given integer array, if reachable, stores boolean
 * array used as a representation of the added elements of the given array
 */
public class SharedData {

	/** array - local ArrayList<Integer> stores the numbers entered */
	private ArrayList<Integer> array;

	/**
	 * winArray - boolean array contains flags showing the numbers/ indices of the
	 * wanted sum
	 */
	private boolean[] winArray;

	/**
	 * flag - boolean variable- "true"- the wanted sum is reachable from entered
	 * array "false"- the wanted sum is unreachable from entered array
	 */
	private boolean flag;

	/** b - type int variable, stores the wanted sum entered */
	private final int b;

	/**
	 * SharedData constructor
	 * 
	 * @param array
	 * @param b
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		this.array = array;
		this.b = b;
	}

	public boolean[] getWinArray() {
		return winArray;
	}

	public void setWinArray(boolean[] winArray) {
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray() {
		return array;
	}

	public int getB() {
		return b;
	}

	public boolean getFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
