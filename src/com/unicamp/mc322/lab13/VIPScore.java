package com.unicamp.mc322.lab13;

import java.util.Comparator;

public class VIPScore extends PriorityScore implements IOrderingStrategy, Comparator<IOrder>{
	IOrder order1, order2;
	public int calcPoints(IOrder order) {
		return order.getClient().getAge()/100 + 7*order.getTurns()/100 + order.getClient().getPoints();
	}
}
//Pronto