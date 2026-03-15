from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelFunctionInfo:
    """AI模型服务功能支持配置信息"""
    functions: List[ModelFunctionItem] = None
