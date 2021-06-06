package lab1;
import java.util.Scanner;
public class Que13 {
	public static void main(String[] args) {
		System.out.println("Enter the side of square:");
		Scanner scan = new Scanner(System.in);
		double side =scan.nextDouble();
		scan.close();
		double area = side * side;
		System.out.println("Area of square is :"+area);
	}

}
