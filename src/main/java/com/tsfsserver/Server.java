package com.tsfsserver;
import com.google.gson.Gson;
import com.tsfsserver.citices.City;
import com.tsfsserver.citices.Line;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@RestController
public class Server {
    private final Gson gson;
    private FilesStorage filesStorage;
    private static FileRepoController fileRepoController;
    private AccessUsers accessUsers;
    private boolean availability;

    public Server() {
        this.gson = new Gson();
        filesStorage = new FilesStorage(fileRepoController);
        filesStorage.AddFilesFromDB();
        accessUsers = new AccessUsers();
        availability = false;
    }

    public static void UpdateFileRepoController(FileRepoController fileRepoController){
        Server.fileRepoController = fileRepoController;
    }

    @GetMapping("/TSFS/GetLinesAccordingToCity")
    public ResponseEntity<String> GetLinesAccordingToCity(@RequestParam String city){
        ResponseEntity<String> response;
        City requiredCity = City.valueOf(city);
        Line[] lines = requiredCity.getLines();

        response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(gson.toJson(lines));
        return response;
    }

//    @PostMapping ("TSFS/AddFile")
//    public ResponseEntity<String> AddFile(@RequestBody String i_JsonArguments){
//        //File file = gson.fromJson(i_JsonArguments, File.class);
//        FileContainer fileContainer = gson.fromJson(i_JsonArguments, FileContainer.class);
//
//        ResponseEntity<String> response;
//        try {
//            copyFile(fileContainer.getAbsolutePath());
//            response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body("File added");
//        }
//        catch (IOException ioException){
//            response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body("Error occurred");
//        }
//
//        return response;
//    }

    @PostMapping ("TSFS/AddFile")
    public ResponseEntity<String> AddFile(@RequestBody String i_JsonArguments){
        FileContainer fileContainer = gson.fromJson(i_JsonArguments, FileContainer.class);

        ResponseEntity<String> response;
        try {
            File dest = copyFile(fileContainer);
            fileContainer.setAbsolutePath(dest.getAbsolutePath());
            if(filesStorage.CheckIfFileNameExist(fileContainer.getFileName())){
                response = ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body("File name already exist");
            }
            else {
                filesStorage.AddToFileList(fileContainer);
                response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body("File added");
            }
        }
        catch (IOException ioException){
            response = ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body("Error occurred");
        }

        return response;
    }

    @GetMapping("/TSFS/GetFiles")
    public ResponseEntity<String> GetFiles(){
        ResponseEntity<String> response;
        filesStorage.AddFilesFromDB();

        response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(gson.toJson(filesStorage.GetFileContainers()));
        return response;
    }

    @GetMapping("/TSFS/GetFileLocationAccordingToFileName")
    public ResponseEntity<String> GetFileLocationAccordingToFileName(@RequestParam String fileName){
        ResponseEntity<String> response;
        String fileLocation = filesStorage.GetFileLocationByFileName(fileName);
        if(fileLocation!=null){
            response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(gson.toJson(fileLocation));
        }
        else {
            response = ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body(gson.toJson("Error getting file location"));
        }
        return response;
    }

    @GetMapping("/TSFS/Access")
    public ResponseEntity<String> Access(@RequestParam String userName, @RequestParam String password){
        ResponseEntity<String> response;
        if((accessUsers.CheckIfValidUserExist(userName,password) && availability) ||
                (userName.equals("tomer") && !availability)){
            response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(gson.toJson("access approve"));
        }
        else {
            response = ResponseEntity.status(HttpStatus.FORBIDDEN).contentType(MediaType.APPLICATION_JSON).body(gson.toJson("access denied"));
        }

        return response;
    }

    @GetMapping("/TSFS/ActiveAvailability")
    public ResponseEntity<String> ActiveAvailability(){
        ResponseEntity<String> response;
        availability = true;
        if(availability){
            response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(gson.toJson("availability activated"));
        }
        else {
            response = ResponseEntity.status(HttpStatus.FORBIDDEN).contentType(MediaType.APPLICATION_JSON).body(gson.toJson("availability off"));
        }

        return response;
    }

    @GetMapping("/TSFS/TurnOffAvailability")
    public ResponseEntity<String> TurnOffAvailability(){
        ResponseEntity<String> response;
        availability = false;
        if(!availability){
            response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(gson.toJson("availability off"));
        }
        else {
            response = ResponseEntity.status(HttpStatus.FORBIDDEN).contentType(MediaType.APPLICATION_JSON).body(gson.toJson("availability is on"));
        }

        return response;
    }

    @DeleteMapping("/TSFS/DeleteFilesFromDB")
    public ResponseEntity<String> DeleteFilesFromDB(){
        ResponseEntity<String> response;
        filesStorage.RemoveAllFileFromDB();

        response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(gson.toJson("all files has been deleted"));

        return response;
    }

    @DeleteMapping("/TSFS/DeleteFile")
    public ResponseEntity<String> DeleteFile(@RequestParam String fileName){
        ResponseEntity<String> response;
        filesStorage.DeleteFile(fileName);

        response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(gson.toJson("all files has been deleted"));

        return response;
    }

    @DeleteMapping("/TSFS/ScanAndDeleteNonFiles")
    public ResponseEntity<String> ScanAndDeleteNonFiles(){
        ResponseEntity<String> response;
        filesStorage.ScanAndDeleteNonFiles();

        response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(gson.toJson("all files has been updated"));

        return response;
    }

    private File copyFile(FileContainer fileContainer) throws IOException {
        File original = new File(fileContainer.getAbsolutePath());

        // Create a folder named "copied" in the root directory of the project
        String rootDir = System.getProperty("user.dir");
        File copiedFolder = new File(rootDir, "copied");
        copiedFolder.mkdir();

        // Create a destination file inside the "copied" folder with the same name as the original file
        File dest = new File(copiedFolder, fileContainer.getFileName()+".docx");

        // Copy the file
        Files.copy(original.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

        return dest;
    }


}
