package com.toyota.models.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.toyota.models.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByNoreg(String noreg);

    void save(UserDetails user);

}
