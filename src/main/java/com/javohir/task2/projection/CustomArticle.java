package com.javohir.task2.projection;

import com.javohir.task2.entity.Article;
import com.javohir.task2.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Article.class)
public interface CustomArticle {
    Integer getId();
    String getTitle();
    String getDescription();
    String getUrlLink();
    Attachment getAttachment();
}
