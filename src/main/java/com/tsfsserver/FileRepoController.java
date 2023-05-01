package com.tsfsserver;

import com.tsfsserver.Interface.FileRepository;
import java.util.ArrayList;
import java.util.List;

public class FileRepoController {
    private final FileRepository fileRepository;

    public FileRepoController(FileRepository fileRepository) {this.fileRepository = fileRepository;}

    public void SaveFileToDB(FileContainer fileContainer){
        RemoveFileFromDB(fileContainer);
        fileRepository.save(fileContainer);
    }

    public void RemoveFileFromDB(FileContainer fileContainer){
        if(fileRepository.existsById(fileContainer.getFileName())){
            fileRepository.delete(fileContainer);
        }
    }

    public List<FileContainer> GetAllFilesFromDB(){
        List<FileContainer> fileContainersList;
        if(fileRepository.count() == 0){
            fileContainersList = new ArrayList<>();
        }
        else {
            fileContainersList = fileRepository.findAll();
        }
        return fileContainersList;
    }

    public void RemoveAllFileFromDB(){
        fileRepository.deleteAll(GetAllFilesFromDB());
    }
}
