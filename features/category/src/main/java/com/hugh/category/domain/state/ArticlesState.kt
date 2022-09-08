package com.hugh.category.domain.state

import com.hugh.entity.ArticlesEntity

internal sealed class ArticlesState {
    data class Success(val articlesEntity: ArticlesEntity) : ArticlesState()
    data class Failure(val throwable: Throwable) : ArticlesState()
}
