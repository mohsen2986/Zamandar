package com.mohsen.zamandar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform