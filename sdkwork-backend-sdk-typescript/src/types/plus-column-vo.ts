/** Column view object */
export interface PlusColumnVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** Column ID */
  id?: number;
  /** Column name */
  name?: string;
  /** Column description */
  description?: string;
  /** Data type */
  dataType?: string;
  /** Full column type */
  columnType?: string;
  /** Ordinal position */
  ordinalPosition?: number;
  /** Whether nullable */
  isNullable?: boolean;
  /** Whether primary key */
  isPrimaryKey?: boolean;
  /** Whether auto increment */
  isAutoIncrement?: boolean;
  /** Default value */
  defaultValue?: string;
  /** Comment */
  comment?: string;
  /** Character set */
  characterSet?: string;
  /** Collation rule */
  collationRule?: string;
  /** Table ID */
  tableId?: number;
}
