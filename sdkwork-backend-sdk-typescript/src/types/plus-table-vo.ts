import type { PlusColumnVO } from './plus-column-vo';

/** Table view object */
export interface PlusTableVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** Table ID */
  id?: number;
  /** Table name */
  name?: string;
  /** Table description */
  description?: string;
  /** Table type */
  type?: string;
  /** Column count */
  columnCount?: number;
  /** Row count */
  rowCount?: number;
  /** Last sync time */
  lastSyncTime?: string;
  /** Primary keys */
  primaryKeys?: string;
  /** Storage engine */
  engine?: string;
  /** Create SQL */
  createSql?: string;
  /** Comment */
  comment?: string;
  /** Schema ID */
  schemaId?: number;
  /** Schema name */
  schemaName?: string;
  /** Columns */
  columns?: PlusColumnVO[];
}
