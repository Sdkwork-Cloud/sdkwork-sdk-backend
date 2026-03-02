from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import OAuthCallbackForm, OAuthLoginRequestForm, OAuthLoginResponse, TokenDTO

class OauthAuthenticationApi:
    """oauth_authentication API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_auth_url(self, body: OAuthLoginRequestForm) -> OAuthLoginResponse:
        """Get OAuth authorization URL"""
        return self._client.post(f"/backend/v3/api/auth/oauth/get_auth_url", json=body)

    def create_get_auth_url(self, body: OAuthLoginRequestForm) -> OAuthLoginResponse:
        """Get OAuth authorization URL"""
        return self._client.post(f"/backend/v3/api/auth/oauth/authorize", json=body)

    def handle_callback(self, body: OAuthCallbackForm) -> TokenDTO:
        """Handle OAuth callback"""
        return self._client.post(f"/backend/v3/api/auth/oauth/callback", json=body)
