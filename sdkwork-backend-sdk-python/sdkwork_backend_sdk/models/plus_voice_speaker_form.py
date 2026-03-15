from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVoiceSpeakerForm:
    """Voice speaker creation form"""
    name: str
    channel_speaker_id: str = None
    code: str
    channel: str
    gender: str
    age_type: str
    type: str
    models: List[str]
    tags: TagsContent = None
    status: str
    description: str = None
