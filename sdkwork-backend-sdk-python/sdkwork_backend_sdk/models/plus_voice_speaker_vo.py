from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVoiceSpeakerVO:
    """语音发音人VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    voice: str = None
    channel_speaker_id: str = None
    code: str = None
    channel: str = None
    gender: str = None
    age_type: str = None
    type: str = None
    models: List[str] = None
    tags: TagsContent = None
    status: str = None
    description: str = None
