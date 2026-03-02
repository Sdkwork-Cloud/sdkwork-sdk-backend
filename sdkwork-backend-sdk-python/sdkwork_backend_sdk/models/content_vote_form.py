from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContentVoteForm:
    """Vote creation form"""
    content_type: str
    rating: str
    content_id: int
    metadata: ContentVoteMetadata = None
