package com.tsfsserver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilesStorage {
    private List<FileContainer> fileList;
    private FileRepoController fileRepoController;

    public FilesStorage(FileRepoController fileRepoController) {
        fileList = new ArrayList<>();
        this.fileRepoController = fileRepoController;
    }

    public boolean CheckIfFileNameExist(String fileName){
        return GetFileContainerByFileName(fileName) != null;
    }

    public void AddToFileList(FileContainer fileContainer){
        fileList.add(fileContainer);
        fileRepoController.SaveFileToDB(fileContainer);
    }

    public void DeleteFile(String fileName){
        FileContainer fileContainer = GetFileContainerByFileName(fileName);
        if(fileContainer != null){
            fileList.remove(fileContainer);
            fileRepoController.RemoveFileFromDB(fileContainer);
            try {
                deleteSavedFileFromDirectory(fileContainer);
            }
            catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }
        }
    }

    public void RemoveAllFileFromDB(){
        List<String> fileNames = fileList.stream()
                .map(FileContainer::getFileName)
                .collect(Collectors.toList());

        for(String fileName : fileNames){
            DeleteFile(fileName);
        }
    }

    public FileContainer[] GetFileContainers(){
        return fileList.toArray(fileList.toArray(new FileContainer[0]));
    }

    public String GetFileLocationByFileName(String fileName){
        String fileLocation = null;
        for(FileContainer fileContainer:fileList){
            if(fileContainer.getFileName().equals(fileName)){
                fileLocation = fileContainer.getAbsolutePath();
                break;
            }
        }

        return fileLocation;
    }

    public FileContainer GetFileContainerByFileName(String fileName){
        FileContainer res = null;
        for(FileContainer fileContainer:fileList){
            if(fileContainer.getFileName().equals(fileName)){
                res = fileContainer;
                break;
            }
        }

        return res;
    }

//    public void AddFilesFromDB(){
//        List<FileContainer> fileContainerListFromDB = fileRepoController.GetAllFilesFromDB();
//        for (FileContainer file:fileContainerListFromDB) {
//            if(!fileList.contains(file)){
//                fileList.add(file);
//            }
//        }
//    }

    public void AddFilesFromDB() {
        List<FileContainer> fileContainerListFromDB = fileRepoController.GetAllFilesFromDB();
        for (FileContainer file : fileContainerListFromDB) {
            String fileName = file.getFileName();
            boolean fileAlreadyExists = fileList.stream()
                    .anyMatch(existingFile -> existingFile.getFileName().equals(fileName));
            if (!fileAlreadyExists) {
                fileList.add(file);
            }
        }
    }


    private void deleteSavedFileFromDirectory(FileContainer fileContainer) throws IOException {
        Path filePath = Paths.get(fileContainer.getAbsolutePath());
        Files.delete(filePath);
    }

}
