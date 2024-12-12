package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	
	int age;
	String name;
	String breed;
	
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}

	public Dog(String name){
		this.name = name;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String name, String breed){
		this.name = name;
		this.breed = breed;
		age = 1;
	}
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
		breed = "dog dog";
	}
	
	public void setName(String n){
		this.name = n;
	}
	
	public void setAge(int a){
		this.age = a;
	}
	
	public void setBreed(String b){
		this.breed = b;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	
	public boolean isSleeping(){
		int sleep = (int)(Math.random()*2);
		if(sleep==0)
			return true;
		return false;
	}
	
	public void bark(){
		System.out.println(name+" barks!");
	}	
	
}

