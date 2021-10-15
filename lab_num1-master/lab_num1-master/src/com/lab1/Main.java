package com.lab1;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalUnit;
import java.util.Locale;
import java.util.Scanner;

    public class Main {
        public Main() {
        }

        public static void main(String[] args) throws Exception {
            Locale.setDefault(Locale.US);
           Scanner scanner = new Scanner(System.in);
            Books books = SideStuff.generateBooks(scanner);
            System.out.println(books.toString());
            Workers workers = SideStuff.generateWorker(scanner);
            System.out.println(workers.toString());
            scanner.close();
          /*  LocalDate birthday = LocalDate.of(2000, 12, 24);
            LocalDate now = LocalDate.now();

            System.out.println(Period.between(birthday, now).getYears());

           */
        }
    }





