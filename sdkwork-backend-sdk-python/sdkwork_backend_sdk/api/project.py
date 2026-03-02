from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusProjectVO, PlusApiResultPagePlusProjectVO, PlusApiResultPlusProjectVO, PlusProjectForm, QueryListForm

class ProjectApi:
    """project API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusProjectForm) -> PlusApiResultPlusProjectVO:
        """Update an existing project"""
        return self._client.put(f"/backend/v3/api/project", json=body)

    def create(self, body: PlusProjectForm) -> PlusApiResultPlusProjectVO:
        """Create a new project"""
        return self._client.post(f"/backend/v3/api/project", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusProjectVO:
        """Get projects by page"""
        return self._client.post(f"/backend/v3/api/project/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusProjectVO:
        """Get all projects"""
        return self._client.post(f"/backend/v3/api/project/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusProjectVO:
        """Get a project by ID"""
        return self._client.get(f"/backend/v3/api/project/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a project"""
        return self._client.delete(f"/backend/v3/api/project/{id}")
