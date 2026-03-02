from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAiModelPriceForm, PlusApiResultBoolean, PlusApiResultListPlusAiModelPriceVO, PlusApiResultPagePlusAiModelPriceVO, PlusApiResultPlusAiModelPriceVO, QueryListForm

class AiModelPriceApi:
    """ai_model_price API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAiModelPriceForm) -> PlusApiResultPlusAiModelPriceVO:
        """Update an existing AI model price"""
        return self._client.put(f"/backend/v3/api/model/price", json=body)

    def create(self, body: PlusAiModelPriceForm) -> PlusApiResultPlusAiModelPriceVO:
        """Create a new AI model price"""
        return self._client.post(f"/backend/v3/api/model/price", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiModelPriceVO:
        """Get AI model prices by page"""
        return self._client.post(f"/backend/v3/api/model/price/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAiModelPriceVO:
        """Get all AI model prices"""
        return self._client.post(f"/backend/v3/api/model/price/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAiModelPriceVO:
        """Get an AI model price by ID"""
        return self._client.get(f"/backend/v3/api/model/price/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an AI model price"""
        return self._client.delete(f"/backend/v3/api/model/price/{id}")
