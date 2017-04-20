package com.tcs.dao;

import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

//Impl postfix of the name on it compared to the core repository interface
public class ProductDaoImpl implements ProductDaoCustom {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public int updateProduct(String name, Double price) {

        Query query = new Query(Criteria.where("name").is(name));
        Update update = new Update();
        update.set("price", price);

        WriteResult result = mongoTemplate.updateFirst(query, update, Product.class);

        if(result!=null)
            return result.getN();
        else
            return 0;

    }
}