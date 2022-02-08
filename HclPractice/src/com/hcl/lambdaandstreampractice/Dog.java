package com.hcl.lambdaandstreampractice;

public interface Dog {
       default void speakName() {
    	   System.out.println("I am a dog");
    	   
       }
       static void bark() {
    	   System.out.println("woof");
       }
}
interface Beagle{
	default void speakName() {
		System.out.println("I am a beagle");
	}
}
