/*
	Write a program to find the lowest common factor of given 2 integers excluding 1 and 2.

	Input Format:	First line contains space separated two integer input n, m.

	Output Format:	Print lowest common factor of 2 numbers excluding 1 and 2.

	Sample Input 1
	10 20
	Sample Output 1
	5


	Sample Input 2
	15 30
	Sample Output 2
	3
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // implement your logic here
        int i;
		int max=0;
		for(i=1;i<=n;i++) {
			if(n%i==0 && m%i==0) {
				if(i!=1 && i!=2) {
					max=i;
					break;
				}
				
			}
		}
		System.out.print(max);
    }
}