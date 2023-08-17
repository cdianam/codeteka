package com.sbt.demo.services.mappers;

import com.sbt.demo.data.Category;
import com.sbt.demo.entities.CategoryDB;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category toDomain(CategoryDB category);

    CategoryDB toEntity(Category category);

    List<Category> toDomain(List<CategoryDB> categories);

    List<CategoryDB> toEntity(List<Category> categories);

}
