from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResult, PlusApiResultBoolean, PlusApiResultListPlusPptTemplateSlideVO, PlusApiResultListPlusPptTemplateVO, PlusApiResultPagePlusPptTemplateSlideVO, PlusApiResultPagePlusPptTemplateVO, PlusApiResultPlusPptTemplateSlideVO, PlusApiResultPlusPptTemplateVO, PlusPptTemplateForm, PlusPptTemplateRenderForm, PlusPptTemplateSlideForm, QueryListForm

class PptApi:
    """ppt API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusPptTemplateForm) -> PlusApiResultPlusPptTemplateVO:
        """Update an existing PPT template"""
        return self._client.put(f"/backend/v3/api/ppt/template", json=body)

    def create(self, body: PlusPptTemplateForm) -> PlusApiResultPlusPptTemplateVO:
        """Create a new PPT template"""
        return self._client.post(f"/backend/v3/api/ppt/template", json=body)

    def update_slide(self, body: PlusPptTemplateSlideForm) -> PlusApiResultPlusPptTemplateSlideVO:
        """Update an existing PPT template slide"""
        return self._client.put(f"/backend/v3/api/ppt/template/slide", json=body)

    def create_slide(self, body: PlusPptTemplateSlideForm) -> PlusApiResultPlusPptTemplateSlideVO:
        """Create a new PPT template slide"""
        return self._client.post(f"/backend/v3/api/ppt/template/slide", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusPptTemplateSlideVO:
        """Get PPT template slides by page"""
        return self._client.post(f"/backend/v3/api/ppt/template/slide/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusPptTemplateSlideVO:
        """Get all PPT template slides"""
        return self._client.post(f"/backend/v3/api/ppt/template/slide/list/all", json=body)

    def render(self, body: PlusPptTemplateRenderForm) -> PlusApiResult:
        """Render PPT template"""
        return self._client.post(f"/backend/v3/api/ppt/template/render", json=body)

    def create_list_by_page_template(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusPptTemplateVO:
        """Get PPT templates by page"""
        return self._client.post(f"/backend/v3/api/ppt/template/list", json=body, params=params)

    def create_list_all_entities_template(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusPptTemplateVO:
        """Get all PPT templates"""
        return self._client.post(f"/backend/v3/api/ppt/template/list/all", json=body)

    def stop(self, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> PlusApiResultBoolean:
        return self._client.post(f"/backend/v3/api/ppt/template/chat/stop", params=params, headers=headers)

    def create_completions(self, body: ChatCompletionCreateForm, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with PPT template"""
        return self._client.post(f"/backend/v3/api/ppt/template/chat/completions", json=body, params=params, headers=headers)

    def get_by_id(self, id: str) -> PlusApiResultPlusPptTemplateVO:
        """Get a PPT template by ID"""
        return self._client.get(f"/backend/v3/api/ppt/template/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a PPT template"""
        return self._client.delete(f"/backend/v3/api/ppt/template/{id}")

    def get_by_id_slide(self, id: str) -> PlusApiResultPlusPptTemplateSlideVO:
        """Get a PPT template slide by ID"""
        return self._client.get(f"/backend/v3/api/ppt/template/slide/{id}")

    def delete_slide(self, id: str) -> PlusApiResultBoolean:
        """Delete a PPT template slide"""
        return self._client.delete(f"/backend/v3/api/ppt/template/slide/{id}")
