from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Node:
    id: str = None
    name: str = None
    description: str = None
    type: str = None
    properties: Dict[str, Any] = None
    start_time: str = None
    end_time: str = None
    agents: List[PlusAgent] = None
