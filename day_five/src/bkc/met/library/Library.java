//program to demonstrate on access specifier
package bkc.met.library;
//different access specifier
public class Library {
	public String libraryName, bookName;
	private long userId;
//	public method
	public void displayPublic() {
		System.out.println("Library Name:"+ libraryName);
	}
//	private method
	@SuppressWarnings("unused")
	private void displayPrivate() {
		System.out.println("User Id:"+userId);
	}	
//	default method
	void displayDefault()
	{
		System.out.println("Book Name:"+bookName);
	}
}	