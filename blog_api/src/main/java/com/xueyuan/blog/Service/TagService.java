package com.xueyuan.blog.Service;

import com.xueyuan.blog.vo.Result;
import com.xueyuan.blog.vo.TagVo;

import java.util.List;

public interface TagService {
    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);
}
