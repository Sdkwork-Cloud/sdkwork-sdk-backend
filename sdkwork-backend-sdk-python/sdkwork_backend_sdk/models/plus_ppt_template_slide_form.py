from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptTemplateSlideForm:
    """PPT template slide creation form"""
    template_id: int
    page_number: int
    layout_type: str
    sort_order: int
    is_required: bool
    created_at: str = None
    updated_at: str = None
