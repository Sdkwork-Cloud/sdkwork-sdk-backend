from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusCollectionVO, PlusApiResultPagePlusCollectionVO, PlusApiResultPlusCollectionVO, PlusCollectionForm, QueryListForm

class CollectionApi:
    """collection API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusCollectionForm) -> PlusApiResultPlusCollectionVO:
        """Update an existing collection"""
        return self._client.put(f"/backend/v3/api/collection", json=body)

    def create(self, body: PlusCollectionForm) -> PlusApiResultPlusCollectionVO:
        """Create a new collection"""
        return self._client.post(f"/backend/v3/api/collection", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusCollectionVO:
        """Get collections by page"""
        return self._client.post(f"/backend/v3/api/collection/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusCollectionVO:
        """Get all collections"""
        return self._client.post(f"/backend/v3/api/collection/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusCollectionVO:
        """Get a collection by ID"""
        return self._client.get(f"/backend/v3/api/collection/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a collection"""
        return self._client.delete(f"/backend/v3/api/collection/{id}")
