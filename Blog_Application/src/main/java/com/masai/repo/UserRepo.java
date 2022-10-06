package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
