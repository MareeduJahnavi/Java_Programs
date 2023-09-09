/*
	Insert an asterisk (*) before each occurrence of the characters 'a' and 'A' in a given string.

Input Format
The input consists of a single line containing a string.

Output Format
Output a single line containing the modified string with asterisks inserted before 'a' and 'A' characters.

Sample Inputs & Outputs
Sample Input 1
TaapAAcaademy
Sample Output 1
T*a*ap*A*Ac*a*ademy
Sample Input 2
programming
Sample Output 2
progr*amming
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String s = "";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch=='a' || ch=='A'){
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