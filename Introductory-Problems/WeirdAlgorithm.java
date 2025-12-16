// package cses_introductory_problems;
// https://cses.fi/problemset/result/15615255/

import java.util.*;

public class WeirdAlgorithm {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = Long.parseLong(scan.nextLine());
		scan.close();
		
		System.out.print(n + " ");
		
		while(n != 1) {
			if(n % 2 == 0) 
				n = n / 2;
			else
				n = n * 3 + 1;
			
			System.out.print(n + " ");
		}
		
	}	
	
}
