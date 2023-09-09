/*
	Converts a given string to its corresponding ASCII values.

Input Format
The input consists of a single line containing a string.

Output Format
Output the ASCII values separated by spaces.

Sample Inputs & Outputs
Sample Input 1
Hello, World!
Sample Output 1
72 101 108 108 111 44 32 87 111 114 108 100 33
Sample Input 2
TapAcademy
Sample Output 2
84 97 112 65 99 97 100 101 109 121
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(int i=0; i<input.length(); i++){
            System.out.print(((int)(input.charAt(i)))+" ");
        }
    }
}