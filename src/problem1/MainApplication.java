package problem1;

import problem2.*;

public class MainApplication {

	public static void main(String[] args) {
	     Employee x= new Employee(5,"sai","vivek",30000);
	     System.out.println(x.getId());
	     System.out.println(x.getName());
	     x.setSalary(40000);
	     System.out.println(x.getSalary());
	     System.out.println( x.getAnnualSalary());
	     System.out.println(x.raisesalary(10));
	     System.out.println(x.toString());
	     Author y=new Author("vivek","saivivek@gmail.com",'M');
	     Book_model z=new Book_model("KGF 2", y,1000,2);
	     System.out.println(z.toString());
	     
	     
         
	}

}
