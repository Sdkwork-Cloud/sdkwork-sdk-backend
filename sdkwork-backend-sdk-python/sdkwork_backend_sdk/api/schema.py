from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusSchemaVO, PlusApiResultPagePlusSchemaVO, PlusApiResultPlusSchemaVO, PlusSchemaForm, QueryListForm

class SchemaApi:
    """schema API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusSchemaForm) -> PlusApiResultPlusSchemaVO:
        """Update an existing database schema"""
        return self._client.put(f"/backend/v3/api/schema", json=body)

    def create(self, body: PlusSchemaForm) -> PlusApiResultPlusSchemaVO:
        """Create a new database schema"""
        return self._client.post(f"/backend/v3/api/schema", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusSchemaVO:
        """Get database schemas by page"""
        return self._client.post(f"/backend/v3/api/schema/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusSchemaVO:
        """Get all database schemas"""
        return self._client.post(f"/backend/v3/api/schema/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusSchemaVO:
        """Get a database schema by ID"""
        return self._client.get(f"/backend/v3/api/schema/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a database schema"""
        return self._client.delete(f"/backend/v3/api/schema/{id}")
