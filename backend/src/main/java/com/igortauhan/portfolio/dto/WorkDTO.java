package com.igortauhan.portfolio.dto;

import java.time.LocalDateTime;
import java.util.Set;

public record WorkDTO(Long id, String companyName, LocalDateTime since, Set<SkillDTO> skills) {
}
