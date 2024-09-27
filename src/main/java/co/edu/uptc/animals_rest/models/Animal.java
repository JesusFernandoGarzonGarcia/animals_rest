package co.edu.uptc.animals_rest.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    private String name;
    private String category;
    private int numberByCategory;

    // Constructor with only two parameters (name, category)
    public Animal(String name, String category) {
        this.name = name;
        this.category = category;
        
    }
}
