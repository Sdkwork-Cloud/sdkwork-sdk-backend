from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GetAccessTokenForm:
    """Get access Tokens Form"""
    id: int
    platforms: List[str] = None
