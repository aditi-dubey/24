package com.tavant.practicalassissmentrestapi.exceptions;



import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NoDataFoundException extends Exception {
	
	public NoDataFoundException(String message) {
		super(message);
		
	}
	
	@Override
	public String toString() {
		return super.toString() ;
	}


}
