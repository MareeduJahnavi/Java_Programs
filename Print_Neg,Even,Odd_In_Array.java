/*
	Write a program to print negative elements, even elements and odd elements present in an array separately.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	First line prints space separated negative elements in an array.
			Second line prints space separated odd elements in an array.
			Third line prints space separated even elements in an array.

	Sample Input 1
	6
	1 -4 -6 3 10 -20
	Sample Output 1
	-4 -6 -20
	1 3
	10

	Sample Input 2
	5
	5 -10 -15 20 -25
	Sample Output 2
	-10 -15 -25
	5
	20
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int a[] = new int[N];
        for (int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        Ele(a,N);
    }
    static void Ele(int a[], int N){
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0 && a[i]>0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0 && a[i]>0){
                System.out.print(a[i]+" ");
            }
        }
    }
}