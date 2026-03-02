/** API密钥VO类，用于传输系统中API访问凭证信息 */
export interface PlusApiKeyVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** API密钥名称 */
  name?: string;
  /** API密钥值 */
  keyValue?: string;
  /** API密钥类型 */
  type?: 'DEFAULT' | 'SYSTEM' | 'USER' | 'APPLICATION' | 'INTEGRATION';
  /** API密钥状态 */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'EXPIRED' | 'REVOKED';
  /** API密钥过期时间 */
  expireTime?: string;
  /** API密钥描述 */
  description?: string;
  /** 最后使用时间 */
  lastUsedTime?: string;
}
