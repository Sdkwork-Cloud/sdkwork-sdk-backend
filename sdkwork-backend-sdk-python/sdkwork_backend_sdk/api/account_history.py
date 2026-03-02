from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAccountHistoryForm, PlusApiResultBoolean, PlusApiResultListPlusAccountHistoryVO, PlusApiResultPagePlusAccountHistoryVO, PlusApiResultPlusAccountHistoryVO, QueryListForm

class AccountHistoryApi:
    """account_history API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAccountHistoryForm) -> PlusApiResultPlusAccountHistoryVO:
        """Update an existing account history record"""
        return self._client.put(f"/backend/v3/api/account/history", json=body)

    def create(self, body: PlusAccountHistoryForm) -> PlusApiResultPlusAccountHistoryVO:
        """Create a new account history record"""
        return self._client.post(f"/backend/v3/api/account/history", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAccountHistoryVO:
        """Get account history records by page"""
        return self._client.post(f"/backend/v3/api/account/history/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAccountHistoryVO:
        """Get all account history records"""
        return self._client.post(f"/backend/v3/api/account/history/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAccountHistoryVO:
        """Get an account history record by ID"""
        return self._client.get(f"/backend/v3/api/account/history/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an account history record"""
        return self._client.delete(f"/backend/v3/api/account/history/{id}")
