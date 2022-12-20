package com.igortauhan.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record PortfolioDTO(@JsonProperty("about") AboutDTO aboutDTO,
                           @JsonProperty("articles") List<ArticleDTO> articleDTOS,
                           @JsonProperty("skills") List<SkillDTO> skillDTOS,
                           @JsonProperty("socials") List<SocialDTO> socialDTOS,
                           @JsonProperty("works") List<WorkDTO> workDTOS) {
}
