from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerateAudioForm:
    """Audio Generation Form"""
    title: str = None
    prompt: str = None
    voice: str = None
    model: str = None
    format: str = None
    speed: float = None
