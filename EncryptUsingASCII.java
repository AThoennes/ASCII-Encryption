/**
 * @author Alex Thoennes
 * 
 * This program is a simple encryption program. It starts
 * by prompting the user for a string. The string is then
 * examined character value by character value. These
 * values are then put into an array list which is used 
 * in decoding the message. To encode it, I put the character
 * values into a string.
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class EncryptUsingASCII 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		// prompt for the user to ype something in
		System.out.print("Enter a message to be encrypted: ");
		
		// read in what the user types
		String message = keyboard.nextLine();
		
		// array list of ascii values
		ArrayList<Integer> codedMessageArray = new ArrayList();
		
		String codedMessage = "";
		String decodedMessage = "";
		
		for (int i = 0; i < message.length(); i++)
		{
			// retrieve ascii value of letter at index i in string message
			int numberOfLetter = message.charAt(i);
			
			// put that value into the array
			codedMessageArray.add(numberOfLetter);
			
			// add to the codedMessage String
			codedMessage = codedMessage + codedMessageArray.get(i);
		}
		
		// print out the coded message
		System.out.print("Encrypted message: " + codedMessage);
		
		// for each element in the array
		for (int q : codedMessageArray)
		{
			
			decodedMessage = decodedMessage + Character.toString((char) q);
		}
		
		// print the decoded message
		System.out.print("\nDecoded message: " + decodedMessage);
		
		// close the scanner
		keyboard.close();
	}
}
