from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusCardTemplateVO, PlusApiResultPagePlusCardTemplateVO, PlusApiResultPlusCardTemplateVO, PlusCardTemplateForm, QueryListForm

class CardTemplateApi:
    """card_template API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusCardTemplateForm) -> PlusApiResultPlusCardTemplateVO:
        """Update an existing card template"""
        return self._client.put(f"/backend/v3/api/card/template", json=body)

    def create(self, body: PlusCardTemplateForm) -> PlusApiResultPlusCardTemplateVO:
        """Create a new card template"""
        return self._client.post(f"/backend/v3/api/card/template", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusCardTemplateVO:
        """Get card templates by page"""
        return self._client.post(f"/backend/v3/api/card/template/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusCardTemplateVO:
        """Get all card templates"""
        return self._client.post(f"/backend/v3/api/card/template/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusCardTemplateVO:
        """Get a card template by ID"""
        return self._client.get(f"/backend/v3/api/card/template/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a card template"""
        return self._client.delete(f"/backend/v3/api/card/template/{id}")
