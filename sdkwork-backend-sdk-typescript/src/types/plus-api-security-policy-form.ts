/** API安全策略表单 */
export interface PlusApiSecurityPolicyForm {
  /** 策略编码 */
  policyCode: string;
  /** API类型(app/backend/ai/open/*) */
  apiType: string;
  /** 路径匹配模式 */
  pathPattern: string;
  /** HTTP方法(GET/POST/.../*) */
  httpMethod?: string;
  /** 路径匹配方式(EXACT/PREFIX/ANT) */
  matchMode: 'EXACT' | 'PREFIX' | 'ANT';
  /** 认证模式(NONE/API_KEY/AUTH_TOKEN/ACCESS_TOKEN/AUTHENTICATED) */
  authMode: 'NONE' | 'API_KEY' | 'AUTH_TOKEN' | 'ACCESS_TOKEN' | 'AUTHENTICATED';
  /** 是否允许匿名访问 */
  allowAnonymous?: boolean;
  /** 所需角色编码列表(逗号分隔) */
  requiredRoles?: string;
  /** 所需权限编码列表(逗号分隔) */
  requiredPermissions?: string;
  /** 优先级(数值越小优先级越高) */
  priority?: number;
  /** 是否启用 */
  enabled?: boolean;
  /** 描述 */
  description?: string;
}
