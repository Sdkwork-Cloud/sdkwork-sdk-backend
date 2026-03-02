from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AuthorInfo:
    id: int = None
    face_image: ImageMediaResource = None
    name: str = None
    email: str = None
    bio: str = None
    website: str = None
