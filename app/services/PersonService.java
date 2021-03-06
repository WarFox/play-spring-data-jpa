package services;

import models.Person;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 *
 */
@Named
@Singleton
public interface PersonService {
    Person save(Person person);

    Person findOne(Long id);
}
