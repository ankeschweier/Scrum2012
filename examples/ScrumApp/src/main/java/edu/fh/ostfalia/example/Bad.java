package edu.fh.ostfalia.example;

public class Bad {
	public static void main(String[] args) {
		int unused;
		foo();
		bar();
	}
	
	private void unused()
	{
	}
	
	private static void foo()
	{
		int a = 1;
		int b = 2;
		System.out.println(a+b);
	}
	
	private static void bar()
	{
		int a = 1;
		int b = 2;
		System.out.println(a+b);
	}
}
