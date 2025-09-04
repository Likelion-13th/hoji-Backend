package likelion13th.shop.dto.response;

import likelion13th.shop.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

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
                .provider(user.getProvider())
                .recentPaymentValue(user.getRecentPaymentValue())
                .build();
    }
}
