/** VIP package group creation form */
export interface PlusVipPackGroupForm {
  /** 应用ID */
  appId: number;
  /** 分组名称 */
  name: string;
  /** 分组描述 */
  description?: string;
  /** 排序权重 */
  sortWeight?: number;
  /** 分组状态 */
  status: 'DEFAULT' | 'ENABLED' | 'DISABLED';
  /** 备注信息 */
  remark?: string;
}
