from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContentSegment:
    id: str = None
    order: int = None
    type: str = None
    text: str = None
    start_ms: int = None
    end_ms: int = None
    metadata: Dict[str, Any] = None
