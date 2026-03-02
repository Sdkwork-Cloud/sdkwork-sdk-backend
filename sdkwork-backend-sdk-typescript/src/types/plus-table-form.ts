/** Table creation form */
export interface PlusTableForm {
  /** 表名称 */
  name: string;
  /** 表描述 */
  description?: string;
  /** 表类型(TABLE, VIEW等) */
  type?: string;
  /** 列数量 */
  columnCount?: number;
  /** 行数量估计 */
  rowCount?: number;
  /** 最后同步时间 */
  lastSyncTime?: string;
  /** 主键列(逗号分隔) */
  primaryKeys?: string;
  /** 存储引擎(如InnoDB, MyISAM等) */
  engine?: string;
  /** 创建表的SQL语句 */
  createSql?: string;
  /** 表注释 */
  comment?: string;
}
