/*
	Find the second largest number in a given array of integers. Where second largest number must be different from first largest number.

	Input Format:	The first line contains a single integer, N, representing the size of the array. 
			The second line contains N space-separated integers, representing the elements of the array.

	Output Format:	Print the second largest number in the array.

	Sample Input 1
	5
	1 4 6 3 10
	Sample Output 1
	6


	Sample Input 2
	8
	3 8 2 10 5 9 7 1
	Sample Output 2
	9
*/

import java.util.*;

public class Main {

    public static int findSecondLargest(int[] arr) {
        // write your code here
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int res = findSecondLargest(arr);
        System.out.println(res);

    }
}