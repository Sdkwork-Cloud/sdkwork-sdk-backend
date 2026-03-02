from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusParticipantForm:
    """Chat participant creation form"""
    type: str
    name: str
    face: ImageMediaResource = None
    user_id: int = None
    agent_id: int = None
    role: str
    context_type: str
    context_id: int
    conversation_id: int = None
    group_type: str = None
    conversation_type: str
    is_creator: bool = None
    is_online: bool = None
    last_active_time: str = None
    is_temporary: bool = None
