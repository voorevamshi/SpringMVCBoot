package com.vmc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.vmc.entity.User;

public interface UserRepository extends CrudRepository<User,Long>{

	@Query("select u from User u where u.userName  like %:userName% ")
	List<User> searchUsersByName(@Param("userName") String userName);

}
