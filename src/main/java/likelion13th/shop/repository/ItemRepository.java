package likelion13th.shop.repository;

import likelion13th.shop.domain.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findAllByCategories_Id(Long categoryId);
}
