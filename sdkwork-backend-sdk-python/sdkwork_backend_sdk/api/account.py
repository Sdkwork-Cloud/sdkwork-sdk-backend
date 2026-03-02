from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAccountForm, PlusApiResultBoolean, PlusApiResultListPlusAccountVO, PlusApiResultPagePlusAccountVO, PlusApiResultPlusAccountVO, PlusGetAccountForm, QueryListForm

class AccountApi:
    """account API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAccountForm) -> PlusApiResultPlusAccountVO:
        """Update an existing account"""
        return self._client.put(f"/backend/v3/api/account", json=body)

    def create(self, body: PlusAccountForm) -> PlusApiResultPlusAccountVO:
        """Create a new account"""
        return self._client.post(f"/backend/v3/api/account", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAccountVO:
        """Get accounts by page"""
        return self._client.post(f"/backend/v3/api/account/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAccountVO:
        """Get all accounts"""
        return self._client.post(f"/backend/v3/api/account/list/all", json=body)

    def get_points(self, body: PlusGetAccountForm) -> PlusApiResultPlusAccountVO:
        """Get points account"""
        return self._client.post(f"/backend/v3/api/account/get_points", json=body)

    def get_cash(self, body: PlusGetAccountForm) -> PlusApiResultPlusAccountVO:
        """Get cash account"""
        return self._client.post(f"/backend/v3/api/account/get_cash", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAccountVO:
        """Get an account by ID"""
        return self._client.get(f"/backend/v3/api/account/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an account"""
        return self._client.delete(f"/backend/v3/api/account/{id}")
