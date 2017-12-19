package com.creational.pattern.AbstractFactoryDesignPattern.Example;

public class ShapeFactory {
 public static Shape getShape(ShapeAbstractFactory aShape){
	 return aShape.createShape();
 }
}
