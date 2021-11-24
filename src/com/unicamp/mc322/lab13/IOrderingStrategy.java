package com.unicamp.mc322.lab13;
import java.util.Comparator;

public interface IOrderingStrategy extends Comparator<IOrder>{
	public int calcPoints(IOrder order);
}
