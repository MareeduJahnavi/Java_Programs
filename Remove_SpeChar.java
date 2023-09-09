/*
	Remove all special characters from a given string.

Input Format
The input consists of a single line containing a string that may contain special characters.

Output Format
Output a single line containing the modified string after removing all the special characters.

Sample Inputs & Outputs
Sample Input 1
Tap$@Acad123
Sample Output 1
TapAcad123
Sample Input 2
P@r!o$g#r^a&m*m*i(n)g~
Sample Output 2
Programming
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t ="";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9') || (ch==' ')){
                t+=ch;
            }
        }
        System.out.print(t);
    }
}