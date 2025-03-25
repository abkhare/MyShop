package com.khareab.myshop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform