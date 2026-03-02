from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChatMessageContentVO:
    """聊天消息内容VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    version: int = None
    role: str = None
    type: str = None
    status: str = None
    conversation_id: int = None
    conversation_uuid: str = None
    agent_id: int = None
    agent_type: str = None
    agent_biz_type: str = None
    content: MessageBody = None
    metadata: Dict[str, Any] = None
