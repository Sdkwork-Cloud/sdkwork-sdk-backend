from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChatMessageForm:
    """Chat message creation form"""
    content: MessageBody
    role: str
    type: str
    status: str
    conversation_id: int
    user_id: int = None
    parent_message_id: int = None
    metadata: Dict[str, Any] = None
    token_count: int = None
    processing_time: int = None
    is_error: bool = None
    error_code: str = None
    error_message: str = None
    model_id: int = None
    model: str = None
    temperature: float = None
    used_rag: bool = None
    chat_options: PlusChatOptions = None
