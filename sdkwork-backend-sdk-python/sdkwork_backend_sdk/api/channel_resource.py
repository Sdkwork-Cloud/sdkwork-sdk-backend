from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusChannelResourceVO, PlusApiResultPagePlusChannelResourceVO, PlusApiResultPlusChannelResourceVO, PlusChannelResourceForm, QueryListForm

class ChannelResourceApi:
    """channel_resource API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusChannelResourceForm) -> PlusApiResultPlusChannelResourceVO:
        """Update an existing channel resource"""
        return self._client.put(f"/backend/v3/api/channel/resource", json=body)

    def create(self, body: PlusChannelResourceForm) -> PlusApiResultPlusChannelResourceVO:
        """Create a new channel resource"""
        return self._client.post(f"/backend/v3/api/channel/resource", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChannelResourceVO:
        """Get channel resources by page"""
        return self._client.post(f"/backend/v3/api/channel/resource/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusChannelResourceVO:
        """Get all channel resources"""
        return self._client.post(f"/backend/v3/api/channel/resource/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusChannelResourceVO:
        """Get a channel resource by ID"""
        return self._client.get(f"/backend/v3/api/channel/resource/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a channel resource"""
        return self._client.delete(f"/backend/v3/api/channel/resource/{id}")
