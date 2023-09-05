package com.example.ecommerceapp.bootstrap;

import com.example.ecommerceapp.dao.CountryRepository;
import com.example.ecommerceapp.dao.CustomerRepository;
import com.example.ecommerceapp.dao.DivisionRepository;
import com.example.ecommerceapp.entities.Country;
import com.example.ecommerceapp.entities.Customer;
import com.example.ecommerceapp.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

	private final CustomerRepository customerRepository;
	private final DivisionRepository divisionRepository;
	private final CountryRepository countryRepository;

	public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository, CountryRepository countryRepository) {
		this.customerRepository = customerRepository;
		this.divisionRepository = divisionRepository;
		this.countryRepository = countryRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		mySampleData();
	}

	public void mySampleData () {
		//country object
		Country country = new Country();
		country.setCountry("SampleCountry");

		//save the country to the database
		country = countryRepository.save(country);

		for (int i = 1; i < 5; i++) {

			//division object for testing
			Division division = new Division();
			division.setDivision("SampleDivision" + i);
			//set the country for the division
			division.setCountry(country);

			//save the division to the database
			division = divisionRepository.save(division);

			//sample customers for testing
			Customer customer = new Customer();
			customer.setCustomer_first_name("SampleFirstName" + i);
			customer.setCustomer_last_name("SampleLastName" + i);
			customer.setAddress("Sample Address " + i);
			customer.setPhone("Sample Phone " + i);
			customer.setPostal_code("Sample Postal Code " + i);
			customer.setDivision(division);

			//save the customer to the database
			customerRepository.save(customer);

		}
	}

}
