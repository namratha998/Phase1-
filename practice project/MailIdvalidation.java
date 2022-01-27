
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailIdvalidation { 
	
	private final String [] MAILID = {
			"admin@gmail.com",
			"emp001@gmail.com",
			"generaldept@gmail.com",
			"emp244@gmail.com",
			"hr010@gmail.com"
	};
	
	public boolean validateMailId(String mailidToValidate) {
		String regexDoublePoint = ".*[.]{2}.*";
		String mailidPattern ="[a-zA-Z0-9_]*@[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9][.][a-zA-Z]*"; 
				
		Pattern pattern = Pattern.compile(regexDoublePoint);
		Matcher matcher = pattern.matcher(mailidToValidate);
		if(matcher.matches()) {
			System.out.println("Invalid mail id , MailId with consecutive '.'");
			return false;
		}
		else {
			pattern = Pattern.compile(mailidPattern);
			matcher = pattern.matcher(mailidToValidate);
			if(matcher.matches()) {
				for (int i=0;i<MAILID.length;i++) {
					if (MAILID[i].toLowerCase().equals(mailidToValidate.toLowerCase())) { 
						
						return true;
					}
				}
					
				{System.out.println("mailid not recognized");
				return false;}
			}
			else
			{   System.out.println("Invalid MailId ");
				return false;}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MailIdvalidation mailid = new MailIdvalidation();
		Scanner sc = new Scanner(System.in);
		String userInput;
		do {
			System.out.println("Enter the mailid:");
		    userInput = sc.next();
		}
		while(!mailid.validateMailId(userInput));
		System.out.println("MailId found in the database");
		sc.close();
	}

}
