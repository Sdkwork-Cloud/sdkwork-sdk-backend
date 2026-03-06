from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusHostDomainVO, PlusApiResultPagePlusHostDomainVO, PlusApiResultPlusHostDomainVO, PlusHostDomainForm, QueryListForm

class NetApi:
    """net API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusHostDomainForm) -> PlusApiResultPlusHostDomainVO:
        """更新域名"""
        return self._client.put(f"/backend/v3/api/net/host/domain", json=body)

    def create(self, body: PlusHostDomainForm) -> PlusApiResultPlusHostDomainVO:
        """创建域名"""
        return self._client.post(f"/backend/v3/api/net/host/domain", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusHostDomainVO:
        """分页获取域名"""
        return self._client.post(f"/backend/v3/api/net/host/domain/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusHostDomainVO:
        """获取所有域名"""
        return self._client.post(f"/backend/v3/api/net/host/domain/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusHostDomainVO:
        """获取域名详情"""
        return self._client.get(f"/backend/v3/api/net/host/domain/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """删除域名"""
        return self._client.delete(f"/backend/v3/api/net/host/domain/{id}")
