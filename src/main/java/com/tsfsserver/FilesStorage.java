package com.tsfsserver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FilesStorage {
    private List<FileContainer> fileList;

    public FilesStorage() {
        fileList = new ArrayList<>();
    }

    public void AddToFileList(FileContainer fileContainer){
        fileList.add(fileContainer);
    }

    public FileContainer[] GetFileContainers(){
        return fileList.toArray(fileList.toArray(new FileContainer[0]));
    }

}
