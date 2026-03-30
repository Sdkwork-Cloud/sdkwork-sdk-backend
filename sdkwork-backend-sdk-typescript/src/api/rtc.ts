import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultPageResultRtcAccessRuleVO, PlusApiResultPageResultRtcCallRecordVO, PlusApiResultPageResultRtcRoomVO, PlusApiResultRtcAccessRuleVO, RtcAccessRuleQuery, RtcAccessRuleRequest, RtcRecordQuery, RtcRoomQuery } from '../types';


export class RtcApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** RTC room page */
  async listRooms(body?: RtcRoomQuery): Promise<PlusApiResultPageResultRtcRoomVO> {
    return this.client.post<PlusApiResultPageResultRtcRoomVO>(backendApiPath(`/rtc/room/list`), body);
  }

/** RTC call record page */
  async listRecords(body?: RtcRecordQuery): Promise<PlusApiResultPageResultRtcCallRecordVO> {
    return this.client.post<PlusApiResultPageResultRtcCallRecordVO>(backendApiPath(`/rtc/record/list`), body);
  }

/** Save RTC access rule */
  async saveAccessRule(body: RtcAccessRuleRequest): Promise<PlusApiResultRtcAccessRuleVO> {
    return this.client.post<PlusApiResultRtcAccessRuleVO>(backendApiPath(`/rtc/access-rule`), body);
  }

/** RTC access rule page */
  async listAccessRules(body?: RtcAccessRuleQuery): Promise<PlusApiResultPageResultRtcAccessRuleVO> {
    return this.client.post<PlusApiResultPageResultRtcAccessRuleVO>(backendApiPath(`/rtc/access-rule/list`), body);
  }

/** Delete RTC access rule */
  async deleteAccessRule(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/rtc/access-rule/${id}`));
  }
}

export function createRtcApi(client: HttpClient): RtcApi {
  return new RtcApi(client);
}
