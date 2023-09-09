/*
	Extracts and prints all the distinct special characters present in a given string in the order of their occurrence.

	Input Format:	The program takes a single line of input containing a string.

	Output Format:	Print the distinct special characters in the order of their occurrence.
			If no special characters are found, output 'No special characters found.'

	Sample Input 1
	Hello! How are you? #Excited!
	Sample Output 1
	! ? # !


	Sample Input 2
	1234567890
	Sample Output 2
	No special characters found.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean flag = false;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(!((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9') || ch==' ')){
                System.out.print(input.charAt(i)+" ");
                flag = true;
            }
        }
        if(!flag){
            System.out.print("No special characters found.");
        }
    }
}
