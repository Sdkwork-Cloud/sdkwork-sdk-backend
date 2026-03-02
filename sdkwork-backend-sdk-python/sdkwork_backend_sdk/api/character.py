from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusCharacterVO, PlusApiResultPagePlusCharacterVO, PlusApiResultPlusCharacterVO, PlusCharacterForm, QueryListForm

class CharacterApi:
    """character API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusCharacterForm) -> PlusApiResultPlusCharacterVO:
        """Update character"""
        return self._client.put(f"/backend/v3/api/character", json=body)

    def create(self, body: PlusCharacterForm) -> PlusApiResultPlusCharacterVO:
        """Create character"""
        return self._client.post(f"/backend/v3/api/character", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusCharacterVO:
        """Get characters by page"""
        return self._client.post(f"/backend/v3/api/character/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusCharacterVO:
        """Get all characters"""
        return self._client.post(f"/backend/v3/api/character/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusCharacterVO:
        """Get character by ID"""
        return self._client.get(f"/backend/v3/api/character/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete character"""
        return self._client.delete(f"/backend/v3/api/character/{id}")
