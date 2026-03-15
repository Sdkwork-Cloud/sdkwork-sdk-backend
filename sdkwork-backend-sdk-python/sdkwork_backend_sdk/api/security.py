from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusApiSecurityPolicyVO, PlusApiResultPagePlusApiSecurityPolicyVO, PlusApiResultPlusApiSecurityPolicyVO, PlusApiSecurityPolicyForm, QueryListForm

class SecurityApi:
    """security API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusApiSecurityPolicyForm) -> PlusApiResultPlusApiSecurityPolicyVO:
        return self._client.put(f"/backend/v3/api/security/policy", json=body)

    def create(self, body: PlusApiSecurityPolicyForm) -> PlusApiResultPlusApiSecurityPolicyVO:
        return self._client.post(f"/backend/v3/api/security/policy", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusApiSecurityPolicyVO:
        """List policies by page"""
        return self._client.post(f"/backend/v3/api/security/policy/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusApiSecurityPolicyVO:
        """List all policies"""
        return self._client.post(f"/backend/v3/api/security/policy/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusApiSecurityPolicyVO:
        return self._client.get(f"/backend/v3/api/security/policy/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        return self._client.delete(f"/backend/v3/api/security/policy/{id}")
