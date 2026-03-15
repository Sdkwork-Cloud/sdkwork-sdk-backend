from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusShardingKeyVO, PlusApiResultPagePlusShardingKeyVO, PlusApiResultPlusShardingKeyVO, PlusShardingKeyForm, QueryListForm

class ShardingApi:
    """sharding API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusShardingKeyForm) -> PlusApiResultPlusShardingKeyVO:
        """Update Sharding Key"""
        return self._client.put(f"/backend/v3/api/sharding/key", json=body)

    def create(self, body: PlusShardingKeyForm) -> PlusApiResultPlusShardingKeyVO:
        """Create Sharding Key"""
        return self._client.post(f"/backend/v3/api/sharding/key", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusShardingKeyVO:
        """List Sharding Keys by Page"""
        return self._client.post(f"/backend/v3/api/sharding/key/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusShardingKeyVO:
        """List All Sharding Keys"""
        return self._client.post(f"/backend/v3/api/sharding/key/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusShardingKeyVO:
        """Get Sharding Key by ID"""
        return self._client.get(f"/backend/v3/api/sharding/key/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete Sharding Key"""
        return self._client.delete(f"/backend/v3/api/sharding/key/{id}")
