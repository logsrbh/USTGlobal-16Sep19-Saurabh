package com.ustglobal.sorting.set;

import java.util.Comparator;

public class CustSortBySal implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
	 Integer i = o1.sal;
	 Integer j = o2.sal;
	 return i.compareTo(j);
	}

}
