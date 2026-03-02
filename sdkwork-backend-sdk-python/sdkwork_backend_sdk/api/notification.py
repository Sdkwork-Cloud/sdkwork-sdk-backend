from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusNotificationVO, PlusApiResultPagePlusNotificationVO, PlusApiResultPlusNotificationVO, PlusNotificationForm, QueryListForm

class NotificationApi:
    """notification API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusNotificationForm) -> PlusApiResultPlusNotificationVO:
        """Update an existing notification"""
        return self._client.put(f"/backend/v3/api/notification", json=body)

    def create(self, body: PlusNotificationForm) -> PlusApiResultPlusNotificationVO:
        """Create a new notification"""
        return self._client.post(f"/backend/v3/api/notification", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusNotificationVO:
        """Get notifications by page"""
        return self._client.post(f"/backend/v3/api/notification/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusNotificationVO:
        """Get all notifications"""
        return self._client.post(f"/backend/v3/api/notification/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusNotificationVO:
        """Get a notification by ID"""
        return self._client.get(f"/backend/v3/api/notification/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a notification"""
        return self._client.delete(f"/backend/v3/api/notification/{id}")
