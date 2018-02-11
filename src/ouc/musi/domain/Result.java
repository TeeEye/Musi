package ouc.musi.domain;

public class Result {
	
	private boolean success;
	private String reason;
	private Object data;
	
	public Result() {
		
	}
	
	public Result(boolean success, String reason, Object data) {
		this.success = success;
		this.reason = reason;
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
