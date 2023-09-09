/*
	Rearrange the array by moving 0 elements to the end while maintaining the relative order of positive integers.

	Input Format:	First line contains size of the array n.
			Second line contains n space separated integer values.

	Output Format:	A line containing space-separated integers representing the rearranged array.

	Sample Input 1
	7
	3 0 4 0 2 0 8
	Sample Output 1
	3 4 2 8 0 0 0


	Sample Input 2
	7
	0 5 0 1 0 3 0
	Sample Output 2
	5 1 3 0 0 0 0
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

        int i=0, j=0;
        while(i<a.length){
            if(a[i]>0){
                a[j] = a[i];
                i++;
                j++;
            }
            else if(a[i] ==0){
                i++;
            }
        }
        while(j<a.length){
            a[j] = 0;
            j++;
        }

        for(int k=0; k<a.length; k++){
            System.out.print(a[k]+" ");
        }
    }
}