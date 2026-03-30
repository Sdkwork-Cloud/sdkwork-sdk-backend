/** Workspace creation form */
export interface PlusWorkspaceForm {
  /** Workspace name */
  name: string;
  /** Workspace code */
  code?: string;
  /** Workspace title */
  title: string;
  /** Workspace description */
  description?: string;
  /** Workspace icon */
  icon?: string;
  /** Workspace color */
  color?: string;
  /** Workspace type */
  type?: 'PERSONAL' | 'TEAM' | 'ORGANIZATION' | 'PROJECT';
  /** Workspace status */
  status: 'ACTIVE' | 'SUSPENDED' | 'ARCHIVED' | 'DELETED';
  /** Owner user ID */
  ownerId: number;
  /** Leader user ID */
  leaderId?: number;
  /** Start time */
  startTime?: string;
  /** End time */
  endTime?: string;
  /** Maximum members */
  maxMembers?: number;
  /** Current members */
  currentMembers?: number;
  /** Maximum storage in bytes */
  maxStorage?: number;
  /** Used storage in bytes */
  usedStorage?: number;
  /** Workspace settings */
  settings?: Record<string, Record<string, unknown>>;
  /** Whether the workspace is deleted */
  isDeleted?: boolean;
  /** Whether the workspace is public */
  isPublic?: boolean;
  /** Whether the workspace is a template */
  isTemplate?: boolean;
}
