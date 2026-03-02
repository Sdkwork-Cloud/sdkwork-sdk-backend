from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusImageVO, PlusApiResultPagePlusImageVO, PlusApiResultPlusImageVO, PlusImageForm, QueryListForm

class ImageApi:
    """image API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusImageForm) -> PlusApiResultPlusImageVO:
        """Update an existing image"""
        return self._client.put(f"/backend/v3/api/image", json=body)

    def create(self, body: PlusImageForm) -> PlusApiResultPlusImageVO:
        """Create a new image"""
        return self._client.post(f"/backend/v3/api/image", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusImageVO:
        """Get images by page"""
        return self._client.post(f"/backend/v3/api/image/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusImageVO:
        """Get all images"""
        return self._client.post(f"/backend/v3/api/image/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusImageVO:
        """Get an image by ID"""
        return self._client.get(f"/backend/v3/api/image/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an image"""
        return self._client.delete(f"/backend/v3/api/image/{id}")
