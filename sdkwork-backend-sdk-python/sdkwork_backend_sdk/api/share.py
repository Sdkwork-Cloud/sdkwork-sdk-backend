from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusShareVisitRecordVO, PlusApiResultListPlusShareVO, PlusApiResultPagePlusShareVisitRecordVO, PlusApiResultPagePlusShareVO, PlusApiResultPlusShareVisitRecordVO, PlusApiResultPlusShareVO, PlusShareForm, PlusShareVisitRecordForm, QueryListForm

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

    def update_visit_record(self, body: PlusShareVisitRecordForm) -> PlusApiResultPlusShareVisitRecordVO:
        """Update visit record"""
        return self._client.put(f"/backend/v3/api/share/visit_record", json=body)

    def create_visit_record(self, body: PlusShareVisitRecordForm) -> PlusApiResultPlusShareVisitRecordVO:
        """Create visit record"""
        return self._client.post(f"/backend/v3/api/share/visit_record", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusShareVisitRecordVO:
        """Get visit records by page"""
        return self._client.post(f"/backend/v3/api/share/visit_record/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusShareVisitRecordVO:
        """Get all visit records"""
        return self._client.post(f"/backend/v3/api/share/visit_record/list/all", json=body)

    def create_list_by_page_share(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusShareVO:
        """分页获取分享"""
        return self._client.post(f"/backend/v3/api/share/list", json=body, params=params)

    def create_list_all_entities_share(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusShareVO:
        """获取所有分享"""
        return self._client.post(f"/backend/v3/api/share/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusShareVO:
        """获取分享详情"""
        return self._client.get(f"/backend/v3/api/share/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """删除分享"""
        return self._client.delete(f"/backend/v3/api/share/{id}")

    def get_by_id_visit_record(self, id: str) -> PlusApiResultPlusShareVisitRecordVO:
        """Get visit record by ID"""
        return self._client.get(f"/backend/v3/api/share/visit_record/{id}")

    def delete_visit_record(self, id: str) -> PlusApiResultBoolean:
        """Delete visit record"""
        return self._client.delete(f"/backend/v3/api/share/visit_record/{id}")
