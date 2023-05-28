package intViewPurpupose;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random rand=new Random();
		int a=rand.nextInt(200);
		int b=rand.nextInt(455);
		System.out.println("Random integers:"+a);
		System.out.println("Random integers:"+b);
//for double
		double c=rand.nextDouble();
		double d=rand.nextDouble();
		System.out.println("Random numbers:"+c);
		System.out.println("Random numbers:"+d);

		 	}

}
