package lt.arminai.spring.oauth.resourceserver.entity;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class User {
    private Long id;
    private String name;
    private Integer age;
}
