package com.srikanth.Lamdas_and_Streams;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App implements Palin
{
	public void PalindromeList(List<String> list,Predicate<String> predicate) {
		for(String s:list) {
			if(predicate.test(s)) {
				System.out.print(s+" ");
			}
		}
		System.out.println();
	}
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	boolean stop = true;
    	Average avgobj = new Average();
    	App app = new App();
    	StringFilter sfobj = new StringFilter();
    	while(stop) {
    		System.out.println("Prees 1: To find  Avg of n numbers");
    		System.out.println("Prees 2: To check which strings meets criteria");
    		System.out.println("Prees 3: To check which strings are palindrome");
    		int op = Integer.parseInt(br.readLine());
    		if(op==1) {
    			System.out.println("Enter n numbers:");
    			String[] avgInp = br.readLine().split(" ");
    			List<Integer> avgiplist = new ArrayList<>();
    			for(String s:avgInp) {
    				avgiplist.add(Integer.parseInt(s));
    			}
    			System.out.println(avgobj.findAverage(avgiplist));
    		}else if(op==2) {
    			System.out.println("Enter strings separated by space");
    			String[] filterip = br.readLine().split(" ");
    			List<String> filteredResult = sfobj.filterStrings(Arrays.asList(filterip));
    			for(String st:filteredResult) {
    				System.out.print(st+" ");
    			}
    			System.out.println();
    		}else if(op==3){
    			System.out.println("Enter strings separated by space to check palindrome");
    			String[] palindromeip = br.readLine().split(" ");
    			app.PalindromeList(Arrays.asList(palindromeip), (s)->s.equals(new StringBuilder(s).reverse().toString()));
    		}else {
    			stop = false;
    			return;
    		}
    	}
    }
}
