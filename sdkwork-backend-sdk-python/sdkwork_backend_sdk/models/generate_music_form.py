from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerateMusicForm:
    """Music generation request form"""
    prompt: str = None
    lyrics: str = None
    n: int = None
    model: str = None
    tempo: int = None
    style: str = None
    instrument: str = None
