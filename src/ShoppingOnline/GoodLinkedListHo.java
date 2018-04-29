package ShoppingOnline;

/**
 * @author Hien Ho
 * manage links
 */
public class GoodLinkedListHo {
	private GoodLinkHo first; // ref to first link on list
	
	/**
	 * constructor of LinkedList
	 */
	public GoodLinkedListHo() // constructor
	{
		first = null; // no links on list yet
	}

	/**
	 * add new link
	 * @param gd
	 */
	public void insertFirst(GoodHo gd) { // make new link
		GoodLinkHo newLink = new GoodLinkHo(gd);
		newLink.next = first; // it points to old first link
		first = newLink; // now first points to this
	}

	/**
	 * find link with given key
	 * @param code
	 * @return current
	 */
	public GoodLinkHo find(String code) // find link with given key
	{ // (assumes non-empty list)
		GoodLinkHo current = first; // start at ‘first’
		while (!code.equalsIgnoreCase(current.data.getCode())) // while no match,
		{
			if (current.next == null) // if end of list,
				return null; // didn’t find it
			else // not end of list,
				current = current.next; // go to next link
		}
		return current; // found it
	}

	/**
	 * delete link with given key
	 * @param code
	 * @return current
	 */
	public GoodLinkHo delete(String code) // delete link with given key
	{ // (assumes non-empty list)
		GoodLinkHo current = first; // search for link
		GoodLinkHo previous = first;
		while (!code.equalsIgnoreCase(current.data.getCode())) {
			if (current.next == null)
				return null; // didn’t find it
			else {
				previous = current; // go to next link
				current = current.next;
			}
		} // found it
		if (current == first) // if first link,
			first = first.next; // change first
		else // otherwise,
			previous.next = current.next; // bypass it
		return current;
	}

	/**
	 * print all the links of list
	 */
	public void displayList() // display the list
	{
		System.out.print("List (first-->last): ");
		GoodLinkHo current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}

	/**
	 * sum all the price
	 * @return result
	 */
	public double total() // sum all price
	{
		double result = 0;
		GoodLinkHo current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			result += current.data.getPrice(); // get price
			current = current.next; // move to next link
		}
		return result;
	}

	/**
	 * return string of good list
	 */
	public String toString() {
		String result = "";
		GoodLinkHo current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			result = result + current.data.toString() + "\n";
			current = current.next; // move to next link
		}
		return result;
	}

	// -------------------------------------------------------------
} // end class GoodLinkedList
