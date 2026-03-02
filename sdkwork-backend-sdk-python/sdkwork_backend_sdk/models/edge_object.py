from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class EdgeObject:
    id: str = None
    name: str = None
    description: str = None
    source_node_id: str = None
    target_node_id: str = None
    type: str = None
    condition: Any = None
