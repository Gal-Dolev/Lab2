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
