/** Project creation form */
export interface PlusProjectForm {
  /** Project name */
  name: string;
  /** Project code */
  code: string;
  /** Project description */
  description?: string;
  /** Project status */
  status: 'PLANNING' | 'IN_PROGRESS' | 'SUSPENDED' | 'COMPLETED' | 'CANCELED';
  /** Leader ID */
  leaderId?: number;
  /** Start time */
  startTime?: string;
  /** End time */
  endTime?: string;
  /** Budget amount */
  budgetAmount?: number;
  /** Whether deleted */
  isDeleted?: boolean;
}
