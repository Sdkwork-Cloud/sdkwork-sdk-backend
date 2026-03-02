from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusUserOAuthAccountVO, PlusApiResultPagePlusUserOAuthAccountVO, PlusApiResultPlusUserOAuthAccountVO, PlusUserOAuthAccountForm, QueryListForm

class UserOauthAccountApi:
    """user_oauth_account API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusUserOAuthAccountForm) -> PlusApiResultPlusUserOAuthAccountVO:
        """Update user OAuth account"""
        return self._client.put(f"/backend/v3/api/user/oauth/account", json=body)

    def create(self, body: PlusUserOAuthAccountForm) -> PlusApiResultPlusUserOAuthAccountVO:
        """Create user OAuth account"""
        return self._client.post(f"/backend/v3/api/user/oauth/account", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusUserOAuthAccountVO:
        """Get user OAuth accounts by page"""
        return self._client.post(f"/backend/v3/api/user/oauth/account/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusUserOAuthAccountVO:
        """Get all user OAuth accounts"""
        return self._client.post(f"/backend/v3/api/user/oauth/account/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusUserOAuthAccountVO:
        """Get user OAuth account by ID"""
        return self._client.get(f"/backend/v3/api/user/oauth/account/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete user OAuth account"""
        return self._client.delete(f"/backend/v3/api/user/oauth/account/{id}")
