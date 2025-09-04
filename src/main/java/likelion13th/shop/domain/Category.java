package likelion13th.shop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany
    private List<Item> items = new ArrayList<Item>();
}
