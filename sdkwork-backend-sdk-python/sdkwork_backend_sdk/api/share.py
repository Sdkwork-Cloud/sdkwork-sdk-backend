from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusShareVO, PlusApiResultPagePlusShareVO, PlusApiResultPlusShareVO, PlusShareForm, QueryListForm

class ShareApi:
    """share API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusShareForm) -> PlusApiResultPlusShareVO:
        """更新分享"""
        return self._client.put(f"/backend/v3/api/share", json=body)

    def create(self, body: PlusShareForm) -> PlusApiResultPlusShareVO:
        """创建分享"""
        return self._client.post(f"/backend/v3/api/share", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusShareVO:
        """分页获取分享"""
        return self._client.post(f"/backend/v3/api/share/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusShareVO:
        """获取所有分享"""
        return self._client.post(f"/backend/v3/api/share/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusShareVO:
        """获取分享详情"""
        return self._client.get(f"/backend/v3/api/share/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """删除分享"""
        return self._client.delete(f"/backend/v3/api/share/{id}")
