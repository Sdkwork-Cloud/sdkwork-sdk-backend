from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SpeechTranscriptionConfig:
    channel: str = None
    product: str = None
    options: AudioTranscriptionOptions = None
