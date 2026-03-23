import type { HttpApiDefinition } from './http-api-definition';
import type { PlusToolDefinition } from './plus-tool-definition';

/** AIå·¥å·VOç±» */
export interface PlusAiToolVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** å·¥å·ID */
  id?: number;
  /** å·¥å·åç§° */
  name?: string;
  /** å·¥å·æè¿° */
  description?: string;
  /** å·¥å·ç±»å(HTTP_API:HTTPæ¥å£,FUNCTION:å½æ°,PLUGIN:æä»¶) */
  type?: 'HTTP' | 'TOOL' | 'MCP' | 'SCRIPT';
  /** å·¥å·ç¶æ(DRAFT:èç¨¿,PUBLISHED:å·²åå¸,DEPRECATED:å·²å¼ç¨) */
  status?: 'ACTIVE' | 'INACTIVE';
  /** æ¯å¦å¯ç¨(true:å¯ç¨,false:ç¦ç¨) */
  enabled?: boolean;
  /** HTTP APIå®ä¹(JSONæ ¼å¼) */
  httpApiDefinition?: HttpApiDefinition;
  /** å·¥å·å®ä¹(JSONæ ¼å¼) */
  toolDefinition?: PlusToolDefinition;
}
