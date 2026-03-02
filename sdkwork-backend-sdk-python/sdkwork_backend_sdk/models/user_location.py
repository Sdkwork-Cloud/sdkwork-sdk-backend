from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserLocation:
    type: str = None
    approximate: Approximate = None
