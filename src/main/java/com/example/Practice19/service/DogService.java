package com.example.Practice19.service;

import com.example.Practice19.models.Dog;
import com.example.Practice19.models.User;
import com.example.Practice19.repository.DogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DogService {

    @Autowired
    private DogRepository dogRepository;

    public User getUserByDog(Long dogId) {
        log.info("Find user by dogId " + dogId);
        return dogRepository.findOneById(dogId).getUser();
    }

    public Dog findById(Long id) {
        log.info("Find dog by id " + id);
        return dogRepository.findOneById(id);
    }

    public List<Dog> findByName(String name) {
        log.info("Find dog by name " + name);
        return dogRepository.findAllByName(name);
    }

    public List<Dog> findByBreed(String breed) {
        log.info("Find dog by breed " + breed);
        return dogRepository.findAllByBreed(breed);
    }

    public List<Dog> getAllDogs() {
        log.info("Find all dogs.");
        return dogRepository.findAll();
    }
}
