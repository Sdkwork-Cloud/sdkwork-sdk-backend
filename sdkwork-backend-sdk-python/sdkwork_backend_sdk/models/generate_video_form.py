from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerateVideoForm:
    """Video generation request form"""
    prompt: str = None
    negative_prompt: str = None
    n: int = None
    width: int = None
    height: int = None
    model: str = None
    response_format: str = None
    style: str = None
    aspect_ratio: str = None
