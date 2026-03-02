from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusConversationQueryListForm:
    """AI Conversation Query List Form - 用于查询用户与AI代理之间的对话会话列表"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    init_defaults: bool = None
