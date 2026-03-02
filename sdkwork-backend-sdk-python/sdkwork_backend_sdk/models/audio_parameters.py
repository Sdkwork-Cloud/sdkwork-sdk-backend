from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioParameters:
    voice: str = None
    format: str = None
