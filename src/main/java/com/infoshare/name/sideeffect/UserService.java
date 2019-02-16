package com.infoshare.name.sideeffect;


import java.time.Instant;

public class UserService {
    private Validator validator;
    private UserRepository repository;

    public User update(User user) {
        validator.validate(user);
        user.updatedAt = Instant.now();
        repository.save(user);
        return user;
    }
}
