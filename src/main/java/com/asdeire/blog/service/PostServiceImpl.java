package com.asdeire.blog.service;

import com.asdeire.blog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private List<Post> posts = new ArrayList<>();
    private Long currentId = 1L;

    @Override
    public List<Post> getAllPosts() {
        return posts;
    }

    @Override
    public Post getPostById(Long id) {
        return posts.stream().filter(post -> post.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Post savePost(Post post) {
        if (post.getId() == null) {
            post.setId(currentId++);
            posts.add(post);
        } else {
            // Оновити існуючий пост
            int index = posts.indexOf(getPostById(post.getId()));
            if (index != -1) {
                posts.set(index, post);
            }
        }
        return post;
    }

    @Override
    public void deletePost(Long id) {
        posts.removeIf(post -> post.getId().equals(id));
    }
}
