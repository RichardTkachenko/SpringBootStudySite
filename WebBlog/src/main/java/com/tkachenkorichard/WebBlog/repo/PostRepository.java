package com.tkachenkorichard.WebBlog.repo;

import com.tkachenkorichard.WebBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
