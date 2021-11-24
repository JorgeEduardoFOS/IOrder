package com.unicamp.mc322.lab13;
import java.util.ArrayList;
import java.util.*;

public class CrazyDS implements ICrazyDS{
	private IOrderingStrategy strategy;
	private ArrayList<IOrder> orders = new ArrayList<IOrder>(); 
	
	CrazyDS(IOrderingStrategy strategy){
		this.strategy = strategy;
	}
	public void addElement(IOrder order) {
		orders.add(order);
		Collections.sort(orders, strategy);
	}
	public void removeElement(IOrder order) {
		orders.remove(order);
	}
	public IOrder peekElement() throws CrazyDSException {
		if(orders.get(0) == null)
			throw new CrazyDSException();
		else
			return orders.get(0);
	}
	public void printElements() {
		for(IOrder element : orders)
			System.out.println(element);
	}
	public IOrder getElementAt(int index) throws CrazyDSException{
		if(index > orders.size())
			throw new CrazyDSException();
		else
			return orders.get(index);
	}
}
