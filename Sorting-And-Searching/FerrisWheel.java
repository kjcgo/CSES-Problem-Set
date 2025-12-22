//package cses_sorting_and_searching;
//https://cses.fi/problemset/result/15683780/

import java.util.*;
import java.io.*;

public class FerrisWheel {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int x = Integer.parseInt(line[1]);
		
		String[] temp_kids = br.readLine().split(" ");
		int[] kids = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			kids[i] = Integer.parseInt(temp_kids[i]);
			
		}
		
		Arrays.sort(kids);
		int l = 0;
		int r = n-1;
		int counter = 0;
		
		while(r >= l) {
			
			//if two kids can be matched up
			//System.out.println(l + " " + r + " " + kids[l] + " " + kids[r]);
			if(kids[l] + kids[r] <= x) {
				
				//move to next kid
				l++;
			}
			
			r--;
			counter++;
		}
		
		System.out.println(counter);
	}
}
