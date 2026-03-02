from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusShareVisitRecordVO, PlusApiResultPagePlusShareVisitRecordVO, PlusApiResultPlusShareVisitRecordVO, PlusShareVisitRecordForm, QueryListForm

class ShareVisitRecordApi:
    """share_visit_record API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusShareVisitRecordForm) -> PlusApiResultPlusShareVisitRecordVO:
        """Update visit record"""
        return self._client.put(f"/backend/v3/api/share/visit_record", json=body)

    def create(self, body: PlusShareVisitRecordForm) -> PlusApiResultPlusShareVisitRecordVO:
        """Create visit record"""
        return self._client.post(f"/backend/v3/api/share/visit_record", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusShareVisitRecordVO:
        """Get visit records by page"""
        return self._client.post(f"/backend/v3/api/share/visit_record/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusShareVisitRecordVO:
        """Get all visit records"""
        return self._client.post(f"/backend/v3/api/share/visit_record/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusShareVisitRecordVO:
        """Get visit record by ID"""
        return self._client.get(f"/backend/v3/api/share/visit_record/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete visit record"""
        return self._client.delete(f"/backend/v3/api/share/visit_record/{id}")
