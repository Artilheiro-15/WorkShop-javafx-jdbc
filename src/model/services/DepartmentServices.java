package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentServices {

	
	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Brooks"));
		list.add(new Department(2, "Computers"));
		list.add(new Department(3, "Electronics"));
		return list;
		
	}
}
