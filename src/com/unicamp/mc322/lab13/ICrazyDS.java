package com.unicamp.mc322.lab13;

public interface ICrazyDS {
	public void addElement(IOrder oder);
	public void removeElement(IOrder order);
	public IOrder peekElement() throws CrazyDSException;
	public void printElements();
	public IOrder getElementAt(int index) throws CrazyDSException;
}
