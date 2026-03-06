from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiKeyForm, PlusApiKeySelfCreateForm, PlusApiKeySelfUpdateForm, PlusApiResultBoolean, PlusApiResultListPlusApiKeyVO, PlusApiResultPagePlusApiKeyVO, PlusApiResultPlusApiKeyVO, QueryListForm

class ApiKeyApi:
    """api_key API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusApiKeyForm) -> PlusApiResultPlusApiKeyVO:
        """Update an existing API key"""
        return self._client.put(f"/backend/v3/api/apikey", json=body)

    def create(self, body: PlusApiKeyForm) -> PlusApiResultPlusApiKeyVO:
        """Create a new API key"""
        return self._client.post(f"/backend/v3/api/apikey", json=body)

    def get_my(self, id: str) -> PlusApiResultPlusApiKeyVO:
        """Get API key detail for current user"""
        return self._client.get(f"/backend/v3/api/apikey/my/{id}")

    def update_my(self, id: str, body: PlusApiKeySelfUpdateForm) -> PlusApiResultPlusApiKeyVO:
        """Update API key for current user"""
        return self._client.put(f"/backend/v3/api/apikey/my/{id}", json=body)

    def delete_my(self, id: str) -> PlusApiResultBoolean:
        """Delete API key for current user"""
        return self._client.delete(f"/backend/v3/api/apikey/my/{id}")

    def create_my(self, body: PlusApiKeySelfCreateForm) -> PlusApiResultPlusApiKeyVO:
        """Create API key for current user"""
        return self._client.post(f"/backend/v3/api/apikey/my", json=body)

    def rotate_my(self, id: str) -> PlusApiResultPlusApiKeyVO:
        """Rotate API key for current user"""
        return self._client.post(f"/backend/v3/api/apikey/my/{id}/rotate")

    def enable_my(self, id: str) -> PlusApiResultPlusApiKeyVO:
        """Enable API key for current user"""
        return self._client.post(f"/backend/v3/api/apikey/my/{id}/enable")

    def disable_my(self, id: str) -> PlusApiResultPlusApiKeyVO:
        """Disable API key for current user"""
        return self._client.post(f"/backend/v3/api/apikey/my/{id}/disable")

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusApiKeyVO:
        """Get API keys by page"""
        return self._client.post(f"/backend/v3/api/apikey/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusApiKeyVO:
        """Get all API keys"""
        return self._client.post(f"/backend/v3/api/apikey/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusApiKeyVO:
        """Get an API key by ID"""
        return self._client.get(f"/backend/v3/api/apikey/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an API key"""
        return self._client.delete(f"/backend/v3/api/apikey/{id}")

    def list_my_api_keys(self) -> PlusApiResultListPlusApiKeyVO:
        """List API keys for current user"""
        return self._client.get(f"/backend/v3/api/apikey/my/list")
