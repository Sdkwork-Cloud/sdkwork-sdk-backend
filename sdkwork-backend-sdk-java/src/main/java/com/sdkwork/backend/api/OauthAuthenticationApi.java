package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class OauthAuthenticationApi {
    private final HttpClient client;
    
    public OauthAuthenticationApi(HttpClient client) {
        this.client = client;
    }

    /** Get OAuth authorization URL */
    public OAuthLoginResponse getAuthUrl(OAuthLoginRequestForm body) throws Exception {
        return (OAuthLoginResponse) client.post(ApiPaths.backendPath("/auth/oauth/get_auth_url"), body);
    }

    /** Get OAuth authorization URL */
    public OAuthLoginResponse createGetAuthUrl(OAuthLoginRequestForm body) throws Exception {
        return (OAuthLoginResponse) client.post(ApiPaths.backendPath("/auth/oauth/authorize"), body);
    }

    /** Handle OAuth callback */
    public TokenDTO handleCallback(OAuthCallbackForm body) throws Exception {
        return (TokenDTO) client.post(ApiPaths.backendPath("/auth/oauth/callback"), body);
    }
}
