		
//	3.   Create a Computer class that has 3 variables. The first variable will have 
//	     a name. The second variable will be the year of the computer. Last variable 
//	     will be the cost of the computer. 
//       All 3 variables should be private instance 
//	     variables and must use getters to retrieve the data and setters to set the 
//	     variables.


package GettersSettersHW;

public class ComputerClass{

	public static void main(String[] args) {

	GettersSettersHW comp1 = new GettersSettersHW(); 
	
	comp1.setName("MacBook Pro");
	comp1.setYear(2021);
	comp1.setCost(1500.00);
	
	
	System.out.println(comp1.getName());
	System.out.println(comp1.getYear());
	System.out.println(comp1.getCost());
	
 
	}
}	

