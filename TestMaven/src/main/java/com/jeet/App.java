package com.jeet;

public class App{
	public String Sample() {
		System.out.println("code by maven running successfully");
		System.out.println("Jankin version updated");
		return "sample string";
	}
public int add(int a, int b)
{
	return a+b;
	}
public static void main (String[] args)
{
	App a = new App();
	a.Sample();
	}
}
