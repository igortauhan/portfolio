package com.igortauhan.portfolio.service.portfolio.impl;

import com.igortauhan.portfolio.dto.*;
import com.igortauhan.portfolio.service.impl.*;
import com.igortauhan.portfolio.service.portfolio.PortfolioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    private final AboutServiceImpl aboutService;
    private final ArticleServiceImpl articleService;
    private final SkillServiceImpl skillService;
    private final SocialServiceImpl socialService;
    private final WorkServiceImpl workService;

    private static final long ABOUT_ID = 1;

    public PortfolioServiceImpl(AboutServiceImpl aboutService,
                                ArticleServiceImpl articleService,
                                SkillServiceImpl skillService,
                                SocialServiceImpl socialService,
                                WorkServiceImpl workService) {
        this.aboutService = aboutService;
        this.articleService = articleService;
        this.skillService = skillService;
        this.socialService = socialService;
        this.workService = workService;
    }

    @Override
    public PortfolioDTO getPortfolio() {
        return generatePortfolio();
    }

    private PortfolioDTO generatePortfolio() {
        AboutDTO about = aboutService.findById(ABOUT_ID);
        List<ArticleDTO> articleDTOS = articleService.findAll();
        List<SkillDTO> skillDTOS = skillService.findAll();
        List<SocialDTO> socialDTOS = socialService.findAll();
        List<WorkDTO> workDTOS = workService.findAll();

        return toDto(about, articleDTOS, skillDTOS, socialDTOS, workDTOS);
    }

    private PortfolioDTO toDto(AboutDTO aboutDTO,
                               List<ArticleDTO> articleDTOS,
                               List<SkillDTO> skillDTOS,
                               List<SocialDTO> socialDTOS,
                               List<WorkDTO> workDTOS) {
        return new PortfolioDTO(
                aboutDTO,
                articleDTOS,
                skillDTOS,
                socialDTOS,
                workDTOS
        );
    }
}
