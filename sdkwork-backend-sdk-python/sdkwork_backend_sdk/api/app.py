from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateJsapiSignatureForm, PlusApiResultAppInfoVO, PlusApiResultAppSdkConfigVO

class AppApi:
    """app API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_sdk_config(self, body: CreateJsapiSignatureForm) -> PlusApiResultAppSdkConfigVO:
        """Get app SDK config"""
        return self._client.post(f"/backend/v3/api/app/get_sdk_config", json=body)

    def get_app_info(self) -> PlusApiResultAppInfoVO:
        """Get app info"""
        return self._client.get(f"/backend/v3/api/app/info")
