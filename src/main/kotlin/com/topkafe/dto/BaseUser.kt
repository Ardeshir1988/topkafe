package com.topkafe.dto


import com.fasterxml.jackson.annotation.JsonProperty

data class BaseUser(
        val graphql: Graphql? = null,
        @JsonProperty("logging_page_id")
        val loggingPageId: String? = null,
        @JsonProperty("show_follow_dialog")
        val showFollowDialog: Boolean? = null,
        @JsonProperty("show_suggested_profiles")
        val showSuggestedProfiles: Boolean? = null
)
