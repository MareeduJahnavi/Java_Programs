/*
	Count the number of spaces in a given string.

Input Format
The input consists of a single line containing the input string.

Output Format
Output the count of spaces in the given string.

Sample Inputs & Outputs
Sample Input 1
Tap Academy.
Sample Output 1
1
Sample Input 2
Programming is fun
Sample Output 2
2
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)==' '){
                count++;
            }
        }
        System.out.print(count);      
    }
}