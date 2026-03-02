from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusFileContentVO, PlusApiResultPagePlusFileContentVO, PlusApiResultPlusFileContentVO, PlusFileContentForm, QueryListForm

class FileContentApi:
    """file_content API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusFileContentForm) -> PlusApiResultPlusFileContentVO:
        """Update file content"""
        return self._client.put(f"/backend/v3/api/file/content", json=body)

    def create(self, body: PlusFileContentForm) -> PlusApiResultPlusFileContentVO:
        """Create file content"""
        return self._client.post(f"/backend/v3/api/file/content", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusFileContentVO:
        """Get file contents by page"""
        return self._client.post(f"/backend/v3/api/file/content/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusFileContentVO:
        """Get all file contents"""
        return self._client.post(f"/backend/v3/api/file/content/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusFileContentVO:
        """Get file content by ID"""
        return self._client.get(f"/backend/v3/api/file/content/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete file content"""
        return self._client.delete(f"/backend/v3/api/file/content/{id}")
