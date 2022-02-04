package com.mdshahnawaz.dsa.arrays;

import java.util.Arrays;

/*Find 2 elements with given sum*/
/*nlogn*/
public class TwoSum {
	
	static boolean hasArrayTwoCandidates(int a[], int arr_size, int sum) {
		int f = 0;
		int l = arr_size - 1;
		Arrays.sort(a);
		
		while(f<l) {
			if(a[f] + a[l] == sum) {
				return true;
			}else if(a[f]+a[l] < sum){
				f++;
			}else {
				l--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int a[] = { 1, 4, 45, 6, 10, -8 };
		int sum = 16;
		int arr_size = a.length;
		
		if(hasArrayTwoCandidates(a, arr_size, sum)) {
			System.out.println("Array has two element with given sum.");
		}else {
			System.out.println("Array doesn't have two element with given sum.");
		}
	}

}
