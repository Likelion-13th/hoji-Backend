package likelion13th.shop.service;

import likelion13th.shop.domain.entity.Item;
import likelion13th.shop.dto.response.ItemResponse;
import likelion13th.shop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class ItemService {
    public final ItemRepository itemRepository;

    @Transactional(readOnly = true)
    public List<ItemResponse> readItemsByCategory(Long categoryId) {
        List<Item> items = itemRepository.findAllByCategories_Id(categoryId);

        return items.stream()
                .map(ItemResponse::from)
                .collect(Collectors.toList());
    }

}
