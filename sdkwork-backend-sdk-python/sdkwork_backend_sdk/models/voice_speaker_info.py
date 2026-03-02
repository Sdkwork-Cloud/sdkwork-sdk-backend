from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceSpeakerInfo:
    channel: str = None
    provider: str = None
    product: str = None
    id: str = None
    models: List[str] = None
    speaker_id: str = None
    display_name: str = None
    tags: TagsContent = None
    motion: VoiceMotion = None
    style: VoiceStyle = None
    description: str = None
