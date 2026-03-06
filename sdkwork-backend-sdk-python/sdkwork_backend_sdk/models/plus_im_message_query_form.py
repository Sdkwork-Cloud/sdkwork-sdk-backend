from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusImMessageQueryForm:
    """IM消息分页查询参数"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    conversation_id: int = None
    sender_id: int = None
    receiver_id: int = None
    group_id: int = None
    type: str = None
