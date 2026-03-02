from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusConversationOpenForm:
    """AI Conversation Form - 用于创建或更新用户与AI代理之间的对话会话"""
    conversation_id: str = None
    uuid: str = None
    title: str
    user_id: int
    agent_id: int = None
    knowledge_base_id: int = None
    data_source_id: int = None
    chat_options: PlusChatOptions = None
