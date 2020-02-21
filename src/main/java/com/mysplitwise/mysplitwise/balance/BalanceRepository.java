package com.mysplitwise.mysplitwise.balance;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepository extends CrudRepository<balance, Groupuserembeded>{
balance findById(long Id);
}
