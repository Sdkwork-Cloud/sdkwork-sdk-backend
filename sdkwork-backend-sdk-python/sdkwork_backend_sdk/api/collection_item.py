from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusCollectionItemVO, PlusApiResultPagePlusCollectionItemVO, PlusApiResultPlusCollectionItemVO, PlusCollectionItemForm, QueryListForm

class CollectionItemApi:
    """collection_item API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusCollectionItemForm) -> PlusApiResultPlusCollectionItemVO:
        """Update an existing collection item"""
        return self._client.put(f"/backend/v3/api/collection-item", json=body)

    def create(self, body: PlusCollectionItemForm) -> PlusApiResultPlusCollectionItemVO:
        """Create a new collection item"""
        return self._client.post(f"/backend/v3/api/collection-item", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusCollectionItemVO:
        """Get collection items by page"""
        return self._client.post(f"/backend/v3/api/collection-item/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusCollectionItemVO:
        """Get all collection items"""
        return self._client.post(f"/backend/v3/api/collection-item/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusCollectionItemVO:
        """Get a collection item by ID"""
        return self._client.get(f"/backend/v3/api/collection-item/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a collection item"""
        return self._client.delete(f"/backend/v3/api/collection-item/{id}")
