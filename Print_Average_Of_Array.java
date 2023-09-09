/*
	Write a program to find the average of all elements present in an array.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	Print float value of average of all elements in an array. [it has to print 2 decimal points]

	Sample Input 1
	5
	1 4 6 3 10
	Sample Output 1
	4.80

	Sample Input 2
	5
	5 -10 -15 20 -25
	Sample Output 2
	-5.00
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
        Average(a,N);
    }
    static void Average(int a[], int N){
        float sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        double av= sum/(float)a.length;
        System.out.printf("%.2f",av);

    }
}