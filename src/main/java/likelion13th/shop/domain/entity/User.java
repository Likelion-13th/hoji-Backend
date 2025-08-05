package likelion13th.shop.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;

    private String username;

    private String nickname;
}
