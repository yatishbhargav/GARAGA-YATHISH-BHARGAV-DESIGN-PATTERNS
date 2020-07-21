package com.epam.DesignPatterns;

/**
 * Hello world!
 *
 */
import com.epam.AdapterPattern.DriverAdapter;
import com.epam.BridgePattern.DriverBridge;
import com.epam.CommandPattern.DriverCommand;
import com.epam.Prototypepattern.DriverPrototype;
import com.epam.SingletonPattern.DriverSingleton;
import com.epam.TemplatePattern.TemplatePatternDemo;


public class App {
    @SuppressWarnings("unused")
	public static void main( String[] args ){
		TemplatePatternDemo t = new TemplatePatternDemo();
		DriverSingleton s = new DriverSingleton();
		DriverAdapter a = new DriverAdapter();
		DriverCommand c = new DriverCommand();
		DriverBridge b = new DriverBridge();
		DriverPrototype p = new DriverPrototype();
    }
}