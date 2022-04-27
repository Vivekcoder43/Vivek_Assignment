package problem1;

public class Employee {
 private int id;
 private String Firstname;
 private String Lastname;
 private int salary;
public Employee(int id, String firstname, String lastname, int salary) {
	this.id = id;
	this.Firstname = firstname;
	this.Lastname = lastname;
	this.salary = salary;
}
public int getId() {
	return this.id;
}

public String getFirstname() {
	return this.Firstname;
}

public String getLastname() {
	return this.Lastname;
	
}

public String getName() {
	return this.Firstname+" "+this.Lastname;
}

public int getSalary() {
	return this.salary;
}
public void setSalary(int salary) {
	this.salary=salary;
}

public int getAnnualSalary() {
	return this.salary * 12;
}

 public int raisesalary(int percent) {
	 this.salary=this.salary+ (this.salary* percent)/100;
	 return this.salary;
 }
@Override
public String toString() {
	return "Employee [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", salary=" + salary + "]";
}
 
 
}
