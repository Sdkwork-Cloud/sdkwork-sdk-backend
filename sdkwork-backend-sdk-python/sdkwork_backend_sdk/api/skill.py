from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAgentSkillBatchReviewForm, PlusAgentSkillFeatureForm, PlusAgentSkillForm, PlusAgentSkillPackageForm, PlusAgentSkillPackageQueryListForm, PlusAgentSkillQueryListForm, PlusAgentSkillReviewForm, PlusApiResultBoolean, PlusApiResultListPlusAgentSkillPackageVO, PlusApiResultListPlusAgentSkillVO, PlusApiResultPagePlusAgentSkillPackageVO, PlusApiResultPagePlusAgentSkillVO, PlusApiResultPlusAgentSkillPackageVO, PlusApiResultPlusAgentSkillVO

class SkillApi:
    """skill API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_by_id(self, id: str) -> PlusApiResultPlusAgentSkillVO:
        """Get one skill detail"""
        return self._client.get(f"/backend/v3/api/skill/{id}")

    def update(self, id: str, body: PlusAgentSkillForm) -> PlusApiResultPlusAgentSkillVO:
        """Update skill"""
        return self._client.put(f"/backend/v3/api/skill/{id}", json=body)

    def get_by_id_package(self, id: str) -> PlusApiResultPlusAgentSkillPackageVO:
        """Get skill package detail"""
        return self._client.get(f"/backend/v3/api/skill/package/{id}")

    def update_package(self, id: str, body: PlusAgentSkillPackageForm) -> PlusApiResultPlusAgentSkillPackageVO:
        """Update skill package"""
        return self._client.put(f"/backend/v3/api/skill/package/{id}", json=body)

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete skill package"""
        return self._client.delete(f"/backend/v3/api/skill/package/{id}")

    def create(self, body: PlusAgentSkillForm) -> PlusApiResultPlusAgentSkillVO:
        """Create skill"""
        return self._client.post(f"/backend/v3/api/skill", json=body)

    def submit_for_review(self, id: str) -> PlusApiResultPlusAgentSkillVO:
        """Submit skill for review"""
        return self._client.post(f"/backend/v3/api/skill/{id}/review/submit")

    def reject_review(self, id: str, body: Optional[PlusAgentSkillReviewForm] = None) -> PlusApiResultPlusAgentSkillVO:
        """Reject skill review"""
        return self._client.post(f"/backend/v3/api/skill/{id}/review/reject", json=body)

    def approve_review(self, id: str, body: Optional[PlusAgentSkillReviewForm] = None) -> PlusApiResultPlusAgentSkillVO:
        """Approve skill review"""
        return self._client.post(f"/backend/v3/api/skill/{id}/review/approve", json=body)

    def publish(self, id: str) -> PlusApiResultPlusAgentSkillVO:
        """Publish skill"""
        return self._client.post(f"/backend/v3/api/skill/{id}/publish")

    def offline(self, id: str) -> PlusApiResultPlusAgentSkillVO:
        """Offline skill"""
        return self._client.post(f"/backend/v3/api/skill/{id}/offline")

    def update_feature(self, id: str, body: PlusAgentSkillFeatureForm) -> PlusApiResultPlusAgentSkillVO:
        """Update skill featured status"""
        return self._client.post(f"/backend/v3/api/skill/{id}/feature", json=body)

    def create_enable(self, id: str) -> PlusApiResultPlusAgentSkillVO:
        """Enable skill"""
        return self._client.post(f"/backend/v3/api/skill/{id}/enable")

    def create_disable(self, id: str) -> PlusApiResultPlusAgentSkillVO:
        """Disable skill"""
        return self._client.post(f"/backend/v3/api/skill/{id}/disable")

    def list_pending_review_by_page(self, body: Optional[PlusAgentSkillQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAgentSkillVO:
        """List pending review skills by page"""
        return self._client.post(f"/backend/v3/api/skill/review/pending/list", json=body, params=params)

    def batch_reject_review(self, body: PlusAgentSkillBatchReviewForm) -> PlusApiResultListPlusAgentSkillVO:
        """Batch reject skill review"""
        return self._client.post(f"/backend/v3/api/skill/review/batch/reject", json=body)

    def batch_approve_review(self, body: PlusAgentSkillBatchReviewForm) -> PlusApiResultListPlusAgentSkillVO:
        """Batch approve skill review"""
        return self._client.post(f"/backend/v3/api/skill/review/batch/approve", json=body)

    def create_package(self, body: PlusAgentSkillPackageForm) -> PlusApiResultPlusAgentSkillPackageVO:
        """Create skill package"""
        return self._client.post(f"/backend/v3/api/skill/package", json=body)

    def create_enable_package(self, id: str) -> PlusApiResultPlusAgentSkillPackageVO:
        """Enable skill package"""
        return self._client.post(f"/backend/v3/api/skill/package/{id}/enable")

    def create_disable_package(self, id: str) -> PlusApiResultPlusAgentSkillPackageVO:
        """Disable skill package"""
        return self._client.post(f"/backend/v3/api/skill/package/{id}/disable")

    def create_list_by_page(self, body: Optional[PlusAgentSkillPackageQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAgentSkillPackageVO:
        """Query skill package list by page"""
        return self._client.post(f"/backend/v3/api/skill/package/list", json=body, params=params)

    def create_list_all(self, body: Optional[PlusAgentSkillPackageQueryListForm] = None) -> PlusApiResultListPlusAgentSkillPackageVO:
        """Query all skill packages"""
        return self._client.post(f"/backend/v3/api/skill/package/list/all", json=body)

    def create_list_by_page_skill(self, body: Optional[PlusAgentSkillQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAgentSkillVO:
        """Query skill list by page"""
        return self._client.post(f"/backend/v3/api/skill/list", json=body, params=params)

    def create_list_all_skill(self, body: Optional[PlusAgentSkillQueryListForm] = None) -> PlusApiResultListPlusAgentSkillVO:
        """Query all skills"""
        return self._client.post(f"/backend/v3/api/skill/list/all", json=body)
