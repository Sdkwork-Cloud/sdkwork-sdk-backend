from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatMessageQueryListForm:
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    conversation_id: int
    conversation_uuid: str
    last_sync_message_id: str = None
