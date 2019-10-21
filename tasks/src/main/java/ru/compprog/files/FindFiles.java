package ru.compprog.files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Finding files in a files
 */
public class FindFiles {

  public static void main(String[] args) {
    ArrayList<File> fileList = new ArrayList<>();
    searchFiles(new File("G:\\downloadS\\SCRIN"), fileList);
    System.out.println("========================ENDING scanning=========================");
    for(File file : fileList) {
      System.out.println(file.getAbsoluteFile());
    }
  }

  private static void searchFiles(File rootFile, List<File> fileList) {
    if(rootFile.isDirectory()) {
      System.out.println("Searching at: " + rootFile.getAbsolutePath());
      File[] directoryFiles = rootFile.listFiles();
      if(directoryFiles != null) {
        for(File file : directoryFiles) {
          if(file.isDirectory()) {
            searchFiles(file, fileList);
          } else {
            if(file.getName().toLowerCase().endsWith(".jpg")) {
              fileList.add(file);
            }
          }
        }
      }
    }
  }
}
