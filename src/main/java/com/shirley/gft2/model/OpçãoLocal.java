package com.shirley.gft2.model;

public enum OpçãoLocal {
	
	
	MORUMBI("Morumbi"),
	SANTANA("Santana"),
	GUAIANASES("Guaianases");
	
	
	private String local;
	
	

	private OpçãoLocal(String local) {
		this.local = local;
	}



	public String getLocal() {
		return local;
	}
}

	
	

