package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank> {
	
	@Override
	public int compare(Bank o1, Bank o2) {
	
		Integer l = o1.micr;
		Integer m = o2.micr;
		
		return l.compareTo(m);
	}

}
