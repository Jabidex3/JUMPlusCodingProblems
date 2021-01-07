import java.util.Scanner;

public class PalindromeCheck {

	static boolean isPalindrome(String s) {
		String check = s.replace(" ", "");
		StringBuilder sb = new StringBuilder(check);
		sb.reverse();
		return check.equals(sb.toString());
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter a String to check if it is a palindrome:");
		Scanner scan = new Scanner(System.in);
		String test = scan.nextLine();
		if(isPalindrome(test)) {
			System.out.println(test+" is a palindrome!");
		}
		else {
			System.out.println(test+" is not a palindrome!");
		}
	}

}
