package com.tsfsserver.Interface;

import com.tsfsserver.FileContainer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends MongoRepository<FileContainer,String> {
}
