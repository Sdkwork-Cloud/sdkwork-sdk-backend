from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateUploadFileRequest, PlusApiResultBoolean, PlusApiResultFileItemVO, PlusApiResultFileListVO, PlusApiResultListPlusDiskMemberVO, PlusApiResultListPlusDiskVO, PlusApiResultPagePlusDiskMemberVO, PlusApiResultPagePlusDiskVO, PlusApiResultPlusDiskMemberVO, PlusApiResultPlusDiskVO, PlusDiskForm, PlusDiskMemberForm, QueryListForm

class DiskApi:
    """disk API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusDiskForm) -> PlusApiResultPlusDiskVO:
        """Update an existing file disk"""
        return self._client.put(f"/backend/v3/api/disk", json=body)

    def create(self, body: PlusDiskForm) -> PlusApiResultPlusDiskVO:
        """Create a new file disk"""
        return self._client.post(f"/backend/v3/api/disk", json=body)

    def update_member(self, body: PlusDiskMemberForm) -> PlusApiResultPlusDiskMemberVO:
        """Update an existing disk member"""
        return self._client.put(f"/backend/v3/api/disk/member", json=body)

    def create_member(self, body: PlusDiskMemberForm) -> PlusApiResultPlusDiskMemberVO:
        """Create a new disk member"""
        return self._client.post(f"/backend/v3/api/disk/member", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusDiskMemberVO:
        """Get disk members by page"""
        return self._client.post(f"/backend/v3/api/disk/member/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusDiskMemberVO:
        """Get all disk members"""
        return self._client.post(f"/backend/v3/api/disk/member/list/all", json=body)

    def create_list_by_page_disk(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusDiskVO:
        """Get file disks by page"""
        return self._client.post(f"/backend/v3/api/disk/list", json=body, params=params)

    def create_list_all_entities_disk(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusDiskVO:
        """Get all file disks"""
        return self._client.post(f"/backend/v3/api/disk/list/all", json=body)

    def get_list_files(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileListVO:
        """List files"""
        return self._client.get(f"/backend/v3/api/disk/files", params=params)

    def create_upload_file(self, body: Optional[CreateUploadFileRequest] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileItemVO:
        """Upload file"""
        return self._client.post(f"/backend/v3/api/disk/files", data=body, params=params)

    def get_by_id(self, id: str) -> PlusApiResultPlusDiskVO:
        """Get a file disk by ID"""
        return self._client.get(f"/backend/v3/api/disk/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a file disk"""
        return self._client.delete(f"/backend/v3/api/disk/{id}")

    def get_by_id_member(self, id: str) -> PlusApiResultPlusDiskMemberVO:
        """Get a disk member by ID"""
        return self._client.get(f"/backend/v3/api/disk/member/{id}")

    def delete_member(self, id: str) -> PlusApiResultBoolean:
        """Delete a disk member"""
        return self._client.delete(f"/backend/v3/api/disk/member/{id}")

    def get_file(self, fileId: str) -> PlusApiResultFileItemVO:
        """Get file"""
        return self._client.get(f"/backend/v3/api/disk/files/{fileId}")

    def delete_file(self, fileId: str) -> PlusApiResultFileItemVO:
        """Delete file"""
        return self._client.delete(f"/backend/v3/api/disk/files/{fileId}")

    def get_file_content(self, fileId: str) -> str:
        """Get file content"""
        return self._client.get(f"/backend/v3/api/disk/files/{fileId}/content")
