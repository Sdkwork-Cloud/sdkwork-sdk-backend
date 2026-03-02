from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GeoPoint:
    longitude: float = None
    latitude: float = None
    valid: bool = None
