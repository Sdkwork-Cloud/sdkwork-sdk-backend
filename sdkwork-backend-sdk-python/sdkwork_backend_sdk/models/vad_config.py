from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VadConfig:
    speech_threshold: float = None
    min_speech_duration_ms: int = None
    min_silence_duration_ms: int = None
    max_silence_duration_ms: int = None
    silence_timeout: int = None
    speech_timeout: int = None
    window_size: int = None
    step_size: int = None
