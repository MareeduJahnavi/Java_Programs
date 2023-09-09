/*
	Converts a given string from lowercase to uppercase.

Input Format
The input consists of a single line containing a string.

Output Format
Output the converted string in uppercase.

Sample Inputs & Outputs
Sample Input 1
hello world!
Sample Output 1
HELLO WORLD!
Sample Input 2
TapACADemy
Sample Output 2
TAPACADEMY
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String s="";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch >= 'a' && ch<='z'){
                s+=(char)(ch-32);
            }
            else{
                s+=ch;
            }
        }
        System.out.print(s);
    }
}