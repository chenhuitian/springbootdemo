package bunkerchain.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bunkerchain.entity.Customer;
import bunkerchain.entity.Hotel;
import bunkerchain.repository.CustomerDao;
import bunkerchain.repository.HotelDao;

@RestController
@RequestMapping("/customers")
@Resource
public class CustomerController {
	
	@Autowired
	CustomerDao customerDao;
	@Autowired
	HotelDao hotelDao;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Customer> getCustomer(@PathVariable("id") long id){
		return customerDao.findById(id);
	}
	@RequestMapping()
	public List<Customer> getAll() {
		return customerDao.findAll();
	}
	
	@PostMapping("/add")
	public Customer newCustomer(@RequestBody Customer customer) {

		Hotel h = new Hotel("ht", "htnumber");
		hotelDao.save(h);
		
		Customer c = new Customer("na","Pd","");
		c.setHotel(h);
		
		return	customerDao.save(c);

	}
	
	@PostMapping("/ad")
	public Customer newCCustomer(@RequestBody Customer customer) {

//		Hotel h = new Hotel("ht", "htnumber");
//		hotelDao.save(h);
//		
//		Customer c = new Customer("na","Pd","");
//		c.setHotel(h);
		
		return	customerDao.save(customer);

	}
	

	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteCustomer(@PathVariable("id") Long id) {

		customerDao.deleteById(id);
	  return "success";
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public Customer deleteCustomer(@PathVariable("id") Long id, @RequestBody Customer customer) {
		customer.setId(id);
		customerDao.save(customer);
	  return customerDao.save(customer);
	}
	
//	public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
//	productRepo.remove(id);
//	product.setId(id);
//	productRepo.put(id, product);
//	return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
//	}
	
	
//	@RequestMapping(value="")
//	public ResponseEntity<Object> getProduct() {
//		List<Customer> customers = customerDao.findAll();
//		return new ResponseEntity<List<Customer>>(customers.value(), HttpStatus.OK);
//		
//	}
}