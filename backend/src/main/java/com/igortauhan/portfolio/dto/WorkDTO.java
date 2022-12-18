package com.igortauhan.portfolio.dto;

import java.time.LocalDateTime;

public record WorkDTO(Long id, String companyName, LocalDateTime since) {
}
