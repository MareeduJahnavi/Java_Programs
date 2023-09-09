/*
	Move all numeric characters to the end of a given string.

Input Format
The input consists of a single line containing a string that may contain numeric characters.

Output Format
Output a single line containing the modified string after moving all numeric characters to the end.

Sample Inputs & Outputs
Sample Input 1
TAP123ACADEMY
Sample Output 1
TAPACADEMY123
Sample Input 2
PROG888RAM
Sample Output 2
PROGRAM888
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String a = "";
        String b = "";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(!(ch>='0' && ch<='9')){
                a+=ch;
            }
            else{
                b+=ch;
            }
        } 
        System.out.print(a+b);      
    }
}