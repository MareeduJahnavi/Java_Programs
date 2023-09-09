/*
	Check whether characters in the second string are present in the first string . There is no need for the characters to be consecutive.

Input Format
The input consists of two lines.

- The first line contains the first string, 'str1'.

- The second line contains the second string, 'str2'.

Output Format
Output 'Yes' if the characters in 'str2' are present in 'str1' in the same order, otherwise output 'No'.

Sample Inputs & Outputs
Sample Input 1
Academy
Tap
Sample Output 1
No
Sample Input 2
Programming
graming
Sample Output 2
Yes
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int i=0, j=0;
        String a ="";
        while(i<str1.length() && j<str2.length()){
            char ch = str1.charAt(i);
            char ch1 = str2.charAt(j);
            if(ch==ch1){
                a+=ch;
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(j== str2.length()){
            System.out.print("Yes");

        }
        else{
            System.out.print("No");
        }
    }
}