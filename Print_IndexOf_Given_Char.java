/*
	Write a Java program that finds the index of the first occurrence of a given character in a string.

Input Format
The first line contains the string, s. The second line contains a single character, k.

Output Format
A single line containing the index of the first occurrence of character k in the string, or -1 if k is not found.

Sample Inputs & Outputs
Sample Input 1
TapAcademy
A
Sample Output 1
3
Sample Input 2
Programming
o
Sample Output 2
2
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char a = scanner.next().charAt(0);
        int count =0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == a){
                count++;
                if(count>0){
                    System.out.print(i);
                    break;
                }
            }
        }
        if(count==0){
            System.out.print(-1);
        }
    }
}