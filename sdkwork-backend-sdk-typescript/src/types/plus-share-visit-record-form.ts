/** Visit record creation form */
export interface PlusShareVisitRecordForm {
  /** 关联的分享ID */
  shareId: number;
  /** 访问者IP地址 */
  ipAddress?: string;
  /** 访问者User-Agent */
  userAgent?: string;
  /** 访问时间 */
  accessedAt: string;
  /** 是否成功访问（输入密码正确等） */
  success?: boolean;
}
