package md.dimatanasciuc.filemanagmentservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static boolean createTheFileIfItDoesNotExist(File file) throws IOException {
        return file.createNewFile();
    }

    public static void informIfTheFileExist(File file){
        if(file.exists()){
            System.out.println("This file is present");
        } else {
            System.out.println("The file is not present");
        }
    }

    public static void printTheFileName(File fileIsThatConsidered){
        System.out.println(fileIsThatConsidered.getName());

    }
    public static void printTheAbsolutePath(File fileIsThatConsidered) {
        System.out.println(fileIsThatConsidered.getAbsolutePath());
    }

    public static void printIfItIsADirectoryOrAFile(File file){
        if (file.isDirectory()){
            System.out.println("It is a directory");
        } else {
            System.out.println("It is a file");
        }
    }
}
