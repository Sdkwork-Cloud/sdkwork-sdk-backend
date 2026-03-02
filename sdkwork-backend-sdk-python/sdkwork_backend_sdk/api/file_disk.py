from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusDiskVO, PlusApiResultPagePlusDiskVO, PlusApiResultPlusDiskVO, PlusDiskForm, QueryListForm

class FileDiskApi:
    """file_disk API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusDiskForm) -> PlusApiResultPlusDiskVO:
        """Update an existing file disk"""
        return self._client.put(f"/backend/v3/api/disk", json=body)

    def create(self, body: PlusDiskForm) -> PlusApiResultPlusDiskVO:
        """Create a new file disk"""
        return self._client.post(f"/backend/v3/api/disk", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusDiskVO:
        """Get file disks by page"""
        return self._client.post(f"/backend/v3/api/disk/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusDiskVO:
        """Get all file disks"""
        return self._client.post(f"/backend/v3/api/disk/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusDiskVO:
        """Get a file disk by ID"""
        return self._client.get(f"/backend/v3/api/disk/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a file disk"""
        return self._client.delete(f"/backend/v3/api/disk/{id}")
