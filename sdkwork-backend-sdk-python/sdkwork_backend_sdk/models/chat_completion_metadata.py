from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatCompletionMetadata:
    """聊天完成元数据"""
    actions: List[str] = None
    agent: Dict[str, Any] = None
    parent_message_id: int = None
    parent_message_uuid: str = None
