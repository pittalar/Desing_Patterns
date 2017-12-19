package com.creational.pattern.singleton;

public class SingletonEagerInitalized {

	private static final SingletonEagerInitalized eagerInitalized = new SingletonEagerInitalized();
	
	private SingletonEagerInitalized(){}
	
	public static SingletonEagerInitalized getInstance(){
		return eagerInitalized;
	}
}
