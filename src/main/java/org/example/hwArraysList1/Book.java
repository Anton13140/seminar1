package org.example.hwArraysList1;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    //названия, фамилии автора, цены, года издания и количества страниц.
    private String name;
    private String author;
    private Integer prise;
    private Integer year;
    private Integer pages;
}
