from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiAgentToolForm:
    """Agent-tool relationship creation form"""
    agent_id: int
    tool_id: int
    sort_order: int = None
    enabled: bool
