from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatContext:
    indent: str = None
    response_handler: ChatResponseHandler = None
    sharding_context: ShardingContext = None
    conversation_id: str = None
    conversation_uuid: str = None
    user_id: int = None
    knowledge_base_id: int = None
    agent_id: int = None
    flow_id: int = None
    datasource_id: int = None
    parent_message_id: int = None
    save_audio: bool = None
    modalities: List[str] = None
    chat_options: PlusChatOptions = None
    response_channels: List[str] = None
