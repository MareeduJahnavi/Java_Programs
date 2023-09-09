/*
	Remove all vowels from a given string.

Input Format
The input consists of a single line containing a string that may contain vowels.

Output Format
Output a single line containing the modified string after removing all vowels.

Sample Inputs & Outputs
Sample Input 1
TapAcademyBTM
Sample Output 1
TpcdmyBTM
Sample Input 2
Coding
Sample Output 2
Cdng
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String t ="";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
            || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
                t+=ch;
            }
        }
        System.out.print(t);
    }
}