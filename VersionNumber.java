package com.leetcode.google;

public class VersionNumber {

	 public static int compareVersion(String version1, String version2) {
	       String[] str1= version1.split("\\.", 0);
			String[] str2 = version2.split("\\.",0);
			int i=0;
			while(i<str1.length || i<str2.length) {
				int v1= i<str1.length?Integer.parseInt(str1[i]):0;
				int v2 = i<str2.length?Integer.parseInt(str2[i]):0;
				if(v1<v2) return -1;
				else if(v2<v1) return 1;
				i++;
			}
			 return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(compareVersion("1.0.1", "1.0.4"));
	}

}
