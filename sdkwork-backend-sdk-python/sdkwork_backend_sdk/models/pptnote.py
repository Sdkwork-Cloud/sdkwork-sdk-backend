from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PPTNote:
    """批注"""
    id: str
    content: str
    time: int
    user: str
    el_id: str = None
    replies: List[PPTNoteReply] = None
