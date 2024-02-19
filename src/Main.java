import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  задача 1
        System.out.println("Задача 1");
        String firstName = "ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О сотрудника - " + fullName);
//  задача 2
        System.out.println("Задача 2");
        String upRegistr = fullName;
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета-" + upRegistr.toUpperCase());
//  Задача 3
        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        String fullNameCorrected = fullName.replace("ё", "е");
        System.out.println(fullNameCorrected);


    }
}







