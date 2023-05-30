import java.util.Scanner;
public class AvgMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter The First Subject Marks  :");
		a = sc.nextInt();
		System.out.println("Enter The Second Subject Marks : ");
		b = sc.nextInt();
		System.out.println("Enter The Third Subject Marks : ");
		c = sc.nextInt();
		int sum = a+b+c;
		int avg = sum/3;
		System.out.println("Result:");
		if(avg>90)
		{
			System.out.println("You are Having A grade Congratulations :) ");
		}
		else if(avg<90 || avg>80)
		{
			System.out.println("You are Having B grade Congratulations");
		}
		else if(avg<80 || avg>70)
		{
			System.out.println("you are Having C grade:");
		}
		else
		{
			System.out.println("You are having D grade :");
		}

	}

}
