package ru.compprog.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create a text file and  writing data to it
 */

public class CreateAndFillFile {

  public static void main(String[] args) throws IOException {
    File file = new File("C:\\projects\\compProg\\compProg\\tasks\\src\\main\\java\\ru\\compprog\\files\\test.txt");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    FileWriter writer = new FileWriter(file,true); //дозаписываем
    //можно обернуть в PrintWriter (new BufferedWriter для writer.println()
    while(true) {
      String lineText = reader.readLine();
      if(!(lineText.isEmpty())) {
        writer.write(lineText);
        writer.flush();
      }
      writer.close();
      break;
    }


  }

}
