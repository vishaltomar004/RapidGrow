package com.RapidGrow.repositories;

import com.RapidGrow.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
