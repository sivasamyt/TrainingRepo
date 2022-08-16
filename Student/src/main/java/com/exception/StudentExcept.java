package com.exception;

import java.security.cert.Extension;

public class StudentExcept extends Exception {
	private String errorMsg;
	

	@Override
	public String getMessage() {
	errorMsg="not";
		return errorMsg;
	}

	public StudentExcept() {
		super();
	}

	public StudentExcept(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	

}
