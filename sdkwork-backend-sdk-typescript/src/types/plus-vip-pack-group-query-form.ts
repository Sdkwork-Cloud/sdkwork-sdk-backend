/** VIP套餐分组查询Form */
export interface PlusVipPackGroupQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 应用ID */
  appId?: number;
  /** 应用ID列表 */
  appIdIn?: number[];
}
