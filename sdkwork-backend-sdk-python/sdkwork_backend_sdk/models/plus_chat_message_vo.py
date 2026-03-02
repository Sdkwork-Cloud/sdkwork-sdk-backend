from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChatMessageVO:
    """Chat Message Value Object - Represents a message in an AI conversation (user input or AI response)"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    body: MessageBody = None
    role: str = None
    type: str = None
    status: str = None
    conversation_id: int = None
    conversation_uuid: str = None
    user_id: int = None
    sender_id: int = None
    sender: Participant = None
    receiver: Participant = None
    receiver_id: int = None
    group_id: int = None
    parent_message_id: int = None
    children: List[PlusChatMessageVO] = None
    metadata: Dict[str, Any] = None
    token_count: int = None
    send_at: str = None
    receive_at: str = None
    read_at: str = None
    processing_time: int = None
    is_error: bool = None
    error_code: str = None
    error_message: str = None
    model_id: int = None
    model: str = None
    temperature: float = None
    used_rag: bool = None
    chat_options: PlusChatOptions = None
    channel_id: str = None
    agent_id: int = None
    knowledge_base_id: int = None
    datasource_id: int = None
    agent_type: str = None
    agent_biz_type: str = None
    channel_msg_id: str = None
    channel_client_msg_id: str = None
    channel_msg_seq: int = None
    conversation_type: str = None
    feedback_metadata: FeedbackMetadata = None
