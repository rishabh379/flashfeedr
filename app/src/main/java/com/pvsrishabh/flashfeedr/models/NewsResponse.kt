package com.pvsrishabh.flashfeedr.models

import com.pvsrishabh.flashfeedr.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)