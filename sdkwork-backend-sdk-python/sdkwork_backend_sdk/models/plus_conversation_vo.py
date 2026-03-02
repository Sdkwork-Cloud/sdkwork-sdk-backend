from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusConversationVO:
    """AI Conversation Value Object - Represents a conversation session between a user and an AI agent"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    title: str = None
    type: str = None
    description: str = None
    user_id: int = None
    status: str = None
    agent_id: int = None
    agent_type: str = None
    agent_biz_type: str = None
    scene: str = None
    summary: str = None
    last_message_id: int = None
    message_count: int = None
    unread_count: int = None
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
