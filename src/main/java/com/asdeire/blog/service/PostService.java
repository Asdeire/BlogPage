package com.asdeire.blog.service;

import com.asdeire.blog.model.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPostById(Long id);
    Post savePost(Post post);
    void deletePost(Long id);
}
