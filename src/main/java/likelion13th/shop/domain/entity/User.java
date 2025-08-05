package likelion13th.shop.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    private Long id;

    private String username;

    private Long mileage;

    private String address;

    private String provider;

    private Long recentPaymentValue;

    private Long zipCode;

    private String addressDetails;

    private LocalDateTime createdAt;
}
