from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Flow:
    id: str = None
    name: str = None
    description: str = None
    status: str = None
    nodes: List[Node] = None
    edges: List[EdgeObject] = None
    sub_flows: List[Flow] = None
    parent_id: int = None
    start_time: str = None
    end_time: str = None
    last_node: Node = None
    parent_flow: Flow = None
    all_agents: List[PlusAgent] = None
