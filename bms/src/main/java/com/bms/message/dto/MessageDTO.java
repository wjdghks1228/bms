package com.bms.message.dto;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("messageDTO")
public class MessageDTO {
	
	private int    id;
	private String title;
	private String content;
	private Date   date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
