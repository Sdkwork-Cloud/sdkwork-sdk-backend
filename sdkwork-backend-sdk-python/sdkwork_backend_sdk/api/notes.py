from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusNotesVO, PlusApiResultPagePlusNotesVO, PlusApiResultPlusNotesVO, PlusNotesForm

class NotesApi:
    """notes API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusNotesForm) -> PlusApiResultPlusNotesVO:
        """Update a note"""
        return self._client.put(f"/backend/v3/api/notes", json=body)

    def create(self, body: PlusNotesForm) -> PlusApiResultPlusNotesVO:
        """Create a note"""
        return self._client.post(f"/backend/v3/api/notes", json=body)

    def get_by_uuid(self, uuid: str) -> PlusApiResultPlusNotesVO:
        """Get note by UUID"""
        return self._client.get(f"/backend/v3/api/notes/{uuid}")

    def search(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusNotesVO:
        """Search notes"""
        return self._client.get(f"/backend/v3/api/notes/search", params=params)

    def page_by_user(self, userId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusNotesVO:
        """Get paginated notes by user"""
        return self._client.get(f"/backend/v3/api/notes/page_by_user/{userId}", params=params)

    def page_by_tag(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusNotesVO:
        """Get paginated notes by tag"""
        return self._client.get(f"/backend/v3/api/notes/page_by_tag", params=params)

    def page_by_category(self, categoryId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusNotesVO:
        """Get paginated notes by category"""
        return self._client.get(f"/backend/v3/api/notes/page_by_category/{categoryId}", params=params)

    def list_by_page(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusNotesVO:
        """Get paginated notes"""
        return self._client.get(f"/backend/v3/api/notes/page", params=params)

    def list_by_user_id(self, userId: str) -> PlusApiResultListPlusNotesVO:
        """List notes by user"""
        return self._client.get(f"/backend/v3/api/notes/list_by_user/{userId}")

    def list_by_tag(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListPlusNotesVO:
        """List notes by tag"""
        return self._client.get(f"/backend/v3/api/notes/list_by_tag", params=params)

    def list_by_category_id(self, categoryId: str) -> PlusApiResultListPlusNotesVO:
        """List notes by category"""
        return self._client.get(f"/backend/v3/api/notes/list_by_category/{categoryId}")

    def get_by_id(self, id: str) -> PlusApiResultPlusNotesVO:
        """Get note by ID"""
        return self._client.get(f"/backend/v3/api/notes/id/{id}")

    def list_all(self) -> PlusApiResultListPlusNotesVO:
        """List all notes"""
        return self._client.get(f"/backend/v3/api/notes/all")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a note"""
        return self._client.delete(f"/backend/v3/api/notes/{id}")
