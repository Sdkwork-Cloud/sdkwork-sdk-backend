from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVoiceSpeakerVO, PlusApiResultPagePlusVoiceSpeakerVO, PlusApiResultPlusVoiceSpeakerVO, PlusVoiceSpeakerForm, PlusVoiceSpeakerQueryForm

class VoiceSpeakerApi:
    """voice_speaker API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVoiceSpeakerForm) -> PlusApiResultPlusVoiceSpeakerVO:
        """Update an existing voice speaker"""
        return self._client.put(f"/backend/v3/api/voice/speaker", json=body)

    def create(self, body: PlusVoiceSpeakerForm) -> PlusApiResultPlusVoiceSpeakerVO:
        """Create a new voice speaker"""
        return self._client.post(f"/backend/v3/api/voice/speaker", json=body)

    def list_public(self, body: Optional[PlusVoiceSpeakerQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVoiceSpeakerVO:
        """Get voice speakers by page"""
        return self._client.post(f"/backend/v3/api/voice/speaker/list_public", json=body, params=params)

    def list_by_page(self, body: Optional[PlusVoiceSpeakerQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVoiceSpeakerVO:
        """Get voice speakers by page"""
        return self._client.post(f"/backend/v3/api/voice/speaker/list", json=body, params=params)

    def list_all_entities(self, body: Optional[PlusVoiceSpeakerQueryForm] = None) -> PlusApiResultListPlusVoiceSpeakerVO:
        """Get all voice speakers"""
        return self._client.post(f"/backend/v3/api/voice/speaker/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVoiceSpeakerVO:
        """Get a voice speaker by ID"""
        return self._client.get(f"/backend/v3/api/voice/speaker/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a voice speaker"""
        return self._client.delete(f"/backend/v3/api/voice/speaker/{id}")
