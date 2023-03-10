package com.igortauhan.portfolio.service.impl;

import com.igortauhan.portfolio.dto.SkillDTO;
import com.igortauhan.portfolio.dto.WorkDTO;
import com.igortauhan.portfolio.exception.exceptions.ObjectNotFoundException;
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
public class WorkServiceImpl implements GenericService<WorkDTO, Work> {

    private final WorkRepository workRepository;
    private final SkillServiceImpl skillServiceImpl;

    public WorkServiceImpl(WorkRepository workRepository, SkillServiceImpl skillServiceImpl) {
        this.workRepository = workRepository;
        this.skillServiceImpl = skillServiceImpl;
    }

    @Override
    public List<WorkDTO> findAll() {
        List<Work> works = workRepository.findAll();
        return works.stream().map(this::toDto).toList();
    }

    @Override
    public WorkDTO findById(Long id) {
        return toDto(workRepository.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Work not found. Id: " + id)
        ));
    }

    @Override
    public WorkDTO toDto(Work work) {
        return new WorkDTO(
                work.getId(),
                work.getCompanyName(),
                work.getSince(),
                work.getDescription(),
                skillToDto(work.getSkills())
        );
    }

    private Set<SkillDTO> skillToDto(Set<Skill> skills) {
        return skills.stream()
                .map(skillServiceImpl::toDto)
                .collect(Collectors.toSet());
    }
}
