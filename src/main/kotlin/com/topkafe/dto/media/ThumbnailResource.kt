package com.topkafe.dto.media

import com.fasterxml.jackson.annotation.JsonProperty

class ThumbnailResource (

    @JsonProperty("config_height")
    val configHeight: Long? = null,
    @JsonProperty("config_width")
    val configWidth: Long? = null,

    val src: String? = null

)
