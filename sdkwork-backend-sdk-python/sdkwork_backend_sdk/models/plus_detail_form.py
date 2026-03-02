from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDetailForm:
    """Detail creation form"""
    content_type: str
    content_id: int
    content: DetailContent = None
