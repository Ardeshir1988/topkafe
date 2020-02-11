package com.topkafe.dto.media


import com.fasterxml.jackson.annotation.JsonProperty

data class User (

    @JsonProperty("edge_owner_to_timeline_media")
    val edgeOwnerToTimelineMedia: EdgeOwnerToTimelineMedia? = null

)