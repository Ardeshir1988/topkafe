package com.topkafe.dto.media


import com.fasterxml.jackson.annotation.JsonProperty

data class Node (

    @JsonProperty("__typename")
    val _Typename: String? = null,
    @JsonProperty("comments_disabled")
    val commentsDisabled: Boolean? = null,
    val dimensions: Dimensions? = null,
    @JsonProperty("display_url")
    val displayUrl: String? = null,
    @JsonProperty("edge_media_preview_like")
    val edgeMediaPreviewLike: EdgeMediaPreviewLike? = null,
    @JsonProperty("edge_media_to_caption")
    val edgeMediaToCaption: EdgeMediaToCaption? = null,
    @JsonProperty("edge_media_to_comment")
    val edgeMediaToComment: EdgeMediaToComment? = null,

    val id: String? = null,
    @JsonProperty("is_video")
    val isVideo: Boolean? = null,

    val owner: Owner? = null,

    val shortcode: String? = null,
    @JsonProperty("taken_at_timestamp")
    val takenAtTimestamp: Long? = null,

    val text: String? = null,
    @JsonProperty("thumbnail_resources")
    val thumbnailResources: List<ThumbnailResource>? = null,
    @JsonProperty("thumbnail_src")
    val thumbnailSrc: String? = null

)
