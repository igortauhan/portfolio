package com.igortauhan.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record SkillDTO(Long id, String name, @JsonFormat(pattern = "dd/MM/yyyy") LocalDateTime since) {
}
