package com.hugh.category.data.room

import com.hugh.category.domain.entity.ArticleEntity
import com.hugh.room.model.RoomArticle

internal fun ArticleEntity.toRoom(): RoomArticle {
    return RoomArticle(
        id = null,
        title = this.title,
        author = this.author,
        date = this.publishedAt,
        description = this.description,
        content = this.content,
        urlToImage = this.urlToImage,
        timestamp = this.timestamp
    )
}

internal fun RoomArticle.toEntity(): ArticleEntity {
    return ArticleEntity(
        author = this.author,
        content = this.content,
        description = this.description,
        publishedAt = this.date,
        title = this.title,
        urlToImage = this.urlToImage,
        timestamp = this.timestamp
    )
}
