from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVisitHistoryVO, PlusApiResultPagePlusVisitHistoryVO, PlusApiResultPlusVisitHistoryVO, PlusVisitHistoryForm, QueryListForm

class VisitHistoryApi:
    """visit_history API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVisitHistoryForm) -> PlusApiResultPlusVisitHistoryVO:
        """Update Visit History"""
        return self._client.put(f"/backend/v3/api/visit_history", json=body)

    def create(self, body: PlusVisitHistoryForm) -> PlusApiResultPlusVisitHistoryVO:
        """Create Visit History"""
        return self._client.post(f"/backend/v3/api/visit_history", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVisitHistoryVO:
        """List Visit Histories by Page"""
        return self._client.post(f"/backend/v3/api/visit_history/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVisitHistoryVO:
        """List All Visit Histories"""
        return self._client.post(f"/backend/v3/api/visit_history/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVisitHistoryVO:
        """Get Visit History by ID"""
        return self._client.get(f"/backend/v3/api/visit_history/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete Visit History"""
        return self._client.delete(f"/backend/v3/api/visit_history/{id}")
