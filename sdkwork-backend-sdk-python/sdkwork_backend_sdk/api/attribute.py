from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusAttributeVO, PlusApiResultPagePlusAttributeVO, PlusApiResultPlusAttributeVO, PlusAttributeForm, QueryListForm

class AttributeApi:
    """attribute API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAttributeForm) -> PlusApiResultPlusAttributeVO:
        """Update attribute"""
        return self._client.put(f"/backend/v3/api/attribute", json=body)

    def create(self, body: PlusAttributeForm) -> PlusApiResultPlusAttributeVO:
        """Create attribute"""
        return self._client.post(f"/backend/v3/api/attribute", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAttributeVO:
        """Get attributes by page"""
        return self._client.post(f"/backend/v3/api/attribute/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAttributeVO:
        """Get all attributes"""
        return self._client.post(f"/backend/v3/api/attribute/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAttributeVO:
        """Get attribute by ID"""
        return self._client.get(f"/backend/v3/api/attribute/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete attribute"""
        return self._client.delete(f"/backend/v3/api/attribute/{id}")
