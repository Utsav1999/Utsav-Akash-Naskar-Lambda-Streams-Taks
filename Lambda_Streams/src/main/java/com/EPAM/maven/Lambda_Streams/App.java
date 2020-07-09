package com.EPAM.maven.Lambda_Streams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.*;

public class App 
{
	public static double average(List<Integer> arr, int n) {
		double arrSum = 0;
		if(arr.size() == 0)
			return arrSum;
		else
		{
			for(Integer ele : arr)
			{
				arrSum += ele;
			}
			return (arrSum / n); 
		}
	}
	
	public static List<String> findString(List<String> strList)
	{
		 List<String> finalList = strList.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
		 return finalList;
	}
	
	public static void main( String[] args )
    {
    	// task 1 
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the number of elements in the list: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.print("Enter the elements: ");
		for(int i = 0; i < n; i++)
		{
			int data = sc.nextInt();
			arr.add(data);
		}
    	
		
		System.out.println("The average of the list is: " + App.average(arr, n));
		
		// task 2
		System.out.print("Enter the number of string elements: ");
		int m = sc.nextInt();
		ArrayList<String> strList = new ArrayList<>();
    	System.out.print("Enter the string elements: ");
    	sc.nextLine();
    	for(int j = 0; j < m; j++)
    	{
    		String input = sc.nextLine();
    		strList.add(input);
    	}
    	List<String> updatedStrList = App.findString(strList);
    	System.out.print("The updated list: ");
    	System.out.println(updatedStrList);
    	
    	// task 3
    	System.out.print("Enter the number of string elements: ");
    	int l = sc.nextInt(); 
    	ArrayList<String> listOfStr = new ArrayList<>();
    	System.out.print("Enter the string elements: ");
    	sc.nextLine();
    	for(int k = 0; k < l; k++)
    	{
    		String ele = sc.nextLine();
    		listOfStr.add(ele);
    	}
    	List<String> filterList = App.finalList(listOfStr, StrPredicates::isPalindrome);
    	System.out.print("The list of palindromic strings: ");
    	System.out.println(filterList);
    }
	
	public static List<String> finalList(List<String> list, Predicate<String> predicate)
	{
		List<String> resultList = new ArrayList<>();
		for(String s: list)
		{
			if((predicate).test(s))
			{
				resultList.add(s);
			}
		}
		return resultList;
	}
}
