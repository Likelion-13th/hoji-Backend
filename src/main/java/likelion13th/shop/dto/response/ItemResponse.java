package likelion13th.shop.dto.response;

import likelion13th.shop.domain.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemResponse {
    private Long id;
    private String name;
    private int price;
    private LocalDateTime updatedDate;
    private String imageUrl;

    public static ItemResponse from(Item item) {
        return ItemResponse.builder()
                .id(item.getId())
                .name(item.getName())
                .price(item.getPrice())
                .updatedDate(item.getUpdatedDate())
                .imageUrl(item.getImageUrl())
                .build();
    }
}
