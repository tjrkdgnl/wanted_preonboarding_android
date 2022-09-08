package com.hugh.category.data.network

import com.hugh.category.data.model.Article
import com.hugh.category.data.model.Articles
import com.hugh.entity.ArticleEntity
import com.hugh.entity.ArticlesEntity
import com.hugh.util.DateFormatter
import java.time.Instant


internal fun Articles.toEntity(): ArticlesEntity {
    return ArticlesEntity(
        articles = this.articles
            .filterNot { it.urlToImage == null || it.description == null }
            .map { it.toEntity() }
    )
}

internal fun Article.toEntity(): ArticleEntity {
    return ArticleEntity(
        author = this.author ?: "",
        content = this.content ?: "내용이 존재하지 않습니다.",
        description = this.description ?: "내용이 존재하지 않습니다.",
        publishedAt = if (this.publishedAt != null) DateFormatter.getDifferentDate(this.publishedAt) else "",
        title = this.title ?: "",
        urlToImage = this.urlToImage ?: "",
        timestamp = Instant.now().toEpochMilli()
    )
}
