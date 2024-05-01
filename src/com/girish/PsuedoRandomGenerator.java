package com.girish;

import java.util.SplittableRandom;
import java.util.random.RandomGenerator.SplittableGenerator;

public class PsuedoRandomGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sRandom = new SplittableRandom().nextInt(10, 20);
		System.out.println("sRandom:"+sRandom);

	}

}
