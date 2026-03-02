from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResult, PlusPptTemplateRenderForm

class PptTemplateRenderingApi:
    """ppt_template_rendering API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def render(self, body: PlusPptTemplateRenderForm) -> PlusApiResult:
        """Render PPT template"""
        return self._client.post(f"/backend/v3/api/ppt/template/render", json=body)
