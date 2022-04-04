package com.greatlearning.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.crm.model.Customer;

@Service
public interface CustomerService {

	public List<Customer> findAll();

	public Customer findById(int id); // Read operation

	public void save(Customer customer); // save or update

	public void deleteById(int id); // delete operation

}