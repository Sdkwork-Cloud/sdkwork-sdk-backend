import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { AppListRequest, AppSettingsVO, BuildTriggerRequest, ConfigDefinitionVO, CreateJsapiSignatureForm, InstanceActionRequest, InstanceDeployRequest, InstanceUpdateRequest, MenuConfigVO, PlusApiResultAppBuildVO, PlusApiResultAppInfoVO, PlusApiResultAppInstanceVO, PlusApiResultAppSdkConfigVO, PlusApiResultAppSettingsVO, PlusApiResultBoolean, PlusApiResultConfigDefinitionVO, PlusApiResultListAppBuildVO, PlusApiResultListAppInstanceLogVO, PlusApiResultListAppInstanceVO, PlusApiResultListAppVersionVO, PlusApiResultListPlusAppVO, PlusApiResultMenuConfigVO, PlusApiResultPagePlusAppVO, PlusApiResultPageResultAppInstanceVO, PlusApiResultPageResultAuditEntryVO, PlusApiResultPlusAppOAuthBindingVO, PlusApiResultPlusAppOAuthConfigVO, PlusApiResultPlusAppVO, PlusAppForm, PlusAppOAuthBindingSaveForm, QueryListForm } from '../types';


export class AppApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update application */
  async update(body: PlusAppForm): Promise<PlusApiResultPlusAppVO> {
    return this.client.put<PlusApiResultPlusAppVO>(backendApiPath(`/app`), body);
  }

/** Create application */
  async create(body: PlusAppForm): Promise<PlusApiResultPlusAppVO> {
    return this.client.post<PlusApiResultPlusAppVO>(backendApiPath(`/app`), body);
  }

/** Get app settings */
  async getSettings(appId: string | number): Promise<PlusApiResultAppSettingsVO> {
    return this.client.get<PlusApiResultAppSettingsVO>(backendApiPath(`/app/admin/${appId}/settings`));
  }

/** Save app settings */
  async saveSettings(appId: string | number, body: AppSettingsVO): Promise<PlusApiResultAppSettingsVO> {
    return this.client.put<PlusApiResultAppSettingsVO>(backendApiPath(`/app/admin/${appId}/settings`), body);
  }

/** Get app oauth config */
  async getOauthConfig(appId: string | number): Promise<PlusApiResultPlusAppOAuthConfigVO> {
    return this.client.get<PlusApiResultPlusAppOAuthConfigVO>(backendApiPath(`/app/admin/${appId}/oauth`));
  }

/** Save app oauth binding */
  async saveOauthBinding(appId: string | number, body: PlusAppOAuthBindingSaveForm): Promise<PlusApiResultPlusAppOAuthBindingVO> {
    return this.client.put<PlusApiResultPlusAppOAuthBindingVO>(backendApiPath(`/app/admin/${appId}/oauth`), body);
  }

/** Get menu config */
  async getMenu(appId: string | number): Promise<PlusApiResultMenuConfigVO> {
    return this.client.get<PlusApiResultMenuConfigVO>(backendApiPath(`/app/admin/${appId}/menu`));
  }

/** Save menu config */
  async saveMenu(appId: string | number, body: MenuConfigVO): Promise<PlusApiResultMenuConfigVO> {
    return this.client.put<PlusApiResultMenuConfigVO>(backendApiPath(`/app/admin/${appId}/menu`), body);
  }

/** Get config definitions */
  async getConfigDefinitions(appId: string | number): Promise<PlusApiResultConfigDefinitionVO> {
    return this.client.get<PlusApiResultConfigDefinitionVO>(backendApiPath(`/app/admin/${appId}/config`));
  }

/** Save config definitions */
  async saveConfigDefinitions(appId: string | number, body: ConfigDefinitionVO): Promise<PlusApiResultConfigDefinitionVO> {
    return this.client.put<PlusApiResultConfigDefinitionVO>(backendApiPath(`/app/admin/${appId}/config`), body);
  }

/** Update app instance */
  async updateInstance(body: InstanceUpdateRequest): Promise<PlusApiResultAppInstanceVO> {
    return this.client.put<PlusApiResultAppInstanceVO>(backendApiPath(`/app/admin/instance`), body);
  }

/** Get applications by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAppVO> {
    return this.client.post<PlusApiResultPagePlusAppVO>(backendApiPath(`/app/list`), body, params);
  }

/** Get all applications */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAppVO> {
    return this.client.post<PlusApiResultListPlusAppVO>(backendApiPath(`/app/list/all`), body);
  }

/** Get app SDK config */
  async getSdkConfig(body: CreateJsapiSignatureForm): Promise<PlusApiResultAppSdkConfigVO> {
    return this.client.post<PlusApiResultAppSdkConfigVO>(backendApiPath(`/app/get_sdk_config`), body);
  }

/** App versions */
  async listVersions(appId: string | number): Promise<PlusApiResultListAppVersionVO> {
    return this.client.post<PlusApiResultListAppVersionVO>(backendApiPath(`/app/admin/${appId}/version/list`));
  }

/** App instances */
  async listInstances(appId: string | number): Promise<PlusApiResultListAppInstanceVO> {
    return this.client.post<PlusApiResultListAppInstanceVO>(backendApiPath(`/app/admin/${appId}/instance/list`));
  }

/** Deploy app instance */
  async deployInstance(appId: string | number, body?: InstanceDeployRequest): Promise<PlusApiResultAppInstanceVO> {
    return this.client.post<PlusApiResultAppInstanceVO>(backendApiPath(`/app/admin/${appId}/instance/deploy`), body);
  }

/** Trigger build */
  async triggerBuild(appId: string | number, body?: BuildTriggerRequest): Promise<PlusApiResultAppBuildVO> {
    return this.client.post<PlusApiResultAppBuildVO>(backendApiPath(`/app/admin/${appId}/build/trigger`), body);
  }

/** App builds */
  async listBuilds(appId: string | number): Promise<PlusApiResultListAppBuildVO> {
    return this.client.post<PlusApiResultListAppBuildVO>(backendApiPath(`/app/admin/${appId}/build/list`));
  }

/** App audit records */
  async listAudits(appId: string | number, body?: AppListRequest): Promise<PlusApiResultPageResultAuditEntryVO> {
    return this.client.post<PlusApiResultPageResultAuditEntryVO>(backendApiPath(`/app/admin/${appId}/audit/list`), body);
  }

/** Installed instances */
  async listInstalledInstances(body?: AppListRequest): Promise<PlusApiResultPageResultAppInstanceVO> {
    return this.client.post<PlusApiResultPageResultAppInstanceVO>(backendApiPath(`/app/admin/instance/installed/list`), body);
  }

/** Run instance action */
  async runInstanceAction(body: InstanceActionRequest): Promise<PlusApiResultAppInstanceVO> {
    return this.client.post<PlusApiResultAppInstanceVO>(backendApiPath(`/app/admin/instance/action`), body);
  }

/** Get application by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAppVO> {
    return this.client.get<PlusApiResultPlusAppVO>(backendApiPath(`/app/${id}`));
  }

/** Delete application */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/app/${id}`));
  }

/** Get app info */
  async getAppInfo(): Promise<PlusApiResultAppInfoVO> {
    return this.client.get<PlusApiResultAppInfoVO>(backendApiPath(`/app/info`));
  }

/** Get instance logs */
  async getInstanceLogs(instanceId: string | number): Promise<PlusApiResultListAppInstanceLogVO> {
    return this.client.get<PlusApiResultListAppInstanceLogVO>(backendApiPath(`/app/admin/instance/${instanceId}/logs`));
  }
}

export function createAppApi(client: HttpClient): AppApi {
  return new AppApi(client);
}
