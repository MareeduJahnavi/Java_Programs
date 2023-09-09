/*
	Rearrange the array by moving negative integers to the beginning and positive integers to the end while maintaining their relative order.

	Input Format:	First line contains size of the array n.
			Next line contains n space separated integer values.
	
	Output Format:	A line containing space-separated integers representing the rearranged array.

	Sample Input 1
	6
	-3 5 -1 2 -8 -7
	Sample Output 1
	-3 -1 -8 -7 5 2


	Sample Input 2
	7
	2 -1 -4 6 -3 0 8
	Sample Output 2
	-1 -4 -3 2 6 0 8
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<a.length; i++){
            if(a[i]<0){
                System.out.print(a[i]+" ");
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]>=0){
                System.out.print(a[i]+" ");
            }
        }
    }
}