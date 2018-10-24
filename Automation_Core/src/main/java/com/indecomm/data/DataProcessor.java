package com.indecomm.data;
//Interface containing the methods to process the data.
public interface DataProcessor 
{
	//Method used to do I/O operations on the data file.
	public void processData(String fileName);
	//Method which returns the data in form of generic Object.
	public Object getData();
}
