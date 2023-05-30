package org.example.hwArraysList1;

import java.util.ArrayList;
import java.util.List;

public class Ex {

    public static void main(String[] args) {
//        1. Дан массив записей: наименование товара, цена, сорт.
//        Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».

        Product bread1 = new Product("Уныш высший вкус", 40.5, "Первый сорт");
        Product bread2 = new Product("Макароны", 44.5, "Третий сорт");
        Product bread3 = new Product("Высший сорт молоко", 30.0, "Второй сорт");
        Product bread4 = new Product("Слива Высший", 50.5, "третий сорт");
        Product bread5 = new Product("Высший хлеб", 121.5, "пеРвый сорт");
        Product bread6 = new Product("Редиска", 41.5, "Первый сорт");

        List<Product> productsList = new ArrayList<>();
        productsList.add(bread1);
        productsList.add(bread2);
        productsList.add(bread3);
        productsList.add(bread4);
        productsList.add(bread5);
        productsList.add(bread6);

        List<String> findSort = new ArrayList<>();
        findSort.add("Первый");
        findSort.add("Второй");
        String sortName = "высший";
        Double max = 0.0;

        for (int i = 0; i < productsList.size(); i++) {

            String name = productsList.get(i).getName();
            String grade = productsList.get(i).getGrade();

            if (findName(name, sortName) && findGrade(grade, findSort)) {
                if (max < productsList.get(i).getPrise()) {
                    max = productsList.get(i).getPrise();
                }
            }
        }
        System.out.println("Наибольшая стоимость товара 1го или 2го сорта составляет: " + max);
    }
    public static boolean findName(String name, String subStr) {
        if (name.toLowerCase().contains(subStr.toLowerCase())) {
            return true;
        }
        return false;
    }
    public static boolean findGrade(String gride, List<String> sort) {

        for (String item : sort) {
            if (gride.toLowerCase().contains(item.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
