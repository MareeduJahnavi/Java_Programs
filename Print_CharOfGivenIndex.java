/*
	Prints the character present at a given index in a string, and the index value should starts from 0.

Input Format
The program takes two lines of input:

- The first line contains a string.

- The second line contains an integer representing the index value (k).

Output Format
Print the character present at index k in the input string.

If the index is invalid or the string is empty, output "Invalid index".

Sample Inputs & Outputs
Sample Input 1
TapAcademy
3
Sample Output 1
A
Sample Input 2
Testing
7
Sample Output 2
Invalid index
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a = scanner.nextInt();
        boolean flag = false;
        for(int i=0; i<input.length(); i++){
            if(i==a){
                System.out.print(input.charAt(i));
                flag = true;
            }
        }
        if(!flag){
            System.out.print("Invalid index");
        }
    }
}