from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerateVoiceSpeakerForm:
    """Voice Speaker Generation Form"""
    voice_speaker_name: str
    voice_type: str = None
    text: str = None
    speed: float = None
    pitch: float = None
    volume: int = None
    model: str = None
    response_format: str = None
    prompt: str = None
