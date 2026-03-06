from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CreateChapterForm:
    """Form for creating a chapter or directory"""
    content_work_id: int
    parent_directory_id: int = None
    file_name: str
    is_directory: bool = None
    content: str = None
