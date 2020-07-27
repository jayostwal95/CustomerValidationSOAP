package com.imcs.training;

public interface CustomerService {
	public boolean addCustomer(Customer c);
	
	public boolean deleteCustomer(int id);
	
	public Customer getCustomer(int id);
	
	public Customer[] getAllCustomer();
}
	


