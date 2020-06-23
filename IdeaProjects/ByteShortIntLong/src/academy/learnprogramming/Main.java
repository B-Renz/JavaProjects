package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        // int occupies 32 bits, and has a width of 32
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxINtValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxINtValue);
        System.out.println("Busted Max Value = " + (myMaxINtValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;

        // byte occupies 8 bits, and has a width of 8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // short occupies 16 bits, and has a width of 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // long occupies 64 bits, and has a width of 64
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2147483647L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue /2);
    }
}
