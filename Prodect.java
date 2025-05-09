package com.elc.blc;

public class Prodect {
	private String prodectName;
	private int prodectId;
	private double  price ;
	public void setProdectDetails(String name,int id , double prc) {
		prodectName = name;
		prodectId = id;
		price = prc;
		
	}
	public String getprodectDetails() {
		return "Prodect Name " + prodectName + "\nProdect ID :" + prodectId + "\nprodect price" + price ;

	
	}

}