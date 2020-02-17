package com.google.interview;

import java.util.HashMap;
import java.util.Map;

public class GoogleInt3 {

	public String licenseKeyFormatting(String S, int K) {
        String[] parts = S.split("-",0);
         
        StringBuilder stringBuilder = new StringBuilder();
        
        //convert each substring to upper case
        for(String val: parts){
        	if(val.length()==0) continue;
            stringBuilder.append(val.toUpperCase());
        }
        String original = stringBuilder.toString();
        StringBuilder finalString = new StringBuilder(original.length());
        int maxLength = stringBuilder.length();
        if(K >= maxLength) return stringBuilder.toString();
        int rem = maxLength%K;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(0,rem);
        int i =  rem;
        int l = rem;
        
        while(l<maxLength){
            l +=K;
            m.put(i,l);
            i = l;
        }
        
        int mapSize = m.size();
        int count =0;
        for(Map.Entry<Integer, Integer> map:m.entrySet()){
            int start = map.getKey();
            int end = map.getValue();
            String data = original.substring(start,end);
            finalString.append(data);
            if(count <mapSize-1){
                finalString.append("-");
                count++;
            }
        }
         
        return finalString.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s = "---------qWVCLcAmMarhppUSUeFtXKPaDBxidMCIbKVkNKKGATRrhDWIFyUkwKZeJqiHdwThRefpRGavUrixNRqPSIYdLiwSYdfHNhmWDLho";
  GoogleInt3 g =new GoogleInt3();
  System.out.println(g.licenseKeyFormatting(s, 11));
	}

}
