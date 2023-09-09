/*
	Find the longest increasing consecutive subarray in the given array.

	Input Format:	The first line of input contains an integer N (1 <= N <= 10^6), representing the size of the array.
			The second line of input contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array.

	Output Format:	Print the longest increasing consecutive subarray separated by spaces.

	Sample Input 1
	9
	2 4 3 8 5 6 7 8 9
	Sample Output 1
	5 6 7 8 9


	Sample Input 2
	10
	2 3 4 5 2 5 6 7 8 4
	Sample Output 2
	2 3 4 5
*/

import java.util.Scanner; 
 
public class Main { 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt(); 
        int arr[] = new int[n]; 
        for(int i=0;i<arr.length;i++) 
        { 
            arr[i] = scanner.nextInt(); 
        } 
            int maxLength = 1;   
            int length = 1; 
            int end = 0;    
            for(int i = 1; i < arr.length; i++)  
            {  
                if(arr[i] > arr[i-1])  
                { 
                    length++; 
                }  
                else  
                { 
                    if(length > maxLength)  
                    { 
                        maxLength = length; 
                        end = i-1; 
                    } 
                    length = 1;  
                } 
            } 
            if(length > maxLength)  
            {  
                maxLength = length; 
                end = arr.length-1; 
            } 
            for(int i = end-maxLength+1; i <= end; i++)  
            {  
                System.out.print(arr[i] + " "); 
            } 
        } 
    }