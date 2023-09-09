/*
	Write a program to find the smallest element in a given array.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	Print smallest element in an array

	Sample Input 1
	5
	1 5 7 3 2
	Sample Output 1
	1


	Sample Input 2
	6
	0 -1 -2 -3 -4 -5
	Sample Output 2
	-5
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int a[] = new int[N];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
} 