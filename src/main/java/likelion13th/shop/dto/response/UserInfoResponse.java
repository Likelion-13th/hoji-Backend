package likelion13th.shop.dto.response;

import likelion13th.shop.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Optional;

@Getter
@Builder
@AllArgsConstructor
public class UserInfoResponse {
    private String username;
    private Long mileage;
    private String address;
    private String addressDetails;
    private Long zipCode;
    private String provider;
    private Long recentPaymentValue;

    public static UserInfoResponse from(User user) {
        return UserInfoResponse.builder()
                .username(user.getUsername())
                .mileage(user.getMileage())
                .address(user.getAddress())
                .zipCode(user.getZipCode())
                .provider(user.getProvider())
                .recentPaymentValue(user.getRecentPaymentValue())
                .build();
    }
}
