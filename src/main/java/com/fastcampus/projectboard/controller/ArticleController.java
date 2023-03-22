package com.fastcampus.projectboard.controller;

import com.fastcampus.projectboard.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *
 *
 */


@RequiredArgsConstructor
@RequestMapping("/articles")
@Controller
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping
    public String articles(ModelMap map){
        map.addAttribute("articles", List.of());
        return "articles/index";
    }

    @GetMapping("/{articleId}")
    public String article(@PathVariable Long articleId, ModelMap map){
        map.addAttribute("article", "article"); //TODO: 구현할 때 이곳에 실제 데이터를 넣어줘야함
        map.addAttribute("articleComments", List.of());

        return "articles/detail";
    }
}
