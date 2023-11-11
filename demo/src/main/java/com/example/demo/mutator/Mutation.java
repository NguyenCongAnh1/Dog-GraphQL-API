package com.example.demo.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.entity.Dog;
import com.example.demo.exception.DogNotFoundException;
import com.example.demo.repository.DogRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {

    private DogRepository dogRepository;
    public Mutation(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

   public Boolean deleteDog(Long id){
        boolean delete = false;
       Optional<Dog> deletedDog = dogRepository.findById(id);
       if(deletedDog.isPresent()){
           Dog dog = deletedDog.get();
           dogRepository.delete(dog);
           delete=true;
       }else{
           throw new DogNotFoundException("Not found dog", id);
       }
       return delete;

   }

   public Dog updateDogName(String newName, Long id){
        Optional<Dog> updatedDog = dogRepository.findById(id);
        if(updatedDog.isPresent()){
            Dog dog = updatedDog.get();
            dog.setName(newName);
            dogRepository.save(dog);
            return dog;
        }else{
            throw new DogNotFoundException("Not found dog", id);
        }
   }

   public Dog newDog(Long id, String name, String breed, String origin){
        Dog dog = new Dog(id,name,breed,origin);
        dogRepository.save(dog);
        return dog;
   }



}
