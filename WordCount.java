/*
	Counts the number of words in a given string[words might be separated by multiple space].

Input Format
The input consists of a single line containing the input string.

Output Format
Output the count of words in the given string.

Sample Inputs & Outputs
Sample Input 1
Hello World!
Sample Output 1
2
Sample Input 2
Programming is fun
Sample Output 2
3
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 1;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)==' '){
                count++;
            }
        }
        System.out.print(count);
    }
}