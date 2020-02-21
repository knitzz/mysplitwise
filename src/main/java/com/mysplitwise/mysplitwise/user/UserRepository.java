package com.mysplitwise.mysplitwise.user;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
User findById(long Id);
List<User> findAll();
}