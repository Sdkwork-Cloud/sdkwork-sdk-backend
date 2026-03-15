/** Table creation form */
export interface PlusTableForm {
  /** Table name */
  name: string;
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
  schemaId: number;
}
