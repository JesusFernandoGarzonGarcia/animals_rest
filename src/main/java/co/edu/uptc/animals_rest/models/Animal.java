package co.edu.uptc.animals_rest.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // Default no-args constructor
@AllArgsConstructor
public class Animal {
    private String name;
    private String category;
    private String numberByCategory;

     public Animal(String name, String category) {
        this.name = name;
        this.category = category;
    }
}
