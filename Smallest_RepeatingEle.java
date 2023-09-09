/*
	Find the smallest repeating element in a descending sorted array.

	Input Format:	The first line contains an integer 'n' (2 <= n <= 100), representing the size of the array.
			The second line contains 'n' space-separated integers, representing the elements of the array in descending order.

	Output Format:	Print the smallest repeating element in the array.

	Sample Input 1
	5
	10 7 5 5 3
	Sample Output 1
	5


	Sample Input 2
	5
	9 8 7 6 6
	Sample Output 2
	6
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a[] = new int[N];

        for(int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
        }

        int count = 0;
        for(int i=a.length-1; i>=0; i--){
            if(a[i] == a[i-1]){
                count++;
                if(count==1){
                    System.out.println(a[i]);
                }
                break;
            }
        }
    }
}