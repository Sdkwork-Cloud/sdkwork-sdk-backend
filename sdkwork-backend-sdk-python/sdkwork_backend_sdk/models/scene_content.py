from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SceneContent:
    scenes: List[str] = None
    children: List[SceneContent] = None
