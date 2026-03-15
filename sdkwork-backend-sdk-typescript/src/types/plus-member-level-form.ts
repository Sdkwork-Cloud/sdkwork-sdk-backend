/** Member level creation form */
export interface PlusMemberLevelForm {
  /** Card ID */
  cardId: number;
  /** Level name */
  levelName: string;
  /** Required points */
  requiredPoints?: number;
  /** Description */
  description?: string;
  /** Status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
