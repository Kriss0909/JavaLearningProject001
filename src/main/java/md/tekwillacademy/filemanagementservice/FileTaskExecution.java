package md.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {
    public static void main(String[] args) throws IOException {
        File fileObject01 = new File ("src/main/java/md/tekwillacademy/filemanagementservice/fisier.txt");

        FilesManager.informIfTheFileExists(fileObject01);
        System.out.println(FilesManager.createTheFileIfDoesNotExist(fileObject01));
        FilesManager.informIfTheFileExists(fileObject01);
        FilesManager.printTheFileName(fileObject01);
        FilesManager.printTheAbsolutePath(fileObject01);
        FilesManager.printIfTheFileIsADirectory(fileObject01);
        FilesManager.deleteTheFileIfExists(fileObject01);



        String path ="src/main/java/md/tekwillacademy/filemanagementservice/writedata.txt";
        OutputFilesWriterManager.writeDataIntoTheFilesUsingFileWriter(path,"Content1");
        OutputFilesWriterManager.writeDataIntoTheFilesUsingFileWriter(path,"Content2");
        OutputFilesWriterManager.writeDataIntoTheFilesUsingBufferWriter(path,"Content3");

        InputFilesReadManager.printTheDataFromAFile(path);
        InputFilesReadManager.printDataFromAFileByUsingFileReader(path);
        InputFilesReadManager.printDataFromAFileByUsingBufferReader(path);
    }
}
