package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.entity.Dog;
import com.example.demo.exception.DogNotFoundException;
import com.example.demo.repository.DogRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private DogRepository dogRepository;

    public Query(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public Iterable<Dog> findAllDog(){
        return dogRepository.findAll();
    }

    public Dog findDogById(Long id){
        Optional<Dog> foundDog = dogRepository.findById(id);
        if(foundDog.isPresent()){
            return foundDog.get();
        }else{
            throw new DogNotFoundException("Not found the dog",id);
        }

    }

//    public List<String> findDogByBreed(String breed){
//        return dogRepository.findAllBreed();
//    }
}
