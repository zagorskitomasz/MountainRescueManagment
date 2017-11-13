package com.zagorskidev.rescuecrm.dao;

import java.util.List;

import com.zagorskidev.rescuecrm.entity.Operation;

public interface OperationDAO {

	public List<Operation> getAll();
	public List<Operation> getSpecific(String state);
	public Operation get(int id);
	public void persist(Operation operation);
	public void delete(int id);
}
