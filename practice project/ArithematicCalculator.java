import java.util.Scanner;

public class ArithematicCalculator {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       
			Scanner sc=new Scanner(System.in);
	       System.out.println("Arithematic Calculator");
	       System.out.println("enter the first number: ");
	     double num1=sc.nextInt();
	      System.out.println("enter the second number");
	      double num2=sc.nextInt();
	      System.out.println("Enter the operator (+,-,*,/,%)");
	      char option = sc.next().charAt(0);

	      double cal = 0;
	      switch (option) {
	      
	    case '+':
	          cal= num1 + num2;
	          break;

	    
	      case '-':
	    	  cal = num1 - num2;
	          break;


	      case '*':
	    	  cal = num1 * num2;
	          break;


	      case '/':
	          cal = num1 / num2;
	          break;
	     
	      case '%':
	    	  cal= num1%num2;
	      default:
	       System.out.println("You enter wrong input");
	       break;
	      }

	      System.out.println("The final result:");

	      System.out.println();

	      System.out.println(num1 + " " + option + " " + num2
	                         + " = " + cal);
	  }
	       }






