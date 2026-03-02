from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ToolCallbackProvider:
    tool_callbacks: List[ToolCallback] = None
