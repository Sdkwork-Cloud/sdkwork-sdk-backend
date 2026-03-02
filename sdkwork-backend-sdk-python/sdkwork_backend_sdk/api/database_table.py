from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusTableVO, PlusApiResultPagePlusTableVO, PlusApiResultPlusTableVO, PlusTableForm, QueryListForm

class DatabaseTableApi:
    """database_table API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusTableForm) -> PlusApiResultPlusTableVO:
        """Update an existing database table"""
        return self._client.put(f"/backend/v3/api/table", json=body)

    def create(self, body: PlusTableForm) -> PlusApiResultPlusTableVO:
        """Create a new database table"""
        return self._client.post(f"/backend/v3/api/table", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusTableVO:
        """Get database tables by page"""
        return self._client.post(f"/backend/v3/api/table/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusTableVO:
        """Get all database tables"""
        return self._client.post(f"/backend/v3/api/table/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusTableVO:
        """Get a database table by ID"""
        return self._client.get(f"/backend/v3/api/table/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a database table"""
        return self._client.delete(f"/backend/v3/api/table/{id}")
