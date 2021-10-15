package com.lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class Worker {
    /*Фамилия
    Имя
    Отчество
    Должность
    Зарплата
    Дата рождения
    Вывести данные о самом молодом сотруднике.

    */
    private String firstName;
    private String lastName;
    private String position;
    private int salary;
    private Date dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.strip();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.strip();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position.strip();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary> 0 ? salary : -1;
    }

    public String getDateOfBirth() {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(this.dateOfBirth);
    }

    public void setDateOfBirth(String dateOfBirth) {
        try {
            this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        } catch (ParseException pe) {
            System.err.println("Error!");
        }

    }

    public static final String DATE_FORMAT_NOW = "dd/MM/yyyy";

    public static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }
}


