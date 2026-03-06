from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ContentStatsVO, ContentWorkVO, CreateChapterForm, CreateContentForm, FileTreeNodeVO, GetAllArticlesResponse, GetAllContentsResponse, GetAllNovelsResponse, GetAllProseResponse, GetAllScriptsResponse

class ContentWritingApi:
    """content_writing API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def rename_chapter(self, fileId: str, body: str) -> FileTreeNodeVO:
        """Rename chapter"""
        return self._client.put(f"/backend/v3/api/content-writing/chapters/{fileId}/rename", json=body)

    def move_chapter(self, fileId: str, body: int) -> FileTreeNodeVO:
        """Move chapter"""
        return self._client.put(f"/backend/v3/api/content-writing/chapters/{fileId}/move", json=body)

    def get_chapter_content(self, fileId: str) -> str:
        """Get chapter content"""
        return self._client.get(f"/backend/v3/api/content-writing/chapters/{fileId}")

    def update_chapter(self, fileId: str, body: str) -> FileTreeNodeVO:
        """Update chapter"""
        return self._client.put(f"/backend/v3/api/content-writing/chapters/{fileId}", json=body)

    def delete_chapter(self, fileId: str) -> None:
        """Delete chapter"""
        return self._client.delete(f"/backend/v3/api/content-writing/chapters/{fileId}")

    def create_chapter(self, body: CreateChapterForm) -> FileTreeNodeVO:
        """Create chapter"""
        return self._client.post(f"/backend/v3/api/content-writing/chapters", json=body)

    def get_all_contents(self) -> GetAllContentsResponse:
        """Get all contents"""
        return self._client.get(f"/backend/v3/api/content-writing")

    def create_content(self, body: CreateContentForm) -> ContentWorkVO:
        """Create content"""
        return self._client.post(f"/backend/v3/api/content-writing", json=body)

    def get_content(self, id: str) -> ContentWorkVO:
        """Get content"""
        return self._client.get(f"/backend/v3/api/content-writing/{id}")

    def delete_content(self, id: str) -> None:
        """Delete content"""
        return self._client.delete(f"/backend/v3/api/content-writing/{id}")

    def get_directory_tree(self, contentWorkId: str) -> FileTreeNodeVO:
        """Get directory tree"""
        return self._client.get(f"/backend/v3/api/content-writing/{contentWorkId}/tree")

    def get_content_stats(self, contentWorkId: str) -> ContentStatsVO:
        """Get content stats"""
        return self._client.get(f"/backend/v3/api/content-writing/{contentWorkId}/stats")

    def get_all_scripts(self) -> GetAllScriptsResponse:
        """Get all scripts"""
        return self._client.get(f"/backend/v3/api/content-writing/scripts")

    def get_all_prose(self) -> GetAllProseResponse:
        """Get all prose"""
        return self._client.get(f"/backend/v3/api/content-writing/prose")

    def get_all_novels(self) -> GetAllNovelsResponse:
        """Get all novels"""
        return self._client.get(f"/backend/v3/api/content-writing/novels")

    def get_all_articles(self) -> GetAllArticlesResponse:
        """Get all articles"""
        return self._client.get(f"/backend/v3/api/content-writing/articles")
