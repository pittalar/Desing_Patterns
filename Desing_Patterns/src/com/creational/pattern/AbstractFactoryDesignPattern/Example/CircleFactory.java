package com.creational.pattern.AbstractFactoryDesignPattern.Example;

public class CircleFactory implements ShapeAbstractFactory {
	@Override
	public Shape createShape() {
		return new Circle();
	}
}
