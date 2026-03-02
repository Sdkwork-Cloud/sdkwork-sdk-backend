from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptTemplateSlideForm:
    """PPT template slide creation form"""
    template_id: int
    section_title: str
    section_content: str = None
    page_number: int
    layout_type: str
    background_image: str = None
    sort_order: int
    is_required: bool
    created_at: str = None
    updated_at: str = None
