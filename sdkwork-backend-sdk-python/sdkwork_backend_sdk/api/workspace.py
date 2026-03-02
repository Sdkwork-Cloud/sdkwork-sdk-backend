from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusWorkspaceVO, PlusApiResultPagePlusWorkspaceVO, PlusApiResultPlusWorkspaceVO, PlusWorkspaceForm, QueryListForm

class WorkspaceApi:
    """workspace API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusWorkspaceForm) -> PlusApiResultPlusWorkspaceVO:
        """Update an existing workspace"""
        return self._client.put(f"/backend/v3/api/workspace", json=body)

    def create(self, body: PlusWorkspaceForm) -> PlusApiResultPlusWorkspaceVO:
        """Create a new workspace"""
        return self._client.post(f"/backend/v3/api/workspace", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusWorkspaceVO:
        """Get workspaces by page"""
        return self._client.post(f"/backend/v3/api/workspace/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusWorkspaceVO:
        """Get all workspaces"""
        return self._client.post(f"/backend/v3/api/workspace/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusWorkspaceVO:
        """Get a workspace by ID"""
        return self._client.get(f"/backend/v3/api/workspace/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a workspace"""
        return self._client.delete(f"/backend/v3/api/workspace/{id}")
