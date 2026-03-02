from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAiModelInfoForm, PlusApiResultBoolean, PlusApiResultListPlusAiModelInfoVO, PlusApiResultPagePlusAiModelInfoVO, PlusApiResultPlusAiModelInfoVO, QueryListForm

class AiModelInformationApi:
    """ai_model_information API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAiModelInfoForm) -> PlusApiResultPlusAiModelInfoVO:
        """Update existing AI model information"""
        return self._client.put(f"/backend/v3/api/model", json=body)

    def create(self, body: PlusAiModelInfoForm) -> PlusApiResultPlusAiModelInfoVO:
        """Create a new AI model information"""
        return self._client.post(f"/backend/v3/api/model", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiModelInfoVO:
        """Get AI model information by page"""
        return self._client.post(f"/backend/v3/api/model/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAiModelInfoVO:
        """Get all AI model information"""
        return self._client.post(f"/backend/v3/api/model/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAiModelInfoVO:
        """Get AI model information by ID"""
        return self._client.get(f"/backend/v3/api/model/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete AI model information"""
        return self._client.delete(f"/backend/v3/api/model/{id}")
