from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusConversationOpenForm:
    """P lu sC on ve rs at io nO pe nF or m"""
    conversation_id: str = None
    uuid: str = None
    user_id: int
    agent_id: int = None
    knowledge_base_id: int = None
    data_source_id: int = None
    chat_options: PlusChatOptions = None
