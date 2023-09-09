/*
	Rearrange the array by moving -1 elements to the end while maintaining the relative order of positive integers.

	Input Format:	First line contains size of the array n.
			Next line contains n space separated integer values.

	Output Format:	A line containing space-separated integers representing the rearranged array.

	Sample Input 1
	7
	3 5 -1 2 8 -1 7
	Sample Output 1
	3 5 2 8 7 -1 -1


	Sample Input 2
	7
	1 -1 4 2 -1 9 -1
	Sample Output 2
	1 4 2 9 -1 -1 -1
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
            if(a[i]!=-1){
                System.out.print(a[i]+" ");
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i] == -1){
                System.out.print(a[i]+" ");
            }
        }
       
        /*
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
            a[j] = -1;
            j++;
        }

        for(int k=0; k<a.length; k++){
            System.out.print(a[k]+" ");
        }

        */
    }
}