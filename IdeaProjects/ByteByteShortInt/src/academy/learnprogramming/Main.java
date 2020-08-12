package academy.learnprogramming;

import java.nio.file.FileSystemNotFoundException;

public class Main {

    public static void main(String[] args) {
	    int myValue = 1000;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
	    System.out.println("Integer Min Value = " + myMinIntValue);
	    System.out.println("Integer Max Value = " + myMaxIntValue);
		System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
		System.out.println("Busted Min Value = " + (myMinIntValue - 1));

		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Min Value = " + myMinByteValue);
		System.out.println("Byte Max Value = " + myMaxByteValue);

		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Long Min Value = " + myMinShortValue);
		System.out.println("Long Max Value = " + myMaxShortValue);
		
		long myLongValue = 100L;

		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Min Value = " + myMinLongValue);
		System.out.println("Long Max Value = " + myMaxLongValue);

		int myTotal = (myMinIntValue/2);

		//Casting: in order to prevent a type error,
		// we must declare result to be equal type
		// of declared variable
		byte myNewByteValue = (byte) (myMinByteValue / 2);

		short myNewShortValue = (short) (myMinShortValue / 2);

		//Challenge: Primitive Types

		byte myByteE = 11;
		short myShortE = 111;
		int myIntE = 22;

		long myLongE = (10*(myByteE + myShortE)) + 50000;
		System.out.println("My longE is " + myLongE + " long");
    }
}
