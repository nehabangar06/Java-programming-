package com.neha;

	
	class Employee1 {
		private String name;
		private int ID;
		private long salary;
		public String getSalary;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public long getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
		
		

	public class Employee {

		public static void main(String[] args) {
			
			Employee1 obj = new Employee1 ();
			obj.setName("Siddhi");
			obj.setID(2025);
			obj.setSalary(15000);
			System.out.println("Name:"+obj.getName() + " " + "ID:" + obj.getID()+" Salary:"+obj.getSalary());

		}

	}

}
