from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioTranscriptionOptions:
    model: str = None
