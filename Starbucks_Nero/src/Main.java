import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setNationalityId("01234567890");
		customer.setFirstName("Kevser");
		customer.setLastName("Canca");
		customer.setDateOfBirth(new GregorianCalendar(1990,1,7).getTime());
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(customer);
		
		
	
	}

}
