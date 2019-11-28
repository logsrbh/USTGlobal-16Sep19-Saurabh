package com.ustglobal.sorting.set;

import javax.script.Compilable;

public class Employee implements Comparable {
	int id;
	String name;
	double salry;
	
	public Employee(int id, String name, double salry) {
		super();
		this.id = id;
		this.name = name;
		this.salry = salry;
	}

	@Override
	public int hashCode()  {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salry);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salry) != Double.doubleToLongBits(other.salry))
			return false;
		return true;
	}
	
	
	@Override
	public int compareTo(Object o) {
        Employee e = (Employee)o; 
		if(this.id > e.id) {
        	 return 1;
         }else if(this.id < e.id) {
        	 return -1;
         }else {
        	 return 0;
         }
 
	
	}
}
