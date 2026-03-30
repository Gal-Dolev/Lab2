import java.util.ArrayList;

public class SharedData {

	private ArrayList<Integer> array;
	private boolean[] winArray;
	private boolean flag;
	private final int b;

	/**
	 * Description of SharedData(ArrayList<Integer> array, int b)
	 * The constructor of SharedData.
	 * 
	 * @param array - sets array (ArrayList<Integer>)
	 * @param b - sets b (int)
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		this.array = array;
		this.b = b;
	}

	/**
	 * Description of getWinArray()
	 * 
	 * @return - returns winArray (boolean[]).
	 */
	public boolean[] getWinArray() {
		return winArray;
	}

	/**
	 * Description of setWinArray(boolean[] winArray)
	 * 
	 * @param winArray - sets winArray to
	 */
	public void setWinArray(boolean[] winArray) {
		this.winArray = winArray;
	}

	/**
	 * Description of getArray()
	 * 
	 * @return - returns array (ArrayList<Integer>).
	 */
	public ArrayList<Integer> getArray() {
		return array;
	}

	/**
	 * Description of getB()
	 * 
	 * @return - returns the value of b (int).
	 */
	public int getB() {
		return b;
	}

	/**
	 * Description of getFlag()
	 *
	 * @return - returns the value of flag (boolean).
	 */
	public boolean getFlag() {
		return flag;
	}

	/**
	 * Description of setFlag(boolean flag)
	 * 
	 * changes flag's value according to sent boolean parameter.
	 * 
	 * @param flag - boolean value
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
