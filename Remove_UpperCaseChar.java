/*
	Remove all uppercase characters from a given string.

Input Format
The input consists of a single line containing a string that may contain uppercase characters.

Output Format
Output a single line containing the modified string after removing all uppercase characters.

Sample Inputs & Outputs
Sample Input 1
TtAaPpAaCcAaDdEeMmYy
Sample Output 1
tapacademy
Sample Input 2
PpRrOoGgRrAaMmMmIiNnGg
Sample Output 2
programming
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
            if(ch>='A' && ch<='Z'){
                s+=ch;
            }
            else{
                a+=ch;
            }
        }
        System.out.print(a);
    }
}