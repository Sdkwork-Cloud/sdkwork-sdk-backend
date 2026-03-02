from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusPptTemplateSlideVO, PlusApiResultPagePlusPptTemplateSlideVO, PlusApiResultPlusPptTemplateSlideVO, PlusPptTemplateSlideForm, QueryListForm

class PptTemplateSlideApi:
    """ppt_template_slide API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusPptTemplateSlideForm) -> PlusApiResultPlusPptTemplateSlideVO:
        """Update an existing PPT template slide"""
        return self._client.put(f"/backend/v3/api/ppt/template/slide", json=body)

    def create(self, body: PlusPptTemplateSlideForm) -> PlusApiResultPlusPptTemplateSlideVO:
        """Create a new PPT template slide"""
        return self._client.post(f"/backend/v3/api/ppt/template/slide", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusPptTemplateSlideVO:
        """Get PPT template slides by page"""
        return self._client.post(f"/backend/v3/api/ppt/template/slide/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusPptTemplateSlideVO:
        """Get all PPT template slides"""
        return self._client.post(f"/backend/v3/api/ppt/template/slide/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusPptTemplateSlideVO:
        """Get a PPT template slide by ID"""
        return self._client.get(f"/backend/v3/api/ppt/template/slide/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a PPT template slide"""
        return self._client.delete(f"/backend/v3/api/ppt/template/slide/{id}")
