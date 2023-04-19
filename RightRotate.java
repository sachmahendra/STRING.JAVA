import java.util.*;
import java.io.*;
import java.lang.*;
class RightRotate
{ 
    

    static void rightRotate(int arr[], int d, int n)
    {
    	int temp[] = new int[d];

    	for(int i = n-d; i  < n; i++)
    	{
    		temp[i-(d+1)] = arr[i];
    	}

    	for(int i = 0; i  < n-d; i++)
        {
    		arr[i +d] = arr[i];
    	}

    	for(int i = 0; i  < d; i++)
    	{
    		arr[ i] = temp[i];
    	}	
    }

    public static void main(String args[]) 
    { 
       int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

       System.out.println("Before Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       rightRotate(arr, d, n);

       System.out.println("After Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}