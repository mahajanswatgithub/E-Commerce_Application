package com.example.ECommerceAPI.repository;

import com.example.ECommerceAPI.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {
}
