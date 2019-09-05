package com.sharma.java.reusing;

public class CompositionExample {

	public static void main(String[] args) {
		Organisation organisation = new Organisation();
		organisation.employee.id = 101;
		System.out.println(organisation);
	}
}

class Organisation {

	Employee employee = new Employee();

	@Override
	public String toString() {
		return "Organisation [employee=" + employee + "]";
	}

}

class Employee {

	int id;

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

}