package com.lab1;

import java.util.Scanner;

public class SideStuff {
    public SideStuff() {
    }

    public static Books generateBooks(Scanner scanner) {
        System.out.print("Pass the amount of books: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        Books books = new Books();

        for(int i = 0; i < num; ++i) {
            Book dateOfBook = new Book();
            System.out.println("\n BOOK " + (i + 1) + " ");
            System.out.print("Enter the title of book: ");
            String title = scanner.nextLine();
            dateOfBook.setTitle(title);
            System.out.print("Enter the second name of seller: ");
            String seller = scanner.next();
            dateOfBook.setSeller(seller);

            int quantity;
            do {
                System.out.print("Enter the quantity of books: ");

                while(!scanner.hasNextInt()) {
                    System.err.print("Enter the quantity of books: ");
                    scanner.next();
                }

                quantity = scanner.nextInt();
                dateOfBook.setQuantity(quantity);
            } while(quantity <= 0);

            double price;
            do {
                System.out.print("Enter the price of books: ");

                while(!scanner.hasNextDouble()) {
                    System.err.print("Enter the price of books: ");
                    scanner.next();
                }

                price = scanner.nextDouble();
                dateOfBook.setPrice(price);
            } while(price <= 0.0D);

            String date;
            do {
                System.out.print("Enter the date (dd/mm/yyyy format): ");
                date = scanner.next();
            } while(!checkDate(date));

            dateOfBook.setDateOfSale(date);
            scanner.nextLine();
            books.addBook(dateOfBook);
        }

        return books;
    }
    public static Workers generateWorker(Scanner scanner) throws Exception {
        System.out.print("\nPlease input the quantity of workers: ");
        final int num = scanner.nextInt();
        scanner.nextLine();

        Workers worker = new Workers();
        for (int i = 0; i < num; i++) {
            Worker dateOfWorker = new Worker();
            System.out.println("\n Worker num " + (i + 1) + " ");

            // Name
            System.out.print("Enter the first name of worker: ");
            String first = scanner.nextLine();
            dateOfWorker.setFirstName(first);
            // Last Name
            System.out.print("Enter the last name of worker: ");
            String last = scanner.nextLine();
            dateOfWorker.setLastName(last);
            // Position
            System.out.print("Enter the position of worker: ");
            String position = scanner.nextLine();
            dateOfWorker.setPosition(position);
            // Salary
            int salary;
            do {
                System.out.print("Enter the salary of worker: ");

                while (!scanner.hasNextInt()) {
                    System.err.print("Enter the salary of worker again, please: ");
                    scanner.next();
                }
                salary = scanner.nextInt();
                dateOfWorker.setSalary(salary);
            } while (salary <= 0);

            // Birthday
            while (true) {
                System.out.print("Enter the date of birth (dd/mm/yy format): ");
                String date = scanner.next();
                if (checkDate(date)) {
                    dateOfWorker.setDateOfBirth(date);
                    break;
                }
            }
            scanner.nextLine();

            worker.addWork(dateOfWorker);
        }
        return worker;
    }

    public static boolean checkDate(String date) {
        String RegExp = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
        return date.matches(RegExp);
    }
}

