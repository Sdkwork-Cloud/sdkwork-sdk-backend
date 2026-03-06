/** API安全策略VO */
export interface PlusApiSecurityPolicyVO {
  createdAt?: string;
  updatedAt?: string;
  id?: number;
  uuid?: string;
  policyCode?: string;
  apiType?: string;
  pathPattern?: string;
  httpMethod?: string;
  matchMode?: 'EXACT' | 'PREFIX' | 'ANT';
  authMode?: 'NONE' | 'API_KEY' | 'AUTH_TOKEN' | 'ACCESS_TOKEN' | 'AUTHENTICATED';
  allowAnonymous?: boolean;
  requiredRoles?: string;
  requiredPermissions?: string;
  priority?: number;
  enabled?: boolean;
  description?: string;
}
