package lt.arminai.spring.oauth.resourceserver.controller.dto;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class UserDto {
    private Long id;
    private String name;
    private Integer age;
}
