from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusFilePartVO, PlusApiResultPagePlusFilePartVO, PlusApiResultPlusFilePartVO, PlusFilePartForm, QueryListForm

class FilePartApi:
    """file_part API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusFilePartForm) -> PlusApiResultPlusFilePartVO:
        """Update an existing file part"""
        return self._client.put(f"/backend/v3/api/file/part", json=body)

    def create(self, body: PlusFilePartForm) -> PlusApiResultPlusFilePartVO:
        """Create a new file part"""
        return self._client.post(f"/backend/v3/api/file/part", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusFilePartVO:
        """Get file parts by page"""
        return self._client.post(f"/backend/v3/api/file/part/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusFilePartVO:
        """Get all file parts"""
        return self._client.post(f"/backend/v3/api/file/part/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusFilePartVO:
        """Get a file part by ID"""
        return self._client.get(f"/backend/v3/api/file/part/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a file part"""
        return self._client.delete(f"/backend/v3/api/file/part/{id}")
