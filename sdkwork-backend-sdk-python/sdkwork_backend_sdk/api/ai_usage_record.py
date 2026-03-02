from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListUsageRecordVO, PlusApiResultPageUsageRecordVO, PlusApiResultUsageRecordVO, QueryListForm, UsageRecordForm

class AiUsageRecordApi:
    """ai_usage_record API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: UsageRecordForm) -> PlusApiResultUsageRecordVO:
        """Update an existing usage record"""
        return self._client.put(f"/backend/v3/api/usage/record", json=body)

    def create(self, body: UsageRecordForm) -> PlusApiResultUsageRecordVO:
        """Create a new usage record"""
        return self._client.post(f"/backend/v3/api/usage/record", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageUsageRecordVO:
        """Get usage records by page"""
        return self._client.post(f"/backend/v3/api/usage/record/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListUsageRecordVO:
        """Get all usage records"""
        return self._client.post(f"/backend/v3/api/usage/record/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultUsageRecordVO:
        """Get a usage record by ID"""
        return self._client.get(f"/backend/v3/api/usage/record/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a usage record"""
        return self._client.delete(f"/backend/v3/api/usage/record/{id}")
