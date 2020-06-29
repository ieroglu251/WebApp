package org.studyeasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.entity.Post;
import org.studyeasy.services.PostsServices;

@RestController
public class PostsController {

	@Autowired
	private PostsServices services;

	@RequestMapping("/posts") public List<Post> getPosts() {
		return services.getPosts();
	}

	@RequestMapping("/posts/{id}")
	public Post getPost(@PathVariable int id) {

		return services.getPost(id);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/posts")
	public void addPost(@RequestBody Post listElement) {
		services.addPost(listElement);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
	public void updatePost(@RequestBody Post post) {
		services.updatePost(post);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
	public void deletePost(@PathVariable int id) {
		services.deletePost(id);
	}
}
