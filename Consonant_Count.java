/*
	Count the number of consonants in a given string.

Input Format
The input consists of a single line containing the input string.

Output Format
Output the count of consonants in the given string.

Sample Inputs & Outputs
Sample Input 1
Hello, World!
Sample Output 1
7
Sample Input 2
TapAcademy
Sample Output 2
6
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count=0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
                     ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}