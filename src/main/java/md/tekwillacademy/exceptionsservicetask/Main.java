package md.tekwillacademy.exceptionsservicetask;

import org.w3c.dom.Text;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        System.out.println(TextManager.getTheTextLength("mama"));
        System.out.println(TextManager.getTheTextLengthWithTryAndCatch(null));
        System.out.println(TextManager.getTheTextLength("tata"));
        System.out.println(TextManager.getTheTextLengthWithTryAndCatch("Rodica"));

        TextManager.readDataWithTryCatch("file.txt");
        try {
            TextManager.readWithoutTryAndCatch("text.txt");
        } catch (FileNotFoundException exception){
           exception.printStackTrace();
        }
        System.out.println("Last line");
        System.out.println(ArithmeticOperationService.devideWithExceptionHandling(10,0));
        System.out.println("The show must go on");
    }
}
