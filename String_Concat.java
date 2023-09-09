/*
	Concatenates two strings into a single string while preserving their original order.

Input Format
The program takes two lines of input, each containing a string.

Output Format
Print the concatenation of the two input strings.

Sample Inputs & Outputs
Sample Input 1
Tap
Academy
Sample Output 1
TapAcademy
Sample Input 2
Hello
123
Sample Output 2
Hello123
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        System.out.print(input1+input2);
    }
}