/*
	Remove all lowercase characters from a given string.

Input Format
The input consists of a single line containing a string that may contain lowercase characters.

Output Format
Output a single line containing the modified string after removing all lowercase characters.

Sample Inputs & Outputs
Sample Input 1
TtAaPpAaCcAaDdEeMmYy
Sample Output 1
TAPACADEMY
Sample Input 2
PpRrOoGgRrAaMmMmIiNnGg
Sample Output 2
PROGRAMMING
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String s="";
        String a="";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch>='a' && ch<='z'){
                s+=ch;
            }
            else{
                a+=ch;
            }
        }
        System.out.print(a);
    }
}