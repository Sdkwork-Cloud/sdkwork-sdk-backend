/** 分享访问记录Value Object */
export interface PlusShareVisitRecordVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 记录ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 关联的分享ID */
  shareId?: number;
  /** 访问者IP地址 */
  ipAddress?: string;
  /** 访问者User-Agent */
  userAgent?: string;
  /** 访问时间 */
  accessedAt?: string;
  /** 是否成功访问 */
  success?: boolean;
}
