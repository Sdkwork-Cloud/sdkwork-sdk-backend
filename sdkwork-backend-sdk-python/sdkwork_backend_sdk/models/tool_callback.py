from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ToolCallback:
    tool_definition: ToolDefinition = None
    tool_metadata: ToolMetadata = None
