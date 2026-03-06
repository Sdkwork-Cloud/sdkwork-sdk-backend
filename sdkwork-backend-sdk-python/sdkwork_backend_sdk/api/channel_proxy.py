from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusChannelProxyVO, PlusApiResultPagePlusChannelProxyVO, PlusApiResultPlusChannelProxyVO, PlusChannelProxyForm, QueryListForm

class ChannelProxyApi:
    """channel_proxy API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusChannelProxyForm) -> PlusApiResultPlusChannelProxyVO:
        """Update channel proxy"""
        return self._client.put(f"/backend/v3/api/channel/proxy", json=body)

    def create(self, body: PlusChannelProxyForm) -> PlusApiResultPlusChannelProxyVO:
        """Create channel proxy"""
        return self._client.post(f"/backend/v3/api/channel/proxy", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChannelProxyVO:
        """List channel proxies by page"""
        return self._client.post(f"/backend/v3/api/channel/proxy/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusChannelProxyVO:
        """List all channel proxies"""
        return self._client.post(f"/backend/v3/api/channel/proxy/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusChannelProxyVO:
        """Get channel proxy by ID"""
        return self._client.get(f"/backend/v3/api/channel/proxy/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete channel proxy"""
        return self._client.delete(f"/backend/v3/api/channel/proxy/{id}")
