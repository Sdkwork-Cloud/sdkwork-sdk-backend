from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusChannelAccountVO, PlusApiResultListPlusChannelProxyVO, PlusApiResultListPlusChannelResourceVO, PlusApiResultListPlusChannelVO, PlusApiResultPagePlusChannelAccountVO, PlusApiResultPagePlusChannelProxyVO, PlusApiResultPagePlusChannelResourceVO, PlusApiResultPagePlusChannelVO, PlusApiResultPlusChannelAccountVO, PlusApiResultPlusChannelProxyVO, PlusApiResultPlusChannelResourceVO, PlusApiResultPlusChannelVO, PlusChannelAccountForm, PlusChannelAccountQueryForm, PlusChannelForm, PlusChannelProxyForm, PlusChannelResourceForm, QueryListForm

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

    def update_resource(self, body: PlusChannelResourceForm) -> PlusApiResultPlusChannelResourceVO:
        """Update an existing channel resource"""
        return self._client.put(f"/backend/v3/api/channel/resource", json=body)

    def create_resource(self, body: PlusChannelResourceForm) -> PlusApiResultPlusChannelResourceVO:
        """Create a new channel resource"""
        return self._client.post(f"/backend/v3/api/channel/resource", json=body)

    def update_proxy(self, body: PlusChannelProxyForm) -> PlusApiResultPlusChannelProxyVO:
        """Update channel proxy"""
        return self._client.put(f"/backend/v3/api/channel/proxy", json=body)

    def create_proxy(self, body: PlusChannelProxyForm) -> PlusApiResultPlusChannelProxyVO:
        """Create channel proxy"""
        return self._client.post(f"/backend/v3/api/channel/proxy", json=body)

    def update_account(self, body: PlusChannelAccountForm) -> PlusApiResultPlusChannelAccountVO:
        """Update channel account"""
        return self._client.put(f"/backend/v3/api/channel/account", json=body)

    def create_account(self, body: PlusChannelAccountForm) -> PlusApiResultPlusChannelAccountVO:
        """Create channel account"""
        return self._client.post(f"/backend/v3/api/channel/account", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChannelResourceVO:
        """Get channel resources by page"""
        return self._client.post(f"/backend/v3/api/channel/resource/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusChannelResourceVO:
        """Get all channel resources"""
        return self._client.post(f"/backend/v3/api/channel/resource/list/all", json=body)

    def create_list_by_page_proxy(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChannelProxyVO:
        """List channel proxies by page"""
        return self._client.post(f"/backend/v3/api/channel/proxy/list", json=body, params=params)

    def create_list_all_entities_proxy(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusChannelProxyVO:
        """List all channel proxies"""
        return self._client.post(f"/backend/v3/api/channel/proxy/list/all", json=body)

    def create_list_by_page_channel(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChannelVO:
        """List channels by page"""
        return self._client.post(f"/backend/v3/api/channel/list", json=body, params=params)

    def create_list_all_entities_channel(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusChannelVO:
        """List all channels"""
        return self._client.post(f"/backend/v3/api/channel/list/all", json=body)

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

    def create_list_by_page_account(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChannelAccountVO:
        """Get channel accounts by page"""
        return self._client.post(f"/backend/v3/api/channel/account/list", json=body, params=params)

    def create_list_all_entities_account(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusChannelAccountVO:
        """Get all channel accounts"""
        return self._client.post(f"/backend/v3/api/channel/account/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusChannelVO:
        """Get channel by ID"""
        return self._client.get(f"/backend/v3/api/channel/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete channel"""
        return self._client.delete(f"/backend/v3/api/channel/{id}")

    def get_by_id_resource(self, id: str) -> PlusApiResultPlusChannelResourceVO:
        """Get a channel resource by ID"""
        return self._client.get(f"/backend/v3/api/channel/resource/{id}")

    def delete_resource(self, id: str) -> PlusApiResultBoolean:
        """Delete a channel resource"""
        return self._client.delete(f"/backend/v3/api/channel/resource/{id}")

    def get_by_id_proxy(self, id: str) -> PlusApiResultPlusChannelProxyVO:
        """Get channel proxy by ID"""
        return self._client.get(f"/backend/v3/api/channel/proxy/{id}")

    def delete_proxy(self, id: str) -> PlusApiResultBoolean:
        """Delete channel proxy"""
        return self._client.delete(f"/backend/v3/api/channel/proxy/{id}")

    def get_by_id_account(self, id: str) -> PlusApiResultPlusChannelAccountVO:
        """Get channel account by ID"""
        return self._client.get(f"/backend/v3/api/channel/account/{id}")

    def delete_account(self, id: str) -> PlusApiResultBoolean:
        """Delete channel account"""
        return self._client.delete(f"/backend/v3/api/channel/account/{id}")
