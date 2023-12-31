/*
	Reverses a given string.

Input Format
The input consists of a single line containing a string.

Output Format
Output the reversed string.

Sample Inputs & Outputs
Sample Input 1
TapAcademy
Sample Output 1
ymedacApaT
Sample Input 2
Racecar
Sample Output 2
racecaR
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(int i=input.length()-1; i>=0; i--){
            System.out.print(input.charAt(i));
        }
    }
}