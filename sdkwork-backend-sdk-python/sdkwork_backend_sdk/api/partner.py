from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusPartnerVO, PlusApiResultPagePlusPartnerVO, PlusApiResultPlusPartnerVO, PlusPartnerForm, QueryListForm

class PartnerApi:
    """partner API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusPartnerForm) -> PlusApiResultPlusPartnerVO:
        """Update a partner"""
        return self._client.put(f"/backend/v3/api/partner", json=body)

    def create(self, body: PlusPartnerForm) -> PlusApiResultPlusPartnerVO:
        """Create a new partner"""
        return self._client.post(f"/backend/v3/api/partner", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusPartnerVO:
        """Get partners by page"""
        return self._client.post(f"/backend/v3/api/partner/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusPartnerVO:
        """Get all partners"""
        return self._client.post(f"/backend/v3/api/partner/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusPartnerVO:
        """Get a partner by ID"""
        return self._client.get(f"/backend/v3/api/partner/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a partner"""
        return self._client.delete(f"/backend/v3/api/partner/{id}")
