package com.igortauhan.portfolio.service.impl;

import com.igortauhan.portfolio.dto.SkillDTO;
import com.igortauhan.portfolio.dto.WorkDTO;
import com.igortauhan.portfolio.model.Skill;
import com.igortauhan.portfolio.model.Work;
import com.igortauhan.portfolio.repository.WorkRepository;
import com.igortauhan.portfolio.service.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class WorkService implements GenericService<WorkDTO, Work> {

    private final WorkRepository workRepository;
    private final SkillService skillService;

    public WorkService(WorkRepository workRepository, SkillService skillService) {
        this.workRepository = workRepository;
        this.skillService = skillService;
    }

    @Override
    public List<WorkDTO> findAll() {
        List<Work> works = workRepository.findAll();
        return works.stream().map(this::toDto).toList();
    }

    @Override
    public WorkDTO findById(Long id) {
        Optional<Work> work = workRepository.findById(id);

        if (work.isEmpty()) {
            throw new RuntimeException("Not found!");
        }

        return toDto(work.get());
    }

    @Override
    public WorkDTO toDto(Work work) {
        return new WorkDTO(
                work.getId(),
                work.getCompanyName(),
                work.getSince(),
                skillToDto(work.getSkills())
        );
    }

    private Set<SkillDTO> skillToDto(Set<Skill> skills) {
        return skills.stream()
                .map(skillService::toDto)
                .collect(Collectors.toSet());
    }
}
