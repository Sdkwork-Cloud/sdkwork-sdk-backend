from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultFileItemVO, PlusApiResultFileListVO, PlusApiResultGetUrlResult, PlusApiResultListPlusOssBucketVO, PlusApiResultPagePlusOssBucketVO, PlusApiResultPlusFileVO, PlusApiResultPlusOssBucketVO, PlusApiResultPlusTempSessionVO, PlusGetPresignedUrlForm, PlusGetTempSessionForm, PlusOssBucketForm, PlusUploadForm, QueryListForm, UploadFileRequest

class OssApi:
    """oss API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusOssBucketForm) -> PlusApiResultPlusOssBucketVO:
        """Update an existing OSS bucket"""
        return self._client.put(f"/backend/v3/api/oss/bucket", json=body)

    def create(self, body: PlusOssBucketForm) -> PlusApiResultPlusOssBucketVO:
        """Create a new OSS bucket"""
        return self._client.post(f"/backend/v3/api/oss/bucket", json=body)

    def list_files(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileListVO:
        """List files"""
        return self._client.get(f"/backend/v3/api/oss/files", params=params)

    def upload_file(self, body: Optional[UploadFileRequest] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileItemVO:
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

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusOssBucketVO:
        """Get OSS buckets by page"""
        return self._client.post(f"/backend/v3/api/oss/bucket/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusOssBucketVO:
        """Get all OSS buckets"""
        return self._client.post(f"/backend/v3/api/oss/bucket/list/all", json=body)

    def get_file(self, fileId: str) -> PlusApiResultFileItemVO:
        """Get file"""
        return self._client.get(f"/backend/v3/api/oss/files/{fileId}")

    def delete_file(self, fileId: str) -> PlusApiResultFileItemVO:
        """Delete file"""
        return self._client.delete(f"/backend/v3/api/oss/files/{fileId}")

    def get_file_content(self, fileId: str) -> str:
        """Get file content"""
        return self._client.get(f"/backend/v3/api/oss/files/{fileId}/content")

    def get_by_id(self, id: str) -> PlusApiResultPlusOssBucketVO:
        """Get an OSS bucket by ID"""
        return self._client.get(f"/backend/v3/api/oss/bucket/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an OSS bucket"""
        return self._client.delete(f"/backend/v3/api/oss/bucket/{id}")
