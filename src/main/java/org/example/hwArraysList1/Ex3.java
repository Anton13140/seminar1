package org.example.hwArraysList1;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
//        Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
//        Найти названия книг, в которых простое количество страниц,
//        фамилия автора содержит «А» и год издания после 2010 г, включительно.

        Book book = new Book("КГБТ+", "Пелевин", 1200, 2022, 151);
        Book book1 = new Book("Мастер и Маргарита", "Булгаков", 1000, 1914, 134);
        Book book2 = new Book("Вий", "Гоголь", 1300, 1978, 254);
        Book book3 = new Book("Земля", "Елизаров", 1400, 2020, 157);
        Book book4 = new Book("На дне", "Горький", 900, 1913, 124);

        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(book);
        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);
        bookArrayList.add(book4);


        String subStr = "А";
        Integer year = 2010;

        for (Book item:bookArrayList) {
            if(findName(item.getAuthor(), subStr) && simplNum(item.getPages()) && year< item.getYear()){
                System.out.println(item.getName());
            }

        }

    }

    public static boolean simplNum(Integer num){
        if(num < 2) return false;
        for(int i = 2; i < num / 2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean findName(String name, String subStr) {
        if (name.toLowerCase().contains(subStr.toLowerCase())) {
            return true;
        }
        return false;
    }
}
