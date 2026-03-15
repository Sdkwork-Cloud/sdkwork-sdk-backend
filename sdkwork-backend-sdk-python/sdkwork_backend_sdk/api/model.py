from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAiModelInfoForm, PlusAiModelInfoQueryListForm, PlusAiModelPriceForm, PlusApiResultBoolean, PlusApiResultListPlusAiModelInfoVO, PlusApiResultListPlusAiModelPriceVO, PlusApiResultPagePlusAiModelInfoVO, PlusApiResultPagePlusAiModelPriceVO, PlusApiResultPlusAiModelInfoVO, PlusApiResultPlusAiModelPriceVO, QueryListForm

class ModelApi:
    """model API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAiModelInfoForm) -> PlusApiResultPlusAiModelInfoVO:
        """Update existing AI model information"""
        return self._client.put(f"/backend/v3/api/model", json=body)

    def create(self, body: PlusAiModelInfoForm) -> PlusApiResultPlusAiModelInfoVO:
        """Create a new AI model information"""
        return self._client.post(f"/backend/v3/api/model", json=body)

    def update_price(self, body: PlusAiModelPriceForm) -> PlusApiResultPlusAiModelPriceVO:
        """Update an existing AI model price"""
        return self._client.put(f"/backend/v3/api/model/price", json=body)

    def create_price(self, body: PlusAiModelPriceForm) -> PlusApiResultPlusAiModelPriceVO:
        """Create a new AI model price"""
        return self._client.post(f"/backend/v3/api/model/price", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiModelPriceVO:
        """Get AI model prices by page"""
        return self._client.post(f"/backend/v3/api/model/price/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAiModelPriceVO:
        """Get all AI model prices"""
        return self._client.post(f"/backend/v3/api/model/price/list/all", json=body)

    def create_list_by_page_model(self, body: Optional[PlusAiModelInfoQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiModelInfoVO:
        """Get AI model information by page"""
        return self._client.post(f"/backend/v3/api/model/list", json=body, params=params)

    def create_list_all_entities_model(self, body: Optional[PlusAiModelInfoQueryListForm] = None) -> PlusApiResultListPlusAiModelInfoVO:
        """Get all AI model information"""
        return self._client.post(f"/backend/v3/api/model/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAiModelInfoVO:
        """Get AI model information by ID"""
        return self._client.get(f"/backend/v3/api/model/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete AI model information"""
        return self._client.delete(f"/backend/v3/api/model/{id}")

    def get_by_id_price(self, id: str) -> PlusApiResultPlusAiModelPriceVO:
        """Get an AI model price by ID"""
        return self._client.get(f"/backend/v3/api/model/price/{id}")

    def delete_price(self, id: str) -> PlusApiResultBoolean:
        """Delete an AI model price"""
        return self._client.delete(f"/backend/v3/api/model/price/{id}")
