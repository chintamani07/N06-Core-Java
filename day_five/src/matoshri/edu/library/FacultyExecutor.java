//program to demonstrate on access specifier
//driver code
package matoshri.edu.library;
//import package
import bkc.met.library.Library;
//class declaration
public class FacultyExecutor {
//	main method
	public static void main(String[] args) {
		Library l=new Library();
		l.libraryName = "MET Gurukul Library";
		l.displayPublic();
		
		/* userId and displayPrivate() method is private, so 
		 * we can't access into another package or class, only
		 * we can access inside the same class */

//		l.userId=123456;
//		l.displayPrivate();
		
		/* booksName and displayDefault() method is default, 
		 * we can't access into another package, only we can access 
		 * it within another package */
		
//		l.bookName;
//		l.displayDefault();
	}
}