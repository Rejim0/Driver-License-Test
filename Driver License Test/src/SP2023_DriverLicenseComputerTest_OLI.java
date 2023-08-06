//SP2023_DriverLicenseComputerTest_OLI
//SP2023_LAB6PART2_OLI
import java.util.Scanner;

		public class SP2023_DriverLicenseComputerTest_OLI {

		    public static void main(String[] args) {
		        // Creating Scanner object to read user input
		        Scanner scanner = new Scanner(System.in);

		        // Creating a new DriverCandidate object
		        System.out.println("Enter candidate details:");
		        System.out.print("Last name: ");
		        String last_name = scanner.nextLine();
		        System.out.print("First name: ");
		        String first_name = scanner.nextLine();
		        System.out.print("SS number: ");
		        String ssNumber = scanner.nextLine();
		        System.out.print("Address: ");
		        String address = scanner.nextLine();
		        SP2023_DriverCadidate_OLI driverCadidate = new SP2023_DriverCadidate_OLI(last_name, first_name, ssNumber, address, new char[25]);

		        // Displaying test instructions
		        System.out.println("\nDRIVER LICENSE TEST\n");
		        System.out.println("Please select the correct answer by typing A, B, C, or D.");
		        System.out.println("If you type other keys, the program will display 'Invalid key - Retype' and allow you to retype the answer to the current question before moving on.\n");

		        // Asking questions and reading answers
		        char[] answerArray = new char[25];
		        for (int i = 0; i < answerArray.length; i++) {
		            System.out.println("Question " + (i+1) + ":");
		            System.out.print("A) ");
		            System.out.print("B) ");
		            System.out.print("C) ");
		            System.out.print("D) ");
		            System.out.print("Answer: ");
		            char answer = scanner.nextLine().toUpperCase().charAt(0);
		            while (answer != 'A' && answer != 'B' && answer != 'C' && answer != 'D') {
		                System.out.println("Invalid key - Retype");
		                System.out.print("Answer: ");
		                answer = scanner.nextLine().toUpperCase().charAt(0);
		            }
		            answerArray[i] = answer;
		        }

		        // Evaluating result and printing it
		        driverCadidate.setAnswerArray(answerArray);
		        
		
		    
		       System.out.println();
				   System.out.println(driverCadidate.toString());
				   driverCadidate.evaluateResult(keySet,answerArray);	;

				   
				
		    }
		    

		    // Key set for the test questions
		   
		    private static final char[] keySet = {'A', 'C', 'A', 'A', 'B', 'A', 'A', 'C', 'B', 'A',  'B', 'A', 'D', 'A', 'B',  'A', 'A', 'D', 'A', 'C', 'C', 'B', 'A', 'D', 'A' };
		
		
		
	}


