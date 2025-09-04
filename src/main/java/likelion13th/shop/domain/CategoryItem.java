package likelion13th.shop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
@AllArgsConstructor
@Builder
public class CategoryItem {
    @Id
    private Long id;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Item item;
}
