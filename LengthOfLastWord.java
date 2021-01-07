import java.util.Scanner;

public class LengthOfLastWord {

	static int lengthOfLastWord(String s) {
		String[] words = s.split(" ");
		return words[words.length-1].length();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter a String:");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("The last word in the string has a length of "+ lengthOfLastWord(input));
	}

}
