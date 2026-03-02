from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class QueryListForm:
    """Query parameters for filtering"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
