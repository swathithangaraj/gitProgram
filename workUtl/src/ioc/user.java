package ioc;

public class user {
	private String name;
	private String age;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(String age){
		this.age=age;
	}
	public String getAge(){
		return age;
	}
	
	public void sayUser(){
		System.out.println("i'm "+name+" and age = "+age);
	}
}
