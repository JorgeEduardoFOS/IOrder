package com.unicamp.mc322.lab13;

public class Order implements IOrder{
	private int turns;
	private String code;
	private PersonPT client;
	
	Order(PersonPT client){
		this.client = client;
	}
	public void incrementTurn() {
		++turns;
	}
	public int getTurns() {
		return turns;
	}
	public String getCode(){
		return code;
	}
	public void printOwner() {
		System.out.println("Nome do cliente: " + client.getName());
	}
	public void printOwnerFullData() {
		System.out.println("Nome do cliente: " + client.getName());
		System.out.println("CPF do cliente: " + client.getCPF());
	}
	public PersonPT getClient() {
		return client;
	}
	/////////
	//Área de teste
	////////
	public static void main(String[] args) { 
		
	}
}