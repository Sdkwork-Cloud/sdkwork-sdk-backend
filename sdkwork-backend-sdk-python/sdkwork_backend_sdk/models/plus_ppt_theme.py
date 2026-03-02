from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptTheme:
    """PPT主题样式定义"""
    theme_colors: List[str]
    sub_colors: List[str]
    export_theme_colors: List[str]
    font_color: str
    font_name: str = None
    background_color: str
    shadow: PlusPptThemeShadow = None
    outline: PlusPptThemeOutline = None
