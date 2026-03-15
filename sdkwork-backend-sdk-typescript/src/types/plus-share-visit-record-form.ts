/** Visit record creation form */
export interface PlusShareVisitRecordForm {
  /** 鍏宠仈鐨勫垎浜獻D */
  shareId: number;
  /** 璁块棶鑰匢P鍦板潃 */
  ipAddress?: string;
  /** 璁块棶鑰匲ser-Agent */
  userAgent?: string;
  /** 璁块棶鏃堕棿 */
  accessedAt: string;
  /** S uc ce ss */
  success?: boolean;
}
