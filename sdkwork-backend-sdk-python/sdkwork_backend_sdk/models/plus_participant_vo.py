from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusParticipantVO:
    """聊天参与者视图对象"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    type: str = None
    name: str = None
    face: ImageMediaResource = None
    user_id: int = None
    agent_id: int = None
    role: str = None
    context_type: str = None
    context_id: int = None
    conversation_id: int = None
    group_type: str = None
    conversation_type: str = None
    is_creator: bool = None
    is_online: bool = None
    last_active_time: str = None
    is_temporary: bool = None
