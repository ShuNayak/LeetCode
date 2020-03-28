package com.leetcode.google;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumberRecursion {

	 public static List<String> letterCombinations(String digits) {
		 
		 List<String> result = new ArrayList<>();
         if(null == digits || digits.length()==0){
             return result;
         }
         result.add("");
        String[] letters = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        recursion(digits, result,"", 0,letters);
        result.remove(0);
        return result;
        
    }

    
    public static void recursion(String digits, List<String> result,String current, int index, String[] letters)   {
        
    	if(digits.length() == index){
            result.add(current);
            return;
        }
        
        String lets = letters[digits.charAt(index)-'0'];
        for(int i=0;i<lets.length();i++){
               recursion(digits, result,current+lets.charAt(i), index+1, letters);         
        }
    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(letterCombinations("23"));
	}

}
