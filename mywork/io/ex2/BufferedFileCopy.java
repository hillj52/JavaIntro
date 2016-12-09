package mywork.io.ex2;
import java.io.*;

import mywork.io.ex1.FileCounter;
public class BufferedFileCopy {
    public static void main(String a[]) {
        String theLine;
        BufferedReader br = null;
        FileCounter fc = new FileCounter();
        MyKeyboardReader kr = new MyKeyboardReader();
        System.out.println("Enter File Name: ");
        String fileName = kr.readLine();
        try {
            br = new BufferedReader(new FileReader(fileName));
            while((theLine = br.readLine()) != null){
                System.out.println(theLine);
                fc.addLine(theLine);
            }
        } catch(FileNotFoundException e) {
                System.err.println("File Not Found");
                e.printStackTrace();
        } catch(IOException e) {
                System.err.println("IOError: ");
                e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch(IOException e){
                // ignore the exception
            }
        }
        System.out.println("-----------------");
        System.out.println("Lines: " + fc.getNumLines());
        System.out.println("Words: " + fc.getNumWords());
        System.out.println("Chars: " + fc.getNumChars());
    }
}
