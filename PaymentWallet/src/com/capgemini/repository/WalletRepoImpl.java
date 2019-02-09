package com.capgemini.repository;

import java.util.LinkedList;
import java.util.ListIterator;

import com.capgemini.beans.Customer;

public class WalletRepoImpl implements WalletRepo {
	
	LinkedList <Customer> l=new LinkedList<>();
	@Override
	public boolean save(Customer customer) {
		return l.add(customer);
	}

	@Override
	public Customer findOne(String mobilenumber) {
		ListIterator<Customer> it = l.listIterator();
		while(it.hasNext())
		{
			Customer c = it.next();
			if(c.getMobileNumber().equals(mobilenumber))
			{
				return c; 
			}
			
		}
		return null;
	}

}
