package cses_introductory_problems;
import java.util.*;

// https://cses.fi/problemset/result/15615325/ 
public class Repetitions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("");
		
		char current = input[0].charAt(0);
		int counter = 1;
		int max = 1;
		
		for(int i = 1; i < input.length; i++) {
			if(input[i].charAt(0) != current) {
				current = input[i].charAt(0);
				
				counter = 1;
			}
			else {
				counter++;
			}
			max = Math.max(counter, max);
		}
		
		System.out.println(max);
	}
}
