/*
	Write a program to find the absolute sum of all elements present in an array.

	Input Format:	First line contains a single integer N. Second line contains N space separated integer values.

	Output Format:	Print Absolute sum of all elements in an array.

	Sample Input 1
	6
	1 -4 -6 3 10 -20
	Sample Output 1
	44


	Sample Input 2
	5
	5 -10 -15 20 -25
	Sample Output 2
	75
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
        int res = AbsoluteSum(a,N);
        System.out.println(res);
    }
    static int AbsoluteSum(int a[], int N){
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                a[i]*=-1;
                sum+=a[i];
            }
            else{
                sum+=a[i];
            }
        }
        return sum;
    }
}