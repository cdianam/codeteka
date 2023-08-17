package com.sbt.demo.services.mappers;

import com.sbt.demo.data.Tag;
import com.sbt.demo.entities.TagDB;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TagMapper {

    Tag toDomain(TagDB tag);

    TagDB toEntity(Tag tag);

    List<Tag> toDomain(List<TagDB> tags);

    List<TagDB> toEntity(List<Tag> tags);

}
