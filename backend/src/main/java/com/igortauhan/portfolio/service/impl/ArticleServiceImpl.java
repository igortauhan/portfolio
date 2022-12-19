package com.igortauhan.portfolio.service.impl;

import com.igortauhan.portfolio.dto.ArticleDTO;
import com.igortauhan.portfolio.exception.exceptions.ObjectNotFoundException;
import com.igortauhan.portfolio.model.Article;
import com.igortauhan.portfolio.repository.ArticleRepository;
import com.igortauhan.portfolio.service.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements GenericService<ArticleDTO, Article> {

    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<ArticleDTO> findAll() {
        List<Article> articles = articleRepository.findAll();
        return articles.stream().map(this::toDto).toList();
    }

    @Override
    public ArticleDTO findById(Long id) {
        return toDto(articleRepository.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Article not found. Id: " + id)
        ));
    }

    @Override
    public ArticleDTO toDto(Article article) {
        return new ArticleDTO(
                article.getId(),
                article.getTitle(),
                article.getTags(),
                article.getLink()
        );
    }
}
