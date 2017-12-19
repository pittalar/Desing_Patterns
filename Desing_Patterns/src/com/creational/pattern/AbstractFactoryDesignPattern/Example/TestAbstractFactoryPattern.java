package com.creational.pattern.AbstractFactoryDesignPattern.Example;

public class TestAbstractFactoryPattern {
	public static void main(String args[]){
		Shape shape = ShapeFactory.getShape(new CircleFactory());
		Shape shape1 = ShapeFactory.getShape(new RectongleFactory());	
		shape.draw();
		shape1.draw();
	}
}
