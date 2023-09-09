/*
	Counts the number of vowels, consonants, and special characters in a given string.

Input Format
The input consists of a single line containing the input string.

Output Format
Output three lines, each containing the count of vowels, consonants, and special characters in the given string, respectively.

Sample Inputs & Outputs
Sample Input 1
Hello, World!
Sample Output 1
Vowels: 3
Consonants: 7
Special Characters: 2
Sample Input 2
Programming is fun!
Sample Output 2
Vowels: 5
Consonants: 11
Special Characters: 1
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int cv=0, cc=0, cs=0, cn=0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    cv++;
                }
                else{
                    cc++;
                }
            }
            else if((ch>='0' && ch<='9') || (ch==' ')){
                cn++; 
            }
            else{
                cs++;
            }
        }
        System.out.println("Vowels: "+cv);
        System.out.println("Consonants: "+cc);
        System.out.println("Special Characters: "+cs);
    }
}