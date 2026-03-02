from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class StreamOptions:
    include_usage: bool = None
    chunk_include_usage_: bool = None
