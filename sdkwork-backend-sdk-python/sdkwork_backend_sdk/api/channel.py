from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusChannelVO, PlusApiResultPagePlusChannelVO, PlusApiResultPlusChannelVO, PlusChannelForm, QueryListForm

class ChannelApi:
    """channel API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusChannelForm) -> PlusApiResultPlusChannelVO:
        """Update channel"""
        return self._client.put(f"/backend/v3/api/channel", json=body)

    def create(self, body: PlusChannelForm) -> PlusApiResultPlusChannelVO:
        """Create channel"""
        return self._client.post(f"/backend/v3/api/channel", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChannelVO:
        """List channels by page"""
        return self._client.post(f"/backend/v3/api/channel/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusChannelVO:
        """List all channels"""
        return self._client.post(f"/backend/v3/api/channel/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusChannelVO:
        """Get channel by ID"""
        return self._client.get(f"/backend/v3/api/channel/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete channel"""
        return self._client.delete(f"/backend/v3/api/channel/{id}")
