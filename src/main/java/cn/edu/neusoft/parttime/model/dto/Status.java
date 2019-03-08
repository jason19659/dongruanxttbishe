/**
 * 
 */
package cn.edu.neusoft.parttime.model.dto;

/**
 * @author <a href="mailto:jason19659@163.com">jason19659</a>
 *
 *         taiyi.web.model.dto
 *
 *         2016年3月9日
 */

public class Status implements Comparable<Status>{
	private static Status status;
	
	public final static int SUCCESSED_CODE = 200;
	public final static int FAILED_CODE = 500;
	
	

	public final static Status SUCCESSED = new Status(SUCCESSED_CODE, "成功");
	public final static Status FAILED = new Status(FAILED_CODE, "失败");
	
	private int code = FAILED_CODE;
	private String message = "no info";
	
	public synchronized static Status getSuccess() {
		if (status == null) {
			status = new Status();
		}
		status.setCode(Status.SUCCESSED_CODE);
		status.setMessage("成功");

		return status;
	}

	public synchronized static Status getSuccess(String msg) {
		if (status == null) {
			status = new Status();
		}
		status.setCode(Status.SUCCESSED_CODE);
		status.setMessage(msg);
		return status;
	}

	public synchronized static Status getFailed(String msg) {
		if (status == null) {
			status = new Status();
		}
		status.setCode(Status.FAILED_CODE);
		status.setMessage(msg);
		return status;
	}

	public synchronized static Status getFailed() {
		if (status == null) {
			status = new Status();
		} else {
			status.setCode(Status.FAILED_CODE);
			status.setMessage("失败");
		}
		return status;
	}

	public Status() {

	}
	
	public Status(int code) {
		this.code = code;
	}

	public Status(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Status [message=" + message + ", code=" + code + "]";
	}
	
	public static boolean isSuccess(int statusCode) {
		if (statusCode >= 200 && statusCode < 300) {
			return true;
		}
		return false;
	}
	
	public static boolean isFailed(int statusCode) {
		return !isSuccess(statusCode);
	}
	
	public static boolean isFailed(Status status) {
		return !isSuccess(status);
	}

	public static boolean isSuccess(Status status) {
		return isSuccess(status.getCode());
	}

	/* 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Status o) {
		if (code == o.getCode()) {
			return 0;
		} else if(code < o.getCode()){
			return -1;
		}
		return 1;
	}

}
