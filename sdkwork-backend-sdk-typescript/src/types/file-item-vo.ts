/** 文件视图对象 */
export interface FileItemVO {
  /** 文件ID */
  id?: string;
  /** 对象类型 */
  object?: string;
  /** 文件大小（字节） */
  bytes?: number;
  /** 创建时间（Unix时间戳，秒） */
  createdAt?: number;
  /** 文件名 */
  filename?: string;
  /** 文件用途 */
  purpose?: 'assistants' | 'assistants_output' | 'batch' | 'batch_output' | 'fine-tune' | 'fine-tune-results' | 'vision';
  /** 过期时间（Unix时间戳，秒） */
  expiresAt?: number;
  /** 文件状态 */
  status?: 'uploaded' | 'processed' | 'error';
  /** 状态详情 */
  statusDetails?: string;
  /** 是否已删除 */
  deleted?: boolean;
}
