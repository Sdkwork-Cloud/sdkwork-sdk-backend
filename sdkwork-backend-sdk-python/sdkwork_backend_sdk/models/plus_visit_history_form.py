from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVisitHistoryForm:
    """Visit history creation form"""
    content_type: str
    content_id: int
    visit_count: int = None
    last_visited_at: str
    duration: int = None
    source: str = None
