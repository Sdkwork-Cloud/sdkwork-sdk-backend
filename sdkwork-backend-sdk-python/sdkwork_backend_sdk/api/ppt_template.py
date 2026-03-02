from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusPptTemplateVO, PlusApiResultPagePlusPptTemplateVO, PlusApiResultPlusPptTemplateVO, PlusPptTemplateForm, QueryListForm

class PptTemplateApi:
    """ppt_template API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusPptTemplateForm) -> PlusApiResultPlusPptTemplateVO:
        """Update an existing PPT template"""
        return self._client.put(f"/backend/v3/api/ppt/template", json=body)

    def create(self, body: PlusPptTemplateForm) -> PlusApiResultPlusPptTemplateVO:
        """Create a new PPT template"""
        return self._client.post(f"/backend/v3/api/ppt/template", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusPptTemplateVO:
        """Get PPT templates by page"""
        return self._client.post(f"/backend/v3/api/ppt/template/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusPptTemplateVO:
        """Get all PPT templates"""
        return self._client.post(f"/backend/v3/api/ppt/template/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusPptTemplateVO:
        """Get a PPT template by ID"""
        return self._client.get(f"/backend/v3/api/ppt/template/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a PPT template"""
        return self._client.delete(f"/backend/v3/api/ppt/template/{id}")
