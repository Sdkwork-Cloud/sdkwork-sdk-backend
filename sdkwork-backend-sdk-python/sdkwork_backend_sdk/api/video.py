from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVideoVO, PlusApiResultPagePlusVideoVO, PlusApiResultPlusVideoVO, PlusVideoForm, QueryListForm

class VideoApi:
    """video API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVideoForm) -> PlusApiResultPlusVideoVO:
        """Update an existing video"""
        return self._client.put(f"/backend/v3/api/video", json=body)

    def create(self, body: PlusVideoForm) -> PlusApiResultPlusVideoVO:
        """Create a new video"""
        return self._client.post(f"/backend/v3/api/video", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVideoVO:
        """Get videos by page"""
        return self._client.post(f"/backend/v3/api/video/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVideoVO:
        """Get all videos"""
        return self._client.post(f"/backend/v3/api/video/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVideoVO:
        """Get a video by ID"""
        return self._client.get(f"/backend/v3/api/video/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a video"""
        return self._client.delete(f"/backend/v3/api/video/{id}")
