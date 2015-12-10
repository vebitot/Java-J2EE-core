package com.learn.vebitot.model;

public class AccessCredential {
	private String id;
	private String fingerprint;
	
	public void setId(String id){
		this.id = id;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getId() {
		return id;
	}
}
