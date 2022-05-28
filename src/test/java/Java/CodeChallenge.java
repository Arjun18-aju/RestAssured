package Java;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import groovyjarjarantlr4.runtime.IntStream;
import java.util.stream.*;
public class CodeChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prntNum(1);
		
		if(System.out.append("Hello boy")==null) {
			
		}
	
	//java.util.stream.IntStream.range(1,101).forEach(e->System.out.println(e));
		/*
		 * int one='a'/'a';
		 * 
		 * String s="aaaaaaaaaa";
		 * 
		 * for(int i=one;i<=(s.length() * s.length());i++){ System.out.println(i);
		 */ 
		
	}
		 
		
		
		/*
		 * String s="Hello"; String t="world";
		 * 
		 * s=s+t; System.out.println(s);
		 * 
		 * t=s.substring(0, s.length()-t.length()); System.out.println(t);
		 * 
		 * s=s.substring(t.length()); System.out.println(s);
		 * 
		 * System.out.println("s="+s +" "+"t="+t);
		 * 
		 * 
		 * int a=10; int b=20;
		 * 
		 * a=a+b; b=a-b; a=a-b;
		 * 
		 * System.out.println("the a is=" +a + " " + "b is = "+b); //small num in array
		 * int[] n= {58,40,30,80,90};
		 * 
		 * int small=Integer.MAX_VALUE;
		 * 
		 * for(int i=0;i<n.length;i++) {
		 * 
		 * if(n[i]<small) {
		 * 
		 * small=n[i]; } } System.out.println("the small value= " + small);
		 * 
		 * //find duplicate in array
		 * 
		 */
	public void dup() {
		 List<Integer> ls=Arrays.asList(10,40,40,50,60,50);
	      
	      for(int i=0;i<ls.size();i++) {
	    	  
	      
	      int z=  ls.indexOf(ls);
		 if(ls.lastIndexOf(z)!=i) 
		   {
	    	System.out.println("the duplicate value= " + ls);
	    }
	       
	}
	     
	 
	    	  
	      }
    public static void prntNum(int num) {
  	  
    	if(num<=100) {
    		System.out.println(num);
    		num++;
    		prntNum(num);
    	}
	}
   
}
