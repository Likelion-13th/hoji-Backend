package likelion13th.shop.dto.response;

import likelion13th.shop.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class AddressResponse {
    private Long zipCode;
    private String address;
    private String addressDetail;

    public static AddressResponse from(User user)
    {
        return AddressResponse.builder()
                .zipCode(user.getZipCode())
                .address(user.getAddress())
                .addressDetail(user.getAddressDetails())
                .build();
    }
}
