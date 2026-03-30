import java.util.ArrayList;

/**
 * SharedData is a class made to check if a given integer sum is reachable by
 * adding the elements of a given integer array, if reachable, stores boolean
 * array used as a representation of the added elements of the given array
 */
public class SharedData {

	/** array - local ArrayList stores the numbers entered */
	private ArrayList<Integer> array;

	/**
	 * winArray - boolean array contains flags showing the numbers/ indices of the
	 * wanted sum
	 */
	private boolean[] winArray;

	/**
	 * flag - boolean variable- 
	 * "true"- the wanted sum is reachable from entered array 
	 * "false"- the wanted sum is unreachable from entered array
	 */

	private boolean flag;

	/** b - type int variable, stores the wanted sum entered */
	private final int b;

	/**
	 * Constructs a SharedData instance with the available numbers and the target sum.
	 * 
	 * @param array sets array (ArrayList)
	 * @param b     sets b (int)
	 * 
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		this.array = array;
		this.b = b;
	}

	/**
	 * Retrieves the array of flags indicating used numbers.
	 * 
	 * @return returns winArray (boolean[]).
	 */

	public boolean[] getWinArray() {
		return winArray;
	}

	/**
	 * Updates the array of flags indicating used numbers.
	 * 
	 * @param winArray sets winArray to
	 */

	public void setWinArray(boolean[] winArray) {
		this.winArray = winArray;
	}

	/**
	 * Returns array.
	 * 
	 * @return returns array (ArrayList).
	 */

	public ArrayList<Integer> getArray() {
		return array;
	}

	/**
	 * Returns b.
	 * @return returns the value of b (int).
	 */

	public int getB() {
		return b;
	}

	/**
	 * Returns flag.
	 * @return returns the value of flag (boolean).
	 */

	public boolean getFlag() {
		return flag;
	}

	/**
	 * Changes flag's value according to sent boolean parameter.
	 * 
	 * @param flag boolean value
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
