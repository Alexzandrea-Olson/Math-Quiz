package mathQuiz;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int userInput;
		boolean isNumber = true;
		
		//scanner input to retrieve user input
		Scanner input = new Scanner (System.in);
		System.out.println("Please Enter 1 - 4 for level of difficulty of test");
			userInput = input.nextInt();
			
		do {
			//VALIDATING USER INPUT
			if(userInput == 1 || userInput== 2 || userInput == 3 || userInput == 4 ){
				isNumber = true;
	
			}else {
				//PROMPTING UNTIL CORRECT INPUT
				System.out.println("INCORRECT");
				System.out.println("Please Enter 1 - 4 for level of difficulty of test");
				isNumber = false;
				userInput = input.nextInt();
				
		}
		} while(!(isNumber));
	  
		//passing variable to mathTest Class
		mathTests testChoice = new mathTests(userInput);
	    
	    
	}
		  
}
