package me.dio.sdw24.domain.model.ports;

import me.dio.sdw24.domain.model.Champions;

import java.util.List;
import java.util.Optional;

public interface ChampionsRespository {

    List<Champions> findAll();

    Optional<Champions> findById(Long id);
}
