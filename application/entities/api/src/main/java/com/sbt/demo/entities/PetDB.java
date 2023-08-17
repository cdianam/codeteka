package com.sbt.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pets")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PetDB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50, unique = false)
    private String name;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "pet_tag",
            joinColumns = @JoinColumn(name = "pet_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<TagDB> tags;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryDB category;

    @ElementCollection
    @CollectionTable(name = "pet_photo_urls", joinColumns = @JoinColumn(name = "pet_id"))
    @Column(name = "photo_url")
    private List<String> photoUrls;

    @Column
    private String status;
}

