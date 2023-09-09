 /*
	Write a program to print numbers present in the even index of an array.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	Print space separated integer values stored in the even index of the array.

	Sample Input 1
	5
	1 4 6 3 10
	Sample Output 1
	1 6 10


	Sample Input 2
	4
	20 30 40 50
	Sample Output 2
	20 40
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
        EvenIndexElements(a,N);
    }

    static void EvenIndexElements(int a[],int N){
        for(int i=0;i<N;i++){
            if(i%2==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}