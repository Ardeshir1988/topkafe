package com.topkafe.dto.media


import com.fasterxml.jackson.annotation.JsonProperty


data class PageInfo (

    @JsonProperty("end_cursor")
    val endCursor: String? = null,
    @JsonProperty("has_next_page")
    val hasNextPage: Boolean? = null

)
