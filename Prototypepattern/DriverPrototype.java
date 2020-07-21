package com.epam.Prototypepattern;

public class DriverPrototype {
	public DriverPrototype() {
		System.out.println();
		System.out.println("Prototype Pattern");
		ColourStore.getColour("blue").addColour(); 
        ColourStore.getColour("black").addColour(); 
        ColourStore.getColour("black").addColour(); 
        ColourStore.getColour("blue").addColour(); 
	}
}
