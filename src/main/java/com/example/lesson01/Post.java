package com.example.lesson01;

public class Post {
	public String title;
	public String user;
	public String content;
	public String getTitle() {
		return title;
	}
	public Post(String title, String user, String content) {
		super();
		this.title = title;
		this.user = user;
		this.content = content;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
