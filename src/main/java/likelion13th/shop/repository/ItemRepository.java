package likelion13th.shop.repository;


import likelion13th.shop.domain.Item;
import likelion13th.shop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository

public interface ItemRepository extends JpaRepository<Item, Long> {
    Optional<Item> findById(Long itemId);
}