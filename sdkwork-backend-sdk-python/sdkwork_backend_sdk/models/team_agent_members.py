from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TeamAgentMembers:
    id: int = None
    uuid: str = None
    type: str = None
    biz_type: str = None
    description: str = None
    agents: List[Any] = None
