package com.RapidGrow.repositories;

import com.RapidGrow.entities.Post;
import com.RapidGrow.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Long> {

    List<Post> findByUser(User user);
}
