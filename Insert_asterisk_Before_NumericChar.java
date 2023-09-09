/*
	Insert an asterisk (*) before each numeric character (0-9) in a given string.

Input Format
The input consists of a single line containing a string.

Output Format
Output a single line containing the modified string with asterisks inserted before numeric characters.

Sample Inputs & Outputs
Sample Input 1
TAP123ACADEMY456
Sample Output 1
TAP*1*2*3ACADEMY*4*5*6
Sample Input 2
CODE@123TAP
Sample Output 2
CODE@*1*2*3TAP
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String s = "";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch>='0' && ch<='9'){
                s+='*';
                s+=ch;
            }
            else{
                s+=ch;
            }
        }
        System.out.print(s);
    }
}