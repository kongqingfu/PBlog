package com.pblog.dao;

import com.pblog.core.orm.PageRequest;
import com.pblog.domain.ArticleInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleInfoMapper {

    int insert(ArticleInfo articleInfo);

    List<ArticleInfo> findList();

    List<ArticleInfo> findListByCategorySlug(Long categorySlug);

    int updateArticleEnabled(int articleId, Boolean enabled);

    List<ArticleInfo> findTopTenByCreateTimeDesc();

    ArticleInfo findBySlug(Long slug);

    List<ArticleInfo> page(PageRequest pageRequest);

    List<ArticleInfo> findByCreateTimeDesc();

    int update(ArticleInfo articleInfo);
}