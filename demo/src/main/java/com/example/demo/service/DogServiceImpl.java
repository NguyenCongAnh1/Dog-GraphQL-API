//package com.example.demo.service;
//
//import com.example.demo.entity.Dog;
//import com.example.demo.repository.DogRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class DogServiceImpl implements DogService{
//    private DogRepository dogRepository;
//    public DogServiceImpl(DogRepository dogRepository) {
//        this.dogRepository = dogRepository;
//    }
//    @Override
//    public List<Dog> retrieveDogs() {
//        return (List<Dog>) dogRepository.findAll();
//    }
//    @Override
//    public List<String> retrieveDogBreed() {
//        return dogRepository.findAllBreed();
//    }
//
//    @Override
//    public String retrieveDogBreedById(Long id) {
//        return dogRepository.findDogBreedById(id);
//    }
//
//    @Override
//    public List<String> retrieveDogNames() {
//        return dogRepository.findAllName();
//    }
//
////    @Override
////    public boolean deleteDogByBreed(String breed) {
////        return dogRepository.deleteDogBreed(breed);
////    }
////    @Override
////    public Dog updateDogName(Long id, String newName) {
////        return dogRepository.updateDogName(newName, id);
////    }
//
//
//}
