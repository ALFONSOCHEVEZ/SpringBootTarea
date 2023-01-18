package com.db_pruebacurso.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.db_pruebacurso.app.entity.User;

@Component
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
