from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusToolDefinition:
    id: int = None
    uuid: str = None
    type: str = None
    name: str = None
    description: str = None
    input_schema: str = None
    build_in: bool = None
    http_definition: HttpApiDefinition = None
