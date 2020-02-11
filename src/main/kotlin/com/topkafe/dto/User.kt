package com.topkafe.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class User(
        val biography: String? = null,
        @JsonProperty("blocked_by_viewer")
        val blockedByViewer: Boolean? = null,
        @JsonProperty("business_category_name")
        val businessCategoryName: Any? = null,
        @JsonProperty("connected_fb_page")
        private val connectedFbPage: Any? = null,
        @JsonProperty("country_block")
        private val countryBlock: Boolean? = null,
        @JsonProperty("edge_follow")
        private val edgeFollow: EdgeFollow? = null,
        @JsonProperty("edge_followed_by")
        private val edgeFollowedBy: EdgeFollowedBy? = null,
        @JsonProperty("edge_mutual_followed_by")
        private val edgeMutualFollowedBy: EdgeMutualFollowedBy? = null,
        @JsonProperty("external_url")
        private val externalUrl: String? = null,
        @JsonProperty("external_url_linkshimmed")
        private val externalUrlLinkshimmed: String? = null,
        @JsonProperty("followed_by_viewer")
        private val followedByViewer: Boolean? = null,
        @JsonProperty("follows_viewer")
        private val followsViewer: Boolean? = null,
        @JsonProperty("full_name")
        private val fullName: String? = null,
        @JsonProperty("has_blocked_viewer")
        private val hasBlockedViewer: Boolean? = null,
        @JsonProperty("has_channel")
        private val hasChannel: Boolean? = null,
        @JsonProperty("has_requested_viewer")
        private val hasRequestedViewer: Boolean? = null,
        @JsonProperty("highlight_reel_count")
        private val highlightReelCount: Long? = null,
        val id: String? = null,
        @JsonProperty("is_business_account")
        private val isBusinessAccount: Boolean? = null,
        @JsonProperty("is_joined_recently")
        private val isJoinedRecently: Boolean? = null,
        @JsonProperty("is_private")
        private val isPrivate: Boolean? = null,
        @JsonProperty("is_verified")
        private val isVerified: Boolean? = null,
        @JsonProperty("profile_pic_url")
        private val profilePicUrl: String? = null,
        @JsonProperty("profile_pic_url_hd")
        val profilePicUrlHd: String? = null,
        @JsonProperty("requested_by_viewer")
        val requestedByViewer: Boolean? = null,
        val username: String? = null
)
