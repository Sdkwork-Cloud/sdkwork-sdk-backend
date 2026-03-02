from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusFeedbackVO, PlusApiResultPagePlusFeedbackVO, PlusApiResultPlusFeedbackVO, PlusFeedbackForm, QueryListForm

class FeedbackApi:
    """feedback API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusFeedbackForm) -> PlusApiResultPlusFeedbackVO:
        """Update feedback"""
        return self._client.put(f"/backend/v3/api/feedback", json=body)

    def create(self, body: PlusFeedbackForm) -> PlusApiResultPlusFeedbackVO:
        """Create new feedback"""
        return self._client.post(f"/backend/v3/api/feedback", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusFeedbackVO:
        """Get feedback by page"""
        return self._client.post(f"/backend/v3/api/feedback/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusFeedbackVO:
        """Get all feedback records"""
        return self._client.post(f"/backend/v3/api/feedback/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusFeedbackVO:
        """Get feedback by ID"""
        return self._client.get(f"/backend/v3/api/feedback/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete feedback"""
        return self._client.delete(f"/backend/v3/api/feedback/{id}")
