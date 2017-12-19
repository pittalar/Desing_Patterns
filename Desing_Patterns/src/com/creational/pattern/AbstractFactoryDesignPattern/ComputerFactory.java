package com.creational.pattern.AbstractFactoryDesignPattern;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
