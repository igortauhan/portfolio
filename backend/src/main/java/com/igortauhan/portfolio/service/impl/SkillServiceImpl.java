package com.igortauhan.portfolio.service.impl;

import com.igortauhan.portfolio.dto.SkillDTO;
import com.igortauhan.portfolio.model.Skill;
import com.igortauhan.portfolio.repository.SkillRepository;
import com.igortauhan.portfolio.service.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillServiceImpl implements GenericService<SkillDTO, Skill> {

    private final SkillRepository skillRepository;

    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public List<SkillDTO> findAll() {
        List<Skill> skills = skillRepository.findAll();
        return skills.stream().map(this::toDto).toList();
    }

    @Override
    public SkillDTO findById(Long id) {
        Optional<Skill> skill = skillRepository.findById(id);

        if (skill.isEmpty()) {
            throw new RuntimeException("Not found!");
        }

        return toDto(skill.get());
    }

    @Override
    public SkillDTO toDto(Skill skill) {
        return new SkillDTO(
                skill.getId(),
                skill.getName(),
                skill.getSince()
        );
    }
}
