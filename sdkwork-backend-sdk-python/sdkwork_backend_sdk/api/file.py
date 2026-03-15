from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusFileContentVO, PlusApiResultListPlusFilePartVO, PlusApiResultListPlusFileVO, PlusApiResultPagePlusFileContentVO, PlusApiResultPagePlusFilePartVO, PlusApiResultPagePlusFileVO, PlusApiResultPlusFileContentVO, PlusApiResultPlusFilePartVO, PlusApiResultPlusFileVO, PlusApiResultSetPlusTreeNodePlusFileVO, PlusFileContentForm, PlusFileForm, PlusFilePartForm, QueryListForm

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

    def update_part(self, body: PlusFilePartForm) -> PlusApiResultPlusFilePartVO:
        """Update an existing file part"""
        return self._client.put(f"/backend/v3/api/file/part", json=body)

    def create_part(self, body: PlusFilePartForm) -> PlusApiResultPlusFilePartVO:
        """Create a new file part"""
        return self._client.post(f"/backend/v3/api/file/part", json=body)

    def update_content(self, body: PlusFileContentForm) -> PlusApiResultPlusFileContentVO:
        """Update file content"""
        return self._client.put(f"/backend/v3/api/file/content", json=body)

    def create_content(self, body: PlusFileContentForm) -> PlusApiResultPlusFileContentVO:
        """Create file content"""
        return self._client.post(f"/backend/v3/api/file/content", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusFilePartVO:
        """Get file parts by page"""
        return self._client.post(f"/backend/v3/api/file/part/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusFilePartVO:
        """Get all file parts"""
        return self._client.post(f"/backend/v3/api/file/part/list/all", json=body)

    def create_list_by_page_file(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusFileVO:
        """Get file metadata by page"""
        return self._client.post(f"/backend/v3/api/file/list", json=body, params=params)

    def create_list_all_entities_file(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusFileVO:
        """Get all file metadata"""
        return self._client.post(f"/backend/v3/api/file/list/all", json=body)

    def get_tree(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultSetPlusTreeNodePlusFileVO:
        """Get Tree"""
        return self._client.post(f"/backend/v3/api/file/get_tree", json=body, params=params)

    def create_list_by_page_content(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusFileContentVO:
        """Get file contents by page"""
        return self._client.post(f"/backend/v3/api/file/content/list", json=body, params=params)

    def create_list_all_entities_content(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusFileContentVO:
        """Get all file contents"""
        return self._client.post(f"/backend/v3/api/file/content/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusFileVO:
        """Get file metadata by ID"""
        return self._client.get(f"/backend/v3/api/file/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete file metadata"""
        return self._client.delete(f"/backend/v3/api/file/{id}")

    def get_by_id_part(self, id: str) -> PlusApiResultPlusFilePartVO:
        """Get a file part by ID"""
        return self._client.get(f"/backend/v3/api/file/part/{id}")

    def delete_part(self, id: str) -> PlusApiResultBoolean:
        """Delete a file part"""
        return self._client.delete(f"/backend/v3/api/file/part/{id}")

    def get_by_id_content(self, id: str) -> PlusApiResultPlusFileContentVO:
        """Get file content by ID"""
        return self._client.get(f"/backend/v3/api/file/content/{id}")

    def delete_content(self, id: str) -> PlusApiResultBoolean:
        """Delete file content"""
        return self._client.delete(f"/backend/v3/api/file/content/{id}")
