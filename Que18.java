package lab1;
import java.util.Scanner;
public class Que18 {
	public static void main(String[] args) {
		char operator;
		Double num1,num2;
		Scanner input =new Scanner(System.in);
		System.out.println("choose an operator: +,-,*, or /");
		operator = input.next().charAt(0);
		System.out.println("Enter the first number");
		num1 =input.nextDouble();
		
		System.out.println("Enter the second number");
		num2 =input.nextDouble();
		input.close();
		switch(operator) {
		case '+':
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		break;
		case '-':
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		break;
		case '*':
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		break;
		case '/':
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		break;
		default:
			System.out.println("Invalid operator!!");
		break;
		}
	}
}
