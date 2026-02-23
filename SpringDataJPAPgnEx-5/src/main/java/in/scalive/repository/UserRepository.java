package in.scalive.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import in.scalive.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
     Page<User> findByEmailEndingWith(String email,Pageable pageable);	
}
