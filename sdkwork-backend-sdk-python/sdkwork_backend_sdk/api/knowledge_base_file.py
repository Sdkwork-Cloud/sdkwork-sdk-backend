from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateUploadFileRequest, PlusApiResultFileItemVO, PlusApiResultFileListVO, UploadFilePostRequest

class KnowledgeBaseFileApi:
    """knowledge_base_file API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def list_files(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileListVO:
        """List files"""
        return self._client.get(f"/backend/v3/api/knowledge_base/files", params=params)

    def upload_file(self, body: Optional[UploadFilePostRequest] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileItemVO:
        """Upload file"""
        return self._client.post(f"/backend/v3/api/knowledge_base/files", data=body, params=params)

    def get_list_files(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileListVO:
        """List files"""
        return self._client.get(f"/backend/v3/api/disk/files", params=params)

    def create_upload_file(self, body: Optional[CreateUploadFileRequest] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileItemVO:
        """Upload file"""
        return self._client.post(f"/backend/v3/api/disk/files", data=body, params=params)

    def get_file(self, fileId: str) -> PlusApiResultFileItemVO:
        """Get file"""
        return self._client.get(f"/backend/v3/api/knowledge_base/files/{fileId}")

    def delete_file(self, fileId: str) -> PlusApiResultFileItemVO:
        """Delete file"""
        return self._client.delete(f"/backend/v3/api/knowledge_base/files/{fileId}")

    def get_file_content(self, fileId: str) -> str:
        """Get file content"""
        return self._client.get(f"/backend/v3/api/knowledge_base/files/{fileId}/content")

    def get_file_disk(self, fileId: str) -> PlusApiResultFileItemVO:
        """Get file"""
        return self._client.get(f"/backend/v3/api/disk/files/{fileId}")

    def delete_file_disk(self, fileId: str) -> PlusApiResultFileItemVO:
        """Delete file"""
        return self._client.delete(f"/backend/v3/api/disk/files/{fileId}")

    def get_file_content_disk(self, fileId: str) -> str:
        """Get file content"""
        return self._client.get(f"/backend/v3/api/disk/files/{fileId}/content")
