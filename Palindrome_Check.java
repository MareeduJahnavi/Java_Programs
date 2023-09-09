/*
	Checks whether a given string is a palindrome or not.

	Input Format:	The input consists of a single line containing a string.

	Output Format:	Output 'Yes' if the string is a palindrome, 'No' otherwise.

	Sample Input 1
	radar
	Sample Output 1
	Yes


	Sample Input 2
	TapAcademy
	Sample Output 2
	No
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String s="";
        for(int i=input.length()-1; i>=0; i--){
            s+=input.charAt(i);
        }
        System.out.print(input.equals(s) ? "Yes" : "No");
    }
}