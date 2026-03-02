from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import InvitationCodeForm, PlusApiResultBoolean, PlusApiResultInvitationCodeVO, PlusApiResultListInvitationCodeVO, PlusApiResultPageInvitationCodeVO, QueryListForm

class InvitationCodeApi:
    """invitation_code API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: InvitationCodeForm) -> PlusApiResultInvitationCodeVO:
        """Update an existing invitation code"""
        return self._client.put(f"/backend/v3/api/invitation/code", json=body)

    def create(self, body: InvitationCodeForm) -> PlusApiResultInvitationCodeVO:
        """Create a new invitation code"""
        return self._client.post(f"/backend/v3/api/invitation/code", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageInvitationCodeVO:
        """Get invitation codes by page"""
        return self._client.post(f"/backend/v3/api/invitation/code/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListInvitationCodeVO:
        """Get all invitation codes"""
        return self._client.post(f"/backend/v3/api/invitation/code/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultInvitationCodeVO:
        """Get an invitation code by ID"""
        return self._client.get(f"/backend/v3/api/invitation/code/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an invitation code"""
        return self._client.delete(f"/backend/v3/api/invitation/code/{id}")
