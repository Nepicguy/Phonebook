/*programmer: Charanvir Singh
programmer: Russell Vanderveen  
Programmer: Harpreet Sangha
Class: CS 145
Date 02/03/2022
purpose - This is the main method of the PhoneBook Assignment
*/

package PhoneBookPackage;
import java.util.*;
public class PhoneBookTest {//PhoneBookTest class begins

	public static void main(String[] args) {//main method begin	
		Scanner input = new Scanner(System.in);
		ListNode list = null;
		//call the method that has the switch/case for the user choice
		PhoneBookPackage.PhonebookManager.userChoice(input);
	}//end of the main method
}//end of the PhoneBookTest Class
	

