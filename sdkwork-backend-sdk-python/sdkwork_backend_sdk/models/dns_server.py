from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DnsServer:
    address: str = None
    port: int = None
    type: str = None
    priority: int = None
    enabled: bool = None
