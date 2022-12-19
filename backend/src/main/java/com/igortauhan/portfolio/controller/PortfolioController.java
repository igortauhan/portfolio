package com.igortauhan.portfolio.controller;

import com.igortauhan.portfolio.dto.PortfolioDTO;
import com.igortauhan.portfolio.service.portfolio.PortfolioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/portfolio")
public class PortfolioController {

    private final PortfolioService portfolioService;

    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping
    public ResponseEntity<PortfolioDTO> getPortfolio() {
        return ResponseEntity.ok(portfolioService.getPortfolio());
    }
}
