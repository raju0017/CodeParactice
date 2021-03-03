package basics.prgrams;

public abstract class Car {
 abstract void start();
 abstract void move();
 abstract void stop();
 
}
class Audi extends Car
{
	public void start(){
		System.out.println("audi starts");
	}
	public void move(){
		System.out.println("audi movess");
	}
	public void stop(){
		System.out.println("audi stopss");
	}
	
}
class Benz extends Car
{
	public void start(){
		System.out.println("benz starts");
	}
	public void move(){
		System.out.println("benz movess");
	}
	public void stop(){
		System.out.println("benz stopss");
	}
	
}
class Driver
{
	void driver(Car c){
	c.start();
	c.move();
	c.stop();
	}
}
