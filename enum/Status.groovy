enum Status {
	
	
	SENT("Sent") , FAILED("Failed")  ;

	private String key;
	
	private Status(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public static Status getEmailStatus(String key) {
		for (Status keyValues : Status.values()) {
			if (keyValues.getKey().equals(key)) {
				return keyValues;
			}
		}
		return null;
	}
	
	public static Status getStatusObject(String key){
		Status status = null;
		for(Status keyValue : Status.values()){
			if(keyValue.getKey().toLowerCase().contains(key)){
				status = keyValue;
			}
		}
		return status;
	}
	

}
