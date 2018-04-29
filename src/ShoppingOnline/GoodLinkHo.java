package ShoppingOnline;

/**
 * @author Hien Ho
 * Class link of Good
 */
public class GoodLinkHo {
	public GoodHo data; // data item
	public GoodLinkHo next; // next link in list
	
	/**
	 * constructor link with GoodHo
	 * @param good
	 */
	public GoodLinkHo(GoodHo good) // constructor
	{
		data = good;
	}

	/**
	 * print data
	 */
	public void displayLink() // display ourself
	{
		System.out.print(data);
	}
} // end class Link

