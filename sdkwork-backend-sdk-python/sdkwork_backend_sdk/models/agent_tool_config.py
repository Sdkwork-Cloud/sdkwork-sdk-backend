from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AgentToolConfig:
    tools: List[UseTool] = None
