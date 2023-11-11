package com.example.demo.service;
import com.example.demo.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
//    Boolean deleteDogByBreed(String breed);
//    Dog updateDogName(Long id, String newName);
}
