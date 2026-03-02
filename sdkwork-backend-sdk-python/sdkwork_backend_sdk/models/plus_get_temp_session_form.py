from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGetTempSessionForm:
    """Temporary session request form"""
    provider: str = None
    name: str = None
    scene: str = None
    bucket: BucketObject = None
    method: str = None
    expiration_seconds: int = None
