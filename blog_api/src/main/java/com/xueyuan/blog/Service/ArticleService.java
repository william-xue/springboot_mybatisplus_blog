package com.xueyuan.blog.Service;

import com.xueyuan.blog.vo.Result;
import com.xueyuan.blog.vo.params.PageParams;

public interface ArticleService {
    Result listArticle(PageParams pageParams);
    /*
    * 最热文章
    *
    * */

    Result hotArticle(int limit);

    Result newArticle(int limit);

    Result listArchives();
}
