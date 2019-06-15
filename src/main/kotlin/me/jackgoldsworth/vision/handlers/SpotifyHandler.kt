package me.jackgoldsworth.vision.handlers

import com.wrapper.spotify.SpotifyApi
import me.jackgoldsworth.vision.utils.JsonUtils
import java.net.URI

class SpotifyHandler {

    private lateinit var spotifyApi: SpotifyApi

    fun connect() {
        val credMap = JsonUtils.loadCredentials("secret.json")
        spotifyApi = SpotifyApi.builder()
            .setClientId(credMap["client"])
            .setClientSecret(credMap["secret"])
            .setRedirectUri(URI(credMap["redirect"])).build()
    }
}