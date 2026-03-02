from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Approximate:
    city: str = None
    country: str = None
    region: str = None
    timezone: str = None
