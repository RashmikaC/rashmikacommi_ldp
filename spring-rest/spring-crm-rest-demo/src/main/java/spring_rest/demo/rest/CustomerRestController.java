package spring_rest.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring_rest.demo.entity.Customer;
import spring_rest.demo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	// autowire the CustomerService
	@Autowired
	private CustomerService customerService;
	
	// add mapping for GET /customers
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	//mapping for get by customerId
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId)
	{
		Customer tempCustomer=customerService.getCustomer(customerId);
		if(tempCustomer==null)
			throw new CustomerNotFoundException("Customer id not found- "+customerId);
		return tempCustomer;
	}

	//for adding the customer
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer theCustomer)
	{

		//also just in case the pass an id in json ...set id to 0
		//this is force a save of new item..instead of update

		theCustomer.setId(0);
		customerService.saveCustomer(theCustomer);
		return theCustomer;
	}

	//updating the customer
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer theCustomer)
	{
		customerService.saveCustomer(theCustomer);
		return theCustomer;
	}

	//deleting the customer

	@DeleteMapping("/customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId)
	{
		Customer theCustomer=customerService.getCustomer(customerId);
		if(theCustomer == null)
			throw new CustomerNotFoundException("Customer id is not found -"+customerId);
		customerService.deleteCustomer(customerId);
		return "Deleted the customer with id=: "+customerId;
	}
}


















