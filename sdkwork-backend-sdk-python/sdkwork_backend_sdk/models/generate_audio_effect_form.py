from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerateAudioEffectForm:
    """Audio effect generation form parameters"""
    title: str = None
    prompt: str = None
    audio_type: str = None
    effect_type: str = None
    intensity: int = None
    effect_params: str = None
    model: str = None
    channel: str = None
