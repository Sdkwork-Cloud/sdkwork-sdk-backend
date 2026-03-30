/** API瀹夊叏绛栫暐琛ㄥ崟 */
export interface PlusApiSecurityPolicyForm {
  /** 绛栫暐缂栫爜 */
  policyCode: string;
  /** API绫诲瀷(app/backend/ai/open/*) */
  apiType: string;
  /** 璺緞鍖归厤妯″紡 */
  pathPattern: string;
  /** HTTP鏂规硶(GET/POST/.../*) */
  httpMethod?: string;
  /** 璺緞鍖归厤鏂瑰紡(EXACT/PREFIX/ANT) */
  matchMode: 'EXACT' | 'PREFIX' | 'ANT';
  /** 璁よ瘉妯″紡(NONE/API_KEY/AUTH_TOKEN/ACCESS_TOKEN/AUTHENTICATED) */
  authMode: 'NONE' | 'API_KEY' | 'AUTH_TOKEN' | 'ACCESS_TOKEN' | 'AUTHENTICATED';
  /** 鏄惁鍏佽鍖垮悕璁块棶 */
  allowAnonymous?: boolean;
  /** 鎵€闇€瑙掕壊缂栫爜鍒楄〃(閫楀彿鍒嗛殧) */
  requiredRoles?: string;
  /** 鎵€闇€鏉冮檺缂栫爜鍒楄〃(閫楀彿鍒嗛殧) */
  requiredPermissions?: string;
  /** 浼樺厛绾?鏁板€艰秺灏忎紭鍏堢骇瓒婇珮) */
  priority?: number;
  /** 鏄惁鍚敤 */
  enabled?: boolean;
  /** 鎻忚堪 */
  description?: string;
}
