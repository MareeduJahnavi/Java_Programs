/*
	Count the number of vowels in a given string.

Input Format
The input consists of a single line containing the input string.

Output Format
Output the count of vowels in the given string.

Sample Inputs & Outputs
Sample Input 1
Hello, World!
Sample Output 1
3
Sample Input 2
TapAcademy
Sample Output 2
4
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count=0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        System.out.print(count);
    }
}