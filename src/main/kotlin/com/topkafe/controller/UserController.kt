package com.topkafe.controller

import com.topkafe.dto.media.UserPage
import com.topkafe.dto.media.UserPost
import com.topkafe.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class UserController(val userService: UserService) {

    @GetMapping("/user")
    fun getUserId(@RequestParam("username") username: String): Mono<UserPage> {
        return userService.getUserDataWithUserName(username).flatMap { user ->
            userService.getUserPostsWithId(user!!.graphql!!.user!!.id!!)
                    .map { userMedia ->
                        UserPage(postCount = userMedia.data!!.user!!.edgeOwnerToTimelineMedia!!.count!!.toInt(),
                                endCursor = userMedia.data.user!!.edgeOwnerToTimelineMedia!!.pageInfo!!.endCursor!!,
                                hasNextPage = userMedia.data.user.edgeOwnerToTimelineMedia!!.pageInfo!!.hasNextPage!!,
                                posts = userMedia.data.user.edgeOwnerToTimelineMedia.edges!!
                                        .map { edge ->
                                            UserPost(displayUrl = edge.node!!.displayUrl!!,
                                                    caption = edge.node.edgeMediaToCaption!!.edges!![0].node!!.text!!,
                                                    tags = edge.node.edgeMediaToCaption.edges!![0].node!!.text!!
                                                            .split("#"))
                                        })
                    }
        }
    }
}