package com.java.standard.edition.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return Integer.compare(s1.getSid(),s2.getSid());
	}
}
