from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAgentSkillBatchReviewForm, PlusAgentSkillFeatureForm, PlusAgentSkillForm, PlusAgentSkillQueryListForm, PlusAgentSkillReviewForm, PlusApiResultListPlusAgentSkillVO, PlusApiResultPagePlusAgentSkillVO, PlusApiResultPlusAgentSkillVO

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

    def enable(self, id: str) -> PlusApiResultPlusAgentSkillVO:
        """Enable skill"""
        return self._client.post(f"/backend/v3/api/skill/{id}/enable")

    def disable(self, id: str) -> PlusApiResultPlusAgentSkillVO:
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

    def list_by_page(self, body: Optional[PlusAgentSkillQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAgentSkillVO:
        """Query skill list by page"""
        return self._client.post(f"/backend/v3/api/skill/list", json=body, params=params)

    def list_all(self, body: Optional[PlusAgentSkillQueryListForm] = None) -> PlusApiResultListPlusAgentSkillVO:
        """Query all skills"""
        return self._client.post(f"/backend/v3/api/skill/list/all", json=body)
