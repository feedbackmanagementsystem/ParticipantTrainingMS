package com.cg.exception;

public class TrainingProgramException {
	private String message;
	@SuppressWarnings("unused")
	private static final long serialVersionUID = -5747133303192376267L;

	public TrainingProgramException(String msg){
		super();
		
		this.message=msg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
