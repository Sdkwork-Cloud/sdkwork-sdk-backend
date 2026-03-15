from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ContentVoteForm, PlusApiResultBoolean, PlusApiResultContentVoteVO, PlusApiResultListContentVoteVO, PlusApiResultPageContentVoteVO, QueryListForm

class VoteApi:
    """vote API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: ContentVoteForm) -> PlusApiResultContentVoteVO:
        """Update an existing content vote"""
        return self._client.put(f"/backend/v3/api/vote", json=body)

    def create(self, body: ContentVoteForm) -> PlusApiResultContentVoteVO:
        """Create a new content vote"""
        return self._client.post(f"/backend/v3/api/vote", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageContentVoteVO:
        """Get content votes by page"""
        return self._client.post(f"/backend/v3/api/vote/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListContentVoteVO:
        """Get all content votes"""
        return self._client.post(f"/backend/v3/api/vote/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultContentVoteVO:
        """Get a content vote by ID"""
        return self._client.get(f"/backend/v3/api/vote/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a content vote"""
        return self._client.delete(f"/backend/v3/api/vote/{id}")
