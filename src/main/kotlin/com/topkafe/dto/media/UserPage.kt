package com.topkafe.dto.media

data class UserPage(val postCount:Int,val endCursor:String, val hasNextPage:Boolean, val posts:List<UserPost>)