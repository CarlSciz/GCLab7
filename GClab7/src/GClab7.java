import java.util.Scanner;
import java.util.InputMismatchException; 

public class GClab7 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 
		// initialize the scanner to get the input from the user
				String userName; 
		        String userEmail;
		        String userPhoneNum; 
		        String userDate;
//we prompt the user to enter a name
		System.out.println("Please enter a valid Name:");
        userName = scnr.nextLine();
        	//we start with if statements to check if the user actually entered a valid name based on the parameters we set.
        	//The nameValidMethod 
        	if (nameValidMethod(userName) == true) { 
            System.out.println("The name you have entered is Valid! Thanks ");
        	}
        	//The while loop is used to keep the user going until a vaild answer is used
        	while (nameValidMethod(userName) == false) { 
            System.err.println("Sorry!! The name you have entered is not valid!");           
            userName = scnr.nextLine();
            
            if (nameValidMethod(userName) == true) { 
                System.out.println("The name you have entered is Valid! Thanks ");
            	}
            }
        }
	// We now prompt the user to enter a valid email address
		System.out.println("Please enter a Valid Email Address: ");
        userEmail = scnr.nextLine(); 
// if statements are in place to check if the line is true and works within our parameters set.
       		if (emailValidMethod(userEmail) == true) { 
       		}
// a while loop keeps the method going until true
       		while (emailValidMethod(userEmail) == false) { 
            System.err.println("Sorry, invalid response. Please enter a valid email.");
            userEmail = scnr.nextLine();
            //validates that the user finally put in a true statement
            if (emailValidMethod(userEmail) == true) { 
            	

            }
        }
//prompt the user to enter a phone number and then show them the correct format
        System.out.println("Please enter a valid phone number");
        System.out.println("Please keep the phone number in this format 555-555-5555"); 
        userPhoneNum = scnr.nextLine(); 

      //if statements check if it is true
        	if (phoneValidMethod(userPhoneNum) == true) { 
        	}
        	// while loop is used to keep going until information is valid
        	while (phoneValidMethod(userPhoneNum) == false) { 
            System.err.println("Sorry, number is not valid! ");
            userPhoneNum = scnr.nextLine();

            if (phoneValidMethod(userPhoneNum) == true) { 
            	

            }
        }
// now we prompt the user to enter a valid date
        System.out.println("Please enter a valid date: ");
        userDate = scnr.nextLine();
// if statement is used to check if the date entered is set in the parameters we have set.
        	if (userDateValidMethod(userDate) == true) { 
        	
        	}
// while loop keeps them answering until they enter a valid date.
        	while (userDateValidMethod(userDate) == false) { 
            System.out.println("Sorry, date is not valid!");
            userDate = scnr.nextLine();

            if (userDateValidMethod(userDate) == true) { 
            	

            }

        }
        System.out.println("GoodBye!");
}
// we use booleans inputed with the data from regexer.com to help keep all the statements we used, have set parameters.
    public static boolean nameValidMethod (String name) {
        if (userName.matches("[A-Z][A-z]{1,29}")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean emailValidMethod(String email) {
        if (email.matches("\\b[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,4}\\b")) {
            return true;
        } else { 
            return false;
        }
    }

    public static boolean phoneValidMethod(String phoneNum) {
        if (phoneNum.matches("\\d{3}\\-\\d{3}\\-\\d{4}")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean birthDateValidMethod(String userDate) {
        if (userDate.matches("^(0[1-9]|[12]\\d|3[01])[\\/\\-\\.](0[1-9]|1[0-2])[\\/\\-\\.](19|20)\\d{2}$")) {
            return true;
        } else {
            return false;
        }
    }
    }

	
