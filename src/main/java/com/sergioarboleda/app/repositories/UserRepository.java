package com.sergioarboleda.app.repositories;

import com.sergioarboleda.app.model.User;
import com.sergioarboleda.app.repositories.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author ALEJANDRO TACUE - G11
 */
@Repository
public class UserRepository {
    @Autowired
    private UserCrudRepository repository;

    /**
     * @return Lista de usuarios
     */

    public List<User> getAll() {
        return (List<User>) repository.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    public Optional<User>getUserById(Integer id){
        return repository.findById(id);
    }

    /**
     *
     * @param name
     * @return
     */
    public Optional<User> getUserByName(String name) {
        return repository.findByName(name);
    }

    /**
     *
     * @param email
     * @return
     */
    public Optional<User> getUserByEmail(String email) {
        return repository.findByEmail(email);

    }

    /**
     *
     * @param name
     * @param email
     * @return
     */
    public List<User> getUserByNameOrEmail(String name, String email) {
        return repository.findByNameOrEmail(name, email);
    }

    /**
     *
     * @param email
     * @param password
     * @return
     */
    public Optional<User> getUserByEmailAndPassword(String email, String password) {
        return repository.findByEmailAndPassword(email, password);
    }

    /**
     *
     * @param user
     * @return
     */
    public User save(User user) {
        return repository.save(user);

    }
}
