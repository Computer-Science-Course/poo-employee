package entities;

public class Employee {
	private String name;
	private double grossSalary, tax;
	
	public void printStatus() {
		System.out.printf("Employee: %s, $%.2f.\n", this.name, this.netSalary());
	}
	
	private double netSalary() {
		return (this.grossSalary - this.tax);
	}
	
	public void increaseSalary(double porcentage){
		this.setGrossSalary(this.getGrossSalary() * (1 + (porcentage / 100)));
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getGrossSalary(){
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax(){
		return tax;
	}
	public void setTax(double tax){
		this.tax = tax;
	}	
}
