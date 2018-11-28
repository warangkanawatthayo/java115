import java.text.NumberFormat;

//Agginment7
//Design and Code a class for a generic product of Plant Nursery

public class Product {
	
	//fields for defining the fields to state of each product object
	
	private String plantCode;
	private String description;
	private double price;
	private static int count = 0;
	
	//constructor method for initializing the state of the created objects
	
	public Product(String plantCode, String description, double price) {
		setplantCode(plantCode);
		setDescription(description);
		setPrice(price);
		count++;
	}
	
	//getter (return) and setter methods 

	public void setplantCode(String plantCode) {
		this.plantCode = plantCode;
	}
	
	public String getplantCode() {
		return plantCode;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setPrice(double price) {
		this.price = price;
		
	}
	
	public double getPrice() {
		return price;
	}
	
		
	public void setCount(int count) {
		count++;
	}
	
	public int getCount() {
		 return count;
	 }
	
	// to implement of formattedPrice method
	
	public String getPriceFormatted() 
	{
	    String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
	    return formattedPrice;
	}
	
	//to return a string representation of object
	
	public String toString() {
        return getplantCode() + " \t " + getDescription() + " \t " + getPriceFormatted();
    }
	
}
