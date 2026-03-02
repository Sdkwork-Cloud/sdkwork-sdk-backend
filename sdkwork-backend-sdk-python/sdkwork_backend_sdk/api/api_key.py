from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiKeyForm, PlusApiResultBoolean, PlusApiResultListPlusApiKeyVO, PlusApiResultPagePlusApiKeyVO, PlusApiResultPlusApiKeyVO, QueryListForm

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
