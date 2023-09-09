/*
	Counts the number of special characters in a given string. Do not consider space as special character for this problem.

Input Format
The program takes a single line of input containing a string.

Output Format
The program outputs a single line containing the count of special characters in the input string. If no special characters found return 0 in those cases.

Sample Inputs & Outputs
Sample Input 1
T@p A(adE%m&y Banglore
Sample Output 1
4
Sample Input 2
@#$%^&*
Sample Output 2
7
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if( ! ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9') || ch==' ')){
                count++;
            }
        }  
        System.out.print(count);     
    }
}