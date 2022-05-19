package com.xueyuan.blog.controller;


import com.xueyuan.blog.Service.ArticleService;
import com.xueyuan.blog.vo.Result;
import com.xueyuan.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @PostMapping
    private Result listArticle(@RequestBody PageParams pageParams){

        return articleService.listArticle(pageParams);
    }

    @PostMapping("hot")
    private Result hotArticle(){
        int limit = 5;

        return articleService.hotArticle(limit);
    }
    @PostMapping("new")
    private Result newArticle(){
        int limit = 5;

        return articleService.newArticle(limit);
    }

    /**
     * 首页 文章归档
     * @return
     */
    @PostMapping("listArchives")
    public Result listArchives(){
        return articleService.listArchives();
    }


}
