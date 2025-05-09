package com.elc.blc;

public class ProdectMain {
	public static void main(String[] args) {
		Prodect prodect = new Prodect();
		prodect.setProdectDetails("Laptop", 501, 75000.0);
		String rec = prodect.getprodectDetails();
		System.out.println(rec);
		
	}

	

}
