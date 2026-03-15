/** PPT template slide creation form */
export interface PlusPptTemplateSlideForm {
  /** 鍏宠仈鐨凱PT妯℃澘ID */
  templateId: number;
  /** 妯℃澘section鏍囬锛堝'灏侀潰椤?銆?鐩綍椤?銆?鍐呭椤?'绛夛級 */
  pageNumber: number;
  /** 椤甸潰甯冨眬绫诲瀷锛堟爣棰橀〉/鍐呭椤?鏍囬+鍐呭/鍒嗘爮鍐呭绛夛級 */
  layoutType: 'DEFAULT' | 'TITLE' | 'CONTENT' | 'TITLE_CONTENT' | 'COLUMN_CONTENT';
  /** S or tO rd er */
  sortOrder: number;
  /** 鏄惁涓哄繀濉玸ection锛坱rue-蹇呭～锛岀敓鎴怭PT鏃朵笉鍙垹闄わ紱false-鍙€夛紝鍙垹闄わ級 */
  isRequired: boolean;
  /** 鍒涘缓鏃堕棿 */
  createdAt?: string;
  /** U pd at ed At */
  updatedAt?: string;
}
