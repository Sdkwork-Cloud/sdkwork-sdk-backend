/** APIç¹å¤åç»æ «æçã¥å´ */
export interface PlusApiSecurityPolicyForm {
  /** ç»æ «æç¼æ «ç */
  policyCode: string;
  /** APIç»«è¯²ç·(app/backend/ai/open/*) */
  apiType: string;
  /** çºîç·éå½å¤å¦¯â³ç´¡ */
  pathPattern: string;
  /** HTTPéè§ç¡¶(GET/POST/.../*) */
  httpMethod?: string;
  /** çºîç·éå½å¤éç°ç´¡(EXACT/PREFIX/ANT) */
  matchMode: 'EXACT' | 'PREFIX' | 'ANT';
  /** çãçå¦¯â³ç´¡(NONE/API_KEY/AUTH_TOKEN/ACCESS_TOKEN/AUTHENTICATED) */
  authMode: 'NONE' | 'API_KEY' | 'AUTH_TOKEN' | 'ACCESS_TOKEN' | 'AUTHENTICATED';
  /** éîæéä½½îéå®æçåæ£¶ */
  allowAnonymous?: boolean;
  /** éµâ¬éâ¬çæå£ç¼æ «çéæ¥ã(é«æ¥å½¿éåæ®§) */
  requiredRoles?: string;
  /** éµâ¬éâ¬éå®æªºç¼æ «çéæ¥ã(é«æ¥å½¿éåæ®§) */
  requiredPermissions?: string;
  /** æµ¼æ¨ºåç»¾?éæ¿â¬è°ç§ºçå¿ç´­éå ¢éªçå©ç®) */
  priority?: number;
  /** éîæéîæ¤ */
  enabled?: boolean;
  /** é»å¿å ª */
  description?: string;
}
