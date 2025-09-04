package likelion13th.shop.controller;

import likelion13th.shop.dto.request.OrderCreateRequest;
import likelion13th.shop.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Collections;
import java.util.List;

public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ApiResponse<?> createOrder(
            @AuthenticationPrincipal CustomUserDetails customUserDetails,
            @RequestBody OrderCreateRequest request
    ) {
        likelion13th.shop.DTO.response.OrderResponse newOrder = orderService.createOrder(request, customUserDetails);
        return ApiResponse.onSuccess(SuccessCode.ORDER_CREATE_SUCCESS, newOrder);
    }

    @GetMapping
    public ApiResponse<?> getAllOrders(
            @AuthenticationPrincipal CustomUserDetails customUserDetails
    ) {
        List<likelion13th.shop.DTO.response.OrderResponse> orders = orderService.getAllOrders(customUserDetails);

        if (orders.isEmpty()) {
            return ApiResponse.onSuccess(SuccessCode.ORDER_LIST_EMPTY, Collections.emptyList());
        }
        return ApiResponse.onSuccess(SuccessCode.ORDER_LIST_SUCCESS, orders);
    }

    @PutMapping("/{orderId}/cancel")
    public ApiResponse<?> cancelOrder(@PathVariable Long orderId) {

        orderService.cancelOrder(orderId);

        return ApiResponse.onSuccess(SuccessCode.ORDER_CANCEL_SUCCESS, null);
    }
}
