from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusInvokeRecordVO, PlusApiResultPagePlusInvokeRecordVO, PlusApiResultPlusInvokeRecordVO, PlusInvokeRecordForm, QueryListForm

class InvocationRecordApi:
    """invocation_record API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusInvokeRecordForm) -> PlusApiResultPlusInvokeRecordVO:
        """Update an existing invocation record"""
        return self._client.put(f"/backend/v3/api/record", json=body)

    def create(self, body: PlusInvokeRecordForm) -> PlusApiResultPlusInvokeRecordVO:
        """Create a new invocation record"""
        return self._client.post(f"/backend/v3/api/record", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusInvokeRecordVO:
        """Get invocation records by page"""
        return self._client.post(f"/backend/v3/api/record/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusInvokeRecordVO:
        """Get all invocation records"""
        return self._client.post(f"/backend/v3/api/record/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusInvokeRecordVO:
        """Get an invocation record by ID"""
        return self._client.get(f"/backend/v3/api/record/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an invocation record"""
        return self._client.delete(f"/backend/v3/api/record/{id}")
