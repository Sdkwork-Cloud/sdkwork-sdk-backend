/** File disk creation form */
export interface PlusDiskForm {
  /** 存储盘名称 */
  name: string;
  /** 存储盘所有者类型 */
  owner: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  /** 所有者ID */
  ownerId: number;
  /** 总容量（字节） */
  diskSize: number;
  /** 已使用容量（字节） */
  usedSize: number;
  /** 存储盘描述 */
  description?: string;
}
