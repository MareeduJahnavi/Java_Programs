/*
	Compares two strings based on their values to determine if they have the same sequence of characters

Input Format
The program takes two lines of input, each containing a string.

Output Format
Output "Strings are equal" if the two strings have the same sequence of characters.

Output "Strings are not equal" otherwise.

Sample Inputs & Outputs
Sample Input 1
TAP ACADEMY
TAP ACADEMY
Sample Output 1
Strings are equal
Sample Input 2
TAP
ACADEMY
Sample Output 2
Strings are not equal
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.print(str1.equals(str2) ? "Strings are equal" : "Strings are not equal");
    }
}