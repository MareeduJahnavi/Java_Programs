/*
	Move all special characters to the beginning of a given string.

Input Format
The input consists of a single line containing a string that may contain special characters.

Output Format
Output a single line containing the modified string after moving all special characters to the beginning.

Sample Inputs & Outputs
Sample Input 1
HelloTapAcademy@123World!
Sample Output 1
@!HelloTapAcademy123World
Sample Input 2
I love $coding$! @Programming is fun
Sample Output 2
$$!@I love coding Programming is fun
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String a="";
        String b="";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9') || (ch==' ')){
                a+=ch;
            }
            else{
                b+=ch;
            }
        }
        System.out.print(b+a);
    }
}