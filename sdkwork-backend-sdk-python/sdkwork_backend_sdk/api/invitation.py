from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import InvitationCodeForm, InvitationRelationForm, PlusApiResultBoolean, PlusApiResultInvitationCodeVO, PlusApiResultInvitationRelationVO, PlusApiResultListInvitationCodeVO, PlusApiResultListInvitationRelationVO, PlusApiResultPageInvitationCodeVO, PlusApiResultPageInvitationRelationVO, QueryListForm

class InvitationApi:
    """invitation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: InvitationRelationForm) -> PlusApiResultInvitationRelationVO:
        """Update an invitation relation"""
        return self._client.put(f"/backend/v3/api/invitation/relation", json=body)

    def create(self, body: InvitationRelationForm) -> PlusApiResultInvitationRelationVO:
        """Create a new invitation relation"""
        return self._client.post(f"/backend/v3/api/invitation/relation", json=body)

    def update_code(self, body: InvitationCodeForm) -> PlusApiResultInvitationCodeVO:
        """Update an existing invitation code"""
        return self._client.put(f"/backend/v3/api/invitation/code", json=body)

    def create_code(self, body: InvitationCodeForm) -> PlusApiResultInvitationCodeVO:
        """Create a new invitation code"""
        return self._client.post(f"/backend/v3/api/invitation/code", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageInvitationRelationVO:
        """Get invitation relations by page"""
        return self._client.post(f"/backend/v3/api/invitation/relation/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListInvitationRelationVO:
        """Get all invitation relations"""
        return self._client.post(f"/backend/v3/api/invitation/relation/list/all", json=body)

    def create_list_by_page_code(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageInvitationCodeVO:
        """Get invitation codes by page"""
        return self._client.post(f"/backend/v3/api/invitation/code/list", json=body, params=params)

    def create_list_all_entities_code(self, body: Optional[QueryListForm] = None) -> PlusApiResultListInvitationCodeVO:
        """Get all invitation codes"""
        return self._client.post(f"/backend/v3/api/invitation/code/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultInvitationRelationVO:
        """Get an invitation relation by ID"""
        return self._client.get(f"/backend/v3/api/invitation/relation/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an invitation relation"""
        return self._client.delete(f"/backend/v3/api/invitation/relation/{id}")

    def get_by_id_code(self, id: str) -> PlusApiResultInvitationCodeVO:
        """Get an invitation code by ID"""
        return self._client.get(f"/backend/v3/api/invitation/code/{id}")

    def delete_code(self, id: str) -> PlusApiResultBoolean:
        """Delete an invitation code"""
        return self._client.delete(f"/backend/v3/api/invitation/code/{id}")
