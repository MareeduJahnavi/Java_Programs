/*
	Remove all numeric characters from a given string.

Input Format
The input consists of a single line containing a string that may contain numerical characters.

Output Format
Output a single line containing the modified string after removing all numerical characters.

Sample Inputs & Outputs
Sample Input 1
Tap123Academy456
Sample Output 1
TapAcademy
Sample Input 2
P1r2o3g4r5a6m7m8i9n10g!
Sample Output 2
Programming!
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String t = "";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(!(ch>='0' && ch<='9')){
                t+=ch;
            }
        }
        System.out.print(t);
    }
}