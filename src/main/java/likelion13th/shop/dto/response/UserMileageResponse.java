package likelion13th.shop.dto.response;

import likelion13th.shop.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserMileageResponse {
    private Long mileage;

    public static UserMileageResponse from(User user) {
        return UserMileageResponse.builder()
                .mileage(user.getMileage())
                .build();
    }
}
