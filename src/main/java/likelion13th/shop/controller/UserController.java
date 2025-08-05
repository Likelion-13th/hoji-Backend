package likelion13th.shop.controller;

import likelion13th.shop.dto.response.UserInfoResponse;
import likelion13th.shop.service.UserAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserAddressService userAddressService;

    @GetMapping("/info")
    public ResponseEntity<UserInfoResponse> getUserInfo(
        //@AuthenticationPrincipal UserDetails userDetails
        @RequestParam Long userId
    ) {
        UserInfoResponse responses = userAddressService.getUserInfo(userId);
        return ResponseEntity.ok(responses);
    }
}
