from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerateCharacterForm:
    """瑙掕壊鐢熸垚琛ㄥ崟锛岀敤浜庝紶閫掕鑹茬敓鎴愮殑涓氬姟鍙傛暟"""
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
