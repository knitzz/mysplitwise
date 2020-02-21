package com.mysplitwise.mysplitwise.group;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends CrudRepository<Group, Long>{
Group findById(long Id);
List<Group> findAll();
}