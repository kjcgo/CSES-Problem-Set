package cses_sorting_and_searching;

//https://cses.fi/problemset/result/15683166/

import java.util.*;
import java.io.*;

public class DistinctNumbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Set<Integer> nums = new HashSet<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		
		for(int i = 0; i < n; i++) {
			nums.add(Integer.parseInt(input[i]));
		}
		System.out.println(nums.size());
	}
}
