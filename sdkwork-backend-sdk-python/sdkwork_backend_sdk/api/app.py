from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateJsapiSignatureForm, PlusApiResultAppInfoVO, PlusApiResultAppSdkConfigVO, PlusApiResultBoolean, PlusApiResultListPlusAppVO, PlusApiResultPagePlusAppVO, PlusApiResultPlusAppVO, PlusAppForm, QueryListForm

class AppApi:
    """app API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAppForm) -> PlusApiResultPlusAppVO:
        """Update application"""
        return self._client.put(f"/backend/v3/api/app", json=body)

    def create(self, body: PlusAppForm) -> PlusApiResultPlusAppVO:
        """Create application"""
        return self._client.post(f"/backend/v3/api/app", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAppVO:
        """Get applications by page"""
        return self._client.post(f"/backend/v3/api/app/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAppVO:
        """Get all applications"""
        return self._client.post(f"/backend/v3/api/app/list/all", json=body)

    def get_sdk_config(self, body: CreateJsapiSignatureForm) -> PlusApiResultAppSdkConfigVO:
        """Get app SDK config"""
        return self._client.post(f"/backend/v3/api/app/get_sdk_config", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAppVO:
        """Get application by ID"""
        return self._client.get(f"/backend/v3/api/app/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete application"""
        return self._client.delete(f"/backend/v3/api/app/{id}")

    def get_app_info(self) -> PlusApiResultAppInfoVO:
        """Get app info"""
        return self._client.get(f"/backend/v3/api/app/info")
