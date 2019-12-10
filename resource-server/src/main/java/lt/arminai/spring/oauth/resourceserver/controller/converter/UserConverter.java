package lt.arminai.spring.oauth.resourceserver.controller.converter;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lt.arminai.spring.oauth.resourceserver.controller.dto.UserDto;
import lt.arminai.spring.oauth.resourceserver.entity.User;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UserConverter {

    public static UserDto toDto(User user) {
        if (user == null) {
            return null;
        }

        return new UserDto(user.getId(), user.getName(), user.getAge());
    }
}
