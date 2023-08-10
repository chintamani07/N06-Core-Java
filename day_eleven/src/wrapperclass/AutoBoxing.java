//converting a primitive type to object
package wrapperclass;
//class declaration
public class AutoBoxing {
//	main method
	public static void main(String[] args) {
		int n=14;
		Integer value=n;
		System.out.println(value);
		System.out.println(value.getClass().getName());
	}
}