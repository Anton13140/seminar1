package org.example.hwArraysList1;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
//        Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
//                Получить наименования товаров заданного сорта с наименьшей ценой.
        Materials mat1 = new Materials("Доска", "Россия", 1050, 12.0, "первый");
        Materials mat2 = new Materials("Доска", "Дания", 1040, 12.5, "первый");
        Materials mat3 = new Materials("Обои", "Финляндия", 250, 2.0, "первый");
        Materials mat4 = new Materials("Обои", "Греция", 350, 4.2, "первый");
        Materials mat5 = new Materials("Гвозди", "Россия", 4150, 6.0, "первый");
        Materials mat6 = new Materials("Гвозди", "Бельгия", 150, 6.0, "первый");
        Materials mat7 = new Materials("Дрель", "Бразилия", 500, 6.0, "первый");
        Materials mat8 = new Materials("Дрель", "Россия", 120, 6.0, "первый");
        Materials mat9 = new Materials("Метла", "Россия", 120, 6.0, "первый");
        Materials mat10 = new Materials("Пила", "Турция", 420, 6.0, "первый");

        List<Materials> materialsList = new ArrayList<>();
        materialsList.add(mat1);
        materialsList.add(mat2);
        materialsList.add(mat3);
        materialsList.add(mat4);
        materialsList.add(mat5);
        materialsList.add(mat6);
        materialsList.add(mat7);
        materialsList.add(mat8);
        materialsList.add(mat9);
        materialsList.add(mat10);

        String findSort = "первый";
        List<Materials> materialsList2 = new ArrayList<>();

        for (Materials mat:materialsList) {
            if(findInSort(mat.getVariety(), findSort)){
                materialsList2.add(mat);
            }
        }
        for (Materials mat:minPrise(materialsList2)) {
                System.out.println(mat);
        }
    }

    public static boolean findInSort(String name, String subStr) {
        if (name.toLowerCase().equals(subStr.toLowerCase())) {
            return true;
        }
        return false;
    }
    //int i = matList.size()-1; i >= 0; i--
    //int i = 0; i < matList.size(); i++
    public static List<Materials> minPrise(List<Materials> matList){
        for (int i = 0; i < matList.size(); i++) {
            for (int j = 0; j < matList.size(); j++) {
                if(matList.get(i).getName().equals(matList.get(j).getName())){
                    if(matList.get(i).getPrise()<matList.get(j).getPrise()){
                        matList.remove(matList.get(j));
                    }
                    if(matList.get(i).getPrise()>matList.get(j).getPrise()){
                        matList.remove(matList.get(i));
                    }
                }
            }
        }
        return matList;
    }


}
