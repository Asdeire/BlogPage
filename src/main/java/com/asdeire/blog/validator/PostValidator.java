package com.asdeire.blog.validator;

import com.asdeire.blog.model.Post;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PostValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Post.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Post post = (Post) target;

        if (post.getSlug() == null || post.getSlug().isEmpty()) {
            errors.rejectValue("slug", "Slug cannot be empty");
        }
    }
}

