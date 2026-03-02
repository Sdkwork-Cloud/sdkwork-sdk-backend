from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusCommentsVO, PlusApiResultPagePlusCommentsVO, PlusApiResultPlusCommentsVO, PlusCommentsForm, PlusCommentsReplyForm, QueryListForm

class CommentApi:
    """comment API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusCommentsForm) -> PlusApiResultPlusCommentsVO:
        """Update an existing comment"""
        return self._client.put(f"/backend/v3/api/comments", json=body)

    def create(self, body: PlusCommentsForm) -> PlusApiResultPlusCommentsVO:
        """Create a new comment"""
        return self._client.post(f"/backend/v3/api/comments", json=body)

    def unlike(self, id: str) -> PlusApiResultPlusCommentsVO:
        """Unlike a comment"""
        return self._client.post(f"/backend/v3/api/comments/{id}/unlike")

    def reply(self, id: str, body: PlusCommentsReplyForm) -> PlusApiResultPlusCommentsVO:
        """Reply to a comment"""
        return self._client.post(f"/backend/v3/api/comments/{id}/reply", json=body)

    def like(self, id: str) -> PlusApiResultPlusCommentsVO:
        """Like a comment"""
        return self._client.post(f"/backend/v3/api/comments/{id}/like")

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusCommentsVO:
        """Get comments by page"""
        return self._client.post(f"/backend/v3/api/comments/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusCommentsVO:
        """Get all comments"""
        return self._client.post(f"/backend/v3/api/comments/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusCommentsVO:
        """Get a comment by ID"""
        return self._client.get(f"/backend/v3/api/comments/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a comment"""
        return self._client.delete(f"/backend/v3/api/comments/{id}")
