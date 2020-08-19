package javapractice;

import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class CopyArrayElement {
	
	
	public static void main(String[] args) {
		int mul=1;
		
		Scanner sc= new Scanner(System.in);// creating object of scanner
		System.out.println("Enter the size of array:");
		int n= sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		
		}
			int newa[]=new int[n];
			
			for(int i = 0;i<a.length;i++) {
				
				newa[i]=a[i];
				System.out.println(newa[i]);
			}
		}
		

}
