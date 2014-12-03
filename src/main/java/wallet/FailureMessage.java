package wallet;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class FailureMessage implements Serializable{


	private static final long serialVersionUID = 1L;
	private String errorMessage;
	public FailureMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	@JsonSerialize
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
