from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusDiskMemberVO, PlusApiResultPagePlusDiskMemberVO, PlusApiResultPlusDiskMemberVO, PlusDiskMemberForm, QueryListForm

class DiskMemberApi:
    """disk_member API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusDiskMemberForm) -> PlusApiResultPlusDiskMemberVO:
        """Update an existing disk member"""
        return self._client.put(f"/backend/v3/api/disk/member", json=body)

    def create(self, body: PlusDiskMemberForm) -> PlusApiResultPlusDiskMemberVO:
        """Create a new disk member"""
        return self._client.post(f"/backend/v3/api/disk/member", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusDiskMemberVO:
        """Get disk members by page"""
        return self._client.post(f"/backend/v3/api/disk/member/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusDiskMemberVO:
        """Get all disk members"""
        return self._client.post(f"/backend/v3/api/disk/member/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusDiskMemberVO:
        """Get a disk member by ID"""
        return self._client.get(f"/backend/v3/api/disk/member/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a disk member"""
        return self._client.delete(f"/backend/v3/api/disk/member/{id}")
