/** 文件存储盘信息VO */
export interface PlusDiskVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 存储盘名称 */
  name?: string;
  /** 存储盘所有者类型 */
  owner?: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  /** 所有者ID */
  ownerId?: number;
  /** 总容量（字节） */
  diskSize?: number;
  /** 已使用容量（字节） */
  usedSize?: number;
  /** 存储盘描述 */
  description?: string;
  /** 剩余可用容量（字节） */
  remainingSize?: number;
  /** 存储盘使用率（百分比） */
  usageRate?: number;
}
