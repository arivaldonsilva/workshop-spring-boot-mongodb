package com.nelioalves.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CommentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date Date;
	
	private AuthorDTO author;
	
	public CommentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommentDTO(String text, Date date, AuthorDTO author) {
		super();
		this.text = text;
		Date = date;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	
}
