# salah-21110309-programming
package oop;

public class Salah {

	public static void main(String[] args) {
		Salah2 phone=new Salah2();
		phone.setColor("Sky blue");
		phone.setModel("Iphone 13 pro max");
		phone.setYear(2022);
		
		String color=phone.getColor();
		String model=phone.getModel();
		int year=phone.getYear();
		
		
		System.out.println("The color of the model is "+ model);
		System.out.println("The color of the car is "+ color);
		System.out.println("The color of the year is " + year);
	


	}

}
