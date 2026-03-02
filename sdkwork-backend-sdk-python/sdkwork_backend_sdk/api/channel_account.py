from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusChannelAccountVO, PlusApiResultPagePlusChannelAccountVO, PlusApiResultPlusChannelAccountVO, PlusChannelAccountForm, PlusChannelAccountQueryForm, QueryListForm

class ChannelAccountApi:
    """channel_account API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusChannelAccountForm) -> PlusApiResultPlusChannelAccountVO:
        """Update channel account"""
        return self._client.put(f"/backend/v3/api/channel/account", json=body)

    def create(self, body: PlusChannelAccountForm) -> PlusApiResultPlusChannelAccountVO:
        """Create channel account"""
        return self._client.post(f"/backend/v3/api/channel/account", json=body)

    def list_sms(self, body: Optional[PlusChannelAccountQueryForm] = None) -> PlusApiResultListPlusChannelAccountVO:
        """Get SMS channel accounts"""
        return self._client.post(f"/backend/v3/api/channel/account/list_sms", json=body)

    def list_payment(self, body: Optional[PlusChannelAccountQueryForm] = None) -> PlusApiResultListPlusChannelAccountVO:
        """Get payment channel accounts"""
        return self._client.post(f"/backend/v3/api/channel/account/list_payment", json=body)

    def list_oss(self, body: Optional[PlusChannelAccountQueryForm] = None) -> PlusApiResultListPlusChannelAccountVO:
        """Get OSS channel accounts"""
        return self._client.post(f"/backend/v3/api/channel/account/list_oss", json=body)

    def list_official_account(self, body: Optional[PlusChannelAccountQueryForm] = None) -> PlusApiResultListPlusChannelAccountVO:
        """Get official account channel accounts"""
        return self._client.post(f"/backend/v3/api/channel/account/list_official_account", json=body)

    def list_mini_program(self, body: Optional[PlusChannelAccountQueryForm] = None) -> PlusApiResultListPlusChannelAccountVO:
        """Get mini program channel accounts"""
        return self._client.post(f"/backend/v3/api/channel/account/list_mini_program", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChannelAccountVO:
        """Get channel accounts by page"""
        return self._client.post(f"/backend/v3/api/channel/account/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusChannelAccountVO:
        """Get all channel accounts"""
        return self._client.post(f"/backend/v3/api/channel/account/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusChannelAccountVO:
        """Get channel account by ID"""
        return self._client.get(f"/backend/v3/api/channel/account/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete channel account"""
        return self._client.delete(f"/backend/v3/api/channel/account/{id}")
