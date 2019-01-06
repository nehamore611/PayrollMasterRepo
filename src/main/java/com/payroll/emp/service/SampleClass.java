package com.payroll.emp.service;

import java.util.StringTokenizer;

public class SampleClass {
	
	public String reverseWord(String str){  
		  
        StringBuilder result=new StringBuilder();  
        
        if(str!=null)
       {
	        StringTokenizer tokenizer=new StringTokenizer(str," ");  
	  
	        while(tokenizer.hasMoreTokens()){  
	        StringBuilder sb=new StringBuilder();  
	        sb.append(tokenizer.nextToken());  
	        sb.reverse();  
	  
	        result.append(sb);  
	        result.append(" ");  
	        }  
	        return result.toString();  
	    }
        else
        	return null;
	}
}
