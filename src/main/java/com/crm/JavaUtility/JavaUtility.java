package com.crm.JavaUtility;

import java.util.Random;

public class JavaUtility {
	
	public static int getRandomNumber()
	{
		Random r=new Random();
		int random = r.nextInt(500);
		return random;
	}

}
