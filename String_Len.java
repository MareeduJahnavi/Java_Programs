/*
	Determines the length of a string, including whitespaces and special characters.

Input Format
The program takes a single line of input containing a string.

Output Format
Print the length of the input string.

Sample Inputs & Outputs
Sample Input 1
Hello World!
Sample Output 1
12
Sample Input 2
TapAcademy
Sample Output 2
10
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count =0;
        for(int i=0; i<input.length(); i++){
            count++;
        }
        System.out.print(count);
    }
}