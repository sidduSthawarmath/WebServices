package com.siddu.restful.util;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomResponse {

	private String status;
	private String description;
	private Object data;

	public CustomResponse() {
	}

	public CustomResponse(String status, String description, Object data) {
		super();
		this.status = status;
		this.description = description;
		this.data = data;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CustomResponse [status=" + status + ", description=" + description + ", data=" + data + "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}