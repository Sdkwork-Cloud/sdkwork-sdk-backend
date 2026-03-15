import type { PlusTreeParentMetadata } from './plus-tree-parent-metadata';

/** Partner creation form */
export interface PlusPartnerForm {
  /** Partner name */
  name: string;
  /** Partner level */
  level: 'DEFAULT' | 'NORMAL' | 'SENIOR' | 'STRATEGIC';
  /** Partner status */
  status: 'DEFAULT' | 'ACTIVE' | 'SUSPENDED' | 'FROZEN' | 'CLOSED';
  /** Contact name */
  contactName?: string;
  /** Contact phone */
  contactPhone?: string;
  /** Contact email */
  contactEmail?: string;
  /** Company address */
  companyAddress?: string;
  /** Business license */
  businessLicense?: string;
  /** Settlement account */
  settlementAccount?: string;
  /** Commission rate */
  commissionRate?: number;
  /** Total commission */
  totalCommission?: number;
  /** Withdrawable commission */
  withdrawableCommission?: number;
  /** Withdrawn commission */
  withdrawnCommission?: number;
  /** Promotion code */
  promotionCode?: string;
  /** Parent ID */
  parentId?: number;
  /** Parent metadata */
  parentMetadata?: PlusTreeParentMetadata;
  /** Parent UUID */
  parentUuid?: string;
  /** Cooperation start time */
  cooperationStartTime?: string;
  /** Cooperation end time */
  cooperationEndTime?: string;
  /** Remark */
  remark?: string;
}
