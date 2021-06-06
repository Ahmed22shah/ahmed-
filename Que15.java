package lab1;
import java.util.Scanner;
public class Que15 {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double radius = sc.nextDouble();
		sc.close();
		double area = Math.PI*(radius * radius);
		System.out.println("The area of circle is :"+area);
		double circumference = Math.PI* 2*radius;
		System.out.println("The circumference of the circle is:"+circumference);
		}
}
