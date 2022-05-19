package com.xueyuan.blog.Service.impl;

import com.xueyuan.blog.Service.TagService;
import com.xueyuan.blog.dao.mapper.TagMapper;
import com.xueyuan.blog.dao.pojo.Tag;
import com.xueyuan.blog.vo.Result;
import com.xueyuan.blog.vo.TagVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    private List<TagVo> copyList(List<Tag> tagList) {
        List<TagVo> tagVoList = new ArrayList<>();
        for (Tag tag : tagList) {
            tagVoList.add(copy(tag));
        }
        return tagVoList;

    }

    private TagVo copy(Tag tag) {
        TagVo tagVo = new TagVo();
        BeanUtils.copyProperties(tag, tagVo);

        return tagVo;
    }


    @Override
    public List<TagVo> findTagsByArticleId(Long articleId) {

        List<Tag> tags = tagMapper.findTagsByArticleId(articleId);
        return copyList(tags);

    }

    @Override
    public Result hots(int limit) {

        List<Long> tagIds  = tagMapper.findHotsTagIds(limit);

        if(CollectionUtils.isEmpty(tagIds)){
            return Result.success(Collections.emptyList());

        }
        List<Tag>  tagList = tagMapper.findTagsByTagIds(tagIds);
        return Result.success(tagList);
    }
}
