package com.igortauhan.portfolio.service.impl;

import com.igortauhan.portfolio.dto.SocialDTO;
import com.igortauhan.portfolio.exception.exceptions.ObjectNotFoundException;
import com.igortauhan.portfolio.model.Social;
import com.igortauhan.portfolio.repository.SocialRepository;
import com.igortauhan.portfolio.service.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocialServiceImpl implements GenericService<SocialDTO, Social> {

    private final SocialRepository socialRepository;

    public SocialServiceImpl(SocialRepository socialRepository) {
        this.socialRepository = socialRepository;
    }

    @Override
    public List<SocialDTO> findAll() {
        List<Social> socials = socialRepository.findAll();
        return socials.stream().map(this::toDto).toList();
    }

    @Override
    public SocialDTO findById(Long id) {
        return toDto(socialRepository.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Social not found. Id: " + id)
        ));
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
