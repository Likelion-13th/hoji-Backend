package likelion13th.shop.service;

import likelion13th.shop.dto.response.UserInfoResponse;
import likelion13th.shop.dto.response.UserMileageResponse;
import likelion13th.shop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserAddressService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public UserInfoResponse getUserInfo(Long userId) {
        return userRepository.findById(userId)
                .map(UserInfoResponse::from)
                .orElseThrow(() -> new RuntimeException("사용자를 찾을 수 없습니다."));
    }

    @Transactional(readOnly = true)
    public UserMileageResponse getUserMileage(Long userId) {
        return userRepository.findById(userId)
                .map(UserMileageResponse::from)
                .orElseThrow(() -> new RuntimeException("사용자를 찾을 수 없습니다."));
    }
}
