package com.topkafe.dto.media


import com.fasterxml.jackson.annotation.JsonProperty

data class EdgeOwnerToTimelineMedia (


    val count: Long? = null,

    val edges: List<Edge>? = null,
    @JsonProperty("page_info")
    val pageInfo: PageInfo? = null

)
