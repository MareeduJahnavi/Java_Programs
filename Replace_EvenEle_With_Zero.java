/*
	Write a program to find the even elements in an array and replace all even elements with ‘0’.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	Print the required output

	Sample Input 1
	5
	1 2 3 4 5
	Sample Output 1
	1 0 3 0 5


	Sample Input 2
	6
	6 7 8 9 10 11
	Sample Output 2
	0 7 0 9 0 11
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int a[] = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                a[i]=0;
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(a[i]+" ");
        }
    }
}