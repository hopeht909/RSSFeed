package com.example.rssfeed

import android.net.Uri

class Authors {

    var name: String? = null
    var uri: Uri? = null

    override fun toString(): String {
        return " Name = $name \n URI = $uri"
    }
}