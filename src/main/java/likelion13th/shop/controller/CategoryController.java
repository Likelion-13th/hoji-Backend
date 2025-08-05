package likelion13th.shop.controller;

import likelion13th.shop.dto.response.ItemResponse;
import likelion13th.shop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final ItemService itemService;

    @GetMapping("/{categoryId}/items")
    public ResponseEntity<List<ItemResponse>> readItemsByCategory(
            @PathVariable Long categoryId
    ) {
        List<ItemResponse> responses = itemService.readItemsByCategory(categoryId);
        return ResponseEntity.ok(responses);
    }
}
