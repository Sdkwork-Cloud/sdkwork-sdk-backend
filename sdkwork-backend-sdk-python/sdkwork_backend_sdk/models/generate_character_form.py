from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerateCharacterForm:
    """角色生成表单，用于传递角色生成的业务参数"""
    name: str
    description: str
    appearance: str = None
    personality: str = None
    background: str = None
    style: str = None
    response_format: str = None
    model: str = None
    n: int
    width: int = None
    height: int = None
    quality: str = None
    prompt: str = None
    negative_prompt: str = None
