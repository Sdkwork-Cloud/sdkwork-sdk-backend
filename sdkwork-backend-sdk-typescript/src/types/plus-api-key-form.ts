/** API key creation form */
export interface PlusApiKeyForm {
  /** API密钥名称，用于标识不同用途的密钥 */
  name: string;
  /** API密钥值，存储加密后的密钥字符串 */
  keyValue: string;
  /** API密钥类型，区分不同类型的API访问凭证 */
  type: 'DEFAULT' | 'SYSTEM' | 'USER' | 'APPLICATION' | 'INTEGRATION';
  /** API密钥状态，控制密钥是否可用 */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'EXPIRED' | 'REVOKED';
  /** API密钥过期时间，过期后自动失效 */
  expireTime?: string;
  /** API密钥描述信息，说明密钥用途和权限范围 */
  description?: string;
  /** 最后使用时间，记录密钥最近一次使用时间 */
  lastUsedTime?: string;
}
