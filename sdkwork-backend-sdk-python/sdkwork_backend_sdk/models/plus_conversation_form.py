from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusConversationForm:
    """Conversation creation form"""
    uuid: str = None
    title: str
    description: str = None
    user_id: int
    status: str
    agent_id: int = None
    summary: str = None
    last_message_id: int = None
    message_count: int
    tags: TagsContent = None
    system_context: str = None
    user_context: str = None
    last_interaction_time: str = None
    model_id: int = None
    model: str = None
    knowledge_base_id: int = None
    data_source_id: int = None
    chat_options: PlusChatOptions = None
    pinned: bool = None
    sort_order: int = None
