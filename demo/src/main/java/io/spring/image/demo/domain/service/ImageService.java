package io.spring.image.demo.domain.service;

import io.spring.image.demo.domain.entity.Image;

import java.util.Optional;

public interface ImageService {
    Image save (Image Image);

    Optional<Image> getById(String id);
}
