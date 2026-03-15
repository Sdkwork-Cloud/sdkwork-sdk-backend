from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiToolForm:
    """Tool creation form"""
    name: str
    description: str = None
    type: str
    status: str
    enabled: bool
    http_api_definition: HttpApiDefinition = None
    tool_definition: PlusToolDefinition
