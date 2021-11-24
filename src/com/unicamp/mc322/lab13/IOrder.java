package com.unicamp.mc322.lab13;

public interface IOrder {
	public void incrementTurn();
	public int getTurns();
	public String getCode();
	public void printOwner();//?
	public void printOwnerFullData();//?
	public PersonPT getClient();//?
}
//Conferir métodos