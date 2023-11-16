package md.dimatanasciuc.filemanagmentservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFileWriterManager {

    public static void writeInformationIntoAFileUsingFileWriter(String filepath, String content){
        FileWriter fileWriterObject = null;

        try {
            fileWriterObject = new FileWriter(filepath);

            fileWriterObject.write(content);



        } catch (IOException exceptionObject) {
            System.out.println("There is a rpoblem wit the data writing process, let's skip tjos code");
            exceptionObject.printStackTrace();
        }
        finally {
            if (fileWriterObject != null){
                try {
                    fileWriterObject.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public static void writeInformationIntoAFileByUsingBufferWriter(File file, String content){
        BufferedWriter bufferedWriterObject = null;

        try {
            bufferedWriterObject = new BufferedWriter(new FileWriter(file));
            bufferedWriterObject.write(content);

        } catch (IOException exceptionObject) {
            System.out.println(exceptionObject.getMessage());
        }finally {
            if (bufferedWriterObject != null){
              try {
                  bufferedWriterObject.close();
              } catch (IOException e) {
                  System.out.println("There is problem when it comes to close the Writing process ");
              }
            }
        }

    }

}
