from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResultBoolean, PlusApiResultFileItemVO, PlusApiResultFileListVO, PlusApiResultListPlusKnowledgeBaseVO, PlusApiResultPagePlusKnowledgeBaseVO, PlusApiResultPlusKnowledgeBaseVO, PlusKnowledgeBaseForm, QueryListForm, UploadFilePostRequest

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

    def list_files(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileListVO:
        """List files"""
        return self._client.get(f"/backend/v3/api/knowledge_base/files", params=params)

    def upload_file(self, body: Optional[UploadFilePostRequest] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFileItemVO:
        """Upload file"""
        return self._client.post(f"/backend/v3/api/knowledge_base/files", data=body, params=params)

    def stop(self, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> PlusApiResultBoolean:
        return self._client.post(f"/backend/v3/api/knowledge_base/chat/stop", params=params, headers=headers)

    def create_completions(self, body: ChatCompletionCreateForm, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with Knowledge base"""
        return self._client.post(f"/backend/v3/api/knowledge_base/chat/completions", json=body, params=params, headers=headers)

    def get_by_id(self, id: str) -> PlusApiResultPlusKnowledgeBaseVO:
        """Get a knowledge base by ID"""
        return self._client.get(f"/backend/v3/api/knowledge_base/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a knowledge base"""
        return self._client.delete(f"/backend/v3/api/knowledge_base/{id}")

    def get_file(self, fileId: str) -> PlusApiResultFileItemVO:
        """Get file"""
        return self._client.get(f"/backend/v3/api/knowledge_base/files/{fileId}")

    def delete_file(self, fileId: str) -> PlusApiResultFileItemVO:
        """Delete file"""
        return self._client.delete(f"/backend/v3/api/knowledge_base/files/{fileId}")

    def get_file_content(self, fileId: str) -> str:
        """Get file content"""
        return self._client.get(f"/backend/v3/api/knowledge_base/files/{fileId}/content")
