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
class MyDog implements Dog, Beagle {
	public void speakName() {
		Dog.super.speakName();
		Beagle.super.speakName();
		Dog.bark();
		System.out.println("Look at me go!");
	}
}