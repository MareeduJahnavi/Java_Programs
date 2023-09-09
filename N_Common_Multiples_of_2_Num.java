/*
	Write a program to print common multiples of 2 numbers.

	Input Format:	First line contains a single integer input n. Second line contains space separated 2 integer input a, b.

	Output Format:	Print first n common multiples of a and b.

	Sample Input 1
	9
	3 4
	Sample Output 1
	12 24 36 48 60 72 84 96 108


	Sample Input 2
	5
	5 7
	Sample Output 2
	35 70 105 140 175
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // implement your logic here
        int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
        commonMultiples(n,a,b);
    }

    public static void commonMultiples(int n, int a, int b) {
        int lcm;
		int gcd=1;
		
		for(int i=1; i<= n; ++i) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
			
		}
		lcm=(a*b)/gcd;
        	for(int i=1;i<=n;i++) {
			System.out.print(lcm*i + " ");
		}
    }
}