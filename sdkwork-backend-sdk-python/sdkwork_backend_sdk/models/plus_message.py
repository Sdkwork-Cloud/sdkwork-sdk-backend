from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMessage:
    """IM消息实体类"""
    id: int = None
    uuid: str = None
    created_at: str = None
    updated_at: str = None
    send_at: str = None
    conversation_id: int = None
    type: str = None
    sender: Participant = None
    receiver: Participant = None
    group_id: int = None
    msg_id: str = None
    client_msg_id: str = None
    body: MessageBody = None
    metadata: Dict[str, Any] = None
    content: str = None
