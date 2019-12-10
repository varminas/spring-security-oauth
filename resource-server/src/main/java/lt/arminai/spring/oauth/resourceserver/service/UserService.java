package lt.arminai.spring.oauth.resourceserver.service;

import lt.arminai.spring.oauth.resourceserver.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    public Optional<User> getUser(Long id) {
        return Optional.of(new User(id, "Name", 10));
    }
}
