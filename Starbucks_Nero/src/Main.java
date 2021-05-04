import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setNationalityId("37229058689");
		customer.setFirstName("Kevser");
		customer.setLastName("Canca");
		customer.setDateOfBirth(new GregorianCalendar(1990,1,7).getTime());
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		
		
	
	}

}
