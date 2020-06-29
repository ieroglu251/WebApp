package org.studyeasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")

public class Post {
	
	@Id
	@Column(name = "id")
	int PostId;
	
	@Column(name = "title")
	String Title;
	
	@Column(name = "body")
	String body;
	
	
	public Post() {
		super();
	}
	public Post(int postId, String title, String body) {
		
		PostId = postId;
		Title = title;
		this.body = body;
	}
	public int getPostId() {
		return PostId;
	}
	public void setPostId(int postId) {
		PostId = postId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Post [PostId=" + PostId + ", Title=" + Title + ", body=" + body + "]";
	}
	
	

}
