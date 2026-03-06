from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultFileItemVO, PlusApiResultFileListVO, PlusApiResultGetUrlResult, PlusApiResultListPlusFileVO, PlusApiResultPagePlusFileVO, PlusApiResultPlusFileVO, PlusApiResultPlusTempSessionVO, PlusApiResultSetPlusTreeNodePlusFileVO, PlusFileForm, PlusGetPresignedUrlForm, PlusGetTempSessionForm, PlusUploadForm, QueryListForm, UploadFileRequest

class FileApi:
    """file API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusFileForm) -> PlusApiResultPlusFileVO:
        """Update existing file metadata"""
        return self._client.put(f"/backend/v3/api/file", json=body)

    def create(self, body: PlusFileForm) -> PlusApiResultPlusFileVO:
        """Create a new file metadata"""
        return self._client.post(f"/backend/v3/api/file", json=body)

    def list_files(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileListVO:
        """List files"""
        return self._client.get(f"/backend/v3/api/oss/files", params=params)

    def upload(self, body: Optional[UploadFileRequest] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileItemVO:
        """Upload file"""
        return self._client.post(f"/backend/v3/api/oss/files", data=body, params=params)

    def get_temp_session(self, body: PlusGetTempSessionForm) -> PlusApiResultPlusTempSessionVO:
        """Get upload temporary session"""
        return self._client.post(f"/backend/v3/api/oss/files/temp_session", json=body)

    def get_presigned_url(self, body: PlusGetPresignedUrlForm) -> PlusApiResultGetUrlResult:
        """Generate presigned URL"""
        return self._client.post(f"/backend/v3/api/oss/files/get_presigned_url", json=body)

    def create_files(self, body: PlusUploadForm) -> PlusApiResultPlusFileVO:
        """Upload file"""
        return self._client.post(f"/backend/v3/api/oss/files/create", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusFileVO:
        """Get file metadata by page"""
        return self._client.post(f"/backend/v3/api/file/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusFileVO:
        """Get all file metadata"""
        return self._client.post(f"/backend/v3/api/file/list/all", json=body)

    def get_tree(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultSetPlusTreeNodePlusFileVO:
        """Get Tree"""
        return self._client.post(f"/backend/v3/api/file/get_tree", json=body, params=params)

    def get_file(self, fileId: str) -> PlusApiResultFileItemVO:
        """Get file"""
        return self._client.get(f"/backend/v3/api/oss/files/{fileId}")

    def delete_file(self, fileId: str) -> PlusApiResultFileItemVO:
        """Delete file"""
        return self._client.delete(f"/backend/v3/api/oss/files/{fileId}")

    def get_file_content(self, fileId: str) -> str:
        """Get file content"""
        return self._client.get(f"/backend/v3/api/oss/files/{fileId}/content")

    def get_by_id(self, id: str) -> PlusApiResultPlusFileVO:
        """Get file metadata by ID"""
        return self._client.get(f"/backend/v3/api/file/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete file metadata"""
        return self._client.delete(f"/backend/v3/api/file/{id}")
