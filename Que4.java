package lab1;

public class Que4 {
	public static void main(String[] args) {
		int first = 20, second=10;
		System.out.println("--Before swap--");
		System.out.println("First number ="+ first);
		System.out.println("Second number ="+ second);
		int temp = first;
		first = second;
		second = temp;
		System.out.println("--After swap--");
		System.out.println("First number ="+ first);
		System.out.println("Second number ="+ second);
		}

}
