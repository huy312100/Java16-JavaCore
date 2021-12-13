package Bai13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai13 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
			
		do {
			System.out.print("Enter number of array: ");
			n = sc.nextInt();
		} while (n < 0);
			
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("array[" + i + "] : ");
			array[i] = sc.nextInt();
		}
		System.out.println(System.lineSeparator().repeat(100));
		
		System.out.print("Array: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(array[i] +" ");
	    }
	    System.out.println();
		System.out.println("1)Calculate the average value ");
		System.out.println("2)Find max, min value ");
		System.out.println("3)Find the largest and smallest negative element in the array ");
		System.out.println("4)Find the largest and smallest positive element in the array");
		System.out.println("5)Print even and odd elements");
		System.out.println("6)Add an element by index ");
		System.out.println("7)Remove an element by index");
		
		System.out.print("Select : " );
		
		int selected = sc.nextInt();
		
		switch (selected) {
		case 1:
			int sum=0;
			for (int i = 0; i < n; i++) {
				sum+=array[i];
			}
			System.out.println("Average value:"+sum/n);
			break;
		case 2:
			int max=array[0];
			int min=array[0];
			for (int i = 0; i < array.length; i++) {
				if(array[i]>max) {
					max=array[i];
				}
				if (array[i]<min) {
					min=array[i];
				}
			}
			System.out.println("Max value:"+max);
			System.out.println("Min value:"+min);
			break;
		case 3:
			Integer maxNega =null;
			Integer minNega =null;
			for (int i = 0; i < array.length; i++) {
				if(array[i]<0) {
					maxNega=array[i];
					minNega=array[i];
					for(int j=0;j<n;j++)
				    {
						if(array[j]>maxNega && array[j]<0) {
				    	 maxNega=array[j];
						}
						if(array[j]<minNega && array[j]<0) {
					    	 minNega=array[j];
						} 
				    }
				}
			}
			System.out.println("Max negative value:"+maxNega);
			System.out.println("Min negative value:"+minNega);
			break;
		case 4:
			Integer maxPosi =null;
			Integer minPosi =null;
			for (int i = 0; i < array.length; i++) {
				if(array[i]>0) {
					maxPosi=array[i];
					minPosi=array[i];
					for(int j=0;j<n;j++)
				    {
						if(array[j]>maxPosi && array[j]>0) {
							maxPosi=array[j];
						}
						if(array[j]<minPosi && array[j]>0) {
							minPosi=array[j];
						} 
				    }
				}
			}
			System.out.println("Max positive value:"+maxPosi);
			System.out.println("Min positive value:"+minPosi);
			break;
		case 5:
			List<Integer> odd =new ArrayList<Integer>();
			List<Integer> even =new ArrayList<Integer>();
			for (int i = 0; i < array.length; i++) {
				if (array[i]%2 == 0) {
					even.add(array[i]);
				}
				else {
					odd.add(array[i]);
				}
			}
			System.out.println("Even number:"+even);
			System.out.println("Odd number:"+odd);
			break;
		case 6:
			System.out.println("Enter value you want to add : ");
			int addElement =sc.nextInt();
			int idAdd;
			do {
				System.out.println("Enter index you want to add : ");
				idAdd=sc.nextInt();
			} while (idAdd>n || idAdd<0);
			List<Integer> newarr =new ArrayList<Integer>();
	        for (int i = 0; i < n; i++) {
	        	newarr.add(array[i]);
	        }
	        newarr.add(idAdd,addElement);
			System.out.print("Array after insert : "+newarr);
			break;
		case 7:
			int idRemove;
			do {
				System.out.println("Enter index you want to remove : ");
				idRemove=sc.nextInt();
			} while (idRemove>n-1 || idRemove<0);
			List<Integer> newarr0 =new ArrayList<Integer>();
	        for (int i = 0; i < n; i++) {
	        	newarr0.add(array[i]);
	        }
	        newarr0.remove(idRemove);
			System.out.print("Array after remove : "+newarr0);
			break;
		default:
			System.out.println("Enter number from 1-7. Try again");
		}
	}
	
}
