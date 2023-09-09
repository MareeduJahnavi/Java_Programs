/*
	Remove all consonants from a given string.

Input Format
The input consists of a single line containing a string that may contain consonants.

Output Format
Output a single line containing the modified string after removing all consonants.

Sample Inputs & Outputs
Sample Input 1
TapAcademy123
Sample Output 1
aAae123
Sample Input 2
I love coding in JAVA.
Sample Output 2
I oe oi i AA.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String t ="";
        String a="";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
                || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')) {
                    t+=ch;
                }
                else{
                    a+=ch;
                }
            }
            else{
                a+=ch;
            }
        }
        System.out.print(a);
    }
}