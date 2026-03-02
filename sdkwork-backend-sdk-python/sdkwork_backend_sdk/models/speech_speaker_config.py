from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SpeechSpeakerConfig:
    speaker: VoiceSpeakerInfo = None
    speaker_id: int = None
    volume: float = None
    pitch: float = None
    language: str = None
    speed: float = None
    format: str = None
