/** Visit record creation form */
export interface PlusShareVisitRecordForm {
  /** éå® ä»é¨å«åæµç»D */
  shareId: number;
  /** çåæ£¶é°å¢Pé¦æ¿æ½ */
  ipAddress?: string;
  /** çåæ£¶é°å²ser-Agent */
  userAgent?: string;
  /** çåæ£¶éå æ£¿ */
  accessedAt: string;
  /** S uc ce ss */
  success?: boolean;
}
