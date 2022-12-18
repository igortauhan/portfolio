package com.igortauhan.portfolio.service.impl;

import com.igortauhan.portfolio.dto.AboutDTO;
import com.igortauhan.portfolio.model.About;
import com.igortauhan.portfolio.repository.AboutRepository;
import com.igortauhan.portfolio.service.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AboutService implements GenericService<AboutDTO, About> {

    private final AboutRepository aboutRepository;

    public AboutService(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    @Override
    public List<AboutDTO> findAll() {
        List<About> abouts = aboutRepository.findAll();
        return abouts.stream().map(this::toDto).toList();
    }

    @Override
    public AboutDTO findById(Long id) {
        Optional<About> about = aboutRepository.findById(id);

        if (about.isEmpty()) {
            throw new RuntimeException("Not found!");
        }

        return toDto(about.get());
    }

    @Override
    public AboutDTO toDto(About about) {
        return new AboutDTO(
                about.getId(),
                about.getName(),
                about.getRole(),
                about.getDescription()
        );
    }
}
