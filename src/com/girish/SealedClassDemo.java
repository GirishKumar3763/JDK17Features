package com.girish;

sealed class A  permits B,C,D{}
sealed class B extends A permits E {}
final class C  extends A{}
non-sealed class D extends A{}
non-sealed class E extends B{}



public  class SealedClassDemo extends D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Sealed Class Demo");
	}

}
