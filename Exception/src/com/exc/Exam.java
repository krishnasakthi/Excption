package com.exc;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		int a=10;
		
		if(a <=20)
		{
			System.out.println("Then condition true exctu if block");
		}
		else
		{
			System.out.println("Then condition false exctu else block");
		}
        int a1=100/0;
		
		System.out.println(a1);
		}
		
		catch(Exception x)
		{
			System.out.println(x);
		}

	}

}
