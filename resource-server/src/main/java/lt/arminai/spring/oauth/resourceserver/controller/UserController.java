package lt.arminai.spring.oauth.resourceserver.controller;

import lt.arminai.spring.oauth.resourceserver.controller.converter.UserConverter;
import lt.arminai.spring.oauth.resourceserver.controller.dto.UserDto;
import lt.arminai.spring.oauth.resourceserver.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<UserDto> getUser(@RequestParam("id") Long id) {
        return userService.getUser(id)
                .map(UserConverter::toDto)
                .map(user -> ResponseEntity.ok().body(user))
                .orElse(ResponseEntity.noContent().build());
    }
}
