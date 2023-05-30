
import java.util.Scanner;

// PS:Take 2 values From Users and Use Ternary operator to Find The Largest 
public class Ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter The First Number:");
		a = sc.nextInt();
		System.out.println("Enter The Second Number:");
		b = sc.nextInt();
		int c= (a>b) ? a : b;
		System.out.println("Max num is: " +c);  
	}

}
