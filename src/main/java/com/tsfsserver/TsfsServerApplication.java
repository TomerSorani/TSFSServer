package com.tsfsserver;

import com.tsfsserver.Interface.FileRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
@EnableMongoRepositories
public class TsfsServerApplication {
    private static FileRepository staticFileRepository;
    private FileRepoController fileRepoController;
    @Autowired
    private FileRepository plugRepository;

    @PostConstruct
    private void init() {
        staticFileRepository = plugRepository;
        this.fileRepoController = new FileRepoController(staticFileRepository);
        Server.UpdateFileRepoController(fileRepoController);

    }

    public static void main(String[] args) {
        SpringApplication.run(TsfsServerApplication.class, args);
    }




}
