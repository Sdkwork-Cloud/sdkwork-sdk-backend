/** PPT template slide creation form */
export interface PlusPptTemplateSlideForm {
  /** éå® ä»é¨å±PTå¦¯âæ¾ID */
  templateId: number;
  /** å¦¯âæ¾sectionéå¬î½éå î§'çä¾æ½°æ¤¤?é?é©î¼ç¶æ¤¤?é?éå­îæ¤¤?'ç»å¤ç´ */
  pageNumber: number;
  /** æ¤¤ç¸æ½°ç¯å¨ç¬ç»«è¯²ç·éå ç£æ£°æ©ã/éå­îæ¤¤?éå¬î½+éå­î/éåç®éå­îç»å¤ç´ */
  layoutType: 'DEFAULT' | 'TITLE' | 'CONTENT' | 'TITLE_CONTENT' | 'COLUMN_CONTENT';
  /** S or tO rd er */
  sortOrder: number;
  /** éîææ¶åç¹æ¿ç¸ectionéå±rue-è¹å­ï½éå²æé´æ­PTéæµç¬éîå¹éãç´±false-éîâ¬å¤ç´éîå¹éãç´ */
  isRequired: boolean;
  /** éæ¶ç¼éå æ£¿ */
  createdAt?: string;
  /** U pd at ed At */
  updatedAt?: string;
}
