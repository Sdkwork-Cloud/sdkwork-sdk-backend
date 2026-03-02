from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiAgentToolVO:
    """AI智能体与工具关联关系VO类，用于维护AI智能体与工具之间的多对多关联关系"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    agent_id: int = None
    tool_id: int = None
    sort_order: int = None
    enabled: bool = None
    agent_name: str = None
    tool_name: str = None
