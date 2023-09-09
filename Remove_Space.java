/*
	Write a Java program that removes all leading and trailing spaces from a given string.

Input Format
A single line containing a string.

Output Format
Print the input string after removing any leading and trailing spaces.

Sample Inputs & Outputs
Sample Input 1
   Hello, World!   
Sample Output 1
Hello, World!
Sample Input 2
     TAP ACADEMY     
Sample Output 2
TAP ACADEMY
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int si=0, ei=0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) != ' '){
                si = i;
                break;
            }
        }
        for(int i=input.length()-1; i>=0; i--){
            if(input.charAt(i) != ' '){
                ei = i;
                break;
            }
        }

        for(int i=si; i<=ei; i++){
            System.out.print(input.charAt(i));
        }
    }
}