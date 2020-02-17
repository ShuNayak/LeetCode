package com.google.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GoogleInt {
	    public int numUniqueEmails(String[] emails) {
	        Map<String, Set<String>> data = new HashMap<String, Set<String>>();
	       
	        // take the domain name out
	        for(String e: emails){
	            String[] parts = e.split("@",2);
	            String local = simplify(parts[0]);
	            if( data.get(parts[1]) == null){
	                Set<String> s = new HashSet<String>();
	                s.add(local);
	                data.put(parts[1],s);
	            }
	            else{
	                Set<String> s = data.get(parts[1]);
	                s.add(local);
	                data.put(parts[1],s);
	            }
	        }
	        Set<Map.Entry<String, Set<String>>> s = data.entrySet();
	        int count = 0;
	        for(Map.Entry<String, Set<String>> map: s){
	            count  = count + map.getValue().size();
	        }
	        
	        return count;
	    }
	    
	    //simplify every email localname before add it to hashmap
	    public String simplify(String localName){
	        StringBuilder org = new StringBuilder(localName);
	      
	        int plusIndex = org.indexOf("+");
	        
	        //first get rid of plus then period
	        if( plusIndex != -1){
	            org = new StringBuilder(org.substring(0,plusIndex));
	        }
	        
	        while( org.indexOf(".") != -1){
	            int periodIndex = org.indexOf(".");
	            org = org.deleteCharAt(periodIndex);
	        }
	        
	        return org.toString();
	          
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		GoogleInt g = new GoogleInt();
		int c = g.numUniqueEmails(emails);
		System.out.println("the number of emails:"+ c);
	}

}
