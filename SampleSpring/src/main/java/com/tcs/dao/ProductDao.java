package com.tcs.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

// No need implementation, just one interface, and you have CRUD, thanks Spring Data
public interface ProductDao extends MongoRepository<Product, Long>, ProductDaoCustom {

    Product findFirstByName(String domain);

    Product findByNameAndPrice(String name, Double price);

    //Supports native JSON query string
    @Query("{name:'?0'}")
    Product findCustomByName(String name);

    @Query("{name: { $regex: ?0 } })")
    List<Product> findCustomByRegExName(String name);

}