package com.igortauhan.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.Set;

public record WorkDTO(Long id, String companyName, @JsonFormat(pattern = "dd/MM/yyyy") LocalDateTime since, Set<SkillDTO> skills) {
}
