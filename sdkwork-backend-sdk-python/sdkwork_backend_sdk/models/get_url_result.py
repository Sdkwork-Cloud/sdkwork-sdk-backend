from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GetUrlResult:
    """URL Generation Result"""
    url: str = None
    preview_url: str = None
    object_key: str = None
