package com.example.springbootdockermysql.repository;

import com.example.springbootdockermysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> getByFirstName(String firstName);

    Optional<User> getByLastName(String lastName);

    Optional<User> getByEmail(String email);

}
