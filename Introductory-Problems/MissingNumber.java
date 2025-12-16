//package cses_introductory_problems;

// https://cses.fi/problemset/result/15615294/

import java.util.*;

public class MissingNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = Long.parseLong(scan.nextLine());
		long sum = (n * (n+1)) / 2;
		String[] input = scan.nextLine().split(" ");
		for(int i = 0; i < n - 1; i++) {
			sum -= Long.parseLong(input[i]);
		}
		System.out.println(sum);
		scan.close();
		
	}
}
