from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusParticipantVO, PlusApiResultPagePlusParticipantVO, PlusApiResultPlusParticipantVO, PlusParticipantForm, QueryListForm

class ParticipantApi:
    """participant API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusParticipantForm) -> PlusApiResultPlusParticipantVO:
        """Update an existing chat participant"""
        return self._client.put(f"/backend/v3/api/participant", json=body)

    def create(self, body: PlusParticipantForm) -> PlusApiResultPlusParticipantVO:
        """Create a new chat participant"""
        return self._client.post(f"/backend/v3/api/participant", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusParticipantVO:
        """Get chat participants by page"""
        return self._client.post(f"/backend/v3/api/participant/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusParticipantVO:
        """Get all chat participants"""
        return self._client.post(f"/backend/v3/api/participant/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusParticipantVO:
        """Get a chat participant by ID"""
        return self._client.get(f"/backend/v3/api/participant/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a chat participant"""
        return self._client.delete(f"/backend/v3/api/participant/{id}")
