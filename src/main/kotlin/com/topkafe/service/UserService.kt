package com.topkafe.service

import com.topkafe.dto.BaseUser
import com.topkafe.dto.media.UserMedia
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToMono
import reactor.core.publisher.Mono

@Component
class UserService(private val webClient: WebClient = WebClient.create("https://www.instagram.com")) {
    fun getUserDataWithUserName(userName: String): Mono<BaseUser> {
        return webClient.get()
                .uri("/$userName/?__a=1")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono()
    }
    fun getUserPostsWithId(userId:String):Mono<UserMedia>{
        return webClient.get()
                .uri("/graphql/query/?query_id=17888483320059182&id=$userId&first=50&after=")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono()
    }
}