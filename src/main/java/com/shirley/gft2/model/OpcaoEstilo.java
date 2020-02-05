package com.shirley.gft2.model;

public enum OpcaoEstilo {
	
	AXE("Axé"),
	SAMBA("Samba"),
	ROCK("Rock");
	
	
	private String estilo;

	
	private OpcaoEstilo(String estilo) {
		this.estilo = estilo;
	}



	public String getEstilo() {
		return estilo;
	}


}
