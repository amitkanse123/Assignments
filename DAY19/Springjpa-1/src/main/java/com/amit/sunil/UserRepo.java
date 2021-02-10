package com.amit.sunil;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo  extends JpaRepository<com.amit.sunil.User, Integer>{

	//Optional<User> findByname(String name);

	Optional<User> findByName(String name);



}