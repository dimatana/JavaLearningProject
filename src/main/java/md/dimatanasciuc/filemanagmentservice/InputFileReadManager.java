package md.dimatanasciuc.filemanagmentservice;

import java.io.*;
import java.nio.file.Files;

public class InputFileReadManager {

    public static void printDataOnTheConsoleUsingFileReader(File file){
        FileReader fileReaderObject = null;

        try {
            fileReaderObject = new FileReader(file);

            int charNumberInAsciiSystems;
            while ((charNumberInAsciiSystems = fileReaderObject.read()) != -1){
                System.out.print((char) charNumberInAsciiSystems);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found, the procedure is aborted");
        } catch (IOException e){
            System.out.println("There is a problem with the read process");
        }
    }
    public static void printDataFromAFilmeUsingBufferedReader(File file){
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("exception has occured, skip the reading");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    public static void printDataUsingTheEasiestWay(File file){
        try {
            String content = Files.readString(file.toPath());
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
