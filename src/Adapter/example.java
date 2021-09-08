package Adapter;

import java.util.*;

public class example {

	public static void main(String args[])
	{
		Integer nums[]=new Integer[] {23,45,10,11};
		
		List<Integer> list=Arrays.asList(nums);
		
		System.out.println(list);
		System.out.println(nums[0]);
	}
}
