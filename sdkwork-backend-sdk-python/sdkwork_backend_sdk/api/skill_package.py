from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAgentSkillPackageForm, PlusAgentSkillPackageQueryListForm, PlusApiResultBoolean, PlusApiResultListPlusAgentSkillPackageVO, PlusApiResultPagePlusAgentSkillPackageVO, PlusApiResultPlusAgentSkillPackageVO

class SkillPackageApi:
    """skill_package API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_by_id(self, id: str) -> PlusApiResultPlusAgentSkillPackageVO:
        """Get skill package detail"""
        return self._client.get(f"/backend/v3/api/skill/package/{id}")

    def update(self, id: str, body: PlusAgentSkillPackageForm) -> PlusApiResultPlusAgentSkillPackageVO:
        """Update skill package"""
        return self._client.put(f"/backend/v3/api/skill/package/{id}", json=body)

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete skill package"""
        return self._client.delete(f"/backend/v3/api/skill/package/{id}")

    def create(self, body: PlusAgentSkillPackageForm) -> PlusApiResultPlusAgentSkillPackageVO:
        """Create skill package"""
        return self._client.post(f"/backend/v3/api/skill/package", json=body)

    def enable(self, id: str) -> PlusApiResultPlusAgentSkillPackageVO:
        """Enable skill package"""
        return self._client.post(f"/backend/v3/api/skill/package/{id}/enable")

    def disable(self, id: str) -> PlusApiResultPlusAgentSkillPackageVO:
        """Disable skill package"""
        return self._client.post(f"/backend/v3/api/skill/package/{id}/disable")

    def list_by_page(self, body: Optional[PlusAgentSkillPackageQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAgentSkillPackageVO:
        """Query skill package list by page"""
        return self._client.post(f"/backend/v3/api/skill/package/list", json=body, params=params)

    def list_all(self, body: Optional[PlusAgentSkillPackageQueryListForm] = None) -> PlusApiResultListPlusAgentSkillPackageVO:
        """Query all skill packages"""
        return self._client.post(f"/backend/v3/api/skill/package/list/all", json=body)
