from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusKnowledgeBaseVO, PlusApiResultPagePlusKnowledgeBaseVO, PlusApiResultPlusKnowledgeBaseVO, PlusKnowledgeBaseForm, QueryListForm

class KnowledgeBaseApi:
    """knowledge_base API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusKnowledgeBaseForm) -> PlusApiResultPlusKnowledgeBaseVO:
        """Update an existing knowledge base"""
        return self._client.put(f"/backend/v3/api/knowledge_base", json=body)

    def create(self, body: PlusKnowledgeBaseForm) -> PlusApiResultPlusKnowledgeBaseVO:
        """Create a new knowledge base"""
        return self._client.post(f"/backend/v3/api/knowledge_base", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusKnowledgeBaseVO:
        """Get knowledge bases by page"""
        return self._client.post(f"/backend/v3/api/knowledge_base/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusKnowledgeBaseVO:
        """Get all knowledge bases"""
        return self._client.post(f"/backend/v3/api/knowledge_base/list/all", json=body)

    def get_detail(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPlusKnowledgeBaseVO:
        """Get a knowledge base detail by ID"""
        return self._client.post(f"/backend/v3/api/knowledge_base/get_detail", params=params)

    def get_by_id(self, id: str) -> PlusApiResultPlusKnowledgeBaseVO:
        """Get a knowledge base by ID"""
        return self._client.get(f"/backend/v3/api/knowledge_base/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a knowledge base"""
        return self._client.delete(f"/backend/v3/api/knowledge_base/{id}")
