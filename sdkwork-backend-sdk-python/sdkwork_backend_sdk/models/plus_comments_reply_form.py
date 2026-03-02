from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCommentsReplyForm:
    """Reply details"""
    content: str
    user_id: int
