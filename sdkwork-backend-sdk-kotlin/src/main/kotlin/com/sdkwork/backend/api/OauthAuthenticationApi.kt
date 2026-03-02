package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class OauthAuthenticationApi(private val client: HttpClient) {

    /** Get OAuth authorization URL */
    suspend fun getAuthUrl(body: OAuthLoginRequestForm): OAuthLoginResponse? {
        return client.post(ApiPaths.backendPath("/auth/oauth/get_auth_url"), body) as? OAuthLoginResponse
    }

    /** Get OAuth authorization URL */
    suspend fun createGetAuthUrl(body: OAuthLoginRequestForm): OAuthLoginResponse? {
        return client.post(ApiPaths.backendPath("/auth/oauth/authorize"), body) as? OAuthLoginResponse
    }

    /** Handle OAuth callback */
    suspend fun handleCallback(body: OAuthCallbackForm): TokenDTO? {
        return client.post(ApiPaths.backendPath("/auth/oauth/callback"), body) as? TokenDTO
    }
}
