package com.example.demo.repository;


import com.example.demo.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
//    @Query("select d.id, d.breed from Dog d where d.id=:id")
//    String findDogBreedById(Long id);
////
//    @Query("select id, name from Dog")
//    List<String> findAllName();
////
////    @Query("select d.id, d.breed from Dog d")
////    List<String> findAllBreed();
////
//    @Query("select d.id, d.breed from Dog d")
//    List<String> findAllBreed();

//    @Query("delete from Dog d where d.breed=:breed")
//    boolean deleteDogBreed(String breed);

//    @Query("update from Dog d where d.id=:id and d.name=:newName")
//    Dog updateDogName(Long id, String newName);

}
