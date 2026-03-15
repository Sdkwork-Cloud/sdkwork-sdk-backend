from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusCardTemplateVO, PlusApiResultListPlusCardVO, PlusApiResultPagePlusCardTemplateVO, PlusApiResultPagePlusCardVO, PlusApiResultPlusCardTemplateVO, PlusApiResultPlusCardVO, PlusCardForm, PlusCardTemplateForm, QueryListForm

class CardApi:
    """card API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusCardForm) -> PlusApiResultPlusCardVO:
        """Update an existing membership card"""
        return self._client.put(f"/backend/v3/api/card", json=body)

    def create(self, body: PlusCardForm) -> PlusApiResultPlusCardVO:
        """Create a new membership card"""
        return self._client.post(f"/backend/v3/api/card", json=body)

    def update_template(self, body: PlusCardTemplateForm) -> PlusApiResultPlusCardTemplateVO:
        """Update an existing card template"""
        return self._client.put(f"/backend/v3/api/card/template", json=body)

    def create_template(self, body: PlusCardTemplateForm) -> PlusApiResultPlusCardTemplateVO:
        """Create a new card template"""
        return self._client.post(f"/backend/v3/api/card/template", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusCardTemplateVO:
        """Get card templates by page"""
        return self._client.post(f"/backend/v3/api/card/template/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusCardTemplateVO:
        """Get all card templates"""
        return self._client.post(f"/backend/v3/api/card/template/list/all", json=body)

    def create_list_by_page_card(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusCardVO:
        """Get membership cards by page"""
        return self._client.post(f"/backend/v3/api/card/list", json=body, params=params)

    def create_list_all_entities_card(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusCardVO:
        """Get all membership cards"""
        return self._client.post(f"/backend/v3/api/card/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusCardVO:
        """Get a membership card by ID"""
        return self._client.get(f"/backend/v3/api/card/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a membership card"""
        return self._client.delete(f"/backend/v3/api/card/{id}")

    def get_by_id_template(self, id: str) -> PlusApiResultPlusCardTemplateVO:
        """Get a card template by ID"""
        return self._client.get(f"/backend/v3/api/card/template/{id}")

    def delete_template(self, id: str) -> PlusApiResultBoolean:
        """Delete a card template"""
        return self._client.delete(f"/backend/v3/api/card/template/{id}")
