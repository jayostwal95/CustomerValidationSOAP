package com.imcs.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomerServiceImpl implements CustomerService {
	private static Map<Integer, Customer> customers = new HashMap<Integer, Customer>();
	
	public boolean addCustomer(Customer c) {
		if(customers.get(c.getId()) != null) return false;
		customers.put(c.getId(), c);
		return true;
	}
		
		
	
	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		if(customers.get(id) == null) return false;
		customers.remove(id);
		return true;	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customers.get(id);
	}

	@Override
	public Customer[] getAllCustomer() {
		// TODO Auto-generated method stub
		Set<Integer> ids = customers.keySet();
		Customer[] c = new Customer[ids.size()];
		int i=0;
		for(Integer id : ids){
			c[i] = customers.get(id);
			i++;
		}
		return c;
	}

}
