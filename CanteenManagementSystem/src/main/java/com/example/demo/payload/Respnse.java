package com.example.demo.payload;

public class Respnse {
	private String message;
	private boolean status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Respnse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	
}
