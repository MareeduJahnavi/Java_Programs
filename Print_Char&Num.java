/*
	Extracts and prints all the distinct characters and numbers present in a given string in the order of their occurrence.

	Input Format:	The program takes a single line of input containing a string.

	Output Format:	Print the distinct characters and numbers in the order of their occurrence. If no characters or numbers are found, output 'No characters or numbers found.'

	Sample Input 1
	abcd1234efgh5678
	Sample Output 1
	a b c d 1 2 3 4 e f g h 5 6 7 8
	Sample Input 2
	Hello World!
	Sample Output 2
	H e l l o W o r l d
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean flag = false;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if((ch>='0' && ch<='9') || (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ){
                System.out.print(ch+" ");
                flag = true;
            }
        }
        if(!flag){
            System.out.print("No characters or numbers found.");
        }
    }
}