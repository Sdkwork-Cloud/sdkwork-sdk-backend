from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChatMessageContentForm:
    """Chat message creation form"""
    role: str
    type: str
    status: str
    conversation_id: int
    conversation_uuid: str
    agent_id: int = None
    agent_type: str
    agent_biz_type: str = None
    content: MessageBody
    metadata: Dict[str, Any]
