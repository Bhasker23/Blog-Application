package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.models.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer>{

}
