from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DnsServers:
    servers: List[DnsServer] = None
    empty: bool = None
