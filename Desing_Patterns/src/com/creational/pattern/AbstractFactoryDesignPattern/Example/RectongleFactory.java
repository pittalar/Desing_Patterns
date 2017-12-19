package com.creational.pattern.AbstractFactoryDesignPattern.Example;

public class RectongleFactory implements ShapeAbstractFactory{
	@Override
	public Shape createShape() {
		return new Rectongle();
	}
}
