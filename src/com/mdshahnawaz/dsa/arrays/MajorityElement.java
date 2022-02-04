package com.mdshahnawaz.dsa.arrays;

public class MajorityElement {
	
	static void majorityCheck(int a[]) {
		int max = 0;
		int index = -1;
		for(int i=0;i<a.length;i++) {
			int c = 0;
			for(int j=0;j<a.length;j++) {
				if (a[i] == a[j]) {
					c++;
				}
			}
			if(c>max) {
				max=c;
				index =i;
			}
		}
		if(max>a.length/2) {
			System.out.println(a[index]);
		}else {
			System.out.println("No Majority Element");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 5, 2, 5, 3, 5, 5 };
 
        // Function calling
		majorityCheck(arr);
	}

}
