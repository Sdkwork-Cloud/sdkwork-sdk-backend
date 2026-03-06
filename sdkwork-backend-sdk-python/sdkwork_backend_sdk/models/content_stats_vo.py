from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContentStatsVO:
    """Content statistics VO"""
    word_count: int = None
    chapter_count: int = None
    file_size: int = None
