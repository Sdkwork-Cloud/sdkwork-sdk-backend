from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ResponseFormat:
    type: str = None
    json_schema: JsonSchema = None
