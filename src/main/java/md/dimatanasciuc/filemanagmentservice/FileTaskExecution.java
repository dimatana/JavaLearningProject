package md.dimatanasciuc.filemanagmentservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {
    public static void main(String[] args) throws IOException {
        File fileObject = new File("src/main/java/md/dimatanasciuc/filemanagmentservice/text.txt");
        FileManager.informIfTheFileExist(fileObject);
        System.out.println(FileManager.createTheFileIfItDoesNotExist(fileObject));
        FileManager.informIfTheFileExist(fileObject);

    FileManager.printTheFileName(fileObject);
        FileManager.printTheAbsolutePath(fileObject);
        FileManager.printIfItIsADirectoryOrAFile(fileObject);


        OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(), "Content");
        OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(), "Something else");
OutputFileWriterManager.writeInformationIntoAFileByUsingBufferWriter(fileObject, "Value Free");
        OutputFileWriterManager.writeInformationIntoAFileByUsingBufferWriter(fileObject, "Value Free 2 ");
        InputFileReadManager.printDataOnTheConsoleUsingFileReader(fileObject);
        System.out.println();
        InputFileReadManager.printDataFromAFilmeUsingBufferedReader(fileObject);
    InputFileReadManager.printDataUsingTheEasiestWay(fileObject);

    }
}
