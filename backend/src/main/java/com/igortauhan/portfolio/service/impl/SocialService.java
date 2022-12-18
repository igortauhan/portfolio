package com.igortauhan.portfolio.service.impl;

import com.igortauhan.portfolio.dto.SocialDTO;
import com.igortauhan.portfolio.model.Social;
import com.igortauhan.portfolio.repository.SocialRepository;
import com.igortauhan.portfolio.service.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocialService implements GenericService<SocialDTO, Social> {

    private final SocialRepository socialRepository;

    public SocialService(SocialRepository socialRepository) {
        this.socialRepository = socialRepository;
    }

    @Override
    public List<SocialDTO> findAll() {
        List<Social> socials = socialRepository.findAll();
        return socials.stream().map(this::toDto).toList();
    }

    @Override
    public SocialDTO findById(Long id) {
        Optional<Social> social = socialRepository.findById(id);

        if (social.isEmpty()) {
            throw new RuntimeException("Not found!");
        }

        return toDto(social.get());
    }

    @Override
    public SocialDTO toDto(Social social) {
        return new SocialDTO(
                social.getId(),
                social.getName(),
                social.getLink()
        );
    }
}
