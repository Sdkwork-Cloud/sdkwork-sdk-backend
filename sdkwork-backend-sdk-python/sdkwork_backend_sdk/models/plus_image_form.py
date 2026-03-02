from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusImageForm:
    """Image creation form"""
    title: str = None
    description: str = None
    url: str
    aspect_ratio: str
    width: int = None
    height: int = None
    file_size: int = None
    format: str = None
    status: str
