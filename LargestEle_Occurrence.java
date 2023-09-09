/*
	Write a program to find the occurrence of the largest element in an array.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	Print the occurrence of largest element

	Sample Input 1
	4
	1 2 3 4
	Sample Output 1
	1

	Sample Input 2
	7
	1 2 3 4 5 6 7
	Sample Output 2
	1
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int a[] = new int[N];
        int max= Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==max){
                count++;
            }
        }
        System.out.println(count);
    }
}