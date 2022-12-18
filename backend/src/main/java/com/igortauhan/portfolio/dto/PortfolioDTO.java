package com.igortauhan.portfolio.dto;

import java.util.List;

public record PortfolioDTO(AboutDTO aboutDTO,
                           List<ArticleDTO> articleDTOS,
                           List<SkillDTO> skillDTOS,
                           List<SocialDTO> socialDTOS,
                           List<WorkDTO> workDTOS) {
}
