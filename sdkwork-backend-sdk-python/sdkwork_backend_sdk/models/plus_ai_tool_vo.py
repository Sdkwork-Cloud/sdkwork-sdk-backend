from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiToolVO:
    """AI工具VO类"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    description: str = None
    type: str = None
    status: str = None
    enabled: bool = None
    http_api_definition: HttpApiDefinition = None
    tool_definition: PlusToolDefinition = None
