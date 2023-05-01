package com.tsfsserver;

import java.util.ArrayList;
import java.util.List;

public class FilesStorage {
    private List<FileContainer> fileList;
    private FileRepoController fileRepoController;

    public FilesStorage(FileRepoController fileRepoController) {
        fileList = new ArrayList<>();
        this.fileRepoController = fileRepoController;
    }

    public void AddToFileList(FileContainer fileContainer){
        fileList.add(fileContainer);
        fileRepoController.SaveFileToDB(fileContainer);
    }

    public void DeleteFile(String fileName){
        FileContainer fileContainer = GetFileContainerByFileName(fileName);
        fileRepoController.RemoveFileFromDB(fileContainer);
    }

    public void RemoveAllFileFromDB(){
        fileRepoController.RemoveAllFileFromDB();
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

    public void AddFilesFromDB(){
        List<FileContainer> fileContainerListFromDB = fileRepoController.GetAllFilesFromDB();
        for (FileContainer file:fileContainerListFromDB) {
            if(!fileList.contains(file)){
                fileList.add(file);
            }
        }
    }
}
