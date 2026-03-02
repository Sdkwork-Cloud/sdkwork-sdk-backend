from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptTemplateSlideVO:
    """PPT模板详情配置VO（存储模板中各页面/section的具体配置）"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    template_id: int = None
    section_title: str = None
    section_content: str = None
    page_number: int = None
    layout_type: str = None
    background_image: str = None
    sort_order: int = None
    is_required: bool = None
