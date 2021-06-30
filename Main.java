import java.util.*;
import java.lang.*;
 
public class Main 
{
	public static int max(int arr[], int n)
	{
		int max;
		max = arr[0];
		for(int j=0; j<n-1 ; j++)
		{
			if(arr[j+1] > arr[j])
			{
				max = arr[j+1];
			}
		}

		return max;
	}

	public static int min(int arr[], int n)
	{
		int min;
		min = arr[0];
		for(int k=0; k<n-1; k++)
		{
			if(arr[k+1] < arr[k])
			{
				min = arr[k+1];
			}
		}

		return min;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter length of array");
		int n = sc.nextInt();

		int [] arr = new int[n];
		System.out.println("enter the elements of the array:");
		for(int i=0; i<n; i++)
		{
			int ele = sc.nextInt();
			arr[i] = ele;
		}

		Main instance = new Main();

		int maximum = instance.max(arr,n);
		System.out.println("maximum of array is:"+maximum);
		
		int minimum = instance.min(arr,n);
		System.out.println("minimum of array is:"+minimum);
	}
}