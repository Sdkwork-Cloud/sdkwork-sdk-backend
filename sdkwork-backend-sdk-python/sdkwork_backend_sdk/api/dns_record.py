from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusDnsRecordVO, PlusApiResultPagePlusDnsRecordVO, PlusApiResultPlusDnsRecordVO, PlusDnsRecordForm, QueryListForm

class DnsRecordApi:
    """dns_record API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusDnsRecordForm) -> PlusApiResultPlusDnsRecordVO:
        """Update an existing DNS record"""
        return self._client.put(f"/backend/v3/api/net/dns/record", json=body)

    def create(self, body: PlusDnsRecordForm) -> PlusApiResultPlusDnsRecordVO:
        """Create a new DNS record"""
        return self._client.post(f"/backend/v3/api/net/dns/record", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusDnsRecordVO:
        """Get DNS records by page"""
        return self._client.post(f"/backend/v3/api/net/dns/record/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusDnsRecordVO:
        """Get all DNS records"""
        return self._client.post(f"/backend/v3/api/net/dns/record/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusDnsRecordVO:
        """Get a DNS record by ID"""
        return self._client.get(f"/backend/v3/api/net/dns/record/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a DNS record"""
        return self._client.delete(f"/backend/v3/api/net/dns/record/{id}")
