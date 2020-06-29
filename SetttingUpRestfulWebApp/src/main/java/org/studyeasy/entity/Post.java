package org.studyeasy.entity;

public class Post {
	
	int PostId;
	String Title;
	String body;
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
