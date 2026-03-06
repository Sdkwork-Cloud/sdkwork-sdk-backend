from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResultBoolean, PlusApiResultListPlusDatasourceVO, PlusApiResultPagePlusDatasourceVO, PlusApiResultPlusDatasourceVO, PlusDatasourceForm, QueryListForm

class DatasourceApi:
    """datasource API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusDatasourceForm) -> PlusApiResultPlusDatasourceVO:
        """Update an existing data source"""
        return self._client.put(f"/backend/v3/api/datasource", json=body)

    def create(self, body: PlusDatasourceForm) -> PlusApiResultPlusDatasourceVO:
        """Create a new data source"""
        return self._client.post(f"/backend/v3/api/datasource", json=body)

    def stop(self, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> PlusApiResultBoolean:
        return self._client.post(f"/backend/v3/api/datasource/stop", params=params, headers=headers)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusDatasourceVO:
        """Get data sources by page"""
        return self._client.post(f"/backend/v3/api/datasource/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusDatasourceVO:
        """Get all data sources"""
        return self._client.post(f"/backend/v3/api/datasource/list/all", json=body)

    def create_completions(self, body: ChatCompletionCreateForm, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with Datasource"""
        return self._client.post(f"/backend/v3/api/datasource/chat/completions", json=body, params=params, headers=headers)

    def get_by_id(self, id: str) -> PlusApiResultPlusDatasourceVO:
        """Get a data source by ID"""
        return self._client.get(f"/backend/v3/api/datasource/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a data source"""
        return self._client.delete(f"/backend/v3/api/datasource/{id}")
