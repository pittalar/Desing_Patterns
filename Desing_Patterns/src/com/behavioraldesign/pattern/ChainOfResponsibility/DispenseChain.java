package com.behavioraldesign.pattern.ChainOfResponsibility;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency cur);
}
