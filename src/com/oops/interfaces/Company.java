package com.oops.interfaces;

public interface Company {

	default String getName()
	{
		return "defaults.Company";
	}
}
