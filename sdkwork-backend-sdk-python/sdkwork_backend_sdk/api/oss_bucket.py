from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusOssBucketVO, PlusApiResultPagePlusOssBucketVO, PlusApiResultPlusOssBucketVO, PlusOssBucketForm, QueryListForm

class OssBucketApi:
    """oss_bucket API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusOssBucketForm) -> PlusApiResultPlusOssBucketVO:
        """Update an existing OSS bucket"""
        return self._client.put(f"/backend/v3/api/oss/bucket", json=body)

    def create(self, body: PlusOssBucketForm) -> PlusApiResultPlusOssBucketVO:
        """Create a new OSS bucket"""
        return self._client.post(f"/backend/v3/api/oss/bucket", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusOssBucketVO:
        """Get OSS buckets by page"""
        return self._client.post(f"/backend/v3/api/oss/bucket/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusOssBucketVO:
        """Get all OSS buckets"""
        return self._client.post(f"/backend/v3/api/oss/bucket/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusOssBucketVO:
        """Get an OSS bucket by ID"""
        return self._client.get(f"/backend/v3/api/oss/bucket/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an OSS bucket"""
        return self._client.delete(f"/backend/v3/api/oss/bucket/{id}")
