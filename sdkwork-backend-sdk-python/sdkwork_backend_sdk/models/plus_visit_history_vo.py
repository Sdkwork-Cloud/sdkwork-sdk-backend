from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVisitHistoryVO:
    """访问历史VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    user_id: int = None
    content_type: str = None
    content_id: int = None
    visit_count: int = None
    last_visited_at: str = None
    duration: int = None
    source: str = None
