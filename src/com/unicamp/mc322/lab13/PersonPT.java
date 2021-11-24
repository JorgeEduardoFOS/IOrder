package com.unicamp.mc322.lab13;
import java.time.LocalDate;
import java.time.Period;

public class PersonPT {
	private String cpf;
	private String name;
	private Position address;
	private LocalDate birthDate;
	private int points;
	
	PersonPT(LocalDate date, String cpf, String name){
		this.cpf = cpf;
		this.name = name;
		this.birthDate = date;
	}
	public String getCPF() {
		return cpf;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		LocalDate now = LocalDate.now();
		Period age = Period.between(birthDate, now);
		return age.getYears();
	}
	public int getX() {
		return address.getX();
	}
	public int getY() {
		return address.getY();
	}
	public void addPoint(int points) {
		this.points = points;
	}
	public int getPoints() {
		return points;
	}
}
//Pronto