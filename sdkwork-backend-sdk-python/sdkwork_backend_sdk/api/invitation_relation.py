from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import InvitationRelationForm, PlusApiResultBoolean, PlusApiResultInvitationRelationVO, PlusApiResultListInvitationRelationVO, PlusApiResultPageInvitationRelationVO, QueryListForm

class InvitationRelationApi:
    """invitation_relation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: InvitationRelationForm) -> PlusApiResultInvitationRelationVO:
        """Update an invitation relation"""
        return self._client.put(f"/backend/v3/api/invitation/relation", json=body)

    def create(self, body: InvitationRelationForm) -> PlusApiResultInvitationRelationVO:
        """Create a new invitation relation"""
        return self._client.post(f"/backend/v3/api/invitation/relation", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageInvitationRelationVO:
        """Get invitation relations by page"""
        return self._client.post(f"/backend/v3/api/invitation/relation/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListInvitationRelationVO:
        """Get all invitation relations"""
        return self._client.post(f"/backend/v3/api/invitation/relation/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultInvitationRelationVO:
        """Get an invitation relation by ID"""
        return self._client.get(f"/backend/v3/api/invitation/relation/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an invitation relation"""
        return self._client.delete(f"/backend/v3/api/invitation/relation/{id}")
