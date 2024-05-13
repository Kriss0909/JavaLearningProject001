package md.tekwillacademy.exceptionsservicetask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class ArithmeticOperationService {

    public static double devideWithoutExceptionHandling(int a, int b) {
        return a / b;
    }

    public static double devideWithExceptionHandling(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException capturedException) {

            System.out.println(capturedException.getMessage());
            return 0;
        }
    }
        public static  void  readData (String filename) {


            try {
                FileReader fileReader = new FileReader(filename);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Filereader was created");
    }


}
