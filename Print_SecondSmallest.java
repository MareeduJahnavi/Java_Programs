/*
	Write a program that finds the second smallest number in a given array of integers.

	Input Format:	The first line contains a single integer, N, representing the size of the array.
			The second line contains N space-separated integers, representing the elements of the array.

	Output Format:	Print the second smallest number in the array.

	Sample Input 1
	6
	5 9 2 8 3 7
	Sample Output 1
	3


	Sample Input 2
	7
	10 5 8 2 6 1 4
	Sample Output 2
	2
*/

import java.util.Scanner;

public class Main {

    public static int findSecondSmallest(int[] array) {
        // Write your code here
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array[1];

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        } 

        int res = findSecondSmallest(array);
        System.out.println(res);
    }
}