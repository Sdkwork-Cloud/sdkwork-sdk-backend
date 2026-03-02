from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PPTNoteReply:
    """批注回复"""
    id: str
    content: str
    time: int
    user: str
