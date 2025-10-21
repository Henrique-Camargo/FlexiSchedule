package dev.rick.FlexiSchedule.user.service;

import dev.rick.FlexiSchedule.user.domain.UserModel;
import dev.rick.FlexiSchedule.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    private final UserRepository repository;

    public UserServices(UserRepository repository) {
        this.repository = repository;
    }

    public UserModel save(UserModel user){
        return repository.save(user);
    }

}
