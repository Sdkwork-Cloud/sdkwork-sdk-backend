from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusSkuVO, PlusApiResultPagePlusSkuVO, PlusApiResultPlusSkuVO, PlusSkuForm, QueryListForm

class ProductSkuApi:
    """product_sku API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusSkuForm) -> PlusApiResultPlusSkuVO:
        """Update an existing SKU"""
        return self._client.put(f"/backend/v3/api/sku", json=body)

    def create(self, body: PlusSkuForm) -> PlusApiResultPlusSkuVO:
        """Create a new SKU"""
        return self._client.post(f"/backend/v3/api/sku", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusSkuVO:
        """Get SKUs by page"""
        return self._client.post(f"/backend/v3/api/sku/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusSkuVO:
        """Get all SKUs"""
        return self._client.post(f"/backend/v3/api/sku/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusSkuVO:
        """Get an SKU by ID"""
        return self._client.get(f"/backend/v3/api/sku/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an SKU"""
        return self._client.delete(f"/backend/v3/api/sku/{id}")
