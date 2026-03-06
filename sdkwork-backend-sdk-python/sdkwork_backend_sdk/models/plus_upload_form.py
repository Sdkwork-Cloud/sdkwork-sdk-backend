from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUploadForm:
    """File upload form"""
    provider: str = None
    name: str = None
    scene: str = None
    bucket: BucketObject = None
    expiration_seconds: int = None
