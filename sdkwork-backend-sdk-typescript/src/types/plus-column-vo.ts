/** 数据库列定义VO */
export interface PlusColumnVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** 列名称 */
  name?: string;
  /** 列描述 */
  description?: string;
  /** 数据类型(VARCHAR, INT等) */
  dataType?: string;
  /** 列类型(包含长度等信息) */
  columnType?: string;
  /** 列在表中的位置顺序 */
  ordinalPosition?: number;
  /** 是否允许为空 */
  isNullable?: boolean;
  /** 是否主键 */
  isPrimaryKey?: boolean;
  /** 是否自增 */
  isAutoIncrement?: boolean;
  /** 默认值 */
  defaultValue?: string;
  /** 列注释 */
  comment?: string;
  /** 字符集 */
  characterSet?: string;
  /** 排序规则 */
  collationRule?: string;
  /** 所属表ID */
  tableId?: number;
}
