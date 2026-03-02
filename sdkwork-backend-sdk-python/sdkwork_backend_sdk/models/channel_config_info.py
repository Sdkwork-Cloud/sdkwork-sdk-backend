from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChannelConfigInfo:
    uuid: str = None
    accounts: List[ModelConfig] = None
