package ru.compprog.date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class InDateRange {

  public static void main(String[] args) throws ParseException, IOException {
//    String dateFirst = "1995.03.01";
//    String dateSecond = "2015.11.01";


    LocalDate dateFirst = LocalDate.of(1995,03,01);
    LocalDate dateSecond = LocalDate.of(2015,11,01);

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите год, месяц, день  -  через запятую");
    String[] input = reader.readLine().split(",");

    if(Integer.parseInt(input[0]) > dateFirst.getYear() && Integer.parseInt(input[0]) < dateSecond.getYear()) {
      System.out.println("Ваша дата в диапазоне");
    } else if(Integer.parseInt(input[0]) == dateFirst.getYear()) {
      if(Integer.parseInt(input[1]) > dateFirst.getMonthValue()) {
        System.out.println("Ваша дата в диапазоне");
      } else {
        System.out.println("Ваша дата НЕ в диапазоне");
      }
    } else if(Integer.parseInt(input[0]) == dateSecond.getYear()) {
      if (Integer.parseInt(input[1]) < dateSecond.getMonthValue()) {
        System.out.println("Ваша дата в диапазоне");
      } else {
        System.out.println("Ваша дата НЕ в диапазоне");
      }
    }
  }
}
