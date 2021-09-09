package Flyweight;

import java.util.*;

public class example {
	
	public static void main(String args[])
	{
		Integer first=Integer.valueOf(5);
		Integer second=Integer.valueOf(5);
		Integer third=Integer.valueOf(35);
		
		System.out.println(System.identityHashCode(first));
		System.out.println(System.identityHashCode(second));
		System.out.println(System.identityHashCode(third));
	}

}
