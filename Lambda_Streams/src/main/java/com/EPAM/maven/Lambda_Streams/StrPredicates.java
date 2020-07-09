package com.EPAM.maven.Lambda_Streams;

public class StrPredicates {
	public static boolean isPalindrome(String s)
	{
		int start, end;
		start = 0;
		end = s.length()-1;
		while(start < end)
		{
			if(s.charAt(start) != s.charAt(end))
				return false;
			else
			{
				start++;
				end--;
			}
				
		}
		return true;
	}

}
