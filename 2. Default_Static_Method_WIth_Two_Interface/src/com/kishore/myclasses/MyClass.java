package com.kishore.myclasses;

import com.kishore.MyInterface1;
import com.kishore.MyInterface2;

public class MyClass implements MyInterface1, MyInterface2 {
	
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		c1.m1();
	}

	public void m1() {
		MyInterface1.super.m1();
		//MyInterface2.InnerInterface;
		System.out.println(MyInterface1.s);
	}

	public void m2() {
		// TODO Auto-generated method stub
		MyInterface2.super.m2();
	}

}
