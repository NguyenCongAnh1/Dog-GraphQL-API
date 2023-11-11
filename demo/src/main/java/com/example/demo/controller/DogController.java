package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dogs")
public class DogController {
//    private DogServiceImpl dogServiceImpl;
//    public DogController(DogServiceImpl dogServiceImpl) {
//        this.dogServiceImpl = dogServiceImpl;
//    }
//
//    @GetMapping()
//    public ResponseEntity<List<Dog>> getAllDogs(){
//        List<Dog> list = dogServiceImpl.retrieveDogs();
//        return new ResponseEntity<List<Dog>>(list, HttpStatus.OK);
//    }
//
//    @GetMapping("/breed/{id}")
//    public ResponseEntity<String> getDogBreedById (@PathVariable Long id){
//        String foundDog = dogServiceImpl.retrieveDogBreedById(id);
//        return new ResponseEntity<String>(foundDog, HttpStatus.OK);
//    }
//
//    @GetMapping("/name")
//    public ResponseEntity<List<String>> getDogName (){
//        List<String> list = dogServiceImpl.retrieveDogNames();
//        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
//    }
//
//    @GetMapping("/breed")
//    public ResponseEntity<List<String>> getDogBreed (){
//        List<String> list = dogServiceImpl.retrieveDogBreed();
//        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/breed/delete/{breed}")
//    public ResponseEntity<Boolean> deleteDogBreed(@PathVariable String breed){
//        return new ResponseEntity<Boolean>(dogServiceImpl.deleteDogByBreed(breed), HttpStatus.OK);
//    }
//
////    @DeleteMapping("/breed/update/{breed}")
////    public ResponseEntity<Boolean> deleteDogBreed(@ String breed){
////        return new ResponseEntity<Boolean>(dogServiceImpl.deleteDogByBreed(breed), HttpStatus.OK)
////    }

}

