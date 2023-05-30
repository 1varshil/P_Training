import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account1 a = new Account1();
		a.setAttr("Varshil",10000);
		
		
		System.out.println(a.getName());
		System.out.println(a.getBalance());
		
		Scanner sc = new Scanner(System.in);
	      
		 
	      System.out.print("Do you want to withdraw money -> 1=yes");
	      int w = sc.nextInt();
	      System.out.print("Amount ton be withdraw");
	      int amount=sc.nextInt();
	      
	      if(w==1)
	      {
	    	  a.withdraw(amount);
	      }
	      else
	      {
	    	System.out.println("Thank you");	    
	      }
	      
	}

}