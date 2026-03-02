class PlusWorkspaceForm {
  final String? name;
  final String? code;
  final String? title;
  final String? description;
  final String? icon;
  final String? color;
  final String? type;
  final String? status;
  final int? ownerId;
  final int? leaderId;
  final String? startTime;
  final String? endTime;
  final int? maxMembers;
  final int? currentMembers;
  final int? maxStorage;
  final int? usedStorage;
  final String? settings;
  final bool? isDeleted;
  final bool? isPublic;
  final bool? isTemplate;

  PlusWorkspaceForm({
    this.name,
    this.code,
    this.title,
    this.description,
    this.icon,
    this.color,
    this.type,
    this.status,
    this.ownerId,
    this.leaderId,
    this.startTime,
    this.endTime,
    this.maxMembers,
    this.currentMembers,
    this.maxStorage,
    this.usedStorage,
    this.settings,
    this.isDeleted,
    this.isPublic,
    this.isTemplate
  });
}

class PlusApiResultPlusWorkspaceVO {
  final PlusWorkspaceVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusWorkspaceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusWorkspaceVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? name;
  final String? code;
  final String? title;
  final String? description;
  final String? icon;
  final String? color;
  final String? type;
  final String? status;
  final int? ownerId;
  final int? leaderId;
  final String? startTime;
  final String? endTime;
  final int? maxMembers;
  final int? currentMembers;
  final int? maxStorage;
  final int? usedStorage;
  final String? settings;
  final bool? isDeleted;
  final bool? isPublic;
  final bool? isTemplate;

  PlusWorkspaceVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.name,
    this.code,
    this.title,
    this.description,
    this.icon,
    this.color,
    this.type,
    this.status,
    this.ownerId,
    this.leaderId,
    this.startTime,
    this.endTime,
    this.maxMembers,
    this.currentMembers,
    this.maxStorage,
    this.usedStorage,
    this.settings,
    this.isDeleted,
    this.isPublic,
    this.isTemplate
  });
}

class ContentVoteForm {
  final String? contentType;
  final String? rating;
  final int? contentId;
  final ContentVoteMetadata? metadata;

  ContentVoteForm({
    this.contentType,
    this.rating,
    this.contentId,
    this.metadata
  });
}

class ContentVoteMetadata {
  final String? rating;

  ContentVoteMetadata({
    this.rating
  });
}

class ContentVoteVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? v;
  final int? userId;
  final String? contentType;
  final String? rating;
  final int? contentId;
  final ContentVoteMetadata? metadata;

  ContentVoteVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.v,
    this.userId,
    this.contentType,
    this.rating,
    this.contentId,
    this.metadata
  });
}

class PlusApiResultContentVoteVO {
  final ContentVoteVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultContentVoteVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVoiceSpeakerForm {
  final String? name;
  final String? channelSpeakerId;
  final String? code;
  final String? channel;
  final String? gender;
  final String? ageType;
  final String? type;
  final List<String>? models;
  final TagsContent? tags;
  final String? status;
  final String? description;

  PlusVoiceSpeakerForm({
    this.name,
    this.channelSpeakerId,
    this.code,
    this.channel,
    this.gender,
    this.ageType,
    this.type,
    this.models,
    this.tags,
    this.status,
    this.description
  });
}

class TagsContent {
  final List<String>? tags;
  final List<TagsContent>? children;

  TagsContent({
    this.tags,
    this.children
  });
}

class PlusApiResultPlusVoiceSpeakerVO {
  final PlusVoiceSpeakerVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVoiceSpeakerVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVoiceSpeakerVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? voice;
  final String? channelSpeakerId;
  final String? code;
  final String? channel;
  final String? gender;
  final String? ageType;
  final String? type;
  final List<String>? models;
  final TagsContent? tags;
  final String? status;
  final String? description;

  PlusVoiceSpeakerVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.voice,
    this.channelSpeakerId,
    this.code,
    this.channel,
    this.gender,
    this.ageType,
    this.type,
    this.models,
    this.tags,
    this.status,
    this.description
  });
}

class PlusVisitHistoryForm {
  final String? contentType;
  final int? contentId;
  final int? visitCount;
  final String? lastVisitedAt;
  final int? duration;
  final String? source;

  PlusVisitHistoryForm({
    this.contentType,
    this.contentId,
    this.visitCount,
    this.lastVisitedAt,
    this.duration,
    this.source
  });
}

class PlusApiResultPlusVisitHistoryVO {
  final PlusVisitHistoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVisitHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVisitHistoryVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? userId;
  final String? contentType;
  final int? contentId;
  final int? visitCount;
  final String? lastVisitedAt;
  final int? duration;
  final String? source;

  PlusVisitHistoryVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.userId,
    this.contentType,
    this.contentId,
    this.visitCount,
    this.lastVisitedAt,
    this.duration,
    this.source
  });
}

class PlusVipUserForm {
  final int? userId;
  final int? vipLevelId;
  final String? status;
  final int? pointBalance;
  final int? totalRechargedPoints;
  final String? validFrom;
  final String? validTo;
  final String? lastActiveTime;
  final String? remark;

  PlusVipUserForm({
    this.userId,
    this.vipLevelId,
    this.status,
    this.pointBalance,
    this.totalRechargedPoints,
    this.validFrom,
    this.validTo,
    this.lastActiveTime,
    this.remark
  });
}

class PlusApiResultPlusVipUserVO {
  final PlusVipUserVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVipUserVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVipBenefitVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;
  final String? benefitKey;
  final String? type;

  PlusVipBenefitVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.benefitKey,
    this.type
  });
}

class PlusVipLevelVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final int? levelValue;
  final int? requiredPoints;
  final String? description;
  final List<int>? benefitIds;
  final List<PlusVipBenefitVO>? benefits;

  PlusVipLevelVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.levelValue,
    this.requiredPoints,
    this.description,
    this.benefitIds,
    this.benefits
  });
}

class PlusVipUserVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? userId;
  final int? vipLevelId;
  final String? status;
  final int? pointBalance;
  final int? totalRechargedPoints;
  final String? validFrom;
  final String? validTo;
  final String? lastActiveTime;
  final String? remark;
  final PlusVipLevelVO? vipLevel;

  PlusVipUserVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.userId,
    this.vipLevelId,
    this.status,
    this.pointBalance,
    this.totalRechargedPoints,
    this.validFrom,
    this.validTo,
    this.lastActiveTime,
    this.remark,
    this.vipLevel
  });
}

class PlusVipRechargeForm {
  final int? userId;
  final int? vipLevelId;
  final double? amount;
  final int? pointAmount;
  final String? rechargeType;
  final String? rechargeTime;
  final String? transactionNo;
  final int? status;
  final String? remark;

  PlusVipRechargeForm({
    this.userId,
    this.vipLevelId,
    this.amount,
    this.pointAmount,
    this.rechargeType,
    this.rechargeTime,
    this.transactionNo,
    this.status,
    this.remark
  });
}

class PlusApiResultPlusVipRechargeVO {
  final PlusVipRechargeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVipRechargeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVipRechargeVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? userId;
  final int? vipLevelId;
  final double? amount;
  final int? pointAmount;
  final String? rechargeType;
  final String? rechargeTime;
  final String? transactionNo;
  final int? status;
  final String? remark;

  PlusVipRechargeVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.userId,
    this.vipLevelId,
    this.amount,
    this.pointAmount,
    this.rechargeType,
    this.rechargeTime,
    this.transactionNo,
    this.status,
    this.remark
  });
}

class PlusVipRechargePackForm {
  final String? name;
  final String? description;
  final double? price;
  final int? pointAmount;
  final int? vipDurationDays;
  final int? status;
  final int? sortWeight;
  final String? validFrom;
  final String? validTo;
  final String? remark;

  PlusVipRechargePackForm({
    this.name,
    this.description,
    this.price,
    this.pointAmount,
    this.vipDurationDays,
    this.status,
    this.sortWeight,
    this.validFrom,
    this.validTo,
    this.remark
  });
}

class PlusApiResultPlusVipRechargePackVO {
  final PlusVipRechargePackVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVipRechargePackVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVipRechargePackVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;
  final double? price;
  final int? pointAmount;
  final int? vipDurationDays;
  final int? status;
  final int? sortWeight;
  final String? validFrom;
  final String? validTo;
  final String? remark;

  PlusVipRechargePackVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.price,
    this.pointAmount,
    this.vipDurationDays,
    this.status,
    this.sortWeight,
    this.validFrom,
    this.validTo,
    this.remark
  });
}

class PlusVipPointChangeForm {
  final int? userId;
  final String? changeType;
  final int? changeAmount;
  final int? beforeBalance;
  final int? afterBalance;
  final int? sourceId;
  final String? sourceType;
  final String? remark;

  PlusVipPointChangeForm({
    this.userId,
    this.changeType,
    this.changeAmount,
    this.beforeBalance,
    this.afterBalance,
    this.sourceId,
    this.sourceType,
    this.remark
  });
}

class PlusApiResultPlusVipPointChangeVO {
  final PlusVipPointChangeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVipPointChangeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVipPointChangeVO {
  final String? createdAt;
  final String? updatedAt;
  final int? userId;
  final String? changeType;
  final int? changeAmount;
  final int? beforeBalance;
  final int? afterBalance;
  final int? sourceId;
  final String? sourceType;
  final String? remark;

  PlusVipPointChangeVO({
    this.createdAt,
    this.updatedAt,
    this.userId,
    this.changeType,
    this.changeAmount,
    this.beforeBalance,
    this.afterBalance,
    this.sourceId,
    this.sourceType,
    this.remark
  });
}

class PlusVipPackGroupForm {
  final int? appId;
  final String? name;
  final String? description;
  final int? sortWeight;
  final String? status;
  final String? remark;

  PlusVipPackGroupForm({
    this.appId,
    this.name,
    this.description,
    this.sortWeight,
    this.status,
    this.remark
  });
}

class PlusApiResultPlusVipPackGroupVO {
  final PlusVipPackGroupVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVipPackGroupVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVipPackGroupVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? appId;
  final String? name;
  final String? description;
  final int? sortWeight;
  final String? status;
  final String? remark;
  final List<PlusVipPackVO>? packs;

  PlusVipPackGroupVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.appId,
    this.name,
    this.description,
    this.sortWeight,
    this.status,
    this.remark,
    this.packs
  });
}

class PlusVipPackVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? name;
  final String? description;
  final int? groupId;
  final int? vipLevelId;
  final double? price;
  final int? pointAmount;
  final int? vipDurationDays;
  final String? status;
  final int? sortWeight;
  final String? validFrom;
  final String? validTo;
  final String? remark;
  final PlusVipLevelVO? vipLevel;

  PlusVipPackVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.name,
    this.description,
    this.groupId,
    this.vipLevelId,
    this.price,
    this.pointAmount,
    this.vipDurationDays,
    this.status,
    this.sortWeight,
    this.validFrom,
    this.validTo,
    this.remark,
    this.vipLevel
  });
}

class PlusVipPackForm {
  final String? name;
  final String? description;
  final int? groupId;
  final int? vipLevelId;
  final double? price;
  final int? pointAmount;
  final int? vipDurationDays;
  final String? status;
  final int? sortWeight;
  final String? validFrom;
  final String? validTo;
  final String? remark;

  PlusVipPackForm({
    this.name,
    this.description,
    this.groupId,
    this.vipLevelId,
    this.price,
    this.pointAmount,
    this.vipDurationDays,
    this.status,
    this.sortWeight,
    this.validFrom,
    this.validTo,
    this.remark
  });
}

class PlusApiResultPlusVipPackVO {
  final PlusVipPackVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVipPackVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVipLevelForm {
  final String? name;
  final int? levelValue;
  final int? requiredPoints;
  final String? description;

  PlusVipLevelForm({
    this.name,
    this.levelValue,
    this.requiredPoints,
    this.description
  });
}

class PlusApiResultPlusVipLevelVO {
  final PlusVipLevelVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVipLevelVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVipLevelBenefitForm {
  final int? vipLevelId;
  final int? benefitId;
  final int? dailyLimit;
  final int? monthlyLimit;
  final int? totalLimit;
  final String? status;
  final VipLevelBenefitMetadata? metadata;
  final String? remark;

  PlusVipLevelBenefitForm({
    this.vipLevelId,
    this.benefitId,
    this.dailyLimit,
    this.monthlyLimit,
    this.totalLimit,
    this.status,
    this.metadata,
    this.remark
  });
}

class VipLevelBenefitMetadata {
  final int? maxUsageCount;
  final int? maxDailyUsage;
  final int? maxMonthlyUsage;
  final bool? isUnlimited;
  final String? validPeriod;
  final String? extendInfo;

  VipLevelBenefitMetadata({
    this.maxUsageCount,
    this.maxDailyUsage,
    this.maxMonthlyUsage,
    this.isUnlimited,
    this.validPeriod,
    this.extendInfo
  });
}

class PlusApiResultPlusVipLevelBenefitVO {
  final PlusVipLevelBenefitVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVipLevelBenefitVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVipLevelBenefitVO {
  final String? createdAt;
  final String? updatedAt;
  final int? vipLevelId;
  final int? benefitId;
  final int? dailyLimit;
  final int? monthlyLimit;
  final int? totalLimit;
  final String? status;
  final VipLevelBenefitMetadata? metadata;
  final String? remark;

  PlusVipLevelBenefitVO({
    this.createdAt,
    this.updatedAt,
    this.vipLevelId,
    this.benefitId,
    this.dailyLimit,
    this.monthlyLimit,
    this.totalLimit,
    this.status,
    this.metadata,
    this.remark
  });
}

class PlusVipBenefitForm {
  final String? name;
  final String? description;
  final String? benefitKey;
  final String? type;

  PlusVipBenefitForm({
    this.name,
    this.description,
    this.benefitKey,
    this.type
  });
}

class PlusApiResultPlusVipBenefitVO {
  final PlusVipBenefitVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVipBenefitVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVipBenefitUsageForm {
  final int? userId;
  final String? benefitType;
  final String? usageTime;
  final int? usageCount;
  final int? status;
  final int? sourceId;
  final String? sourceType;
  final String? remark;

  PlusVipBenefitUsageForm({
    this.userId,
    this.benefitType,
    this.usageTime,
    this.usageCount,
    this.status,
    this.sourceId,
    this.sourceType,
    this.remark
  });
}

class PlusApiResultPlusVipBenefitUsageVO {
  final PlusVipBenefitUsageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVipBenefitUsageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVipBenefitUsageVO {
  final String? createdAt;
  final String? updatedAt;
  final int? userId;
  final String? benefitType;
  final String? usageTime;
  final int? usageCount;
  final int? status;
  final int? sourceId;
  final String? sourceType;
  final String? remark;

  PlusVipBenefitUsageVO({
    this.createdAt,
    this.updatedAt,
    this.userId,
    this.benefitType,
    this.usageTime,
    this.usageCount,
    this.status,
    this.sourceId,
    this.sourceType,
    this.remark
  });
}

class PlusVideoForm {
  final int? id;
  final String? title;
  final String? description;
  final String? contentUrl;
  final String? aspectRatio;
  final int? duration;
  final String? resolution;
  final int? width;
  final int? height;
  final int? fileSize;
  final String? format;
  final String? thumbnailUrl;
  final String? status;
  final String? uuid;
  final String? createdAt;
  final String? updatedAt;

  PlusVideoForm({
    this.id,
    this.title,
    this.description,
    this.contentUrl,
    this.aspectRatio,
    this.duration,
    this.resolution,
    this.width,
    this.height,
    this.fileSize,
    this.format,
    this.thumbnailUrl,
    this.status,
    this.uuid,
    this.createdAt,
    this.updatedAt
  });
}

class AuthorInfo {
  final int? id;
  final ImageMediaResource? faceImage;
  final String? name;
  final String? email;
  final String? bio;
  final String? website;

  AuthorInfo({
    this.id,
    this.faceImage,
    this.name,
    this.email,
    this.bio,
    this.website
  });
}

class ImageMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final String? mimeType;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final int? width;
  final int? height;
  final ImageMediaResource? splitImages;
  final String? aspectRatio;

  ImageMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.mimeType,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.width,
    this.height,
    this.splitImages,
    this.aspectRatio
  });
}

class PlusApiResultPlusVideoVO {
  final PlusVideoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusVideoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVideoVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? version;
  final String? title;
  final String? description;
  final VideoMediaResource? resource;
  final AuthorInfo? author;
  final String? contentUrl;
  final String? aspectRatio;
  final int? duration;
  final String? resolution;
  final int? width;
  final int? height;
  final int? fileSize;
  final String? format;
  final String? thumbnailUrl;
  final String? status;

  PlusVideoVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.version,
    this.title,
    this.description,
    this.resource,
    this.author,
    this.contentUrl,
    this.aspectRatio,
    this.duration,
    this.resolution,
    this.width,
    this.height,
    this.fileSize,
    this.format,
    this.thumbnailUrl,
    this.status
  });
}

class VideoMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final String? mimeType;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final int? duration;
  final int? width;
  final int? height;

  VideoMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.mimeType,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.duration,
    this.width,
    this.height
  });
}

class PlusUserForm {
  final String? username;
  final String? password;
  final String? salt;
  final String? email;
  final String? phone;
  final String? status;
  final List<int>? roleIds;

  PlusUserForm({
    this.username,
    this.password,
    this.salt,
    this.email,
    this.phone,
    this.status,
    this.roleIds
  });
}

class FacebookInfo {
  final String? userId;
  final String? username;
  final String? name;
  final String? avatarUrl;
  final String? email;
  final String? gender;
  final String? country;
  final String? city;

  FacebookInfo({
    this.userId,
    this.username,
    this.name,
    this.avatarUrl,
    this.email,
    this.gender,
    this.country,
    this.city
  });
}

class InstagramInfo {
  final String? userId;
  final String? username;
  final String? fullName;
  final String? profilePictureUrl;
  final String? bio;
  final String? website;
  final bool? isBusinessAccount;

  InstagramInfo({
    this.userId,
    this.username,
    this.fullName,
    this.profilePictureUrl,
    this.bio,
    this.website,
    this.isBusinessAccount
  });
}

class LinkedInInfo {
  final String? userId;
  final String? username;
  final String? fullName;
  final String? profilePictureUrl;
  final String? headline;
  final String? position;
  final String? company;
  final String? industry;
  final String? education;
  final String? location;

  LinkedInInfo({
    this.userId,
    this.username,
    this.fullName,
    this.profilePictureUrl,
    this.headline,
    this.position,
    this.company,
    this.industry,
    this.education,
    this.location
  });
}

class PlusApiResultPlusUserVO {
  final PlusUserVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusUserVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusUserVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final ImageMediaResource? faceImage;
  final ImageMediaResource? faceVideo;
  final String? username;
  final String? nickname;
  final String? email;
  final String? phone;
  final String? gender;
  final String? status;
  final List<int>? roleIds;
  final List<String>? roleNames;
  final SocialInfoList? socialInfoList;

  PlusUserVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.faceImage,
    this.faceVideo,
    this.username,
    this.nickname,
    this.email,
    this.phone,
    this.gender,
    this.status,
    this.roleIds,
    this.roleNames,
    this.socialInfoList
  });
}

class SocialInfoList {
  final WechatInfo? wechat;
  final FacebookInfo? facebook;
  final TwitterInfo? twitter;
  final InstagramInfo? instagram;
  final LinkedInInfo? linkedin;
  final TelegramInfo? telegram;
  final WhatsAppInfo? whatsapp;
  final TikTokInfo? tiktok;

  SocialInfoList({
    this.wechat,
    this.facebook,
    this.twitter,
    this.instagram,
    this.linkedin,
    this.telegram,
    this.whatsapp,
    this.tiktok
  });
}

class TelegramInfo {
  final int? userId;
  final String? username;
  final String? fullName;
  final String? phoneNumber;
  final String? languageCode;

  TelegramInfo({
    this.userId,
    this.username,
    this.fullName,
    this.phoneNumber,
    this.languageCode
  });
}

class TikTokInfo {
  final String? userId;
  final String? username;
  final String? displayName;
  final String? avatarUrl;
  final String? bio;
  final bool? isVerified;
  final int? followerCount;
  final int? followingCount;
  final int? likeCount;

  TikTokInfo({
    this.userId,
    this.username,
    this.displayName,
    this.avatarUrl,
    this.bio,
    this.isVerified,
    this.followerCount,
    this.followingCount,
    this.likeCount
  });
}

class TwitterInfo {
  final String? userId;
  final String? username;
  final String? displayName;
  final String? avatarUrl;
  final String? bio;
  final String? location;
  final String? website;

  TwitterInfo({
    this.userId,
    this.username,
    this.displayName,
    this.avatarUrl,
    this.bio,
    this.location,
    this.website
  });
}

class WechatInfo {
  final String? openId;
  final String? unionId;
  final String? nickname;
  final String? avatarUrl;
  final int? gender;
  final String? country;
  final String? province;
  final String? city;

  WechatInfo({
    this.openId,
    this.unionId,
    this.nickname,
    this.avatarUrl,
    this.gender,
    this.country,
    this.province,
    this.city
  });
}

class WhatsAppInfo {
  final String? userId;
  final String? phoneNumber;
  final String? displayName;
  final String? profilePictureUrl;

  WhatsAppInfo({
    this.userId,
    this.phoneNumber,
    this.displayName,
    this.profilePictureUrl
  });
}

class PlusUserOAuthAccountForm {
  final int? userId;
  final String? oauthProvider;
  final String? openId;
  final String? unionId;
  final String? appId;
  final int? channelAccountId;
  final String? accessTokenExpiresAt;

  PlusUserOAuthAccountForm({
    this.userId,
    this.oauthProvider,
    this.openId,
    this.unionId,
    this.appId,
    this.channelAccountId,
    this.accessTokenExpiresAt
  });
}

class PlusApiResultPlusUserOAuthAccountVO {
  final PlusUserOAuthAccountVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusUserOAuthAccountVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusUserOAuthAccountVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? userId;
  final String? oauthProvider;
  final String? openId;
  final String? unionId;
  final String? appId;
  final int? channelAccountId;
  final String? accessTokenExpiresAt;

  PlusUserOAuthAccountVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.userId,
    this.oauthProvider,
    this.openId,
    this.unionId,
    this.appId,
    this.channelAccountId,
    this.accessTokenExpiresAt
  });
}

class PlusUserCouponForm {
  final int? userId;
  final int? couponId;
  final String? couponCode;
  final String? acquireAt;
  final String? useAt;
  final String? status;

  PlusUserCouponForm({
    this.userId,
    this.couponId,
    this.couponCode,
    this.acquireAt,
    this.useAt,
    this.status
  });
}

class PlusApiResultPlusUserCouponVO {
  final PlusUserCouponVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusUserCouponVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusUserCouponVO {
  final String? createdAt;
  final String? updatedAt;
  final int? userId;
  final int? couponId;
  final String? couponCode;
  final String? acquireTime;
  final String? useTime;
  final String? status;

  PlusUserCouponVO({
    this.createdAt,
    this.updatedAt,
    this.userId,
    this.couponId,
    this.couponCode,
    this.acquireTime,
    this.useTime,
    this.status
  });
}

class PlusUserCardForm {
  final int? userId;
  final int? cardId;
  final String? cardCode;
  final String? acquireTime;
  final String? activateTime;
  final String? cancelTime;
  final int? points;
  final int? balance;

  PlusUserCardForm({
    this.userId,
    this.cardId,
    this.cardCode,
    this.acquireTime,
    this.activateTime,
    this.cancelTime,
    this.points,
    this.balance
  });
}

class PlusApiResultPlusUserCardVO {
  final PlusUserCardVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusUserCardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusUserCardVO {
  final String? createdAt;
  final String? updatedAt;
  final int? userId;
  final int? cardId;
  final String? cardCode;
  final String? acquireTime;
  final String? activateTime;
  final String? cancelTime;
  final int? points;
  final int? balance;

  PlusUserCardVO({
    this.createdAt,
    this.updatedAt,
    this.userId,
    this.cardId,
    this.cardCode,
    this.acquireTime,
    this.activateTime,
    this.cancelTime,
    this.points,
    this.balance
  });
}

class PlusUserAddressForm {
  final String? name;
  final String? phone;
  final String? countryCode;
  final String? provinceCode;
  final String? cityCode;
  final String? districtCode;
  final String? addressDetail;
  final String? postalCode;
  final bool? isDefault;
  final TagsContent? tags;

  PlusUserAddressForm({
    this.name,
    this.phone,
    this.countryCode,
    this.provinceCode,
    this.cityCode,
    this.districtCode,
    this.addressDetail,
    this.postalCode,
    this.isDefault,
    this.tags
  });
}

class PlusApiResultPlusUserAddressVO {
  final PlusUserAddressVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusUserAddressVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusUserAddressVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? name;
  final String? phone;
  final String? countryCode;
  final String? provinceCode;
  final String? cityCode;
  final String? districtCode;
  final String? addressDetail;
  final String? postalCode;
  final bool? isDefault;
  final TagsContent? tags;

  PlusUserAddressVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.name,
    this.phone,
    this.countryCode,
    this.provinceCode,
    this.cityCode,
    this.districtCode,
    this.addressDetail,
    this.postalCode,
    this.isDefault,
    this.tags
  });
}

class UsageRecordForm {
  final int? userId;
  final String? requestId;
  final String? modelName;
  final String? channel;
  final String? usageType;
  final String? billingType;
  final int? promptTokens;
  final int? completionTokens;
  final int? cachedTokens;
  final int? totalTokens;
  final int? callCount;
  final int? processingTime;
  final int? imageCount;
  final String? imageSize;
  final int? videoDuration;
  final int? audioDuration;
  final double? cost;
  final String? currencyCode;
  final String? status;
  final String? requestTime;
  final String? responseTime;
  final int? promptId;
  final int? toolId;

  UsageRecordForm({
    this.userId,
    this.requestId,
    this.modelName,
    this.channel,
    this.usageType,
    this.billingType,
    this.promptTokens,
    this.completionTokens,
    this.cachedTokens,
    this.totalTokens,
    this.callCount,
    this.processingTime,
    this.imageCount,
    this.imageSize,
    this.videoDuration,
    this.audioDuration,
    this.cost,
    this.currencyCode,
    this.status,
    this.requestTime,
    this.responseTime,
    this.promptId,
    this.toolId
  });
}

class PlusApiResultUsageRecordVO {
  final UsageRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUsageRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UsageRecordVO {
  final String? createdAt;
  final String? updatedAt;
  final int? userId;
  final String? requestId;
  final String? modelName;
  final String? channel;
  final String? usageType;
  final String? billingType;
  final int? promptTokens;
  final int? completionTokens;
  final int? cachedTokens;
  final int? totalTokens;
  final int? callCount;
  final int? processingTime;
  final int? imageCount;
  final String? imageSize;
  final int? videoDuration;
  final int? audioDuration;
  final double? cost;
  final String? currencyCode;
  final String? status;
  final String? requestTime;
  final String? responseTime;
  final int? promptId;
  final int? toolId;

  UsageRecordVO({
    this.createdAt,
    this.updatedAt,
    this.userId,
    this.requestId,
    this.modelName,
    this.channel,
    this.usageType,
    this.billingType,
    this.promptTokens,
    this.completionTokens,
    this.cachedTokens,
    this.totalTokens,
    this.callCount,
    this.processingTime,
    this.imageCount,
    this.imageSize,
    this.videoDuration,
    this.audioDuration,
    this.cost,
    this.currencyCode,
    this.status,
    this.requestTime,
    this.responseTime,
    this.promptId,
    this.toolId
  });
}

class CartGroup {
  final String? uuid;
  final String? name;
  final List<CartItem>? items;
  final int? totalQuantity;
  final double? totalPrice;

  CartGroup({
    this.uuid,
    this.name,
    this.items,
    this.totalQuantity,
    this.totalPrice
  });
}

class CartGroupList {
  final List<CartGroup>? groups;
  final int? totalQuantity;
  final double? totalPrice;
  final int? selectedQuantity;
  final double? selectedPrice;
  final List<CartItem>? allItems;

  CartGroupList({
    this.groups,
    this.totalQuantity,
    this.totalPrice,
    this.selectedQuantity,
    this.selectedPrice,
    this.allItems
  });
}

class CartItem {
  final int? id;
  final PlusSku? sku;
  final int? quantity;
  final double? unitPrice;
  final double? totalPrice;
  final bool? selected;

  CartItem({
    this.id,
    this.sku,
    this.quantity,
    this.unitPrice,
    this.totalPrice,
    this.selected
  });
}

class PlusShoppingCartForm {
  final String? owner;
  final int? ownerId;
  final String? name;
  final String? description;
  final CartGroupList? groupList;
  final String? status;

  PlusShoppingCartForm({
    this.owner,
    this.ownerId,
    this.name,
    this.description,
    this.groupList,
    this.status
  });
}

class PlusSku {
  final int? tenantId;
  final int? organizationId;
  final String? dataScope;
  final int? id;
  final String? uuid;
  final String? createdAt;
  final String? updatedAt;
  final int? v;
  final int? productId;
  final String? skuCode;
  final String? name;
  final String? title;
  final double? price;
  final double? originalPrice;
  final int? stock;
  final int? sales;
  final int? status;
  final String? image;
  final String? specs;

  PlusSku({
    this.tenantId,
    this.organizationId,
    this.dataScope,
    this.id,
    this.uuid,
    this.createdAt,
    this.updatedAt,
    this.v,
    this.productId,
    this.skuCode,
    this.name,
    this.title,
    this.price,
    this.originalPrice,
    this.stock,
    this.sales,
    this.status,
    this.image,
    this.specs
  });
}

class PlusApiResultPlusShoppingCartVO {
  final PlusShoppingCartVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusShoppingCartVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusShoppingCartVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? owner;
  final int? ownerId;
  final String? name;
  final String? description;
  final CartGroupList? groupList;
  final String? status;

  PlusShoppingCartVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.owner,
    this.ownerId,
    this.name,
    this.description,
    this.groupList,
    this.status
  });
}

class PlusShoppingCartItemForm {
  final int? cartId;
  final String? cartGroupUuid;
  final int? productId;
  final int? skuId;
  final int? quantity;
  final double? price;
  final bool? selected;

  PlusShoppingCartItemForm({
    this.cartId,
    this.cartGroupUuid,
    this.productId,
    this.skuId,
    this.quantity,
    this.price,
    this.selected
  });
}

class PlusApiResultPlusShoppingCartItemVO {
  final PlusShoppingCartItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusShoppingCartItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusShoppingCartItemVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? cartId;
  final String? cartGroupUuid;
  final int? productId;
  final int? skuId;
  final int? quantity;
  final double? price;
  final bool? selected;

  PlusShoppingCartItemVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.cartId,
    this.cartGroupUuid,
    this.productId,
    this.skuId,
    this.quantity,
    this.price,
    this.selected
  });
}

class PlusRefundForm {
  final int? orderId;
  final int? paymentId;
  final String? outRefundNo;
  final String? outTradeNo;
  final String? refundId;
  final double? amount;
  final String? type;
  final String? status;
  final String? applyTime;
  final String? completeTime;
  final String? remark;
  final String? contentType;
  final int? contentId;

  PlusRefundForm({
    this.orderId,
    this.paymentId,
    this.outRefundNo,
    this.outTradeNo,
    this.refundId,
    this.amount,
    this.type,
    this.status,
    this.applyTime,
    this.completeTime,
    this.remark,
    this.contentType,
    this.contentId
  });
}

class PlusApiResultPlusRefundVO {
  final PlusRefundVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusRefundVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusRefundVO {
  final String? createdAt;
  final String? updatedAt;
  final int? orderId;
  final int? paymentId;
  final String? outRefundNo;
  final String? outTradeNo;
  final String? refundId;
  final double? amount;
  final String? type;
  final String? status;
  final String? applyTime;
  final String? completeTime;
  final String? remark;
  final String? contentType;
  final int? contentId;

  PlusRefundVO({
    this.createdAt,
    this.updatedAt,
    this.orderId,
    this.paymentId,
    this.outRefundNo,
    this.outTradeNo,
    this.refundId,
    this.amount,
    this.type,
    this.status,
    this.applyTime,
    this.completeTime,
    this.remark,
    this.contentType,
    this.contentId
  });
}

class PlusPaymentForm {
  final String? purpose;
  final int? orderId;
  final String? transactionId;
  final String? outTradeNo;
  final String? channel;
  final String? status;
  final double? amount;
  final String? successTime;
  final String? remark;
  final String? contentType;
  final int? contentId;
  final String? productType;
  final String? provider;

  PlusPaymentForm({
    this.purpose,
    this.orderId,
    this.transactionId,
    this.outTradeNo,
    this.channel,
    this.status,
    this.amount,
    this.successTime,
    this.remark,
    this.contentType,
    this.contentId,
    this.productType,
    this.provider
  });
}

class PlusApiResultPlusPaymentVO {
  final PlusPaymentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusPaymentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusPaymentVO {
  final String? createdAt;
  final String? updatedAt;
  final String? purpose;
  final int? orderId;
  final String? transactionId;
  final String? outTradeNo;
  final String? channel;
  final String? status;
  final double? amount;
  final String? successTime;
  final String? remark;
  final String? contentType;
  final int? contentId;
  final String? productType;
  final String? provider;

  PlusPaymentVO({
    this.createdAt,
    this.updatedAt,
    this.purpose,
    this.orderId,
    this.transactionId,
    this.outTradeNo,
    this.channel,
    this.status,
    this.amount,
    this.successTime,
    this.remark,
    this.contentType,
    this.contentId,
    this.productType,
    this.provider
  });
}

class PlusOrderForm {
  final String? orderType;
  final int? userId;
  final String? orderSn;
  final String? transactionId;
  final String? outTradeNo;
  final double? totalAmount;
  final double? paidAmount;
  final int? paidPointsAmount;
  final String? status;
  final String? payTime;
  final String? expireTime;
  final String? contentType;
  final int? contentId;

  PlusOrderForm({
    this.orderType,
    this.userId,
    this.orderSn,
    this.transactionId,
    this.outTradeNo,
    this.totalAmount,
    this.paidAmount,
    this.paidPointsAmount,
    this.status,
    this.payTime,
    this.expireTime,
    this.contentType,
    this.contentId
  });
}

class AlipayObject {
  final String? payUrl;
  final String? sign;
  final String? outTradeNo;
  final String? tradeNo;
  final String? appId;
  final String? method;
  final String? qrCode;

  AlipayObject({
    this.payUrl,
    this.sign,
    this.outTradeNo,
    this.tradeNo,
    this.appId,
    this.method,
    this.qrCode
  });
}

class ApplePayObject {
  final String? paymentData;
  final String? merchantId;
  final String? transactionId;
  final String? displayName;
  final String? network;
  final String? type;
  final String? amount;
  final String? currencyCode;

  ApplePayObject({
    this.paymentData,
    this.merchantId,
    this.transactionId,
    this.displayName,
    this.network,
    this.type,
    this.amount,
    this.currencyCode
  });
}

class ClientPayObjects {
  final WechatPayObject? wechat;
  final AlipayObject? alipay;
  final ApplePayObject? applePay;
  final PaypalObject? paypal;
  final StripeObject? stripe;
  final UnionPayObject? unionPay;

  ClientPayObjects({
    this.wechat,
    this.alipay,
    this.applePay,
    this.paypal,
    this.stripe,
    this.unionPay
  });
}

class PaypalObject {
  final String? token;
  final String? payerId;
  final String? paymentUrl;
  final String? invoice;
  final String? amount;
  final String? currency;
  final String? paymentStatus;
  final String? transactionId;
  final String? returnUrl;
  final String? cancelUrl;

  PaypalObject({
    this.token,
    this.payerId,
    this.paymentUrl,
    this.invoice,
    this.amount,
    this.currency,
    this.paymentStatus,
    this.transactionId,
    this.returnUrl,
    this.cancelUrl
  });
}

class PlusApiResultPlusOrderVO {
  final PlusOrderVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusOrderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusOrderVO {
  final String? createdAt;
  final String? updatedAt;
  final String? orderType;
  final int? userId;
  final String? orderSn;
  final String? transactionId;
  final String? outTradeNo;
  final double? totalAmount;
  final double? paidAmount;
  final int? paidPointsAmount;
  final String? status;
  final String? payTime;
  final String? expireTime;
  final String? contentType;
  final int? contentId;
  final ClientPayObjects? payObjects;

  PlusOrderVO({
    this.createdAt,
    this.updatedAt,
    this.orderType,
    this.userId,
    this.orderSn,
    this.transactionId,
    this.outTradeNo,
    this.totalAmount,
    this.paidAmount,
    this.paidPointsAmount,
    this.status,
    this.payTime,
    this.expireTime,
    this.contentType,
    this.contentId,
    this.payObjects
  });
}

class StripeObject {
  final String? sessionId;
  final String? paymentUrl;
  final String? clientSecret;
  final String? paymentIntentId;
  final String? publishableKey;
  final String? returnUrl;
  final String? amount;
  final String? currency;

  StripeObject({
    this.sessionId,
    this.paymentUrl,
    this.clientSecret,
    this.paymentIntentId,
    this.publishableKey,
    this.returnUrl,
    this.amount,
    this.currency
  });
}

class UnionPayObject {
  final String? payUrl;
  final String? tn;
  final String? merOrderId;
  final String? merId;
  final String? mode;
  final String? schemeStr;
  final String? signature;

  UnionPayObject({
    this.payUrl,
    this.tn,
    this.merOrderId,
    this.merId,
    this.mode,
    this.schemeStr,
    this.signature
  });
}

class WechatPayObject {
  final String? prepayId;
  final String? mwebUrl;
  final String? codeUrl;
  final String? timeStamp;
  final String? nonceStr;
  final String? signType;
  final String? paySign;
  final String? outTradeNo;
  final String? tradeType;

  WechatPayObject({
    this.prepayId,
    this.mwebUrl,
    this.codeUrl,
    this.timeStamp,
    this.nonceStr,
    this.signType,
    this.paySign,
    this.outTradeNo,
    this.tradeType
  });
}

class PlusOrderItemForm {
  final int? orderId;
  final String? productType;
  final int? productId;
  final int? skuId;
  final int? quantity;
  final double? unitPrice;
  final double? totalAmount;
  final String? expireTime;
  final String? contentType;
  final int? contentId;

  PlusOrderItemForm({
    this.orderId,
    this.productType,
    this.productId,
    this.skuId,
    this.quantity,
    this.unitPrice,
    this.totalAmount,
    this.expireTime,
    this.contentType,
    this.contentId
  });
}

class PlusApiResultPlusOrderItemVO {
  final PlusOrderItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusOrderItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusOrderItemVO {
  final String? createdAt;
  final String? updatedAt;
  final int? orderId;
  final String? productType;
  final int? productId;
  final int? skuId;
  final int? quantity;
  final double? unitPrice;
  final double? totalAmount;
  final String? expireTime;
  final String? contentType;
  final int? contentId;

  PlusOrderItemVO({
    this.createdAt,
    this.updatedAt,
    this.orderId,
    this.productType,
    this.productId,
    this.skuId,
    this.quantity,
    this.unitPrice,
    this.totalAmount,
    this.expireTime,
    this.contentType,
    this.contentId
  });
}

class HttpApiDefinition {
  final String? apiName;
  final String? description;
  final String? baseUrl;
  final String? path;
  final String? method;
  final Map<String, String>? headers;
  final Map<String, dynamic>? parameters;
  final String? requestFormat;
  final String? responseFormat;
  final bool? authenticated;
  final int? timeoutMillis;
  final String? requestBodyFormat;
  final Map<String, dynamic>? requestBody;
  final String? authType;
  final Map<String, dynamic>? authParams;

  HttpApiDefinition({
    this.apiName,
    this.description,
    this.baseUrl,
    this.path,
    this.method,
    this.headers,
    this.parameters,
    this.requestFormat,
    this.responseFormat,
    this.authenticated,
    this.timeoutMillis,
    this.requestBodyFormat,
    this.requestBody,
    this.authType,
    this.authParams
  });
}

class PlusAiToolForm {
  final String? name;
  final String? description;
  final String? type;
  final String? status;
  final bool? enabled;
  final HttpApiDefinition? httpApiDefinition;
  final PlusToolDefinition? toolDefinition;

  PlusAiToolForm({
    this.name,
    this.description,
    this.type,
    this.status,
    this.enabled,
    this.httpApiDefinition,
    this.toolDefinition
  });
}

class PlusToolDefinition {
  final int? id;
  final String? uuid;
  final String? type;
  final String? name;
  final String? description;
  final String? inputSchema;
  final bool? buildIn;
  final HttpApiDefinition? httpDefinition;

  PlusToolDefinition({
    this.id,
    this.uuid,
    this.type,
    this.name,
    this.description,
    this.inputSchema,
    this.buildIn,
    this.httpDefinition
  });
}

class PlusAiToolVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;
  final String? type;
  final String? status;
  final bool? enabled;
  final HttpApiDefinition? httpApiDefinition;
  final PlusToolDefinition? toolDefinition;

  PlusAiToolVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.type,
    this.status,
    this.enabled,
    this.httpApiDefinition,
    this.toolDefinition
  });
}

class PlusApiResultPlusAiToolVO {
  final PlusAiToolVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusAiToolVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class InstallAppList {
  final List<int>? appIdList;

  InstallAppList({
    this.appIdList
  });
}

class PlusTenantForm {
  final String? name;
  final String? code;
  final String? status;
  final String? description;
  final int? adminUserId;
  final String? expireTime;
  final InstallAppList? installAppList;

  PlusTenantForm({
    this.name,
    this.code,
    this.status,
    this.description,
    this.adminUserId,
    this.expireTime,
    this.installAppList
  });
}

class PlusApiResultPlusTenantVO {
  final PlusTenantVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusTenantVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusTenantVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? code;
  final String? status;
  final String? description;
  final int? adminUserId;
  final String? expireTime;
  final InstallAppList? installAppList;

  PlusTenantVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.code,
    this.status,
    this.description,
    this.adminUserId,
    this.expireTime,
    this.installAppList
  });
}

class PlusTableForm {
  final String? name;
  final String? description;
  final String? type;
  final int? columnCount;
  final int? rowCount;
  final String? lastSyncTime;
  final String? primaryKeys;
  final String? engine;
  final String? createSql;
  final String? comment;

  PlusTableForm({
    this.name,
    this.description,
    this.type,
    this.columnCount,
    this.rowCount,
    this.lastSyncTime,
    this.primaryKeys,
    this.engine,
    this.createSql,
    this.comment
  });
}

class PlusApiResultPlusTableVO {
  final PlusTableVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusTableVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusColumnVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;
  final String? dataType;
  final String? columnType;
  final int? ordinalPosition;
  final bool? isNullable;
  final bool? isPrimaryKey;
  final bool? isAutoIncrement;
  final String? defaultValue;
  final String? comment;
  final String? characterSet;
  final String? collationRule;
  final int? tableId;

  PlusColumnVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.dataType,
    this.columnType,
    this.ordinalPosition,
    this.isNullable,
    this.isPrimaryKey,
    this.isAutoIncrement,
    this.defaultValue,
    this.comment,
    this.characterSet,
    this.collationRule,
    this.tableId
  });
}

class PlusTableVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;
  final String? type;
  final int? columnCount;
  final int? rowCount;
  final String? lastSyncTime;
  final String? primaryKeys;
  final String? engine;
  final String? createSql;
  final String? comment;
  final int? schemaId;
  final String? schemaName;
  final List<PlusColumnVO>? columns;

  PlusTableVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.type,
    this.columnCount,
    this.rowCount,
    this.lastSyncTime,
    this.primaryKeys,
    this.engine,
    this.createSql,
    this.comment,
    this.schemaId,
    this.schemaName,
    this.columns
  });
}

class AssetMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final String? mimeType;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final ImageMediaResource? image;
  final VideoMediaResource? video;
  final AudioMediaResource? audio;
  final MusicMediaResource? music;
  final CharacterMediaResource? character;
  final FileMediaResource? file;
  final Map<String, dynamic>? extraProps;

  AssetMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.mimeType,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.image,
    this.video,
    this.audio,
    this.music,
    this.character,
    this.file,
    this.extraProps
  });
}

class AssetMediaResourceList {
  final List<ImageMediaResource>? images;
  final List<VideoMediaResource>? videos;
  final List<AudioMediaResource>? audios;
  final List<FileMediaResource>? files;
  final List<MusicMediaResource>? musics;
  final List<AssetMediaResource>? resources;

  AssetMediaResourceList({
    this.images,
    this.videos,
    this.audios,
    this.files,
    this.musics,
    this.resources
  });
}

class AttributeItem {
  final int? id;
  final String? name;
  final List<String>? values;

  AttributeItem({
    this.id,
    this.name,
    this.values
  });
}

class AudioMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final String? mimeType;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final String? format;
  final int? bitRate;
  final int? sampleRate;
  final int? channels;
  final int? duration;

  AudioMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.mimeType,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.format,
    this.bitRate,
    this.sampleRate,
    this.channels,
    this.duration
  });
}

class CharacterMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final String? mimeType;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final String? characterType;
  final String? gender;
  final String? ageGroup;
  final String? avatarUrl;
  final String? avatarVideoUrl;
  final int? speakerId;
  final Map<String, dynamic>? appearanceParams;
  final Map<String, dynamic>? animationParams;

  CharacterMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.mimeType,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.characterType,
    this.gender,
    this.ageGroup,
    this.avatarUrl,
    this.avatarVideoUrl,
    this.speakerId,
    this.appearanceParams,
    this.animationParams
  });
}

class FileMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final int? width;
  final int? height;
  final int? duration;
  final String? mimeType;

  FileMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.width,
    this.height,
    this.duration,
    this.mimeType
  });
}

class ImageMediaResourceList {
  final List<ImageMediaResource>? images;

  ImageMediaResourceList({
    this.images
  });
}

class MusicMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final String? mimeType;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final String? format;
  final int? duration;

  MusicMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.mimeType,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.format,
    this.duration
  });
}

class PlusSkuForm {
  final String? title;
  final int? productId;
  final String? skuCode;
  final ImageMediaResourceList? images;
  final AssetMediaResourceList? resources;
  final double? price;
  final double? originalPrice;
  final int? stock;
  final int? salesCount;
  final String? status;
  final int? categoryId;
  final List<AttributeItem>? attributes;

  PlusSkuForm({
    this.title,
    this.productId,
    this.skuCode,
    this.images,
    this.resources,
    this.price,
    this.originalPrice,
    this.stock,
    this.salesCount,
    this.status,
    this.categoryId,
    this.attributes
  });
}

class PlusApiResultPlusSkuVO {
  final PlusSkuVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusSkuVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusSkuVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? productId;
  final String? skuCode;
  final String? name;
  final String? title;
  final double? price;
  final double? originalPrice;
  final int? stock;
  final int? sales;
  final int? status;
  final String? image;
  final String? specs;

  PlusSkuVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.productId,
    this.skuCode,
    this.name,
    this.title,
    this.price,
    this.originalPrice,
    this.stock,
    this.sales,
    this.status,
    this.image,
    this.specs
  });
}

class ShortUrlForm {
  final String? originalUrl;
  final String? shortCode;
  final String? expiresAt;
  final String? status;
  final int? createdBy;
  final String? description;

  ShortUrlForm({
    this.originalUrl,
    this.shortCode,
    this.expiresAt,
    this.status,
    this.createdBy,
    this.description
  });
}

class PlusApiResultShortUrlVO {
  final ShortUrlVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultShortUrlVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShortUrlVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? originalUrl;
  final String? shortCode;
  final String? expiresAt;
  final int? clickCount;
  final String? status;
  final int? createdBy;
  final String? description;

  ShortUrlVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.originalUrl,
    this.shortCode,
    this.expiresAt,
    this.clickCount,
    this.status,
    this.createdBy,
    this.description
  });
}

class GeoPoint {
  final double? longitude;
  final double? latitude;
  final bool? valid;

  GeoPoint({
    this.longitude,
    this.latitude,
    this.valid
  });
}

class PlusShopForm {
  final String? name;
  final String? description;
  final ImageMediaResource? logo;
  final ImageMediaResource? cover;
  final String? contactPhone;
  final String? contactEmail;
  final GeoPoint? location;
  final String? address;
  final String? licenseNumber;
  final List<String>? tags;
  final String? status;
  final String? businessHours;

  PlusShopForm({
    this.name,
    this.description,
    this.logo,
    this.cover,
    this.contactPhone,
    this.contactEmail,
    this.location,
    this.address,
    this.licenseNumber,
    this.tags,
    this.status,
    this.businessHours
  });
}

class PlusApiResultPlusShopVO {
  final PlusShopVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusShopVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusShopVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? userId;
  final String? name;
  final String? description;
  final ImageMediaResource? logo;
  final ImageMediaResource? cover;
  final String? contactPhone;
  final String? contactEmail;
  final GeoPoint? location;
  final String? address;
  final String? licenseNumber;
  final List<String>? tags;
  final String? status;
  final String? businessHours;

  PlusShopVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.userId,
    this.name,
    this.description,
    this.logo,
    this.cover,
    this.contactPhone,
    this.contactEmail,
    this.location,
    this.address,
    this.licenseNumber,
    this.tags,
    this.status,
    this.businessHours
  });
}

class PlusShareForm {
  final String? title;
  final String? description;
  final String? type;
  final ShareContents? contents;
  final String? contentType;
  final String? status;
  final String? shareUrl;
  final List<String>? contentIds;
  final String? password;
  final String? expireAt;
  final int? clickCount;
  final TagsContent? tags;
  final String? shareCode;

  PlusShareForm({
    this.title,
    this.description,
    this.type,
    this.contents,
    this.contentType,
    this.status,
    this.shareUrl,
    this.contentIds,
    this.password,
    this.expireAt,
    this.clickCount,
    this.tags,
    this.shareCode
  });
}

class ShareContents {
  final List<ShareItem>? items;

  ShareContents({
    this.items
  });
}

class ShareItem {


  ShareItem({

  });
}

class PlusApiResultPlusShareVO {
  final PlusShareVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusShareVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusShareVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? title;
  final String? description;
  final String? type;
  final ShareContents? contents;
  final String? contentType;
  final String? status;
  final String? shareUrl;
  final List<String>? contentIds;
  final String? password;
  final String? expireAt;
  final int? clickCount;
  final TagsContent? tags;
  final String? shareCode;

  PlusShareVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.title,
    this.description,
    this.type,
    this.contents,
    this.contentType,
    this.status,
    this.shareUrl,
    this.contentIds,
    this.password,
    this.expireAt,
    this.clickCount,
    this.tags,
    this.shareCode
  });
}

class PlusShareVisitRecordForm {
  final int? shareId;
  final String? ipAddress;
  final String? userAgent;
  final String? accessedAt;
  final bool? success;

  PlusShareVisitRecordForm({
    this.shareId,
    this.ipAddress,
    this.userAgent,
    this.accessedAt,
    this.success
  });
}

class PlusApiResultPlusShareVisitRecordVO {
  final PlusShareVisitRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusShareVisitRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusShareVisitRecordVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? shareId;
  final String? ipAddress;
  final String? userAgent;
  final String? accessedAt;
  final bool? success;

  PlusShareVisitRecordVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.shareId,
    this.ipAddress,
    this.userAgent,
    this.accessedAt,
    this.success
  });
}

class PlusShardingKeyForm {
  final String? shardingKey;
  final int? tenantId;
  final String? owner;
  final int? ownerId;
  final String? status;
  final String? description;

  PlusShardingKeyForm({
    this.shardingKey,
    this.tenantId,
    this.owner,
    this.ownerId,
    this.status,
    this.description
  });
}

class PlusApiResultPlusShardingKeyVO {
  final PlusShardingKeyVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusShardingKeyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusShardingKeyVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? shardingKey;
  final int? tenantId;
  final String? owner;
  final int? ownerId;
  final String? status;
  final String? description;

  PlusShardingKeyVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.shardingKey,
    this.tenantId,
    this.owner,
    this.ownerId,
    this.status,
    this.description
  });
}

class PlusSchemaForm {
  final String? name;
  final String? description;
  final int? status;
  final int? tableCount;
  final String? lastSyncTime;
  final bool? isDefault;
  final int? datasourceId;

  PlusSchemaForm({
    this.name,
    this.description,
    this.status,
    this.tableCount,
    this.lastSyncTime,
    this.isDefault,
    this.datasourceId
  });
}

class PlusApiResultPlusSchemaVO {
  final PlusSchemaVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusSchemaVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusSchemaVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;
  final int? status;
  final int? tableCount;
  final String? lastSyncTime;
  final bool? isDefault;
  final int? datasourceId;
  final List<int>? tableIds;

  PlusSchemaVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.status,
    this.tableCount,
    this.lastSyncTime,
    this.isDefault,
    this.datasourceId,
    this.tableIds
  });
}

class PlusRoleForm {
  final String? code;
  final String? name;
  final String? description;
  final String? status;

  PlusRoleForm({
    this.code,
    this.name,
    this.description,
    this.status
  });
}

class PlusApiResultPlusRoleVO {
  final PlusRoleVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusRoleVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusRoleVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? code;
  final String? name;
  final String? description;
  final String? status;

  PlusRoleVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.code,
    this.name,
    this.description,
    this.status
  });
}

class PlusRolePermissionForm {
  final int? roleId;
  final String? roleUuid;
  final int? permissionId;
  final String? permissionUuid;
  final bool? enabled;
  final String? description;
  final int? operatorId;

  PlusRolePermissionForm({
    this.roleId,
    this.roleUuid,
    this.permissionId,
    this.permissionUuid,
    this.enabled,
    this.description,
    this.operatorId
  });
}

class PlusApiResultPlusRolePermissionVO {
  final PlusRolePermissionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusRolePermissionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusRolePermissionVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? roleId;
  final String? roleUuid;
  final int? permissionId;
  final String? permissionUuid;
  final bool? enabled;
  final String? description;
  final int? operatorId;
  final String? status;

  PlusRolePermissionVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.roleId,
    this.roleUuid,
    this.permissionId,
    this.permissionUuid,
    this.enabled,
    this.description,
    this.operatorId,
    this.status
  });
}

class PlusInvokeRecordForm {
  final String? type;
  final String? apiEndpoint;
  final String? functionName;
  final Map<String, dynamic>? requestParams;
  final Map<String, dynamic>? headers;
  final String? status;
  final int? duration;
  final String? errorMsg;
  final int? userId;
  final String? clientIp;
  final String? clientLocation;
  final String? userAgent;
  final String? browserInfo;
  final String? clientId;

  PlusInvokeRecordForm({
    this.type,
    this.apiEndpoint,
    this.functionName,
    this.requestParams,
    this.headers,
    this.status,
    this.duration,
    this.errorMsg,
    this.userId,
    this.clientIp,
    this.clientLocation,
    this.userAgent,
    this.browserInfo,
    this.clientId
  });
}

class PlusApiResultPlusInvokeRecordVO {
  final PlusInvokeRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusInvokeRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusInvokeRecordVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? type;
  final String? apiEndpoint;
  final String? functionName;
  final Map<String, dynamic>? requestParams;
  final Map<String, dynamic>? headers;
  final String? status;
  final int? duration;
  final String? errorMsg;
  final int? userId;
  final String? clientIp;
  final String? clientLocation;
  final String? userAgent;
  final String? browserInfo;
  final String? clientId;

  PlusInvokeRecordVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.type,
    this.apiEndpoint,
    this.functionName,
    this.requestParams,
    this.headers,
    this.status,
    this.duration,
    this.errorMsg,
    this.userId,
    this.clientIp,
    this.clientLocation,
    this.userAgent,
    this.browserInfo,
    this.clientId
  });
}

class PlusUserRoleForm {
  final int? userId;
  final int? roleId;

  PlusUserRoleForm({
    this.userId,
    this.roleId
  });
}

class PlusApiResultPlusUserRoleVO {
  final PlusUserRoleVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusUserRoleVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusUserRoleVO {
  final String? createdAt;
  final String? updatedAt;
  final int? userId;
  final int? roleId;

  PlusUserRoleVO({
    this.createdAt,
    this.updatedAt,
    this.userId,
    this.roleId
  });
}

class PlusAiPromptForm {
  final String? title;
  final String? content;
  final String? description;
  final int? categoryId;
  final bool? enabled;
  final int? sort;
  final Map<String, dynamic>? parameters;
  final String? creator;
  final String? model;
  final TagsContent? tags;
  final int? usageCount;
  final int? avgResponseTime;

  PlusAiPromptForm({
    this.title,
    this.content,
    this.description,
    this.categoryId,
    this.enabled,
    this.sort,
    this.parameters,
    this.creator,
    this.model,
    this.tags,
    this.usageCount,
    this.avgResponseTime
  });
}

class PlusAiPromptVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? title;
  final String? content;
  final String? description;
  final int? categoryId;
  final bool? enabled;
  final int? sort;
  final Map<String, dynamic>? parameters;
  final String? creator;
  final String? model;
  final TagsContent? tags;
  final int? usageCount;
  final int? avgResponseTime;

  PlusAiPromptVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.content,
    this.description,
    this.categoryId,
    this.enabled,
    this.sort,
    this.parameters,
    this.creator,
    this.model,
    this.tags,
    this.usageCount,
    this.avgResponseTime
  });
}

class PlusApiResultPlusAiPromptVO {
  final PlusAiPromptVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusAiPromptVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusProjectForm {
  final String? name;
  final String? code;
  final String? description;
  final String? status;
  final int? leaderId;
  final String? startTime;
  final String? endTime;
  final int? budgetAmount;
  final bool? isDeleted;

  PlusProjectForm({
    this.name,
    this.code,
    this.description,
    this.status,
    this.leaderId,
    this.startTime,
    this.endTime,
    this.budgetAmount,
    this.isDeleted
  });
}

class PlusApiResultPlusProjectVO {
  final PlusProjectVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusProjectVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusProjectVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? name;
  final String? code;
  final String? description;
  final String? status;
  final int? leaderId;
  final String? startTime;
  final String? endTime;
  final int? budgetAmount;
  final bool? isDeleted;

  PlusProjectVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.name,
    this.code,
    this.description,
    this.status,
    this.leaderId,
    this.startTime,
    this.endTime,
    this.budgetAmount,
    this.isDeleted
  });
}

class Attributes {
  final List<AttributeItem>? items;

  Attributes({
    this.items
  });
}

class PlusProductForm {
  final String? title;
  final String? code;
  final String? subtitle;
  final AssetMediaResourceList? resources;
  final double? price;
  final double? originalPrice;
  final int? stock;
  final int? salesCount;
  final String? status;
  final String? onSaleAt;
  final String? description;
  final int? categoryId;
  final Attributes? baseAttributes;
  final Attributes? specAttributes;

  PlusProductForm({
    this.title,
    this.code,
    this.subtitle,
    this.resources,
    this.price,
    this.originalPrice,
    this.stock,
    this.salesCount,
    this.status,
    this.onSaleAt,
    this.description,
    this.categoryId,
    this.baseAttributes,
    this.specAttributes
  });
}

class PlusApiResultPlusProductVO {
  final PlusProductVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusProductVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusProductVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? userId;
  final String? title;
  final String? code;
  final String? subtitle;
  final AssetMediaResourceList? resources;
  final TagsContent? tags;
  final double? price;
  final double? originalPrice;
  final int? stock;
  final int? salesCount;
  final String? status;
  final String? onSaleAt;
  final String? description;
  final int? categoryId;
  final Attributes? baseAttributes;
  final Attributes? specAttributes;

  PlusProductVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.userId,
    this.title,
    this.code,
    this.subtitle,
    this.resources,
    this.tags,
    this.price,
    this.originalPrice,
    this.stock,
    this.salesCount,
    this.status,
    this.onSaleAt,
    this.description,
    this.categoryId,
    this.baseAttributes,
    this.specAttributes
  });
}

class GetUserInfoResponse {
  final String? userId;
  final String? openId;
  final String? unionId;
  final String? username;
  final String? email;
  final bool? emailVerified;
  final String? fullName;
  final String? avatarUrl;
  final String? gender;
  final String? nickname;
  final int? sex;
  final String? city;
  final String? province;
  final String? country;
  final List<String>? privileges;
  final String? bio;
  final String? blog;
  final String? location;
  final String? company;
  final String? firstName;
  final String? lastName;
  final String? locale;
  final String? mobile;
  final String? jobTitle;
  final String? officeLocation;

  GetUserInfoResponse({
    this.userId,
    this.openId,
    this.unionId,
    this.username,
    this.email,
    this.emailVerified,
    this.fullName,
    this.avatarUrl,
    this.gender,
    this.nickname,
    this.sex,
    this.city,
    this.province,
    this.country,
    this.privileges,
    this.bio,
    this.blog,
    this.location,
    this.company,
    this.firstName,
    this.lastName,
    this.locale,
    this.mobile,
    this.jobTitle,
    this.officeLocation
  });
}

class GrantedAuthority {
  final String? authority;

  GrantedAuthority({
    this.authority
  });
}

class PPTAnimation {
  final String? id;
  final String? elId;
  final String? effect;
  final PPTAnimationType? type;
  final int? duration;
  final PPTAnimationTrigger? trigger;

  PPTAnimation({
    this.id,
    this.elId,
    this.effect,
    this.type,
    this.duration,
    this.trigger
  });
}

class PPTAnimationTrigger {


  PPTAnimationTrigger({

  });
}

class PPTAnimationType {


  PPTAnimationType({

  });
}

class PPTBaseElement {
  final String? id;
  final int? left;
  final int? top;
  final bool? lock;
  final String? groupId;
  final int? width;
  final int? height;
  final int? rotate;
  final PPTElementLink? link;
  final String? name;

  PPTBaseElement({
    this.id,
    this.left,
    this.top,
    this.lock,
    this.groupId,
    this.width,
    this.height,
    this.rotate,
    this.link,
    this.name
  });
}

class PPTElementLink {
  final PPTElementLinkType? type;
  final String? target;

  PPTElementLink({
    this.type,
    this.target
  });
}

class PPTElementLinkType {


  PPTElementLinkType({

  });
}

class PPTGradient {
  final PPTGradientType? type;
  final List<PPTGradientColor>? colors;
  final int? rotate;

  PPTGradient({
    this.type,
    this.colors,
    this.rotate
  });
}

class PPTGradientColor {
  final int? pos;
  final String? color;

  PPTGradientColor({
    this.pos,
    this.color
  });
}

class PPTGradientType {


  PPTGradientType({

  });
}

class PPTNote {
  final String? id;
  final String? content;
  final int? time;
  final String? user;
  final String? elId;
  final List<PPTNoteReply>? replies;

  PPTNote({
    this.id,
    this.content,
    this.time,
    this.user,
    this.elId,
    this.replies
  });
}

class PPTNoteReply {
  final String? id;
  final String? content;
  final int? time;
  final String? user;

  PPTNoteReply({
    this.id,
    this.content,
    this.time,
    this.user
  });
}

class PPTSectionTag {
  final String? id;
  final String? title;

  PPTSectionTag({
    this.id,
    this.title
  });
}

class PPTSlideBackground {
  final PPTSlideBackgroundType? type;
  final String? color;
  final PPTSlideBackgroundImage? image;
  final PPTGradient? pptgradient;

  PPTSlideBackground({
    this.type,
    this.color,
    this.image,
    this.pptgradient
  });
}

class PPTSlideBackgroundImage {
  final String? src;
  final String? size;

  PPTSlideBackgroundImage({
    this.src,
    this.size
  });
}

class PPTSlideBackgroundType {


  PPTSlideBackgroundType({

  });
}

class PPTSlideType {


  PPTSlideType({

  });
}

class PPTTurningMode {


  PPTTurningMode({

  });
}

class PlusPermission {
  final int? tenantId;
  final int? organizationId;
  final String? dataScope;
  final int? id;
  final String? uuid;
  final String? createdAt;
  final String? updatedAt;
  final int? v;
  final String? name;
  final String? code;
  final String? description;
  final String? status;
  final int? sortOrder;
  final String? resourceUrl;
  final String? httpMethod;

  PlusPermission({
    this.tenantId,
    this.organizationId,
    this.dataScope,
    this.id,
    this.uuid,
    this.createdAt,
    this.updatedAt,
    this.v,
    this.name,
    this.code,
    this.description,
    this.status,
    this.sortOrder,
    this.resourceUrl,
    this.httpMethod
  });
}

class PlusPptPayload {


  PlusPptPayload({

  });
}

class PlusPptSlide {
  final String? id;
  final List<PPTBaseElement>? elements;
  final List<PPTNote>? notes;
  final String? remark;
  final PPTSlideBackground? background;
  final List<PPTAnimation>? animations;
  final PPTTurningMode? turningMode;
  final PPTSectionTag? sectionTag;
  final PPTSlideType? type;
  final PlusPptPayload? payload;

  PlusPptSlide({
    this.id,
    this.elements,
    this.notes,
    this.remark,
    this.background,
    this.animations,
    this.turningMode,
    this.sectionTag,
    this.type,
    this.payload
  });
}

class PlusPptTemplate {
  final int? tenantId;
  final int? organizationId;
  final String? dataScope;
  final int? id;
  final String? uuid;
  final String? createdAt;
  final String? updatedAt;
  final int? v;
  final String? title;
  final String? description;
  final ImageMediaResourceList? coverImages;
  final String? type;
  final String? status;
  final int? authorId;
  final String? authorName;
  final PlusUser? author;
  final PlusPptTemplateTags? tags;
  final PlusPptTemplateMeta? meta;
  final List<PlusPptTemplateSlide>? slides;

  PlusPptTemplate({
    this.tenantId,
    this.organizationId,
    this.dataScope,
    this.id,
    this.uuid,
    this.createdAt,
    this.updatedAt,
    this.v,
    this.title,
    this.description,
    this.coverImages,
    this.type,
    this.status,
    this.authorId,
    this.authorName,
    this.author,
    this.tags,
    this.meta,
    this.slides
  });
}

class PlusPptTemplateForm {
  final String? title;
  final String? description;
  final ImageMediaResourceList? coverImages;
  final String? type;
  final String? status;
  final int? authorId;
  final String? authorName;
  final PlusPptTemplateTags? tags;
  final PlusPptTemplateMeta? meta;
  final List<PlusPptTemplateSlide>? slides;

  PlusPptTemplateForm({
    this.title,
    this.description,
    this.coverImages,
    this.type,
    this.status,
    this.authorId,
    this.authorName,
    this.tags,
    this.meta,
    this.slides
  });
}

class PlusPptTemplateMeta {
  final String? payloadUrl;
  final List<String>? previewUrls;

  PlusPptTemplateMeta({
    this.payloadUrl,
    this.previewUrls
  });
}

class PlusPptTemplateSlide {
  final int? tenantId;
  final int? organizationId;
  final String? dataScope;
  final int? id;
  final String? uuid;
  final String? createdAt;
  final String? updatedAt;
  final int? v;
  final int? templateId;
  final PlusPptTemplate? pptTemplate;
  final PPTSlideType? type;
  final String? title;
  final String? description;
  final int? sortOrder;
  final String? layoutType;
  final PlusPptSlide? slideConfig;
  final PlusPptPayload? payload;
  final PPTTurningMode? pptturningMode;

  PlusPptTemplateSlide({
    this.tenantId,
    this.organizationId,
    this.dataScope,
    this.id,
    this.uuid,
    this.createdAt,
    this.updatedAt,
    this.v,
    this.templateId,
    this.pptTemplate,
    this.type,
    this.title,
    this.description,
    this.sortOrder,
    this.layoutType,
    this.slideConfig,
    this.payload,
    this.pptturningMode
  });
}

class PlusPptTemplateTags {
  final List<String>? scene;
  final List<String>? design;
  final List<String>? theme;
  final List<String>? style;

  PlusPptTemplateTags({
    this.scene,
    this.design,
    this.theme,
    this.style
  });
}

class PlusRole {
  final int? tenantId;
  final int? organizationId;
  final String? dataScope;
  final int? id;
  final String? uuid;
  final String? createdAt;
  final String? updatedAt;
  final int? v;
  final String? code;
  final String? name;
  final String? description;
  final String? status;
  final List<PlusPermission>? permissions;
  final List<String>? permissionCodes;

  PlusRole({
    this.tenantId,
    this.organizationId,
    this.dataScope,
    this.id,
    this.uuid,
    this.createdAt,
    this.updatedAt,
    this.v,
    this.code,
    this.name,
    this.description,
    this.status,
    this.permissions,
    this.permissionCodes
  });
}

class PlusUser {
  final int? tenantId;
  final int? organizationId;
  final String? dataScope;
  final int? id;
  final String? uuid;
  final String? createdAt;
  final String? updatedAt;
  final int? v;
  final String? username;
  final String? nickname;
  final String? password;
  final String? platform;
  final String? type;
  final String? gender;
  final ImageMediaResource? faceImage;
  final VideoMediaResource? faceVideo;
  final String? salt;
  final String? scene;
  final String? email;
  final String? phone;
  final String? countryCode;
  final String? provinceCode;
  final String? cityCode;
  final String? districtCode;
  final String? address;
  final String? bio;
  final String? birthDate;
  final GetUserInfoResponse? oauthUserInfo;
  final String? status;
  final List<PlusRole>? roles;
  final UserMetadata? metadata;
  final SocialInfoList? socialInfoList;
  final List<String>? roleCodes;
  final List<GrantedAuthority>? authorities;

  PlusUser({
    this.tenantId,
    this.organizationId,
    this.dataScope,
    this.id,
    this.uuid,
    this.createdAt,
    this.updatedAt,
    this.v,
    this.username,
    this.nickname,
    this.password,
    this.platform,
    this.type,
    this.gender,
    this.faceImage,
    this.faceVideo,
    this.salt,
    this.scene,
    this.email,
    this.phone,
    this.countryCode,
    this.provinceCode,
    this.cityCode,
    this.districtCode,
    this.address,
    this.bio,
    this.birthDate,
    this.oauthUserInfo,
    this.status,
    this.roles,
    this.metadata,
    this.socialInfoList,
    this.roleCodes,
    this.authorities
  });
}

class UserMetadata {
  final int? spMchId;
  final int? partnerId;
  final int? agentId;
  final int? shopId;
  final int? fromUserId;

  UserMetadata({
    this.spMchId,
    this.partnerId,
    this.agentId,
    this.shopId,
    this.fromUserId
  });
}

class PlusApiResultPlusPptTemplateVO {
  final PlusPptTemplateVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusPptTemplateVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusPptTemplateSlideVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? templateId;
  final String? sectionTitle;
  final String? sectionContent;
  final int? pageNumber;
  final String? layoutType;
  final String? backgroundImage;
  final int? sortOrder;
  final bool? isRequired;

  PlusPptTemplateSlideVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.templateId,
    this.sectionTitle,
    this.sectionContent,
    this.pageNumber,
    this.layoutType,
    this.backgroundImage,
    this.sortOrder,
    this.isRequired
  });
}

class PlusPptTemplateVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? title;
  final String? description;
  final ImageMediaResourceList? coverImages;
  final String? type;
  final String? status;
  final int? authorId;
  final String? authorName;
  final PlusPptTemplateTags? tags;
  final PlusPptTemplateMeta? meta;
  final List<PlusPptTemplateSlideVO>? slides;

  PlusPptTemplateVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.title,
    this.description,
    this.coverImages,
    this.type,
    this.status,
    this.authorId,
    this.authorName,
    this.tags,
    this.meta,
    this.slides
  });
}

class PlusPptTemplateSlideForm {
  final int? templateId;
  final String? sectionTitle;
  final String? sectionContent;
  final int? pageNumber;
  final String? layoutType;
  final String? backgroundImage;
  final int? sortOrder;
  final bool? isRequired;
  final String? createdAt;
  final String? updatedAt;

  PlusPptTemplateSlideForm({
    this.templateId,
    this.sectionTitle,
    this.sectionContent,
    this.pageNumber,
    this.layoutType,
    this.backgroundImage,
    this.sortOrder,
    this.isRequired,
    this.createdAt,
    this.updatedAt
  });
}

class PlusApiResultPlusPptTemplateSlideVO {
  final PlusPptTemplateSlideVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusPptTemplateSlideVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusPartnerForm {
  final String? name;
  final String? level;
  final String? status;
  final String? contactName;
  final String? contactPhone;
  final String? contactEmail;
  final String? companyAddress;
  final String? businessLicense;
  final String? settlementAccount;
  final double? commissionRate;
  final double? totalCommission;
  final double? withdrawableCommission;
  final double? withdrawnCommission;
  final String? promotionCode;
  final int? parentId;
  final PlusTreeParentMetadata? parentMetadata;
  final String? parentUuid;
  final String? cooperationStartTime;
  final String? cooperationEndTime;
  final String? remark;

  PlusPartnerForm({
    this.name,
    this.level,
    this.status,
    this.contactName,
    this.contactPhone,
    this.contactEmail,
    this.companyAddress,
    this.businessLicense,
    this.settlementAccount,
    this.commissionRate,
    this.totalCommission,
    this.withdrawableCommission,
    this.withdrawnCommission,
    this.promotionCode,
    this.parentId,
    this.parentMetadata,
    this.parentUuid,
    this.cooperationStartTime,
    this.cooperationEndTime,
    this.remark
  });
}

class PlusTreeParentMetadata {
  final List<int>? parentIds;

  PlusTreeParentMetadata({
    this.parentIds
  });
}

class PlusApiResultPlusPartnerVO {
  final PlusPartnerVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusPartnerVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusPartnerVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? name;
  final String? level;
  final String? status;
  final String? contactName;
  final String? contactPhone;
  final String? contactEmail;
  final String? companyAddress;
  final String? businessLicense;
  final String? settlementAccount;
  final double? commissionRate;
  final double? totalCommission;
  final double? withdrawableCommission;
  final double? withdrawnCommission;
  final String? promotionCode;
  final int? parentId;
  final PlusTreeParentMetadata? parentMetadata;
  final String? parentUuid;
  final String? cooperationStartTime;
  final String? cooperationEndTime;
  final String? remark;

  PlusPartnerVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.name,
    this.level,
    this.status,
    this.contactName,
    this.contactPhone,
    this.contactEmail,
    this.companyAddress,
    this.businessLicense,
    this.settlementAccount,
    this.commissionRate,
    this.totalCommission,
    this.withdrawableCommission,
    this.withdrawnCommission,
    this.promotionCode,
    this.parentId,
    this.parentMetadata,
    this.parentUuid,
    this.cooperationStartTime,
    this.cooperationEndTime,
    this.remark
  });
}

class PlusParticipantForm {
  final String? type;
  final String? name;
  final ImageMediaResource? face;
  final int? userId;
  final int? agentId;
  final String? role;
  final String? contextType;
  final int? contextId;
  final int? conversationId;
  final String? groupType;
  final String? conversationType;
  final bool? isCreator;
  final bool? isOnline;
  final String? lastActiveTime;
  final bool? isTemporary;

  PlusParticipantForm({
    this.type,
    this.name,
    this.face,
    this.userId,
    this.agentId,
    this.role,
    this.contextType,
    this.contextId,
    this.conversationId,
    this.groupType,
    this.conversationType,
    this.isCreator,
    this.isOnline,
    this.lastActiveTime,
    this.isTemporary
  });
}

class PlusApiResultPlusParticipantVO {
  final PlusParticipantVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusParticipantVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusParticipantVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? type;
  final String? name;
  final ImageMediaResource? face;
  final int? userId;
  final int? agentId;
  final String? role;
  final String? contextType;
  final int? contextId;
  final int? conversationId;
  final String? groupType;
  final String? conversationType;
  final bool? isCreator;
  final bool? isOnline;
  final String? lastActiveTime;
  final bool? isTemporary;

  PlusParticipantVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.type,
    this.name,
    this.face,
    this.userId,
    this.agentId,
    this.role,
    this.contextType,
    this.contextId,
    this.conversationId,
    this.groupType,
    this.conversationType,
    this.isCreator,
    this.isOnline,
    this.lastActiveTime,
    this.isTemporary
  });
}

class PlusOssBucketForm {
  final String? name;
  final String? region;
  final String? channel;
  final int? channelConfigId;
  final String? description;
  final String? status;
  final String? creationDate;
  final String? arn;
  final String? endpoint;
  final String? storageClass;
  final bool? versioningEnabled;
  final bool? encryptionEnabled;
  final String? encryptionType;
  final String? acl;

  PlusOssBucketForm({
    this.name,
    this.region,
    this.channel,
    this.channelConfigId,
    this.description,
    this.status,
    this.creationDate,
    this.arn,
    this.endpoint,
    this.storageClass,
    this.versioningEnabled,
    this.encryptionEnabled,
    this.encryptionType,
    this.acl
  });
}

class PlusApiResultPlusOssBucketVO {
  final PlusOssBucketVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusOssBucketVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusOssBucketVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? v;
  final int? userId;
  final String? name;
  final String? region;
  final String? channel;
  final int? channelConfigId;
  final String? description;
  final String? status;
  final String? creationDate;
  final String? arn;
  final String? endpoint;
  final String? storageClass;
  final bool? versioningEnabled;
  final bool? encryptionEnabled;
  final String? encryptionType;
  final String? acl;

  PlusOssBucketVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.v,
    this.userId,
    this.name,
    this.region,
    this.channel,
    this.channelConfigId,
    this.description,
    this.status,
    this.creationDate,
    this.arn,
    this.endpoint,
    this.storageClass,
    this.versioningEnabled,
    this.encryptionEnabled,
    this.encryptionType,
    this.acl
  });
}

class PlusOrganizationForm {
  final String? name;
  final String? code;
  final String? status;
  final String? description;
  final int? parentId;
  final InstallAppList? installAppList;

  PlusOrganizationForm({
    this.name,
    this.code,
    this.status,
    this.description,
    this.parentId,
    this.installAppList
  });
}

class PlusApiResultPlusOrganizationVO {
  final PlusOrganizationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusOrganizationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusOrganizationVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? code;
  final String? status;
  final String? description;
  final int? parentId;
  final InstallAppList? installAppList;

  PlusOrganizationVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.code,
    this.status,
    this.description,
    this.parentId,
    this.installAppList
  });
}

class PlusPositionForm {
  final int? parentId;
  final String? name;
  final String? description;
  final String? owner;
  final int? ownerId;
  final String? code;
  final int? level;
  final int? sortOrder;
  final bool? isActive;

  PlusPositionForm({
    this.parentId,
    this.name,
    this.description,
    this.owner,
    this.ownerId,
    this.code,
    this.level,
    this.sortOrder,
    this.isActive
  });
}

class PlusApiResultPlusPositionVO {
  final PlusPositionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusPositionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusPositionVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? parentId;
  final String? name;
  final String? description;
  final String? owner;
  final int? ownerId;
  final String? code;
  final int? level;
  final int? sortOrder;
  final bool? isActive;
  final String? organizationName;
  final List<int>? memberIds;

  PlusPositionVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.parentId,
    this.name,
    this.description,
    this.owner,
    this.ownerId,
    this.code,
    this.level,
    this.sortOrder,
    this.isActive,
    this.organizationName,
    this.memberIds
  });
}

class PlusMemberRelationsForm {
  final int? memberId;
  final String? owner;
  final int? ownerId;
  final String? type;
  final int? targetId;
  final bool? isPrimary;
  final bool? isActive;
  final String? effectiveAt;
  final String? expiredAt;
  final int? sortOrder;
  final String? remark;
  final String? createdAt;
  final String? updatedAt;

  PlusMemberRelationsForm({
    this.memberId,
    this.owner,
    this.ownerId,
    this.type,
    this.targetId,
    this.isPrimary,
    this.isActive,
    this.effectiveAt,
    this.expiredAt,
    this.sortOrder,
    this.remark,
    this.createdAt,
    this.updatedAt
  });
}

class PlusApiResultPlusMemberRelationsVO {
  final PlusMemberRelationsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusMemberRelationsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusMemberRelationsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? memberId;
  final String? owner;
  final int? ownerId;
  final String? type;
  final int? parentId;
  final int? targetId;
  final bool? isPrimary;
  final bool? isActive;
  final String? effectiveAt;
  final String? expiredAt;
  final int? sortOrder;
  final String? remark;

  PlusMemberRelationsVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.memberId,
    this.owner,
    this.ownerId,
    this.type,
    this.parentId,
    this.targetId,
    this.isPrimary,
    this.isActive,
    this.effectiveAt,
    this.expiredAt,
    this.sortOrder,
    this.remark
  });
}

class PlusOrganizationMemberForm {
  final int? userId;
  final String? owner;
  final int? ownerId;
  final bool? isActive;
  final String? joinedAt;
  final String? leftAt;
  final String? remark;

  PlusOrganizationMemberForm({
    this.userId,
    this.owner,
    this.ownerId,
    this.isActive,
    this.joinedAt,
    this.leftAt,
    this.remark
  });
}

class PlusApiResultPlusOrganizationMemberVO {
  final PlusOrganizationMemberVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusOrganizationMemberVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusOrganizationMemberVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? userId;
  final String? owner;
  final int? ownerId;
  final bool? isActive;
  final String? joinedAt;
  final String? leftAt;
  final String? remark;
  final List<int>? departmentIds;
  final List<int>? positionIds;
  final List<int>? roleIds;
  final int? primaryDepartmentId;
  final int? primaryPositionId;
  final bool? valid;

  PlusOrganizationMemberVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.userId,
    this.owner,
    this.ownerId,
    this.isActive,
    this.joinedAt,
    this.leftAt,
    this.remark,
    this.departmentIds,
    this.positionIds,
    this.roleIds,
    this.primaryDepartmentId,
    this.primaryPositionId,
    this.valid
  });
}

class Participant {
  final int? id;
  final String? uuid;
  final String? openId;
  final String? unionId;
  final String? name;
  final ImageMediaResource? face;
  final int? deviceId;
  final String? deviceUuid;
  final bool? device;

  Participant({
    this.id,
    this.uuid,
    this.openId,
    this.unionId,
    this.name,
    this.face,
    this.deviceId,
    this.deviceUuid,
    this.device
  });
}

class PlusNotificationForm {
  final String? role;
  final int? senderId;
  final Participant? sender;
  final int? receiverId;
  final Participant? receiver;
  final int? groupId;
  final String? title;
  final String? content;
  final String? type;
  final String? channelType;
  final String? templateId;
  final Map<String, dynamic>? templateParams;
  final String? redirectUrl;
  final String? miniProgramPath;
  final String? status;
  final String? sentAt;
  final String? readAt;
  final Map<String, dynamic>? extraData;
  final int? retryCount;
  final int? maxRetryCount;
  final String? errorMessage;

  PlusNotificationForm({
    this.role,
    this.senderId,
    this.sender,
    this.receiverId,
    this.receiver,
    this.groupId,
    this.title,
    this.content,
    this.type,
    this.channelType,
    this.templateId,
    this.templateParams,
    this.redirectUrl,
    this.miniProgramPath,
    this.status,
    this.sentAt,
    this.readAt,
    this.extraData,
    this.retryCount,
    this.maxRetryCount,
    this.errorMessage
  });
}

class PlusApiResultPlusNotificationVO {
  final PlusNotificationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusNotificationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusNotificationVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? role;
  final int? senderId;
  final Participant? sender;
  final int? receiverId;
  final Participant? receiver;
  final int? groupId;
  final String? title;
  final String? content;
  final String? type;
  final String? channelType;
  final String? templateId;
  final Map<String, dynamic>? templateParams;
  final String? redirectUrl;
  final String? miniProgramPath;
  final String? status;
  final String? sentAt;
  final String? readAt;
  final Map<String, dynamic>? extraData;
  final int? retryCount;
  final int? maxRetryCount;
  final String? errorMessage;

  PlusNotificationVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.role,
    this.senderId,
    this.sender,
    this.receiverId,
    this.receiver,
    this.groupId,
    this.title,
    this.content,
    this.type,
    this.channelType,
    this.templateId,
    this.templateParams,
    this.redirectUrl,
    this.miniProgramPath,
    this.status,
    this.sentAt,
    this.readAt,
    this.extraData,
    this.retryCount,
    this.maxRetryCount,
    this.errorMessage
  });
}

class PlusNotesForm {
  final String? title;
  final String? content;
  final int? userId;
  final int? categoryId;
  final String? tags;
  final String? accessScope;
  final String? password;
  final ImageMediaResource? coverImage;
  final String? status;
  final String? remark;
  final int? diskId;
  final int? parentId;
  final String? type;
  final TagsContent? tagsAsTagsContent;

  PlusNotesForm({
    this.title,
    this.content,
    this.userId,
    this.categoryId,
    this.tags,
    this.accessScope,
    this.password,
    this.coverImage,
    this.status,
    this.remark,
    this.diskId,
    this.parentId,
    this.type,
    this.tagsAsTagsContent
  });
}

class PlusApiResultPlusNotesVO {
  final PlusNotesVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusNotesVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusNotesVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? title;
  final String? content;
  final int? userId;
  final String? userName;
  final int? categoryId;
  final String? categoryName;
  final String? tags;
  final String? accessScope;
  final String? password;
  final ImageMediaResource? coverImage;
  final String? status;
  final String? remark;
  final int? diskId;
  final int? parentId;
  final String? type;
  final String? path;
  final String? relativePath;

  PlusNotesVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.title,
    this.content,
    this.userId,
    this.userName,
    this.categoryId,
    this.categoryName,
    this.tags,
    this.accessScope,
    this.password,
    this.coverImage,
    this.status,
    this.remark,
    this.diskId,
    this.parentId,
    this.type,
    this.path,
    this.relativePath
  });
}

class PlusNewsForm {
  final String? title;
  final String? url;
  final String? source;
  final String? summary;
  final String? publishTime;
  final TagsContent? tags;
  final int? userId;

  PlusNewsForm({
    this.title,
    this.url,
    this.source,
    this.summary,
    this.publishTime,
    this.tags,
    this.userId
  });
}

class PlusApiResultPlusNewsVO {
  final PlusNewsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusNewsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusNewsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? userId;
  final String? title;
  final String? url;
  final String? source;
  final String? summary;
  final String? publishTime;
  final TagsContent? tags;

  PlusNewsVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.userId,
    this.title,
    this.url,
    this.source,
    this.summary,
    this.publishTime,
    this.tags
  });
}

class DnsServer {
  final String? address;
  final int? port;
  final String? type;
  final int? priority;
  final bool? enabled;

  DnsServer({
    this.address,
    this.port,
    this.type,
    this.priority,
    this.enabled
  });
}

class DnsServers {
  final List<DnsServer>? servers;
  final bool? empty;

  DnsServers({
    this.servers,
    this.empty
  });
}

class PlusHostDomainForm {
  final String? domainName;
  final String? tld;
  final String? registrar;
  final int? ownerId;
  final String? registeredAt;
  final String? expiredAt;
  final String? status;
  final DnsServers? dnsServers;
  final String? resolutionStatus;
  final bool? autoRenew;
  final String? remark;

  PlusHostDomainForm({
    this.domainName,
    this.tld,
    this.registrar,
    this.ownerId,
    this.registeredAt,
    this.expiredAt,
    this.status,
    this.dnsServers,
    this.resolutionStatus,
    this.autoRenew,
    this.remark
  });
}

class DnsRecordValue {
  final List<String>? values;
  final bool? empty;
  final String? firstValue;

  DnsRecordValue({
    this.values,
    this.empty,
    this.firstValue
  });
}

class PlusApiResultPlusHostDomainVO {
  final PlusHostDomainVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusHostDomainVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusDnsRecordVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? domainId;
  final String? recordName;
  final String? fileName;
  final String? fileContent;
  final String? recordType;
  final DnsRecordValue? recordValue;
  final int? ttl;
  final int? priority;
  final bool? enabled;
  final String? firstRecordValue;
  final List<String>? recordValues;

  PlusDnsRecordVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.domainId,
    this.recordName,
    this.fileName,
    this.fileContent,
    this.recordType,
    this.recordValue,
    this.ttl,
    this.priority,
    this.enabled,
    this.firstRecordValue,
    this.recordValues
  });
}

class PlusHostDomainVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? domainName;
  final String? tld;
  final String? registrar;
  final int? ownerId;
  final String? registeredAt;
  final String? expiredAt;
  final String? status;
  final DnsServers? dnsServers;
  final String? resolutionStatus;
  final bool? autoRenew;
  final String? remark;
  final List<PlusDnsRecordVO>? dnsRecords;

  PlusHostDomainVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.domainName,
    this.tld,
    this.registrar,
    this.ownerId,
    this.registeredAt,
    this.expiredAt,
    this.status,
    this.dnsServers,
    this.resolutionStatus,
    this.autoRenew,
    this.remark,
    this.dnsRecords
  });
}

class PlusDnsRecordForm {
  final int? domainId;
  final String? recordName;
  final String? fileName;
  final String? fileContent;
  final String? recordType;
  final DnsRecordValue? recordValue;
  final int? ttl;
  final int? priority;
  final bool? enabled;

  PlusDnsRecordForm({
    this.domainId,
    this.recordName,
    this.fileName,
    this.fileContent,
    this.recordType,
    this.recordValue,
    this.ttl,
    this.priority,
    this.enabled
  });
}

class PlusApiResultPlusDnsRecordVO {
  final PlusDnsRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusDnsRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusMusicForm {
  final String? title;
  final String? description;
  final String? contentUrl;
  final String? format;
  final int? duration;
  final int? fileSize;
  final String? thumbnailUrl;
  final String? artist;
  final String? genre;
  final int? bitrate;
  final String? status;
  final String? createdAt;
  final String? updatedAt;

  PlusMusicForm({
    this.title,
    this.description,
    this.contentUrl,
    this.format,
    this.duration,
    this.fileSize,
    this.thumbnailUrl,
    this.artist,
    this.genre,
    this.bitrate,
    this.status,
    this.createdAt,
    this.updatedAt
  });
}

class PlusApiResultPlusMusicVO {
  final PlusMusicVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusMusicVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusMusicVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? version;
  final String? title;
  final ImageMediaResourceList? coverImages;
  final String? description;
  final MusicMediaResource? resource;
  final AuthorInfo? author;
  final String? contentUrl;
  final AssetMediaResourceList? resourceList;
  final String? format;
  final int? duration;
  final int? fileSize;
  final String? thumbnailUrl;
  final String? artist;
  final String? genre;
  final int? bitrate;
  final String? status;

  PlusMusicVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.version,
    this.title,
    this.coverImages,
    this.description,
    this.resource,
    this.author,
    this.contentUrl,
    this.resourceList,
    this.format,
    this.duration,
    this.fileSize,
    this.thumbnailUrl,
    this.artist,
    this.genre,
    this.bitrate,
    this.status
  });
}

class AspectRatio {
  final String? ratio;
  final double? width;
  final double? height;

  AspectRatio({
    this.ratio,
    this.width,
    this.height
  });
}

class ModelLimitInfo {
  final String? unit;
  final List<ModelLimitItem>? items;

  ModelLimitInfo({
    this.unit,
    this.items
  });
}

class ModelLimitItem {
  final String? type;
  final double? value;

  ModelLimitItem({
    this.type,
    this.value
  });
}

class ModelMetadata {
  final List<int>? durations;
  final List<String>? resolutions;
  final List<AspectRatio>? ratios;
  final bool? isMultimodal;
  final bool? isReasoning;
  final bool? isToolCall;

  ModelMetadata({
    this.durations,
    this.resolutions,
    this.ratios,
    this.isMultimodal,
    this.isReasoning,
    this.isToolCall
  });
}

class ModelPrice {
  final String? unit;
  final List<ModelPriceItem>? items;
  final String? currency;

  ModelPrice({
    this.unit,
    this.items,
    this.currency
  });
}

class ModelPriceItem {
  final String? type;
  final double? price;

  ModelPriceItem({
    this.type,
    this.price
  });
}

class PlusAiModelInfoForm {
  final String? objectId;
  final String? model;
  final String? name;
  final String? description;
  final String? channel;
  final String? modelVersion;
  final String? family;
  final String? apiEndpoint;
  final String? modelType;
  final int? createdAt;
  final String? ownedBy;
  final ModelLimitInfo? tokenLimit;
  final ModelPrice? priceInfo;
  final ModelMetadata? metadata;
  final String? supportedVoices;
  final double? defaultTemperature;
  final double? defaultTopP;
  final double? defaultFrequencyPenalty;
  final double? defaultPresencePenalty;
  final String? status;
  final int? usageCount;
  final int? totalTokens;
  final int? avgResponseTime;
  final TagsContent? tags;
  final String? configParams;

  PlusAiModelInfoForm({
    this.objectId,
    this.model,
    this.name,
    this.description,
    this.channel,
    this.modelVersion,
    this.family,
    this.apiEndpoint,
    this.modelType,
    this.createdAt,
    this.ownedBy,
    this.tokenLimit,
    this.priceInfo,
    this.metadata,
    this.supportedVoices,
    this.defaultTemperature,
    this.defaultTopP,
    this.defaultFrequencyPenalty,
    this.defaultPresencePenalty,
    this.status,
    this.usageCount,
    this.totalTokens,
    this.avgResponseTime,
    this.tags,
    this.configParams
  });
}

class PlusAiModelInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final String? objectId;
  final String? model;
  final String? name;
  final String? description;
  final String? channel;
  final String? modelVersion;
  final String? family;
  final String? apiEndpoint;
  final String? modelType;
  final String? ownedBy;
  final ModelLimitInfo? tokenLimit;
  final ModelPrice? priceInfo;
  final ModelMetadata? metadata;
  final String? supportedVoices;
  final double? defaultTemperature;
  final double? defaultTopP;
  final double? defaultFrequencyPenalty;
  final double? defaultPresencePenalty;
  final String? status;
  final int? usageCount;
  final int? totalTokens;
  final int? avgResponseTime;
  final TagsContent? tags;
  final String? configParams;

  PlusAiModelInfoVO({
    this.createdAt,
    this.updatedAt,
    this.objectId,
    this.model,
    this.name,
    this.description,
    this.channel,
    this.modelVersion,
    this.family,
    this.apiEndpoint,
    this.modelType,
    this.ownedBy,
    this.tokenLimit,
    this.priceInfo,
    this.metadata,
    this.supportedVoices,
    this.defaultTemperature,
    this.defaultTopP,
    this.defaultFrequencyPenalty,
    this.defaultPresencePenalty,
    this.status,
    this.usageCount,
    this.totalTokens,
    this.avgResponseTime,
    this.tags,
    this.configParams
  });
}

class PlusApiResultPlusAiModelInfoVO {
  final PlusAiModelInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusAiModelInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusAiModelPriceForm {
  final String? objectId;
  final String? model;
  final String? unit;
  final double? price;
  final double? inputPrice;
  final double? batchInputPrice;
  final double? cachedInputPrice;
  final double? batchCachedInputPrice;
  final double? outputPrice;
  final double? batchOutputPrice;
  final String? currency;

  PlusAiModelPriceForm({
    this.objectId,
    this.model,
    this.unit,
    this.price,
    this.inputPrice,
    this.batchInputPrice,
    this.cachedInputPrice,
    this.batchCachedInputPrice,
    this.outputPrice,
    this.batchOutputPrice,
    this.currency
  });
}

class PlusAiModelPriceVO {
  final String? createdAt;
  final String? updatedAt;
  final String? objectId;
  final String? model;
  final String? unit;
  final double? price;
  final double? inputPrice;
  final double? batchInputPrice;
  final double? cachedInputPrice;
  final double? batchCachedInputPrice;
  final double? outputPrice;
  final double? batchOutputPrice;
  final String? currency;

  PlusAiModelPriceVO({
    this.createdAt,
    this.updatedAt,
    this.objectId,
    this.model,
    this.unit,
    this.price,
    this.inputPrice,
    this.batchInputPrice,
    this.cachedInputPrice,
    this.batchCachedInputPrice,
    this.outputPrice,
    this.batchOutputPrice,
    this.currency
  });
}

class PlusApiResultPlusAiModelPriceVO {
  final PlusAiModelPriceVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusAiModelPriceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AccountConfigMetadata {


  AccountConfigMetadata({

  });
}

class AecConfig {
  final int? echoMode;
  final int? delayEstimation;
  final int? noiseSuppression;
  final int? echoTailMs;
  final int? sampleRate;

  AecConfig({
    this.echoMode,
    this.delayEstimation,
    this.noiseSuppression,
    this.echoTailMs,
    this.sampleRate
  });
}

class AgentDefinition {
  final int? id;
  final String? uuid;
  final String? name;
  final String? instructions;
  final String? description;
  final String? type;
  final String? bizType;
  final TeamAgentMembers? agents;
  final AgentToolConfig? toolConfig;
  final PlusAiAgentConfig? baseConfig;
  final AgentKnowledgeConfig? knowledgeConfig;
  final AgentMemoryConfig? memoryConfig;
  final SpeechConfig? speechConfig;
  final ChatOptions? chatOptions;

  AgentDefinition({
    this.id,
    this.uuid,
    this.name,
    this.instructions,
    this.description,
    this.type,
    this.bizType,
    this.agents,
    this.toolConfig,
    this.baseConfig,
    this.knowledgeConfig,
    this.memoryConfig,
    this.speechConfig,
    this.chatOptions
  });
}

class AgentExecutionContext {
  final String? id;
  final String? bizType;
  final String? uuid;
  final int? maxFlowSteps;
  final int? flowSteps;
  final int? threads;
  final String? createAt;
  final int? maxDuration;
  final List<ChatMessageListener>? listeners;
  final String? state;
  final ChatContext? chatContext;
  final ShardingContext? shardingContext;
  final Flow? flow;
  final AgentExecutionContext? root;
  final AgentExecutionContext? parent;
  final PlusAgent? pre;
  final PlusAgent? current;
  final ChatResponseHandler? responseHandler;
  final PlusProjectObject? project;
  final PlusDiskObject? disk;
  final PlusFileObject? diskRootFile;
  final bool? completed;
  final bool? expired;
  final Map<String, AgentScope>? agentSCOPES;
  final bool? overSteps;
  final bool? paused;
  final bool? running;
  final bool? failed;
  final bool? waiting;
  final bool? init;
  final bool? end;

  AgentExecutionContext({
    this.id,
    this.bizType,
    this.uuid,
    this.maxFlowSteps,
    this.flowSteps,
    this.threads,
    this.createAt,
    this.maxDuration,
    this.listeners,
    this.state,
    this.chatContext,
    this.shardingContext,
    this.flow,
    this.root,
    this.parent,
    this.pre,
    this.current,
    this.responseHandler,
    this.project,
    this.disk,
    this.diskRootFile,
    this.completed,
    this.expired,
    this.agentSCOPES,
    this.overSteps,
    this.paused,
    this.running,
    this.failed,
    this.waiting,
    this.init,
    this.end
  });
}

class AgentKnowledgeConfig {
  final List<AgentKnowledgeItem>? list;

  AgentKnowledgeConfig({
    this.list
  });
}

class AgentKnowledgeItem {
  final int? id;

  AgentKnowledgeItem({
    this.id
  });
}

class AgentMemoryConfig {
  final MemoryProfile? profile;

  AgentMemoryConfig({
    this.profile
  });
}

class AgentMetadata {


  AgentMetadata({

  });
}

class AgentScope {


  AgentScope({

  });
}

class AgentToolConfig {
  final List<UseTool>? tools;

  AgentToolConfig({
    this.tools
  });
}

class Approximate {
  final String? city;
  final String? country;
  final String? region;
  final String? timezone;

  Approximate({
    this.city,
    this.country,
    this.region,
    this.timezone
  });
}

class AudioParameters {
  final String? voice;
  final String? format;

  AudioParameters({
    this.voice,
    this.format
  });
}

class AudioTranscriptionOptions {
  final String? model;

  AudioTranscriptionOptions({
    this.model
  });
}

class BucketObject {
  final String? name;
  final String? region;
  final String? creationDate;
  final String? arn;

  BucketObject({
    this.name,
    this.region,
    this.creationDate,
    this.arn
  });
}

class ChatCompletion {
  final String? id;
  final String? object;
  final int? created;
  final String? model;
  final List<ChatCompletionChoice>? choices;
  final CompletionUsage? usage;
  final ChatCompletionMetadata? metadata;
  final String? content;
  final PlusAgent? agent;
  final String? systemFingerprint;

  ChatCompletion({
    this.id,
    this.object,
    this.created,
    this.model,
    this.choices,
    this.usage,
    this.metadata,
    this.content,
    this.agent,
    this.systemFingerprint
  });
}

class ChatCompletionAudio {


  ChatCompletionAudio({

  });
}

class ChatCompletionChoice {
  final int? index;
  final ChatCompletionMessage? message;
  final LogProbInfo? logprobs;
  final String? finishReason;

  ChatCompletionChoice({
    this.index,
    this.message,
    this.logprobs,
    this.finishReason
  });
}

class ChatCompletionChunk {
  final String? id;
  final String? object;
  final int? created;
  final String? model;
  final List<ChatCompletionChunkChoice>? choices;
  final CompletionUsage? usage;
  final ChatCompletionMetadata? metadata;
  final String? content;
  final PlusAgent? agent;
  final String? reasoningContent;
  final String? systemFingerprint;

  ChatCompletionChunk({
    this.id,
    this.object,
    this.created,
    this.model,
    this.choices,
    this.usage,
    this.metadata,
    this.content,
    this.agent,
    this.reasoningContent,
    this.systemFingerprint
  });
}

class ChatCompletionChunkChoice {
  final int? index;
  final ChatCompletionChunkDelta? delta;
  final LogProbInfo? logprobs;
  final String? finishReason;

  ChatCompletionChunkChoice({
    this.index,
    this.delta,
    this.logprobs,
    this.finishReason
  });
}

class ChatCompletionChunkDelta {
  final String? role;
  final String? content;
  final ChatCompletionAudio? audio;
  final String? reasoningContent;
  final List<ChatCompletionMessageToolCall>? toolCalls;

  ChatCompletionChunkDelta({
    this.role,
    this.content,
    this.audio,
    this.reasoningContent,
    this.toolCalls
  });
}

class ChatCompletionMessage {
  final String? role;
  final String? content;
  final ChatCompletionAudio? audio;
  final List<ChatCompletionMessageToolCall>? toolCalls;

  ChatCompletionMessage({
    this.role,
    this.content,
    this.audio,
    this.toolCalls
  });
}

class ChatCompletionMessageToolCall {
  final String? id;
  final String? type;
  final FunctionCall? function;

  ChatCompletionMessageToolCall({
    this.id,
    this.type,
    this.function
  });
}

class ChatCompletionMetadata {
  final List<String>? actions;
  final Map<String, dynamic>? agent;
  final int? parentMessageId;
  final String? parentMessageUuid;

  ChatCompletionMetadata({
    this.actions,
    this.agent,
    this.parentMessageId,
    this.parentMessageUuid
  });
}

class ChatContext {
  final String? indent;
  final ChatResponseHandler? responseHandler;
  final ShardingContext? shardingContext;
  final String? conversationId;
  final String? conversationUuid;
  final int? userId;
  final int? knowledgeBaseId;
  final int? agentId;
  final int? flowId;
  final int? datasourceId;
  final int? parentMessageId;
  final bool? saveAudio;
  final List<String>? modalities;
  final PlusChatOptions? chatOptions;
  final List<String>? responseChannels;

  ChatContext({
    this.indent,
    this.responseHandler,
    this.shardingContext,
    this.conversationId,
    this.conversationUuid,
    this.userId,
    this.knowledgeBaseId,
    this.agentId,
    this.flowId,
    this.datasourceId,
    this.parentMessageId,
    this.saveAudio,
    this.modalities,
    this.chatOptions,
    this.responseChannels
  });
}

class ChatMessageListener {


  ChatMessageListener({

  });
}

class ChatOptions {
  final double? topP;
  final int? topK;
  final double? presencePenalty;
  final int? maxTokens;
  final List<String>? stopSequences;
  final double? frequencyPenalty;
  final String? model;
  final double? temperature;

  ChatOptions({
    this.topP,
    this.topK,
    this.presencePenalty,
    this.maxTokens,
    this.stopSequences,
    this.frequencyPenalty,
    this.model,
    this.temperature
  });
}

class ChatResponseHandler {


  ChatResponseHandler({

  });
}

class ChatState {
  final String? content;
  final String? reasoningContent;
  final bool? thinking;

  ChatState({
    this.content,
    this.reasoningContent,
    this.thinking
  });
}

class CompletionTokensDetails {
  final int? reasoningTokens;
  final int? audioTokens;
  final int? acceptedPredictionTokens;
  final int? rejectedPredictionTokens;

  CompletionTokensDetails({
    this.reasoningTokens,
    this.audioTokens,
    this.acceptedPredictionTokens,
    this.rejectedPredictionTokens
  });
}

class CompletionUsage {
  final int? promptTokens;
  final int? completionTokens;
  final int? totalTokens;
  final int? promptCacheHitTokens;
  final int? promptCacheMissTokens;
  final PromptTokensDetails? promptTokensDetails;
  final CompletionTokensDetails? completionTokensDetails;

  CompletionUsage({
    this.promptTokens,
    this.completionTokens,
    this.totalTokens,
    this.promptCacheHitTokens,
    this.promptCacheMissTokens,
    this.promptTokensDetails,
    this.completionTokensDetails
  });
}

class EdgeObject {
  final String? id;
  final String? name;
  final String? description;
  final String? sourceNodeId;
  final String? targetNodeId;
  final String? type;
  final dynamic? condition;

  EdgeObject({
    this.id,
    this.name,
    this.description,
    this.sourceNodeId,
    this.targetNodeId,
    this.type,
    this.condition
  });
}

class Flow {
  final String? id;
  final String? name;
  final String? description;
  final String? status;
  final List<Node>? nodes;
  final List<EdgeObject>? edges;
  final List<Flow>? subFlows;
  final int? parentId;
  final String? startTime;
  final String? endTime;
  final Flow? parentFlow;
  final List<PlusAgent>? allAgents;
  final Node? lastNode;

  Flow({
    this.id,
    this.name,
    this.description,
    this.status,
    this.nodes,
    this.edges,
    this.subFlows,
    this.parentId,
    this.startTime,
    this.endTime,
    this.parentFlow,
    this.allAgents,
    this.lastNode
  });
}

class Function {
  final String? description;
  final String? name;
  final Map<String, dynamic>? parameters;
  final bool? strict;

  Function({
    this.description,
    this.name,
    this.parameters,
    this.strict
  });
}

class FunctionCall {
  final String? name;
  final Map<String, dynamic>? arguments;

  FunctionCall({
    this.name,
    this.arguments
  });
}

class FunctionTool {
  final String? type;
  final Function? function;

  FunctionTool({
    this.type,
    this.function
  });
}

class GroupInfo {
  final String? id;
  final String? object;
  final int? created;
  final String? model;
  final String? systemFingerprint;
  final ChatCompletionMetadata? metadata;
  final PlusAgent? agent;

  GroupInfo({
    this.id,
    this.object,
    this.created,
    this.model,
    this.systemFingerprint,
    this.metadata,
    this.agent
  });
}

class IPlusChatMemory {
  final String? id;

  IPlusChatMemory({
    this.id
  });
}

class JsonSchema {
  final String? name;
  final Map<String, dynamic>? schema;
  final bool? strict;

  JsonSchema({
    this.name,
    this.schema,
    this.strict
  });
}

class LlmAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;
  final BucketObject? bucket;
  final int? maxTokens;
  final bool? toolCall;
  final bool? multimodal;
  final PlusChatOptions? options;

  LlmAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel,
    this.bucket,
    this.maxTokens,
    this.toolCall,
    this.multimodal,
    this.options
  });
}

class LogProbInfo {
  final List<String>? tokens;
  final List<double>? tokenLogprobs;
  final List<int>? textOffset;

  LogProbInfo({
    this.tokens,
    this.tokenLogprobs,
    this.textOffset
  });
}

class Media {
  final String? id;
  final MimeType? mimeType;
  final dynamic? data;
  final String? name;
  final String? dataAsByteArray;

  Media({
    this.id,
    this.mimeType,
    this.data,
    this.name,
    this.dataAsByteArray
  });
}

class MemoryProfile {
  final List<ProfileItem>? items;
  final Map<String, List<ProfileItem>>? customs;
  final String? description;

  MemoryProfile({
    this.items,
    this.customs,
    this.description
  });
}

class Message {
  final String? messageType;
  final String? text;
  final Map<String, dynamic>? metadata;

  Message({
    this.messageType,
    this.text,
    this.metadata
  });
}

class MessageBody {
  final String? id;
  final ChatCompletion? completion;
  final MsgPayload? payload;
  final ChatCompletionChunk? chunk;
  final AudioMediaResource? audioFrame;
  final Map<String, GroupInfo>? groupInfos;
  final Map<String, List<ChatCompletionChunk>>? groups;
  final int? thinkStart;
  final int? thinkEnd;
  final ChatState? state;

  MessageBody({
    this.id,
    this.completion,
    this.payload,
    this.chunk,
    this.audioFrame,
    this.groupInfos,
    this.groups,
    this.thinkStart,
    this.thinkEnd,
    this.state
  });
}

class MimeType {
  final String? type;
  final String? subtype;
  final Map<String, String>? parameters;
  final String? charset;
  final bool? concrete;
  final bool? wildcardSubtype;
  final bool? wildcardType;
  final String? subtypeSuffix;

  MimeType({
    this.type,
    this.subtype,
    this.parameters,
    this.charset,
    this.concrete,
    this.wildcardSubtype,
    this.wildcardType,
    this.subtypeSuffix
  });
}

class MsgAudioContent {
  final String? content;
  final AudioMediaResource? resource;

  MsgAudioContent({
    this.content,
    this.resource
  });
}

class MsgFileContent {
  final String? content;
  final FileMediaResource? resource;

  MsgFileContent({
    this.content,
    this.resource
  });
}

class MsgImageContent {
  final String? content;
  final ImageMediaResource? resource;

  MsgImageContent({
    this.content,
    this.resource
  });
}

class MsgLocationContent {
  final String? content;
  final GeoPoint? location;
  final String? address;
  final String? name;
  final double? radius;

  MsgLocationContent({
    this.content,
    this.location,
    this.address,
    this.name,
    this.radius
  });
}

class MsgMusicContent {
  final String? content;
  final MusicMediaResource? resource;
  final String? title;
  final String? artist;
  final String? album;
  final int? duration;

  MsgMusicContent({
    this.content,
    this.resource,
    this.title,
    this.artist,
    this.album,
    this.duration
  });
}

class MsgPayload {
  final MsgAudioContent? audio;
  final MsgFileContent? file;
  final MsgImageContent? image;
  final MsgLocationContent? location;
  final MsgMusicContent? music;
  final MsgTextContent? text;
  final MsgVideoContent? video;

  MsgPayload({
    this.audio,
    this.file,
    this.image,
    this.location,
    this.music,
    this.text,
    this.video
  });
}

class MsgTextContent {
  final String? content;

  MsgTextContent({
    this.content
  });
}

class MsgVideoContent {
  final String? content;
  final VideoMediaResource? resource;

  MsgVideoContent({
    this.content,
    this.resource
  });
}

class Node {
  final String? id;
  final String? name;
  final String? description;
  final String? type;
  final Map<String, dynamic>? properties;
  final String? startTime;
  final String? endTime;
  final List<PlusAgent>? agents;

  Node({
    this.id,
    this.name,
    this.description,
    this.type,
    this.properties,
    this.startTime,
    this.endTime,
    this.agents
  });
}

class PlusAgent {
  final String? name;
  final int? id;
  final AgentDefinition? definition;
  final String? uuid;
  final List<String>? nextActions;
  final IPlusChatMemory? chatMemory;
  final AgentExecutionContext? executionContext;
  final LlmAccountConfig? accountConfig;
  final ToolCallbackProvider? toolCallbackProvider;
  final PromptContextOptimizer? promptContextOptimizer;
  final String? promptPath;
  final String? description;
  final AgentMetadata? metadata;
  final String? faceURL;
  final Map<String, Prompt>? prompts;
  final Prompt? systemPrompt;
  final List<String>? instructions;
  final ChatOptions? chatOptions;
  final ChatContext? chatContext;
  final List<PromptToolDescription>? tools;

  PlusAgent({
    this.name,
    this.id,
    this.definition,
    this.uuid,
    this.nextActions,
    this.chatMemory,
    this.executionContext,
    this.accountConfig,
    this.toolCallbackProvider,
    this.promptContextOptimizer,
    this.promptPath,
    this.description,
    this.metadata,
    this.faceURL,
    this.prompts,
    this.systemPrompt,
    this.instructions,
    this.chatOptions,
    this.chatContext,
    this.tools
  });
}

class PlusAiAgentConfig {
  final String? welcome;
  final List<String>? questions;
  final bool? saveFiles;
  final bool? enableMemory;
  final int? maxHistoryMessages;
  final bool? useKnowledgeBase;
  final Map<String, dynamic>? properties;

  PlusAiAgentConfig({
    this.welcome,
    this.questions,
    this.saveFiles,
    this.enableMemory,
    this.maxHistoryMessages,
    this.useKnowledgeBase,
    this.properties
  });
}

class PlusChatMessageContentForm {
  final String? role;
  final String? type;
  final String? status;
  final int? conversationId;
  final String? conversationUuid;
  final int? agentId;
  final String? agentType;
  final String? agentBizType;
  final MessageBody? content;
  final Map<String, dynamic>? metadata;

  PlusChatMessageContentForm({
    this.role,
    this.type,
    this.status,
    this.conversationId,
    this.conversationUuid,
    this.agentId,
    this.agentType,
    this.agentBizType,
    this.content,
    this.metadata
  });
}

class PlusChatOptions {
  final bool? streamUsage;
  final String? model;
  final double? frequencyPenalty;
  final Map<String, int>? logitBias;
  final bool? logprobs;
  final int? topLogprobs;
  final int? maxTokens;
  final int? maxCompletionTokens;
  final int? n;
  final List<String>? modalities;
  final AudioParameters? audio;
  final double? presencePenalty;
  final ResponseFormat? responseFormat;
  final StreamOptions? streamOptions;
  final bool? stream;
  final int? seed;
  final List<String>? stop;
  final double? temperature;
  final double? topP;
  final List<FunctionTool>? tools;
  final dynamic? toolChoice;
  final String? user;
  final bool? parallelToolCalls;
  final bool? store;
  final Map<String, String>? metadata;
  final String? reasoningEffort;
  final String? verbosity;
  final WebSearchOptions? webSearchOptions;

  PlusChatOptions({
    this.streamUsage,
    this.model,
    this.frequencyPenalty,
    this.logitBias,
    this.logprobs,
    this.topLogprobs,
    this.maxTokens,
    this.maxCompletionTokens,
    this.n,
    this.modalities,
    this.audio,
    this.presencePenalty,
    this.responseFormat,
    this.streamOptions,
    this.stream,
    this.seed,
    this.stop,
    this.temperature,
    this.topP,
    this.tools,
    this.toolChoice,
    this.user,
    this.parallelToolCalls,
    this.store,
    this.metadata,
    this.reasoningEffort,
    this.verbosity,
    this.webSearchOptions
  });
}

class PlusDiskObject {
  final int? id;
  final String? uuid;
  final String? owner;
  final int? ownerId;
  final String? name;
  final String? type;
  final String? description;
  final int? diskSize;
  final int? usedSize;

  PlusDiskObject({
    this.id,
    this.uuid,
    this.owner,
    this.ownerId,
    this.name,
    this.type,
    this.description,
    this.diskSize,
    this.usedSize
  });
}

class PlusFileObject {
  final int? id;
  final String? uuid;
  final int? diskId;
  final String? name;
  final int? size;
  final String? path;
  final String? relativePath;
  final String? type;
  final String? extension;
  final String? lastModifiedTime;
  final String? createdAt;
  final String? versionId;
  final String? description;
  final String? projectUuid;
  final int? projectId;
  final String? owner;
  final int? ownerId;
  final String? author;
  final String? prompt;
  final String? content;
  final TagsContent? tags;
  final bool? readonly;
  final List<String>? permission;
  final int? referenceFileId;
  final List<PlusFileObject>? children;

  PlusFileObject({
    this.id,
    this.uuid,
    this.diskId,
    this.name,
    this.size,
    this.path,
    this.relativePath,
    this.type,
    this.extension,
    this.lastModifiedTime,
    this.createdAt,
    this.versionId,
    this.description,
    this.projectUuid,
    this.projectId,
    this.owner,
    this.ownerId,
    this.author,
    this.prompt,
    this.content,
    this.tags,
    this.readonly,
    this.permission,
    this.referenceFileId,
    this.children
  });
}

class PlusProjectObject {
  final String? name;
  final String? id;
  final String? type;
  final String? owner;
  final String? lastModifiedTime;
  final String? version;
  final List<PlusFileObject>? files;
  final String? uuid;
  final int? diskId;
  final String? author;
  final int? ownerId;
  final String? createdAt;
  final String? screenType;
  final String? description;
  final TagsContent? tags;
  final String? title;

  PlusProjectObject({
    this.name,
    this.id,
    this.type,
    this.owner,
    this.lastModifiedTime,
    this.version,
    this.files,
    this.uuid,
    this.diskId,
    this.author,
    this.ownerId,
    this.createdAt,
    this.screenType,
    this.description,
    this.tags,
    this.title
  });
}

class ProfileItem {
  final String? name;
  final String? label;
  final List<String>? values;
  final bool? custom;
  final int? updateCount;
  final List<String>? samples;
  final String? description;

  ProfileItem({
    this.name,
    this.label,
    this.values,
    this.custom,
    this.updateCount,
    this.samples,
    this.description
  });
}

class Prompt {
  final String? contents;
  final Message? lastUserOrToolResponseMessage;
  final List<SystemMessage>? systemMessages;
  final List<UserMessage>? userMessages;
  final UserMessage? userMessage;
  final SystemMessage? systemMessage;
  final ChatOptions? options;
  final List<Message>? instructions;

  Prompt({
    this.contents,
    this.lastUserOrToolResponseMessage,
    this.systemMessages,
    this.userMessages,
    this.userMessage,
    this.systemMessage,
    this.options,
    this.instructions
  });
}

class PromptContextOptimizer {


  PromptContextOptimizer({

  });
}

class PromptTokensDetails {
  final int? cachedTokens;
  final int? audioTokens;

  PromptTokensDetails({
    this.cachedTokens,
    this.audioTokens
  });
}

class PromptToolDescription {
  final String? id;
  final String? name;
  final String? description;

  PromptToolDescription({
    this.id,
    this.name,
    this.description
  });
}

class ResponseFormat {
  final String? type;
  final JsonSchema? jsonSchema;

  ResponseFormat({
    this.type,
    this.jsonSchema
  });
}

class ShardingContext {
  final String? platform;
  final String? owner;
  final String? shardingKey;
  final int? tenantId;
  final int? organizationId;
  final int? userId;

  ShardingContext({
    this.platform,
    this.owner,
    this.shardingKey,
    this.tenantId,
    this.organizationId,
    this.userId
  });
}

class SpeechConfig {
  final SpeechSpeakerConfig? speakerConfig;
  final SpeechTranscriptionConfig? transcriptionConfig;
  final VadConfig? vadConfig;
  final AecConfig? aecConfig;

  SpeechConfig({
    this.speakerConfig,
    this.transcriptionConfig,
    this.vadConfig,
    this.aecConfig
  });
}

class SpeechSpeakerConfig {
  final VoiceSpeakerInfo? speaker;
  final int? speakerId;
  final double? volume;
  final double? pitch;
  final String? language;
  final double? speed;
  final String? format;

  SpeechSpeakerConfig({
    this.speaker,
    this.speakerId,
    this.volume,
    this.pitch,
    this.language,
    this.speed,
    this.format
  });
}

class SpeechTranscriptionConfig {
  final String? channel;
  final String? product;
  final AudioTranscriptionOptions? options;

  SpeechTranscriptionConfig({
    this.channel,
    this.product,
    this.options
  });
}

class StreamOptions {
  final bool? includeUsage;
  final bool? chunkIncludeUsage;

  StreamOptions({
    this.includeUsage,
    this.chunkIncludeUsage
  });
}

class SystemMessage {
  final String? messageType;
  final Map<String, dynamic>? metadata;
  final String? text;

  SystemMessage({
    this.messageType,
    this.metadata,
    this.text
  });
}

class TeamAgentMembers {
  final int? id;
  final String? uuid;
  final String? type;
  final String? bizType;
  final String? description;
  final List<dynamic>? agents;

  TeamAgentMembers({
    this.id,
    this.uuid,
    this.type,
    this.bizType,
    this.description,
    this.agents
  });
}

class ToolCallback {
  final ToolDefinition? toolDefinition;
  final ToolMetadata? toolMetadata;

  ToolCallback({
    this.toolDefinition,
    this.toolMetadata
  });
}

class ToolCallbackProvider {
  final List<ToolCallback>? toolCallbacks;

  ToolCallbackProvider({
    this.toolCallbacks
  });
}

class ToolDefinition {


  ToolDefinition({

  });
}

class ToolMetadata {


  ToolMetadata({

  });
}

class UseTool {
  final int? id;
  final String? name;
  final String? description;
  final bool? enable;

  UseTool({
    this.id,
    this.name,
    this.description,
    this.enable
  });
}

class UserLocation {
  final String? type;
  final Approximate? approximate;

  UserLocation({
    this.type,
    this.approximate
  });
}

class UserMessage {
  final String? messageType;
  final Map<String, dynamic>? metadata;
  final List<Media>? media;
  final String? text;

  UserMessage({
    this.messageType,
    this.metadata,
    this.media,
    this.text
  });
}

class VadConfig {
  final double? speechThreshold;
  final int? minSpeechDurationMs;
  final int? minSilenceDurationMs;
  final int? maxSilenceDurationMs;
  final int? silenceTimeout;
  final int? speechTimeout;
  final int? windowSize;
  final int? stepSize;

  VadConfig({
    this.speechThreshold,
    this.minSpeechDurationMs,
    this.minSilenceDurationMs,
    this.maxSilenceDurationMs,
    this.silenceTimeout,
    this.speechTimeout,
    this.windowSize,
    this.stepSize
  });
}

class VoiceMotion {


  VoiceMotion({

  });
}

class VoiceSpeakerInfo {
  final String? channel;
  final String? provider;
  final String? product;
  final String? id;
  final List<String>? models;
  final String? speakerId;
  final String? displayName;
  final TagsContent? tags;
  final VoiceMotion? motion;
  final VoiceStyle? style;
  final String? description;

  VoiceSpeakerInfo({
    this.channel,
    this.provider,
    this.product,
    this.id,
    this.models,
    this.speakerId,
    this.displayName,
    this.tags,
    this.motion,
    this.style,
    this.description
  });
}

class VoiceStyle {


  VoiceStyle({

  });
}

class WebSearchOptions {
  final String? searchContextSize;
  final UserLocation? userLocation;

  WebSearchOptions({
    this.searchContextSize,
    this.userLocation
  });
}

class PlusApiResultPlusChatMessageContentVO {
  final PlusChatMessageContentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusChatMessageContentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusChatMessageContentVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? version;
  final String? role;
  final String? type;
  final String? status;
  final int? conversationId;
  final String? conversationUuid;
  final int? agentId;
  final String? agentType;
  final String? agentBizType;
  final MessageBody? content;
  final Map<String, dynamic>? metadata;

  PlusChatMessageContentVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.version,
    this.role,
    this.type,
    this.status,
    this.conversationId,
    this.conversationUuid,
    this.agentId,
    this.agentType,
    this.agentBizType,
    this.content,
    this.metadata
  });
}

class PlusMemberLevelForm {
  final int? cardId;
  final String? levelName;
  final int? requiredPoints;
  final String? description;
  final String? status;

  PlusMemberLevelForm({
    this.cardId,
    this.levelName,
    this.requiredPoints,
    this.description,
    this.status
  });
}

class PlusApiResultPlusMemberLevelVO {
  final PlusMemberLevelVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusMemberLevelVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusMemberLevelVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final int? cardId;
  final String? levelName;
  final int? requiredPoints;
  final String? description;
  final String? status;

  PlusMemberLevelVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.cardId,
    this.levelName,
    this.requiredPoints,
    this.description,
    this.status
  });
}

class PlusCard {
  final int? tenantId;
  final int? organizationId;
  final String? dataScope;
  final int? id;
  final String? uuid;
  final String? createdAt;
  final String? updatedAt;
  final int? v;
  final int? cardOrganizationId;
  final String? cardType;
  final String? codeType;
  final String? title;
  final String? brandName;
  final String? logoUrl;
  final String? notice;
  final String? description;
  final String? color;
  final int? quantity;
  final int? getLimit;
  final bool? canShare;
  final bool? canGiveFriend;
  final String? startTime;
  final String? endTime;
  final String? status;

  PlusCard({
    this.tenantId,
    this.organizationId,
    this.dataScope,
    this.id,
    this.uuid,
    this.createdAt,
    this.updatedAt,
    this.v,
    this.cardOrganizationId,
    this.cardType,
    this.codeType,
    this.title,
    this.brandName,
    this.logoUrl,
    this.notice,
    this.description,
    this.color,
    this.quantity,
    this.getLimit,
    this.canShare,
    this.canGiveFriend,
    this.startTime,
    this.endTime,
    this.status
  });
}

class PlusMemberCardForm {
  final PlusCard? card;
  final bool? supplyBonus;
  final bool? supplyBalance;
  final String? bonusName;
  final String? balanceName;
  final String? prerogative;
  final bool? autoActivate;
  final bool? wxActivate;
  final int? costMoneyUnit;
  final int? increaseBonus;
  final int? initIncreaseBonus;
  final int? maxIncreaseBonus;
  final int? costBonusUnit;
  final int? reduceMoney;
  final int? leastMoneyToUseBonus;
  final int? maxReduceBonus;

  PlusMemberCardForm({
    this.card,
    this.supplyBonus,
    this.supplyBalance,
    this.bonusName,
    this.balanceName,
    this.prerogative,
    this.autoActivate,
    this.wxActivate,
    this.costMoneyUnit,
    this.increaseBonus,
    this.initIncreaseBonus,
    this.maxIncreaseBonus,
    this.costBonusUnit,
    this.reduceMoney,
    this.leastMoneyToUseBonus,
    this.maxReduceBonus
  });
}

class PlusApiResultPlusMemberCardVO {
  final PlusMemberCardVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusMemberCardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusMemberCardVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? cardId;
  final bool? supplyBonus;
  final bool? supplyBalance;
  final String? bonusName;
  final String? balanceName;
  final String? prerogative;
  final bool? autoActivate;
  final bool? wxActivate;
  final int? costMoneyUnit;
  final int? increaseBonus;
  final int? initIncreaseBonus;
  final int? maxIncreaseBonus;
  final int? costBonusUnit;
  final int? reduceMoney;
  final int? leastMoneyToUseBonus;
  final int? maxReduceBonus;

  PlusMemberCardVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.cardId,
    this.supplyBonus,
    this.supplyBalance,
    this.bonusName,
    this.balanceName,
    this.prerogative,
    this.autoActivate,
    this.wxActivate,
    this.costMoneyUnit,
    this.increaseBonus,
    this.initIncreaseBonus,
    this.maxIncreaseBonus,
    this.costBonusUnit,
    this.reduceMoney,
    this.leastMoneyToUseBonus,
    this.maxReduceBonus
  });
}

class PlusKnowledgeBaseForm {
  final String? name;
  final String? description;

  PlusKnowledgeBaseForm({
    this.name,
    this.description
  });
}

class PlusApiResultPlusKnowledgeBaseVO {
  final PlusKnowledgeBaseVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusKnowledgeBaseVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusKnowledgeBaseVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;

  PlusKnowledgeBaseVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description
  });
}

class InvitationRelationForm {
  final int? inviterUserId;
  final int? inviteeUserId;
  final String? inviteCode;
  final String? usedTime;
  final int? relationLevel;
  final String? rewardStatus;
  final double? rewardAmount;
  final String? rewardType;

  InvitationRelationForm({
    this.inviterUserId,
    this.inviteeUserId,
    this.inviteCode,
    this.usedTime,
    this.relationLevel,
    this.rewardStatus,
    this.rewardAmount,
    this.rewardType
  });
}

class InvitationRelationVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? inviterUserId;
  final int? inviteeUserId;
  final String? inviteCode;
  final String? usedTime;
  final int? relationLevel;
  final String? rewardStatus;
  final double? rewardAmount;
  final String? rewardType;

  InvitationRelationVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.inviterUserId,
    this.inviteeUserId,
    this.inviteCode,
    this.usedTime,
    this.relationLevel,
    this.rewardStatus,
    this.rewardAmount,
    this.rewardType
  });
}

class PlusApiResultInvitationRelationVO {
  final InvitationRelationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultInvitationRelationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class InvitationCodeForm {
  final String? code;
  final int? creatorUserId;
  final String? status;
  final String? expireTime;
  final int? usageLimit;
  final int? usedCount;

  InvitationCodeForm({
    this.code,
    this.creatorUserId,
    this.status,
    this.expireTime,
    this.usageLimit,
    this.usedCount
  });
}

class InvitationCodeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? code;
  final int? creatorUserId;
  final String? status;
  final String? expireTime;
  final int? usageLimit;
  final int? usedCount;

  InvitationCodeVO({
    this.createdAt,
    this.updatedAt,
    this.code,
    this.creatorUserId,
    this.status,
    this.expireTime,
    this.usageLimit,
    this.usedCount
  });
}

class PlusApiResultInvitationCodeVO {
  final InvitationCodeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultInvitationCodeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusImageForm {
  final String? title;
  final String? description;
  final String? url;
  final String? aspectRatio;
  final int? width;
  final int? height;
  final int? fileSize;
  final String? format;
  final String? status;

  PlusImageForm({
    this.title,
    this.description,
    this.url,
    this.aspectRatio,
    this.width,
    this.height,
    this.fileSize,
    this.format,
    this.status
  });
}

class PlusApiResultPlusImageVO {
  final PlusImageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusImageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusImageVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? title;
  final String? description;
  final ImageMediaResource? resource;
  final AuthorInfo? author;
  final String? url;
  final String? aspectRatio;
  final int? width;
  final int? height;
  final int? fileSize;
  final String? format;
  final String? status;

  PlusImageVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.title,
    this.description,
    this.resource,
    this.author,
    this.url,
    this.aspectRatio,
    this.width,
    this.height,
    this.fileSize,
    this.format,
    this.status
  });
}

class PlusImGroupForm {
  final String? name;
  final String? description;
  final ImageMediaResource? avatar;
  final String? announcement;
  final int? memberCount;
  final int? maxMembers;
  final int? creatorId;
  final String? type;
  final String? status;
  final bool? allowMemberInvite;
  final bool? requireApproval;

  PlusImGroupForm({
    this.name,
    this.description,
    this.avatar,
    this.announcement,
    this.memberCount,
    this.maxMembers,
    this.creatorId,
    this.type,
    this.status,
    this.allowMemberInvite,
    this.requireApproval
  });
}

class PlusApiResultPlusImGroupVO {
  final PlusImGroupVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusImGroupVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusImGroupVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? name;
  final String? description;
  final ImageMediaResource? avatar;
  final String? announcement;
  final int? memberCount;
  final int? maxMembers;
  final int? creatorId;
  final String? type;
  final String? status;
  final bool? allowMemberInvite;
  final bool? requireApproval;

  PlusImGroupVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.name,
    this.description,
    this.avatar,
    this.announcement,
    this.memberCount,
    this.maxMembers,
    this.creatorId,
    this.type,
    this.status,
    this.allowMemberInvite,
    this.requireApproval
  });
}

class PlusAiGenerationForm {
  final int? userId;
  final String? requestId;
  final String? model;
  final String? channel;
  final String? type;
  final ImageMediaResourceList? coverImages;
  final AssetMediaResourceList? resourceList;
  final VideoStoryboard? storyboard;
  final AuthorInfo? author;
  final TagsContent? tags;
  final int? promptId;
  final String? channelTaskId;
  final String? channelTaskStatus;
  final String? taskCreatedTime;
  final String? taskUpdatedTime;
  final double? cost;
  final String? status;
  final String? requestTime;
  final String? responseTime;
  final int? usageRecordId;
  final int? conversationId;
  final int? messageId;

  PlusAiGenerationForm({
    this.userId,
    this.requestId,
    this.model,
    this.channel,
    this.type,
    this.coverImages,
    this.resourceList,
    this.storyboard,
    this.author,
    this.tags,
    this.promptId,
    this.channelTaskId,
    this.channelTaskStatus,
    this.taskCreatedTime,
    this.taskUpdatedTime,
    this.cost,
    this.status,
    this.requestTime,
    this.responseTime,
    this.usageRecordId,
    this.conversationId,
    this.messageId
  });
}

class VideoShotItem {
  final String? id;
  final String? uuid;
  final String? shotPrompt;
  final String? dialogue;
  final double? duration;
  final ImageMediaResource? startFrame;
  final ImageMediaResource? endFrame;
  final ImageMediaResource? image;
  final AssetMediaResourceList? resourceList;
  final String? emotion;
  final String? videoDescription;
  final VideoMediaResource? video;

  VideoShotItem({
    this.id,
    this.uuid,
    this.shotPrompt,
    this.dialogue,
    this.duration,
    this.startFrame,
    this.endFrame,
    this.image,
    this.resourceList,
    this.emotion,
    this.videoDescription,
    this.video
  });
}

class VideoStoryboard {
  final List<VideoShotItem>? shots;
  final VideoMediaResource? finalVideo;
  final AudioMediaResource? finalAudio;
  final String? title;
  final String? description;
  final String? style;
  final String? aspectRatio;
  final String? prompt;
  final double? duration;
  final VoiceSpeakerInfo? speaker;

  VideoStoryboard({
    this.shots,
    this.finalVideo,
    this.finalAudio,
    this.title,
    this.description,
    this.style,
    this.aspectRatio,
    this.prompt,
    this.duration,
    this.speaker
  });
}

class AudioEffectGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final String? description;
  final String? category;
  final int? duration;
  final int? sampleRate;
  final int? bitRate;
  final int? channels;
  final bool? loop;
  final double? fadeIn;
  final double? fadeOut;
  final int? referenceAssetCount;

  AudioEffectGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.description,
    this.category,
    this.duration,
    this.sampleRate,
    this.bitRate,
    this.channels,
    this.loop,
    this.fadeIn,
    this.fadeOut,
    this.referenceAssetCount
  });
}

class AudioGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final String? text;
  final String? voice;
  final int? voiceSpeakerId;
  final String? language;
  final double? speed;
  final double? pitch;
  final int? volume;
  final int? sampleRate;
  final int? bitRate;
  final int? channels;
  final String? emotion;
  final int? referenceAssetCount;

  AudioGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.text,
    this.voice,
    this.voiceSpeakerId,
    this.language,
    this.speed,
    this.pitch,
    this.volume,
    this.sampleRate,
    this.bitRate,
    this.channels,
    this.emotion,
    this.referenceAssetCount
  });
}

class BaseGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final int? referenceAssetCount;

  BaseGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.referenceAssetCount
  });
}

class CharacterGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final String? name;
  final String? description;
  final String? appearance;
  final String? personality;
  final String? background;
  final String? type;
  final String? style;
  final String? pose;
  final String? expression;
  final String? gender;
  final String? age;
  final String? clothing;
  final int? width;
  final int? height;
  final bool? hd;
  final bool? multiView;
  final int? referenceAssetCount;

  CharacterGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.name,
    this.description,
    this.appearance,
    this.personality,
    this.background,
    this.type,
    this.style,
    this.pose,
    this.expression,
    this.gender,
    this.age,
    this.clothing,
    this.width,
    this.height,
    this.hd,
    this.multiView,
    this.referenceAssetCount
  });
}

class GenerationInput {
  final String? type;
  final ImageGenerationInput? image;
  final VideoGenerationInput? video;
  final AudioGenerationInput? audio;
  final MusicGenerationInput? music;
  final CharacterGenerationInput? character;
  final VoiceSpeakerGenerationInput? voiceSpeaker;
  final AudioEffectGenerationInput? audioEffect;
  final BaseGenerationInput? input;
  final String? prompt;

  GenerationInput({
    this.type,
    this.image,
    this.video,
    this.audio,
    this.music,
    this.character,
    this.voiceSpeaker,
    this.audioEffect,
    this.input,
    this.prompt
  });
}

class GenerationOutput {
  final List<AssetMediaResource>? resources;
  final String? primaryUrl;
  final List<String>? urls;
  final int? durationMs;
  final int? tokenUsage;
  final double? cost;
  final String? modelVersion;
  final int? seed;
  final Map<String, dynamic>? metadata;
  final String? createdAt;
  final int? resourceCount;
  final AssetMediaResource? primaryResource;

  GenerationOutput({
    this.resources,
    this.primaryUrl,
    this.urls,
    this.durationMs,
    this.tokenUsage,
    this.cost,
    this.modelVersion,
    this.seed,
    this.metadata,
    this.createdAt,
    this.resourceCount,
    this.primaryResource
  });
}

class ImageGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final int? width;
  final int? height;
  final String? size;
  final String? quality;
  final String? style;
  final double? cfgScale;
  final int? steps;
  final String? sampler;
  final double? strength;
  final bool? safetyChecker;
  final String? aspectRatio;
  final int? referenceAssetCount;

  ImageGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.width,
    this.height,
    this.size,
    this.quality,
    this.style,
    this.cfgScale,
    this.steps,
    this.sampler,
    this.strength,
    this.safetyChecker,
    this.aspectRatio,
    this.referenceAssetCount
  });
}

class MusicGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final String? lyrics;
  final int? duration;
  final String? genre;
  final String? style;
  final int? tempo;
  final String? key;
  final String? timeSignature;
  final String? mood;
  final String? instruments;
  final bool? instrumental;
  final bool? hd;
  final int? referenceAssetCount;

  MusicGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.lyrics,
    this.duration,
    this.genre,
    this.style,
    this.tempo,
    this.key,
    this.timeSignature,
    this.mood,
    this.instruments,
    this.instrumental,
    this.hd,
    this.referenceAssetCount
  });
}

class PlusAiGenerationVO {
  final int? id;
  final String? uuid;
  final int? userId;
  final String? title;
  final String? requestId;
  final String? type;
  final String? model;
  final String? channel;
  final GenerationInput? inputParams;
  final GenerationOutput? outputResult;
  final String? status;
  final int? progress;
  final String? channelTaskId;
  final String? channelTaskStatus;
  final double? cost;
  final String? errorCode;
  final String? errorMessage;
  final int? retryCount;
  final int? maxRetry;
  final String? startedAt;
  final String? completedAt;
  final int? conversationId;
  final int? messageId;
  final int? parentId;
  final String? batchId;
  final String? createdAt;
  final String? updatedAt;

  PlusAiGenerationVO({
    this.id,
    this.uuid,
    this.userId,
    this.title,
    this.requestId,
    this.type,
    this.model,
    this.channel,
    this.inputParams,
    this.outputResult,
    this.status,
    this.progress,
    this.channelTaskId,
    this.channelTaskStatus,
    this.cost,
    this.errorCode,
    this.errorMessage,
    this.retryCount,
    this.maxRetry,
    this.startedAt,
    this.completedAt,
    this.conversationId,
    this.messageId,
    this.parentId,
    this.batchId,
    this.createdAt,
    this.updatedAt
  });
}

class PlusApiResultPlusAiGenerationVO {
  final PlusAiGenerationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusAiGenerationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VideoGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final int? width;
  final int? height;
  final int? duration;
  final int? fps;
  final String? style;
  final String? aspectRatio;
  final int? motionStrength;
  final String? cameraMotion;
  final bool? loop;
  final bool? hd;
  final bool? subtitle;
  final bool? textToVideo;
  final int? referenceAssetCount;

  VideoGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.width,
    this.height,
    this.duration,
    this.fps,
    this.style,
    this.aspectRatio,
    this.motionStrength,
    this.cameraMotion,
    this.loop,
    this.hd,
    this.subtitle,
    this.textToVideo,
    this.referenceAssetCount
  });
}

class VoiceSpeakerGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final String? text;
  final String? speakerName;
  final String? speakerId;
  final String? language;
  final double? speed;
  final double? pitch;
  final int? volume;
  final String? emotion;
  final bool? saveSpeaker;
  final bool? usingExistingSpeaker;
  final bool? voiceClone;
  final int? referenceAssetCount;

  VoiceSpeakerGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.text,
    this.speakerName,
    this.speakerId,
    this.language,
    this.speed,
    this.pitch,
    this.volume,
    this.emotion,
    this.saveSpeaker,
    this.usingExistingSpeaker,
    this.voiceClone,
    this.referenceAssetCount
  });
}

class PlusAiGenerationContentForm {
  final String? title;
  final String? description;
  final String? contentType;
  final int? contentId;
  final Map<String, dynamic>? metadata;
  final String? contentUrl;
  final int? fileSize;
  final String? contentFormat;

  PlusAiGenerationContentForm({
    this.title,
    this.description,
    this.contentType,
    this.contentId,
    this.metadata,
    this.contentUrl,
    this.fileSize,
    this.contentFormat
  });
}

class GenerationInputParams {
  final ImageGenerationInput? image;
  final VideoGenerationInput? video;
  final AudioGenerationInput? audio;
  final MusicGenerationInput? music;
  final VoiceSpeakerGenerationInput? voice;
  final CharacterGenerationInput? character;
  final AudioEffectGenerationInput? audioEffect;

  GenerationInputParams({
    this.image,
    this.video,
    this.audio,
    this.music,
    this.voice,
    this.character,
    this.audioEffect
  });
}

class PlusAiGenerationContentVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? version;
  final String? title;
  final String? description;
  final String? contentType;
  final int? contentId;
  final Map<String, dynamic>? metadata;
  final GenerationInputParams? inputParams;
  final GenerationOutput? output;
  final String? contentFormat;
  final String? contentUrl;
  final int? fileSize;

  PlusAiGenerationContentVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.version,
    this.title,
    this.description,
    this.contentType,
    this.contentId,
    this.metadata,
    this.inputParams,
    this.output,
    this.contentFormat,
    this.contentUrl,
    this.fileSize
  });
}

class PlusApiResultPlusAiGenerationContentVO {
  final PlusAiGenerationContentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusAiGenerationContentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusFileForm {
  final String? name;
  final String? path;
  final String? objectKey;
  final int? size;
  final String? contentType;
  final String? extension;
  final String? storageClass;
  final String? versionId;
  final FileMediaResource? resource;
  final String? uploadTime;
  final String? lastAccessTime;
  final String? description;
  final TagsContent? tags;
  final String? fileType;
  final String? fileCategory;
  final bool? isPublic;
  final String? status;
  final int? parentId;
  final String? etag;

  PlusFileForm({
    this.name,
    this.path,
    this.objectKey,
    this.size,
    this.contentType,
    this.extension,
    this.storageClass,
    this.versionId,
    this.resource,
    this.uploadTime,
    this.lastAccessTime,
    this.description,
    this.tags,
    this.fileType,
    this.fileCategory,
    this.isPublic,
    this.status,
    this.parentId,
    this.etag
  });
}

class FileContentObject {
  final String? text;
  final Map<String, String>? contents;

  FileContentObject({
    this.text,
    this.contents
  });
}

class FilePermission {
  final List<String>? permissions;
  final bool? readOnly;
  final List<String>? permissionSet;

  FilePermission({
    this.permissions,
    this.readOnly,
    this.permissionSet
  });
}

class PlusApiResultPlusFileVO {
  final PlusFileVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusFileVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusFileVO {
  final String? parentUuid;
  final PlusTreeParentMetadata? parentMetadata;
  final int? id;
  final int? parentId;
  final String? name;
  final String? path;
  final String? fullPath;
  final String? objectKey;
  final int? size;
  final String? contentType;
  final String? extension;
  final String? storageClass;
  final String? versionId;
  final FileMediaResource? resource;
  final String? url;
  final String? uploadTime;
  final String? lastAccessTime;
  final String? description;
  final TagsContent? tags;
  final String? fileType;
  final String? fileCategory;
  final FilePermission? permission;
  final bool? isPublic;
  final String? pinnedAt;
  final String? status;
  final FileContentObject? content;
  final String? etag;

  PlusFileVO({
    this.parentUuid,
    this.parentMetadata,
    this.id,
    this.parentId,
    this.name,
    this.path,
    this.fullPath,
    this.objectKey,
    this.size,
    this.contentType,
    this.extension,
    this.storageClass,
    this.versionId,
    this.resource,
    this.url,
    this.uploadTime,
    this.lastAccessTime,
    this.description,
    this.tags,
    this.fileType,
    this.fileCategory,
    this.permission,
    this.isPublic,
    this.pinnedAt,
    this.status,
    this.content,
    this.etag
  });
}

class PlusFilePartForm {
  final int? fileId;
  final int? chunkIndex;
  final int? chunkSize;
  final int? totalSize;
  final String? checksum;
  final int? status;
  final String? storagePath;

  PlusFilePartForm({
    this.fileId,
    this.chunkIndex,
    this.chunkSize,
    this.totalSize,
    this.checksum,
    this.status,
    this.storagePath
  });
}

class PlusApiResultPlusFilePartVO {
  final PlusFilePartVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusFilePartVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusFilePartVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? fileId;
  final int? chunkIndex;
  final int? chunkSize;
  final int? totalSize;
  final String? checksum;
  final int? status;
  final String? storagePath;

  PlusFilePartVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.fileId,
    this.chunkIndex,
    this.chunkSize,
    this.totalSize,
    this.checksum,
    this.status,
    this.storagePath
  });
}

class PlusFileContentForm {
  final int? fileId;
  final String? fileUuid;
  final String? prompt;
  final String? encoding;
  final FileContentObject? content;

  PlusFileContentForm({
    this.fileId,
    this.fileUuid,
    this.prompt,
    this.encoding,
    this.content
  });
}

class PlusApiResultPlusFileContentVO {
  final PlusFileContentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusFileContentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusFileContentVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? fileId;
  final String? fileUuid;
  final String? prompt;
  final String? encoding;
  final FileContentObject? content;

  PlusFileContentVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.fileId,
    this.fileUuid,
    this.prompt,
    this.encoding,
    this.content
  });
}

class PlusFeedsForm {
  final String? title;
  final String? summary;
  final String? contentType;
  final int? contentId;
  final ImageMediaResourceList? coverImages;
  final String? source;
  final String? publishTime;
  final TagsContent? tags;
  final String? status;
  final int? viewCount;
  final int? likeCount;
  final int? commentCount;

  PlusFeedsForm({
    this.title,
    this.summary,
    this.contentType,
    this.contentId,
    this.coverImages,
    this.source,
    this.publishTime,
    this.tags,
    this.status,
    this.viewCount,
    this.likeCount,
    this.commentCount
  });
}

class PlusApiResultPlusFeedsVO {
  final PlusFeedsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusFeedsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusFeedsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? userId;
  final String? title;
  final String? summary;
  final String? contentType;
  final int? contentId;
  final ImageMediaResourceList? coverImages;
  final AssetMediaResourceList? resourceList;
  final AuthorInfo? author;
  final String? source;
  final String? publishTime;
  final TagsContent? tags;
  final String? status;
  final int? viewCount;
  final int? likeCount;
  final int? commentCount;

  PlusFeedsVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.userId,
    this.title,
    this.summary,
    this.contentType,
    this.contentId,
    this.coverImages,
    this.resourceList,
    this.author,
    this.source,
    this.publishTime,
    this.tags,
    this.status,
    this.viewCount,
    this.likeCount,
    this.commentCount
  });
}

class PlusFeedbackForm {
  final int? userId;

  PlusFeedbackForm({
    this.userId
  });
}

class PlusApiResultPlusFeedbackVO {
  final PlusFeedbackVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusFeedbackVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusFeedbackVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? version;
  final int? userId;

  PlusFeedbackVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.version,
    this.userId
  });
}

class PlusFavoriteForm {
  final String? contentType;
  final int? contentId;
  final String? folderName;
  final String? remark;
  final int? sortWeight;
  final String? title;
  final ImageMediaResource? image;
  final bool? isPrivate;
  final String? status;

  PlusFavoriteForm({
    this.contentType,
    this.contentId,
    this.folderName,
    this.remark,
    this.sortWeight,
    this.title,
    this.image,
    this.isPrivate,
    this.status
  });
}

class PlusApiResultPlusFavoriteVO {
  final PlusFavoriteVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusFavoriteVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusFavoriteVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? contentType;
  final int? contentId;
  final int? folderId;
  final String? remark;
  final String? tags;
  final int? sortWeight;
  final String? title;
  final ImageMediaResource? image;
  final bool? isPrivate;
  final String? status;
  final int? viewCount;
  final String? lastViewedAt;

  PlusFavoriteVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.contentType,
    this.contentId,
    this.folderId,
    this.remark,
    this.tags,
    this.sortWeight,
    this.title,
    this.image,
    this.isPrivate,
    this.status,
    this.viewCount,
    this.lastViewedAt
  });
}

class PlusDiskForm {
  final String? name;
  final String? owner;
  final int? ownerId;
  final int? diskSize;
  final int? usedSize;
  final String? description;

  PlusDiskForm({
    this.name,
    this.owner,
    this.ownerId,
    this.diskSize,
    this.usedSize,
    this.description
  });
}

class PlusApiResultPlusDiskVO {
  final PlusDiskVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusDiskVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusDiskVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? name;
  final String? owner;
  final int? ownerId;
  final int? diskSize;
  final int? usedSize;
  final String? description;
  final int? remainingSize;
  final double? usageRate;

  PlusDiskVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.name,
    this.owner,
    this.ownerId,
    this.diskSize,
    this.usedSize,
    this.description,
    this.remainingSize,
    this.usageRate
  });
}

class DiskPermission {
  final List<String>? permissions;
  final List<String>? permissionSet;

  DiskPermission({
    this.permissions,
    this.permissionSet
  });
}

class PlusDiskMemberForm {
  final int? diskId;
  final int? userId;
  final DiskPermission? permission;
  final String? remark;
  final bool? isOwner;

  PlusDiskMemberForm({
    this.diskId,
    this.userId,
    this.permission,
    this.remark,
    this.isOwner
  });
}

class PlusApiResultPlusDiskMemberVO {
  final PlusDiskMemberVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusDiskMemberVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusDiskMemberVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? v;
  final int? diskId;
  final int? userId;
  final DiskPermission? permission;
  final String? remark;
  final bool? isOwner;

  PlusDiskMemberVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.v,
    this.diskId,
    this.userId,
    this.permission,
    this.remark,
    this.isOwner
  });
}

class DetailContent {
  final String? text;
  final Map<String, String>? contents;

  DetailContent({
    this.text,
    this.contents
  });
}

class PlusDetailForm {
  final String? contentType;
  final int? contentId;
  final DetailContent? content;

  PlusDetailForm({
    this.contentType,
    this.contentId,
    this.content
  });
}

class PlusApiResultPlusDetailVO {
  final PlusDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? contentType;
  final int? contentId;
  final DetailContent? content;
  final int? productId;
  final int? skuId;

  PlusDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.contentType,
    this.contentId,
    this.content,
    this.productId,
    this.skuId
  });
}

class PlusDepartmentForm {
  final String? name;
  final String? description;
  final String? owner;
  final int? ownerId;
  final String? code;
  final int? sortOrder;
  final bool? isActive;
  final int? parentId;

  PlusDepartmentForm({
    this.name,
    this.description,
    this.owner,
    this.ownerId,
    this.code,
    this.sortOrder,
    this.isActive,
    this.parentId
  });
}

class PlusApiResultPlusDepartmentVO {
  final PlusDepartmentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusDepartmentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusDepartmentVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? parentId;
  final String? name;
  final String? description;
  final String? owner;
  final int? ownerId;
  final String? code;
  final int? sortOrder;
  final bool? isActive;
  final int? organizationId;
  final List<int>? memberIds;

  PlusDepartmentVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.parentId,
    this.name,
    this.description,
    this.owner,
    this.ownerId,
    this.code,
    this.sortOrder,
    this.isActive,
    this.organizationId,
    this.memberIds
  });
}

class DatasourceConfig {
  final String? type;
  final String? host;
  final int? port;
  final String? database;
  final String? username;
  final String? password;
  final String? params;
  final PoolConfig? poolConfig;
  final String? driverClassName;
  final String? jdbcUrl;

  DatasourceConfig({
    this.type,
    this.host,
    this.port,
    this.database,
    this.username,
    this.password,
    this.params,
    this.poolConfig,
    this.driverClassName,
    this.jdbcUrl
  });
}

class PlusDatasourceForm {
  final String? name;
  final int? type;
  final int? status;
  final String? description;
  final DatasourceConfig? connectionConfig;
  final String? url;
  final String? owner;
  final String? lastConnectedAt;
  final int? connectionTimeout;
  final TagsContent? tags;
  final String? dbVersion;
  final int? securityLevel;
  final int? accessCount;
  final String? icon;
  final String? color;

  PlusDatasourceForm({
    this.name,
    this.type,
    this.status,
    this.description,
    this.connectionConfig,
    this.url,
    this.owner,
    this.lastConnectedAt,
    this.connectionTimeout,
    this.tags,
    this.dbVersion,
    this.securityLevel,
    this.accessCount,
    this.icon,
    this.color
  });
}

class PoolConfig {
  final int? minIdle;
  final int? maxPoolSize;
  final int? connectionTimeout;
  final int? idleTimeout;
  final int? maxLifetime;
  final bool? autoCommit;
  final String? connectionTestQuery;
  final String? poolName;

  PoolConfig({
    this.minIdle,
    this.maxPoolSize,
    this.connectionTimeout,
    this.idleTimeout,
    this.maxLifetime,
    this.autoCommit,
    this.connectionTestQuery,
    this.poolName
  });
}

class PlusApiResultPlusDatasourceVO {
  final PlusDatasourceVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusDatasourceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusDatasourceVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final int? type;
  final int? status;
  final String? description;
  final dynamic? connectionConfig;
  final String? url;
  final String? owner;
  final String? lastConnectedAt;
  final int? connectionTimeout;
  final TagsContent? tags;
  final String? dbVersion;
  final int? securityLevel;
  final int? accessCount;
  final String? icon;
  final String? color;
  final List<int>? schemaIds;

  PlusDatasourceVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.type,
    this.status,
    this.description,
    this.connectionConfig,
    this.url,
    this.owner,
    this.lastConnectedAt,
    this.connectionTimeout,
    this.tags,
    this.dbVersion,
    this.securityLevel,
    this.accessCount,
    this.icon,
    this.color,
    this.schemaIds
  });
}

class PlusCouponForm {
  final String? name;
  final String? type;
  final String? description;
  final int? amount;
  final double? discount;
  final int? minConsume;
  final String? startTime;
  final String? endTime;
  final int? total;
  final int? getLimit;
  final String? status;

  PlusCouponForm({
    this.name,
    this.type,
    this.description,
    this.amount,
    this.discount,
    this.minConsume,
    this.startTime,
    this.endTime,
    this.total,
    this.getLimit,
    this.status
  });
}

class PlusApiResultPlusCouponVO {
  final PlusCouponVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusCouponVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusCouponVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? type;
  final String? description;
  final int? amount;
  final double? discount;
  final int? minConsume;
  final String? startTime;
  final String? endTime;
  final int? total;
  final int? getLimit;
  final String? status;

  PlusCouponVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.type,
    this.description,
    this.amount,
    this.discount,
    this.minConsume,
    this.startTime,
    this.endTime,
    this.total,
    this.getLimit,
    this.status
  });
}

class PlusCouponTemplateForm {
  final String? name;
  final String? templateCode;
  final String? type;
  final String? description;
  final int? amount;
  final double? discount;
  final int? minConsume;
  final String? startTime;
  final String? endTime;
  final int? total;
  final int? getLimit;
  final String? status;
  final String? validityType;
  final int? validityDays;
  final bool? canShare;
  final int? scopeType;
  final String? scopeValue;

  PlusCouponTemplateForm({
    this.name,
    this.templateCode,
    this.type,
    this.description,
    this.amount,
    this.discount,
    this.minConsume,
    this.startTime,
    this.endTime,
    this.total,
    this.getLimit,
    this.status,
    this.validityType,
    this.validityDays,
    this.canShare,
    this.scopeType,
    this.scopeValue
  });
}

class PlusApiResultPlusCouponTemplateVO {
  final PlusCouponTemplateVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusCouponTemplateVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusCouponTemplateVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? templateCode;
  final String? type;
  final String? description;
  final int? amount;
  final double? discount;
  final int? minConsume;
  final String? startTime;
  final String? endTime;
  final int? total;
  final int? getLimit;
  final String? status;
  final String? validityType;
  final int? validityDays;
  final bool? canShare;
  final int? scopeType;
  final String? scopeValue;

  PlusCouponTemplateVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.templateCode,
    this.type,
    this.description,
    this.amount,
    this.discount,
    this.minConsume,
    this.startTime,
    this.endTime,
    this.total,
    this.getLimit,
    this.status,
    this.validityType,
    this.validityDays,
    this.canShare,
    this.scopeType,
    this.scopeValue
  });
}

class PlusConversationForm {
  final String? uuid;
  final String? title;
  final String? description;
  final int? userId;
  final String? status;
  final int? agentId;
  final String? summary;
  final int? lastMessageId;
  final int? messageCount;
  final TagsContent? tags;
  final String? systemContext;
  final String? userContext;
  final String? lastInteractionTime;
  final int? modelId;
  final String? model;
  final int? knowledgeBaseId;
  final int? dataSourceId;
  final PlusChatOptions? chatOptions;
  final bool? pinned;
  final int? sortOrder;

  PlusConversationForm({
    this.uuid,
    this.title,
    this.description,
    this.userId,
    this.status,
    this.agentId,
    this.summary,
    this.lastMessageId,
    this.messageCount,
    this.tags,
    this.systemContext,
    this.userContext,
    this.lastInteractionTime,
    this.modelId,
    this.model,
    this.knowledgeBaseId,
    this.dataSourceId,
    this.chatOptions,
    this.pinned,
    this.sortOrder
  });
}

class PlusApiResultPlusConversationVO {
  final PlusConversationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusConversationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusConversationVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? title;
  final String? type;
  final String? description;
  final int? userId;
  final String? status;
  final int? agentId;
  final String? agentType;
  final String? agentBizType;
  final String? scene;
  final String? summary;
  final int? lastMessageId;
  final int? messageCount;
  final int? unreadCount;
  final TagsContent? tags;
  final String? systemContext;
  final String? userContext;
  final String? lastInteractionTime;
  final int? modelId;
  final String? model;
  final int? knowledgeBaseId;
  final int? dataSourceId;
  final PlusChatOptions? chatOptions;
  final bool? pinned;
  final int? sortOrder;

  PlusConversationVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.title,
    this.type,
    this.description,
    this.userId,
    this.status,
    this.agentId,
    this.agentType,
    this.agentBizType,
    this.scene,
    this.summary,
    this.lastMessageId,
    this.messageCount,
    this.unreadCount,
    this.tags,
    this.systemContext,
    this.userContext,
    this.lastInteractionTime,
    this.modelId,
    this.model,
    this.knowledgeBaseId,
    this.dataSourceId,
    this.chatOptions,
    this.pinned,
    this.sortOrder
  });
}

class PlusCommentsForm {
  final String? content;
  final String? contentType;
  final int? contentId;
  final String? status;
  final int? rating;
  final int? likes;
  final int? replyCount;
  final bool? isTop;
  final String? ipAddress;
  final String? deviceInfo;
  final int? parentId;
  final String? parentUuid;
  final int? userId;
  final PlusTreeParentMetadata? parentMetadata;

  PlusCommentsForm({
    this.content,
    this.contentType,
    this.contentId,
    this.status,
    this.rating,
    this.likes,
    this.replyCount,
    this.isTop,
    this.ipAddress,
    this.deviceInfo,
    this.parentId,
    this.parentUuid,
    this.userId,
    this.parentMetadata
  });
}

class PlusApiResultPlusCommentsVO {
  final PlusCommentsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusCommentsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusCommentsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? parentId;
  final String? parentUuid;
  final int? userId;
  final String? content;
  final String? contentType;
  final int? contentId;
  final String? status;
  final int? likes;
  final int? replyCount;
  final bool? isTop;
  final String? ipAddress;
  final String? deviceInfo;
  final AuthorInfo? author;

  PlusCommentsVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.parentId,
    this.parentUuid,
    this.userId,
    this.content,
    this.contentType,
    this.contentId,
    this.status,
    this.likes,
    this.replyCount,
    this.isTop,
    this.ipAddress,
    this.deviceInfo,
    this.author
  });
}

class PlusColumnForm {
  final String? name;
  final String? description;
  final String? dataType;
  final String? columnType;
  final int? ordinalPosition;
  final bool? isNullable;
  final bool? isPrimaryKey;
  final bool? isAutoIncrement;
  final String? defaultValue;
  final String? comment;
  final String? characterSet;
  final String? collationRule;
  final int? tableId;

  PlusColumnForm({
    this.name,
    this.description,
    this.dataType,
    this.columnType,
    this.ordinalPosition,
    this.isNullable,
    this.isPrimaryKey,
    this.isAutoIncrement,
    this.defaultValue,
    this.comment,
    this.characterSet,
    this.collationRule,
    this.tableId
  });
}

class PlusApiResultPlusColumnVO {
  final PlusColumnVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusColumnVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusCollectionForm {
  final String? name;
  final String? description;
  final String? type;
  final int? contentId;

  PlusCollectionForm({
    this.name,
    this.description,
    this.type,
    this.contentId
  });
}

class PlusApiResultPlusCollectionVO {
  final PlusCollectionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusCollectionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusCollectionVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? name;
  final String? description;
  final String? type;
  final int? contentId;
  final String? coverImage;
  final bool? isPublic;
  final bool? isPinned;
  final int? sort;
  final int? itemCount;
  final int? viewCount;
  final int? favoriteCount;
  final String? lastUpdatedAt;
  final int? parentId;
  final List<int>? childrenIds;

  PlusCollectionVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.name,
    this.description,
    this.type,
    this.contentId,
    this.coverImage,
    this.isPublic,
    this.isPinned,
    this.sort,
    this.itemCount,
    this.viewCount,
    this.favoriteCount,
    this.lastUpdatedAt,
    this.parentId,
    this.childrenIds
  });
}

class PlusCollectionItemForm {
  final int? collectionId;
  final String? collectionUuid;
  final String? type;
  final String? contentType;
  final int? contentId;
  final String? contentUuid;
  final String? title;
  final String? description;
  final int? position;
  final bool? isPinned;
  final String? tags;
  final String? extraData;

  PlusCollectionItemForm({
    this.collectionId,
    this.collectionUuid,
    this.type,
    this.contentType,
    this.contentId,
    this.contentUuid,
    this.title,
    this.description,
    this.position,
    this.isPinned,
    this.tags,
    this.extraData
  });
}

class PlusApiResultPlusCollectionItemVO {
  final PlusCollectionItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusCollectionItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusCollectionItemVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? collectionId;
  final String? collectionUuid;
  final String? type;
  final String? contentType;
  final int? contentId;
  final String? contentUuid;
  final String? title;
  final String? description;
  final int? position;
  final bool? isPinned;
  final String? tags;
  final String? extraData;

  PlusCollectionItemVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.collectionId,
    this.collectionUuid,
    this.type,
    this.contentType,
    this.contentId,
    this.contentUuid,
    this.title,
    this.description,
    this.position,
    this.isPinned,
    this.tags,
    this.extraData
  });
}

class PlusChatMessageForm {
  final MessageBody? content;
  final String? role;
  final String? type;
  final String? status;
  final int? conversationId;
  final int? userId;
  final int? parentMessageId;
  final Map<String, dynamic>? metadata;
  final int? tokenCount;
  final int? processingTime;
  final bool? isError;
  final String? errorCode;
  final String? errorMessage;
  final int? modelId;
  final String? model;
  final double? temperature;
  final bool? usedRag;
  final PlusChatOptions? chatOptions;

  PlusChatMessageForm({
    this.content,
    this.role,
    this.type,
    this.status,
    this.conversationId,
    this.userId,
    this.parentMessageId,
    this.metadata,
    this.tokenCount,
    this.processingTime,
    this.isError,
    this.errorCode,
    this.errorMessage,
    this.modelId,
    this.model,
    this.temperature,
    this.usedRag,
    this.chatOptions
  });
}

class FeedbackMetadata {
  final String? rating;

  FeedbackMetadata({
    this.rating
  });
}

class PlusApiResultPlusChatMessageVO {
  final PlusChatMessageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusChatMessageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusChatMessageVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final MessageBody? body;
  final String? role;
  final String? type;
  final String? status;
  final int? conversationId;
  final String? conversationUuid;
  final int? userId;
  final int? senderId;
  final Participant? sender;
  final Participant? receiver;
  final int? receiverId;
  final int? groupId;
  final int? parentMessageId;
  final List<PlusChatMessageVO>? children;
  final Map<String, dynamic>? metadata;
  final int? tokenCount;
  final String? sendAt;
  final String? receiveAt;
  final String? readAt;
  final int? processingTime;
  final bool? isError;
  final String? errorCode;
  final String? errorMessage;
  final int? modelId;
  final String? model;
  final double? temperature;
  final bool? usedRag;
  final PlusChatOptions? chatOptions;
  final String? channelId;
  final int? agentId;
  final int? knowledgeBaseId;
  final int? datasourceId;
  final String? agentType;
  final String? agentBizType;
  final String? channelMsgId;
  final String? channelClientMsgId;
  final int? channelMsgSeq;
  final String? conversationType;
  final FeedbackMetadata? feedbackMetadata;

  PlusChatMessageVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.body,
    this.role,
    this.type,
    this.status,
    this.conversationId,
    this.conversationUuid,
    this.userId,
    this.senderId,
    this.sender,
    this.receiver,
    this.receiverId,
    this.groupId,
    this.parentMessageId,
    this.children,
    this.metadata,
    this.tokenCount,
    this.sendAt,
    this.receiveAt,
    this.readAt,
    this.processingTime,
    this.isError,
    this.errorCode,
    this.errorMessage,
    this.modelId,
    this.model,
    this.temperature,
    this.usedRag,
    this.chatOptions,
    this.channelId,
    this.agentId,
    this.knowledgeBaseId,
    this.datasourceId,
    this.agentType,
    this.agentBizType,
    this.channelMsgId,
    this.channelClientMsgId,
    this.channelMsgSeq,
    this.conversationType,
    this.feedbackMetadata
  });
}

class PlusCharacterForm {
  final String? name;
  final String? type;
  final ImageMediaResource? avatar;
  final ImageMediaResource? threeViewImage;
  final ImageMediaResource? gridShotsImage;
  final VideoMediaResource? avatarVideo;
  final int? agentId;
  final String? description;
  final String? status;
  final String? personality;
  final String? background;
  final String? interactionSettings;
  final String? version;
  final int? userId;

  PlusCharacterForm({
    this.name,
    this.type,
    this.avatar,
    this.threeViewImage,
    this.gridShotsImage,
    this.avatarVideo,
    this.agentId,
    this.description,
    this.status,
    this.personality,
    this.background,
    this.interactionSettings,
    this.version,
    this.userId
  });
}

class PlusApiResultPlusCharacterVO {
  final PlusCharacterVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusCharacterVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusCharacterVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? name;
  final String? type;
  final ImageMediaResource? avatar;
  final ImageMediaResource? threeViewImage;
  final ImageMediaResource? gridShotsImage;
  final VideoMediaResource? avatarVideo;
  final int? agentId;
  final String? description;
  final String? status;
  final String? personality;
  final String? background;
  final String? interactionSettings;
  final String? version;
  final int? userId;

  PlusCharacterVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.name,
    this.type,
    this.avatar,
    this.threeViewImage,
    this.gridShotsImage,
    this.avatarVideo,
    this.agentId,
    this.description,
    this.status,
    this.personality,
    this.background,
    this.interactionSettings,
    this.version,
    this.userId
  });
}

class PlusChannelResourceForm {
  final String? resource;
  final String? channel;
  final int? channelAccountId;

  PlusChannelResourceForm({
    this.resource,
    this.channel,
    this.channelAccountId
  });
}

class PlusApiResultPlusChannelResourceVO {
  final PlusChannelResourceVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusChannelResourceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusChannelResourceVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? resource;
  final String? channel;
  final int? channelAccountId;

  PlusChannelResourceVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.resource,
    this.channel,
    this.channelAccountId
  });
}

class AgentAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;
  final String? version;
  final String? agentType;

  AgentAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel,
    this.version,
    this.agentType
  });
}

class ApiKeyAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;

  ApiKeyAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl
  });
}

class AppStoreAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;
  final String? storeType;
  final String? developerId;

  AppStoreAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel,
    this.storeType,
    this.developerId
  });
}

class AudioAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? appId;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;
  final String? defaultVoice;

  AudioAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.appId,
    this.accessKey,
    this.secretKey,
    this.defaultModel,
    this.defaultVoice
  });
}

class ChannelConfigInfo {
  final String? uuid;
  final List<ModelConfig>? accounts;

  ChannelConfigInfo({
    this.uuid,
    this.accounts
  });
}

class ChannelResourceInfo {
  final List<ChannelResourceItem>? items;

  ChannelResourceInfo({
    this.items
  });
}

class ChannelResourceItem {
  final String? type;
  final List<String>? functions;

  ChannelResourceItem({
    this.type,
    this.functions
  });
}

class CloudAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? baseUrl;
  final String? appId;
  final String? accessKey;
  final String? secretKey;
  final String? signName;
  final String? senderId;

  CloudAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.baseUrl,
    this.appId,
    this.accessKey,
    this.secretKey,
    this.signName,
    this.senderId
  });
}

class DatasourceAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;

  DatasourceAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel
  });
}

class EmbeddingAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? defaultModel;
  final int? dimension;
  final PlusChatOptions? options;

  EmbeddingAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.defaultModel,
    this.dimension,
    this.options
  });
}

class FilesAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;
  final String? bucketName;

  FilesAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel,
    this.bucketName
  });
}

class ImAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? baseUrl;
  final String? appId;
  final String? accessKey;
  final String? secretKey;
  final String? signName;
  final String? senderId;

  ImAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.baseUrl,
    this.appId,
    this.accessKey,
    this.secretKey,
    this.signName,
    this.senderId
  });
}

class ImageAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;

  ImageAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel
  });
}

class IotAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final List<IotTransportConfig>? transports;
  final String? firmwareDownloadUrl;
  final String? otaUpgradeUrl;
  final String? deviceRegistryUrl;
  final String? certificatePath;
  final String? privateKeyPath;
  final String? caCertificatePath;
  final int? reportingInterval;
  final int? maxRetryAttempts;
  final int? retryInterval;

  IotAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.transports,
    this.firmwareDownloadUrl,
    this.otaUpgradeUrl,
    this.deviceRegistryUrl,
    this.certificatePath,
    this.privateKeyPath,
    this.caCertificatePath,
    this.reportingInterval,
    this.maxRetryAttempts,
    this.retryInterval
  });
}

class IotTransportConfig {
  final String? type;
  final String? url;
  final int? connectionTimeout;
  final int? keepAliveInterval;
  final int? qos;
  final String? clientId;
  final String? authToken;
  final String? username;
  final String? password;
  final bool? sslEnabled;
  final bool? cleanSession;
  final String? willTopic;
  final String? willMessage;
  final int? willQos;
  final bool? willRetain;
  final List<String>? publishTopics;
  final List<String>? subscribeTopics;

  IotTransportConfig({
    this.type,
    this.url,
    this.connectionTimeout,
    this.keepAliveInterval,
    this.qos,
    this.clientId,
    this.authToken,
    this.username,
    this.password,
    this.sslEnabled,
    this.cleanSession,
    this.willTopic,
    this.willMessage,
    this.willQos,
    this.willRetain,
    this.publishTopics,
    this.subscribeTopics
  });
}

class KnowledgeAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;

  KnowledgeAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel
  });
}

class MemoryAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;

  MemoryAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel
  });
}

class MiniProgramAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? appId;
  final String? secret;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;

  MiniProgramAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.appId,
    this.secret,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel
  });
}

class ModelConfig {
  final int? id;
  final String? uuid;
  final int? weight;
  final String? channel;
  final String? product;
  final AgentAccountConfig? agent;
  final AppStoreAccountConfig? appStore;
  final ApiKeyAccountConfig? apikey;
  final AudioAccountConfig? audio;
  final CloudAccountConfig? cloud;
  final DatasourceAccountConfig? datasource;
  final EmbeddingAccountConfig? embedding;
  final FilesAccountConfig? files;
  final ImAccountConfig? im;
  final ImageAccountConfig? image;
  final IotAccountConfig? iot;
  final KnowledgeAccountConfig? knowledge;
  final LlmAccountConfig? llm;
  final MemoryAccountConfig? memory;
  final ModerationAccountConfig? moderation;
  final MusicAccountConfig? music;
  final MiniProgramAccountConfig? miniProgram;
  final NewsAccountConfig? news;
  final OcrAccountConfig? ocr;
  final OfficialAccountConfig? official;
  final OssAccountConfig? oss;
  final PayAccountConfig? pay;
  final RtcAccountConfig? rtc;
  final SearchAccountConfig? search;
  final SmsAccountConfig? sms;
  final ToolAccountConfig? tool;
  final VectorAccountConfig? vector;
  final VideoAccountConfig? video;
  final AudioAccountConfig? voice;
  final ChannelResourceInfo? resources;
  final Map<String, dynamic>? properties;
  final OAuthAccountConfig? oauth;

  ModelConfig({
    this.id,
    this.uuid,
    this.weight,
    this.channel,
    this.product,
    this.agent,
    this.appStore,
    this.apikey,
    this.audio,
    this.cloud,
    this.datasource,
    this.embedding,
    this.files,
    this.im,
    this.image,
    this.iot,
    this.knowledge,
    this.llm,
    this.memory,
    this.moderation,
    this.music,
    this.miniProgram,
    this.news,
    this.ocr,
    this.official,
    this.oss,
    this.pay,
    this.rtc,
    this.search,
    this.sms,
    this.tool,
    this.vector,
    this.video,
    this.voice,
    this.resources,
    this.properties,
    this.oauth
  });
}

class ModerationAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;
  final String? moderationType;
  final String? severityLevel;

  ModerationAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel,
    this.moderationType,
    this.severityLevel
  });
}

class MusicAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;

  MusicAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel
  });
}

class NewsAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;
  final String? newsSource;
  final String? language;

  NewsAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel,
    this.newsSource,
    this.language
  });
}

class OAuthAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? authProvider;
  final String? appId;
  final String? appSecret;
  final String? token;
  final String? redirectUri;
  final String? scope;
  final bool? isServiceAccount;
  final String? teamId;
  final String? keyId;
  final String? privateKey;
  final String? publicKey;
  final String? encodingAESKey;

  OAuthAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.authProvider,
    this.appId,
    this.appSecret,
    this.token,
    this.redirectUri,
    this.scope,
    this.isServiceAccount,
    this.teamId,
    this.keyId,
    this.privateKey,
    this.publicKey,
    this.encodingAESKey
  });
}

class OcrAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;
  final String? ocrEngine;
  final String? language;

  OcrAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel,
    this.ocrEngine,
    this.language
  });
}

class OfficialAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? authProvider;
  final String? appId;
  final String? appSecret;
  final String? token;
  final String? redirectUri;
  final String? scope;
  final bool? isServiceAccount;
  final String? teamId;
  final String? keyId;
  final String? privateKey;
  final String? publicKey;
  final String? secret;
  final String? aesKey;
  final String? qrCodeUrl;
  final String? originalId;
  final String? notifyUrl;
  final bool? securityModeEnabled;
  final String? accessToken;
  final int? accessTokenExpiresIn;
  final int? accessTokenFetchTime;
  final bool? jsSdkEnabled;
  final String? jsApiDomain;
  final String? encodingAESKey;

  OfficialAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.authProvider,
    this.appId,
    this.appSecret,
    this.token,
    this.redirectUri,
    this.scope,
    this.isServiceAccount,
    this.teamId,
    this.keyId,
    this.privateKey,
    this.publicKey,
    this.secret,
    this.aesKey,
    this.qrCodeUrl,
    this.originalId,
    this.notifyUrl,
    this.securityModeEnabled,
    this.accessToken,
    this.accessTokenExpiresIn,
    this.accessTokenFetchTime,
    this.jsSdkEnabled,
    this.jsApiDomain,
    this.encodingAESKey
  });
}

class OssAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? baseUrl;
  final String? appId;
  final String? accessKey;
  final String? secretKey;
  final String? signName;
  final String? senderId;

  OssAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.baseUrl,
    this.appId,
    this.accessKey,
    this.secretKey,
    this.signName,
    this.senderId
  });
}

class PayAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? merchantId;
  final String? appId;
  final String? privateKey;
  final String? publicKey;
  final String? secretKey;
  final String? notifyUrl;
  final String? returnUrl;
  final String? gatewayUrl;
  final String? payType;

  PayAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.merchantId,
    this.appId,
    this.privateKey,
    this.publicKey,
    this.secretKey,
    this.notifyUrl,
    this.returnUrl,
    this.gatewayUrl,
    this.payType
  });
}

class PlusChannelAccountForm {
  final String? name;
  final String? channel;
  final ChannelConfigInfo? configs;
  final String? status;
  final String? description;

  PlusChannelAccountForm({
    this.name,
    this.channel,
    this.configs,
    this.status,
    this.description
  });
}

class RtcAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? baseUrl;
  final String? appId;
  final String? accessKey;
  final String? secretKey;
  final String? signName;
  final String? senderId;

  RtcAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.baseUrl,
    this.appId,
    this.accessKey,
    this.secretKey,
    this.signName,
    this.senderId
  });
}

class SearchAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;

  SearchAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel
  });
}

class SmsAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? baseUrl;
  final String? appId;
  final String? accessKey;
  final String? secretKey;
  final String? signName;
  final String? senderId;

  SmsAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.baseUrl,
    this.appId,
    this.accessKey,
    this.secretKey,
    this.signName,
    this.senderId
  });
}

class ToolAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;
  final String? toolType;
  final String? version;

  ToolAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel,
    this.toolType,
    this.version
  });
}

class VectorAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final int? dimension;
  final String? indexType;
  final String? indexName;
  final int? embeddingConfigId;
  final String? databaseName;
  final String? collectionName;
  final EmbeddingAccountConfig? embeddingConfig;

  VectorAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.dimension,
    this.indexType,
    this.indexName,
    this.embeddingConfigId,
    this.databaseName,
    this.collectionName,
    this.embeddingConfig
  });
}

class VideoAccountConfig {
  final int? id;
  final String? uuid;
  final String? region;
  final int? weight;
  final String? channel;
  final String? product;
  final List<String>? functions;
  final AccountConfigMetadata? metadata;
  final Map<String, dynamic>? properties;
  final String? apiKey;
  final String? baseUrl;
  final String? accessKey;
  final String? secretKey;
  final String? defaultModel;

  VideoAccountConfig({
    this.id,
    this.uuid,
    this.region,
    this.weight,
    this.channel,
    this.product,
    this.functions,
    this.metadata,
    this.properties,
    this.apiKey,
    this.baseUrl,
    this.accessKey,
    this.secretKey,
    this.defaultModel
  });
}

class PlusApiResultPlusChannelAccountVO {
  final PlusChannelAccountVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusChannelAccountVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusChannelAccountVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? userId;
  final String? name;
  final String? channel;
  final ChannelConfigInfo? configs;
  final String? status;
  final String? description;

  PlusChannelAccountVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.userId,
    this.name,
    this.channel,
    this.configs,
    this.status,
    this.description
  });
}

class PlusCategoryForm {
  final String? name;
  final String? description;
  final String? type;
  final String? icon;
  final int? sortWeight;
  final int? parentId;
  final List<String>? path;
  final int? visible;
  final String? status;

  PlusCategoryForm({
    this.name,
    this.description,
    this.type,
    this.icon,
    this.sortWeight,
    this.parentId,
    this.path,
    this.visible,
    this.status
  });
}

class PlusApiResultPlusCategoryVO {
  final PlusCategoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusCategoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusCategoryVO {
  final String? parentUuid;
  final PlusTreeParentMetadata? parentMetadata;
  final int? id;
  final String? uuid;
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? description;
  final String? type;
  final String? icon;
  final int? sortWeight;
  final int? parentId;
  final List<String>? path;
  final int? visible;
  final String? status;
  final List<PlusCategoryVO>? children;
  final TagsContent? tags;
  final List<int>? attributeIds;

  PlusCategoryVO({
    this.parentUuid,
    this.parentMetadata,
    this.id,
    this.uuid,
    this.createdAt,
    this.updatedAt,
    this.name,
    this.description,
    this.type,
    this.icon,
    this.sortWeight,
    this.parentId,
    this.path,
    this.visible,
    this.status,
    this.children,
    this.tags,
    this.attributeIds
  });
}

class PlusCardForm {
  final int? cardOrganizationId;
  final String? cardType;
  final String? codeType;
  final String? title;
  final String? brandName;
  final String? logoUrl;
  final String? notice;
  final String? description;
  final String? color;
  final int? quantity;
  final int? getLimit;
  final bool? canShare;
  final bool? canGiveFriend;
  final String? startTime;
  final String? endTime;
  final String? status;

  PlusCardForm({
    this.cardOrganizationId,
    this.cardType,
    this.codeType,
    this.title,
    this.brandName,
    this.logoUrl,
    this.notice,
    this.description,
    this.color,
    this.quantity,
    this.getLimit,
    this.canShare,
    this.canGiveFriend,
    this.startTime,
    this.endTime,
    this.status
  });
}

class PlusApiResultPlusCardVO {
  final PlusCardVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusCardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusCardVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final int? cardOrganizationId;
  final String? cardType;
  final String? codeType;
  final String? title;
  final String? brandName;
  final String? logoUrl;
  final String? notice;
  final String? description;
  final String? color;
  final int? quantity;
  final int? getLimit;
  final bool? canShare;
  final bool? canGiveFriend;
  final String? startTime;
  final String? endTime;
  final String? status;

  PlusCardVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.cardOrganizationId,
    this.cardType,
    this.codeType,
    this.title,
    this.brandName,
    this.logoUrl,
    this.notice,
    this.description,
    this.color,
    this.quantity,
    this.getLimit,
    this.canShare,
    this.canGiveFriend,
    this.startTime,
    this.endTime,
    this.status
  });
}

class PlusCardTemplateForm {
  final String? name;
  final String? templateCode;
  final String? cardType;
  final String? codeType;
  final String? title;
  final String? description;
  final String? brandName;
  final String? logoUrl;
  final String? notice;
  final String? color;
  final int? quantity;
  final int? getLimit;
  final bool? canShare;
  final bool? canGiveFriend;
  final double? minimumBalance;
  final double? initialBalance;
  final double? discountRate;
  final String? validityType;
  final String? startTime;
  final String? endTime;
  final int? validityDays;
  final bool? isDeleted;

  PlusCardTemplateForm({
    this.name,
    this.templateCode,
    this.cardType,
    this.codeType,
    this.title,
    this.description,
    this.brandName,
    this.logoUrl,
    this.notice,
    this.color,
    this.quantity,
    this.getLimit,
    this.canShare,
    this.canGiveFriend,
    this.minimumBalance,
    this.initialBalance,
    this.discountRate,
    this.validityType,
    this.startTime,
    this.endTime,
    this.validityDays,
    this.isDeleted
  });
}

class PlusApiResultPlusCardTemplateVO {
  final PlusCardTemplateVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusCardTemplateVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusCardTemplateVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? templateCode;
  final String? cardType;
  final String? codeType;
  final String? title;
  final String? description;
  final String? brandName;
  final String? logoUrl;
  final String? notice;
  final String? color;
  final int? quantity;
  final int? getLimit;
  final bool? canShare;
  final bool? canGiveFriend;
  final double? minimumBalance;
  final double? initialBalance;
  final double? discountRate;
  final String? validityType;
  final String? startTime;
  final String? endTime;
  final int? validityDays;
  final bool? isDeleted;

  PlusCardTemplateVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.templateCode,
    this.cardType,
    this.codeType,
    this.title,
    this.description,
    this.brandName,
    this.logoUrl,
    this.notice,
    this.color,
    this.quantity,
    this.getLimit,
    this.canShare,
    this.canGiveFriend,
    this.minimumBalance,
    this.initialBalance,
    this.discountRate,
    this.validityType,
    this.startTime,
    this.endTime,
    this.validityDays,
    this.isDeleted
  });
}

class PlusAttributeForm {
  final String? name;
  final String? code;
  final String? description;
  final String? type;
  final String? contentType;
  final int? contentId;
  final int? categoryId;
  final String? attributeValue;
  final int? sortWeight;
  final int? required;
  final String? status;

  PlusAttributeForm({
    this.name,
    this.code,
    this.description,
    this.type,
    this.contentType,
    this.contentId,
    this.categoryId,
    this.attributeValue,
    this.sortWeight,
    this.required,
    this.status
  });
}

class PlusApiResultPlusAttributeVO {
  final PlusAttributeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusAttributeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusAttributeVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? version;
  final String? name;
  final String? code;
  final String? description;
  final String? type;
  final String? contentType;
  final int? contentId;
  final int? categoryId;
  final String? attributeValue;
  final int? sortWeight;
  final int? required;
  final String? status;

  PlusAttributeVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.version,
    this.name,
    this.code,
    this.description,
    this.type,
    this.contentType,
    this.contentId,
    this.categoryId,
    this.attributeValue,
    this.sortWeight,
    this.required,
    this.status
  });
}

class PlusArticleForm {
  final String? title;
  final String? subtitle;
  final String? content;
  final int? wordCount;
  final int? readingTime;
  final ImageMediaResourceList? coverImages;
  final AuthorInfo? author;
  final String? source;
  final String? status;
  final List<String>? keywords;
  final String? summary;

  PlusArticleForm({
    this.title,
    this.subtitle,
    this.content,
    this.wordCount,
    this.readingTime,
    this.coverImages,
    this.author,
    this.source,
    this.status,
    this.keywords,
    this.summary
  });
}

class PlusApiResultPlusArticleVO {
  final PlusArticleVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusArticleVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusArticleVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? title;
  final String? subtitle;
  final String? content;
  final int? wordCount;
  final int? readingTime;
  final ImageMediaResourceList? coverImages;
  final AuthorInfo? author;
  final String? source;
  final String? status;
  final List<String>? keywords;
  final String? summary;

  PlusArticleVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.title,
    this.subtitle,
    this.content,
    this.wordCount,
    this.readingTime,
    this.coverImages,
    this.author,
    this.source,
    this.status,
    this.keywords,
    this.summary
  });
}

class AppConfig {
  final OfficialAccountConfig? officialAccount;

  AppConfig({
    this.officialAccount
  });
}

class AppPlatforms {
  final List<String>? platforms;

  AppPlatforms({
    this.platforms
  });
}

class PlusAppForm {
  final String? name;
  final ImageMediaResource? icon;
  final AssetMediaResourceList? resourceList;
  final int? projectId;
  final String? description;
  final String? version;
  final String? iconUrl;
  final String? accessUrl;
  final AppConfig? config;
  final String? status;
  final String? appType;
  final AppPlatforms? platforms;
  final String? packageName;
  final String? bundleId;
  final String? storeUrl;
  final String? downloadUrl;

  PlusAppForm({
    this.name,
    this.icon,
    this.resourceList,
    this.projectId,
    this.description,
    this.version,
    this.iconUrl,
    this.accessUrl,
    this.config,
    this.status,
    this.appType,
    this.platforms,
    this.packageName,
    this.bundleId,
    this.storeUrl,
    this.downloadUrl
  });
}

class PlusApiResultPlusAppVO {
  final PlusAppVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusAppVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusAppVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final ImageMediaResource? icon;
  final AssetMediaResourceList? resourceList;
  final int? projectId;
  final String? description;
  final String? version;
  final String? iconUrl;
  final String? accessUrl;
  final AppConfig? config;
  final String? status;
  final String? appType;
  final AppPlatforms? platforms;
  final String? packageName;
  final String? bundleId;
  final String? storeUrl;
  final String? downloadUrl;

  PlusAppVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.icon,
    this.resourceList,
    this.projectId,
    this.description,
    this.version,
    this.iconUrl,
    this.accessUrl,
    this.config,
    this.status,
    this.appType,
    this.platforms,
    this.packageName,
    this.bundleId,
    this.storeUrl,
    this.downloadUrl
  });
}

class PlusApiKeyForm {
  final String? name;
  final String? keyValue;
  final String? type;
  final String? status;
  final String? expireTime;
  final String? description;
  final String? lastUsedTime;

  PlusApiKeyForm({
    this.name,
    this.keyValue,
    this.type,
    this.status,
    this.expireTime,
    this.description,
    this.lastUsedTime
  });
}

class PlusApiKeyVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? name;
  final String? keyValue;
  final String? type;
  final String? status;
  final String? expireTime;
  final String? description;
  final String? lastUsedTime;

  PlusApiKeyVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.name,
    this.keyValue,
    this.type,
    this.status,
    this.expireTime,
    this.description,
    this.lastUsedTime
  });
}

class PlusApiResultPlusApiKeyVO {
  final PlusApiKeyVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusApiKeyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AiAgentSystemPrompt {
  final String? title;
  final String? content;

  AiAgentSystemPrompt({
    this.title,
    this.content
  });
}

class PlusAiAgentForm {
  final String? name;
  final ImageMediaResource? faceImage;
  final VideoMediaResource? faceVideo;
  final String? owner;
  final int? ownerId;
  final String? channel;
  final String? channelId;
  final String? icon;
  final String? description;
  final TagsContent? tags;
  final String? type;
  final String? bizType;
  final String? status;
  final PlusAiAgentConfig? baseConfig;
  final AgentKnowledgeConfig? knowledgeConfig;
  final AgentMemoryConfig? memoryConfig;
  final SpeechConfig? speechConfig;
  final AgentToolConfig? toolConfig;
  final TeamAgentMembers? members;
  final int? cateId;
  final int? knowledgeBaseId;
  final PlusChatOptions? chatOptions;
  final AiAgentSystemPrompt? prompt;

  PlusAiAgentForm({
    this.name,
    this.faceImage,
    this.faceVideo,
    this.owner,
    this.ownerId,
    this.channel,
    this.channelId,
    this.icon,
    this.description,
    this.tags,
    this.type,
    this.bizType,
    this.status,
    this.baseConfig,
    this.knowledgeConfig,
    this.memoryConfig,
    this.speechConfig,
    this.toolConfig,
    this.members,
    this.cateId,
    this.knowledgeBaseId,
    this.chatOptions,
    this.prompt
  });
}

class PlusAiAgentVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final ImageMediaResource? faceImage;
  final VideoMediaResource? faceVideo;
  final String? owner;
  final int? ownerId;
  final String? channel;
  final String? channelId;
  final String? icon;
  final String? description;
  final TagsContent? tags;
  final String? type;
  final String? bizType;
  final String? status;
  final PlusAiAgentConfig? baseConfig;
  final AgentKnowledgeConfig? knowledgeConfig;
  final AgentMemoryConfig? memoryConfig;
  final SpeechConfig? speechConfig;
  final AgentToolConfig? toolConfig;
  final TeamAgentMembers? members;
  final int? knowledgeBaseId;
  final int? promptId;
  final int? categoryId;
  final PlusChatOptions? chatOptions;
  final PlusAiAgentConfig? config;
  final int? usageCount;

  PlusAiAgentVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.faceImage,
    this.faceVideo,
    this.owner,
    this.ownerId,
    this.channel,
    this.channelId,
    this.icon,
    this.description,
    this.tags,
    this.type,
    this.bizType,
    this.status,
    this.baseConfig,
    this.knowledgeConfig,
    this.memoryConfig,
    this.speechConfig,
    this.toolConfig,
    this.members,
    this.knowledgeBaseId,
    this.promptId,
    this.categoryId,
    this.chatOptions,
    this.config,
    this.usageCount
  });
}

class PlusApiResultPlusAiAgentVO {
  final PlusAiAgentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusAiAgentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusAiAgentToolForm {
  final int? agentId;
  final int? toolId;
  final int? sortOrder;
  final bool? enabled;

  PlusAiAgentToolForm({
    this.agentId,
    this.toolId,
    this.sortOrder,
    this.enabled
  });
}

class PlusAiAgentToolVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final int? agentId;
  final int? toolId;
  final int? sortOrder;
  final bool? enabled;
  final String? agentName;
  final String? toolName;

  PlusAiAgentToolVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.agentId,
    this.toolId,
    this.sortOrder,
    this.enabled,
    this.agentName,
    this.toolName
  });
}

class PlusApiResultPlusAiAgentToolVO {
  final PlusAiAgentToolVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusAiAgentToolVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusAccountForm {
  final int? userId;
  final double? availableBalance;
  final double? frozenBalance;
  final int? availablePoints;
  final int? frozenPoints;
  final String? status;

  PlusAccountForm({
    this.userId,
    this.availableBalance,
    this.frozenBalance,
    this.availablePoints,
    this.frozenPoints,
    this.status
  });
}

class PlusAccountHistoryVO {
  final String? createdAt;
  final String? updatedAt;
  final String? assetType;
  final int? accountId;
  final String? transactionId;
  final String? transactionType;
  final double? amount;
  final double? balanceBefore;
  final double? balanceAfter;
  final int? relatedAccountId;
  final int? pointsChange;
  final int? pointsBefore;
  final int? pointsAfter;
  final String? sourceType;
  final String? sourceId;
  final String? expiredAt;
  final String? status;
  final String? remarks;

  PlusAccountHistoryVO({
    this.createdAt,
    this.updatedAt,
    this.assetType,
    this.accountId,
    this.transactionId,
    this.transactionType,
    this.amount,
    this.balanceBefore,
    this.balanceAfter,
    this.relatedAccountId,
    this.pointsChange,
    this.pointsBefore,
    this.pointsAfter,
    this.sourceType,
    this.sourceId,
    this.expiredAt,
    this.status,
    this.remarks
  });
}

class PlusAccountVO {
  final String? createdAt;
  final String? updatedAt;
  final int? userId;
  final double? availableBalance;
  final double? frozenBalance;
  final int? availablePoints;
  final int? frozenPoints;
  final String? status;
  final List<PlusAccountHistoryVO>? historyList;

  PlusAccountVO({
    this.createdAt,
    this.updatedAt,
    this.userId,
    this.availableBalance,
    this.frozenBalance,
    this.availablePoints,
    this.frozenPoints,
    this.status,
    this.historyList
  });
}

class PlusApiResultPlusAccountVO {
  final PlusAccountVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusAccountVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusAccountHistoryForm {
  final String? assetType;
  final int? accountId;
  final String? transactionId;
  final String? transactionType;
  final double? amount;
  final double? balanceBefore;
  final double? balanceAfter;
  final int? relatedAccountId;
  final int? pointsChange;
  final int? pointsBefore;
  final int? pointsAfter;
  final String? sourceType;
  final String? sourceId;
  final String? expiredAt;
  final String? status;
  final String? remarks;

  PlusAccountHistoryForm({
    this.assetType,
    this.accountId,
    this.transactionId,
    this.transactionType,
    this.amount,
    this.balanceBefore,
    this.balanceAfter,
    this.relatedAccountId,
    this.pointsChange,
    this.pointsBefore,
    this.pointsAfter,
    this.sourceType,
    this.sourceId,
    this.expiredAt,
    this.status,
    this.remarks
  });
}

class PlusApiResultPlusAccountHistoryVO {
  final PlusAccountHistoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusAccountHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class QueryListForm {
  final int? id;
  final String? createdAtFrom;
  final String? createdAtTo;

  QueryListForm({
    this.id,
    this.createdAtFrom,
    this.createdAtTo
  });
}

class Pageable {
  final int? page;
  final int? size;
  final List<String>? sort;

  Pageable({
    this.page,
    this.size,
    this.sort
  });
}

class PagePlusWorkspaceVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusWorkspaceVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusWorkspaceVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PageableObject {
  final int? offset;
  final SortObject? sort;
  final bool? paged;
  final int? pageNumber;
  final int? pageSize;
  final bool? unpaged;

  PageableObject({
    this.offset,
    this.sort,
    this.paged,
    this.pageNumber,
    this.pageSize,
    this.unpaged
  });
}

class PlusApiResultPagePlusWorkspaceVO {
  final PagePlusWorkspaceVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusWorkspaceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SortObject {
  final bool? empty;
  final bool? sorted;
  final bool? unsorted;

  SortObject({
    this.empty,
    this.sorted,
    this.unsorted
  });
}

class PlusApiResultListPlusWorkspaceVO {
  final List<PlusWorkspaceVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusWorkspaceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageContentVoteVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ContentVoteVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageContentVoteVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageContentVoteVO {
  final PageContentVoteVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageContentVoteVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListContentVoteVO {
  final List<ContentVoteVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListContentVoteVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVoiceSpeakerQueryForm {
  final int? id;
  final String? createdAtFrom;
  final String? createdAtTo;
  final int? userId;
  final String? keyword;
  final String? status;
  final String? dataScope;

  PlusVoiceSpeakerQueryForm({
    this.id,
    this.createdAtFrom,
    this.createdAtTo,
    this.userId,
    this.keyword,
    this.status,
    this.dataScope
  });
}

class PagePlusVoiceSpeakerVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVoiceSpeakerVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVoiceSpeakerVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVoiceSpeakerVO {
  final PagePlusVoiceSpeakerVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVoiceSpeakerVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVoiceSpeakerVO {
  final List<PlusVoiceSpeakerVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVoiceSpeakerVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusVisitHistoryVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVisitHistoryVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVisitHistoryVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVisitHistoryVO {
  final PagePlusVisitHistoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVisitHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVisitHistoryVO {
  final List<PlusVisitHistoryVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVisitHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusVipUserVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVipUserVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVipUserVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVipUserVO {
  final PagePlusVipUserVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVipUserVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVipUserVO {
  final List<PlusVipUserVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVipUserVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusVipRechargePackVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVipRechargePackVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVipRechargePackVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVipRechargePackVO {
  final PagePlusVipRechargePackVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVipRechargePackVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVipRechargePackVO {
  final List<PlusVipRechargePackVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVipRechargePackVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusVipRechargeVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVipRechargeVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVipRechargeVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVipRechargeVO {
  final PagePlusVipRechargeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVipRechargeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVipRechargeVO {
  final List<PlusVipRechargeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVipRechargeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusVipPointChangeVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVipPointChangeVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVipPointChangeVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVipPointChangeVO {
  final PagePlusVipPointChangeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVipPointChangeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVipPointChangeVO {
  final List<PlusVipPointChangeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVipPointChangeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusVipPackGroupQueryForm {
  final int? id;
  final String? createdAtFrom;
  final String? createdAtTo;
  final int? appId;
  final List<int>? appIdIn;

  PlusVipPackGroupQueryForm({
    this.id,
    this.createdAtFrom,
    this.createdAtTo,
    this.appId,
    this.appIdIn
  });
}

class PagePlusVipPackGroupVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVipPackGroupVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVipPackGroupVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVipPackGroupVO {
  final PagePlusVipPackGroupVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVipPackGroupVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVipPackGroupVO {
  final List<PlusVipPackGroupVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVipPackGroupVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusVipPackVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVipPackVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVipPackVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVipPackVO {
  final PagePlusVipPackVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVipPackVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVipPackVO {
  final List<PlusVipPackVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVipPackVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusVipLevelVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVipLevelVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVipLevelVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVipLevelVO {
  final PagePlusVipLevelVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVipLevelVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVipLevelVO {
  final List<PlusVipLevelVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVipLevelVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusVipLevelBenefitVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVipLevelBenefitVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVipLevelBenefitVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVipLevelBenefitVO {
  final PagePlusVipLevelBenefitVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVipLevelBenefitVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVipLevelBenefitVO {
  final List<PlusVipLevelBenefitVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVipLevelBenefitVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusVipBenefitUsageVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVipBenefitUsageVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVipBenefitUsageVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVipBenefitUsageVO {
  final PagePlusVipBenefitUsageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVipBenefitUsageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVipBenefitUsageVO {
  final List<PlusVipBenefitUsageVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVipBenefitUsageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusVipBenefitVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVipBenefitVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVipBenefitVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVipBenefitVO {
  final PagePlusVipBenefitVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVipBenefitVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVipBenefitVO {
  final List<PlusVipBenefitVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVipBenefitVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusVideoVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusVideoVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusVideoVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusVideoVO {
  final PagePlusVideoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusVideoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusVideoVO {
  final List<PlusVideoVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusVideoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusUserOAuthAccountVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusUserOAuthAccountVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusUserOAuthAccountVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusUserOAuthAccountVO {
  final PagePlusUserOAuthAccountVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusUserOAuthAccountVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusUserOAuthAccountVO {
  final List<PlusUserOAuthAccountVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusUserOAuthAccountVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusUserVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusUserVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusUserVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusUserVO {
  final PagePlusUserVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusUserVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusUserVO {
  final List<PlusUserVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusUserVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusUserCouponVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusUserCouponVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusUserCouponVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusUserCouponVO {
  final PagePlusUserCouponVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusUserCouponVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusUserCouponVO {
  final List<PlusUserCouponVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusUserCouponVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusUserCardVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusUserCardVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusUserCardVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusUserCardVO {
  final PagePlusUserCardVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusUserCardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusUserCardVO {
  final List<PlusUserCardVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusUserCardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusUserAddressVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusUserAddressVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusUserAddressVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusUserAddressVO {
  final PagePlusUserAddressVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusUserAddressVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusUserAddressVO {
  final List<PlusUserAddressVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusUserAddressVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageUsageRecordVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<UsageRecordVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageUsageRecordVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageUsageRecordVO {
  final PageUsageRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageUsageRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListUsageRecordVO {
  final List<UsageRecordVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListUsageRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusShoppingCartVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusShoppingCartVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusShoppingCartVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusShoppingCartVO {
  final PagePlusShoppingCartVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusShoppingCartVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusShoppingCartVO {
  final List<PlusShoppingCartVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusShoppingCartVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusShoppingCartItemVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusShoppingCartItemVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusShoppingCartItemVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusShoppingCartItemVO {
  final PagePlusShoppingCartItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusShoppingCartItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusShoppingCartItemVO {
  final List<PlusShoppingCartItemVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusShoppingCartItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusRefundVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusRefundVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusRefundVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusRefundVO {
  final PagePlusRefundVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusRefundVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusRefundVO {
  final List<PlusRefundVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusRefundVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusPaymentStatusQueryForm {
  final String? outTradeNo;
  final String? provider;
  final double? amount;

  PlusPaymentStatusQueryForm({
    this.outTradeNo,
    this.provider,
    this.amount
  });
}

class PlusApiResultBoolean {
  final bool? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultBoolean({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusPaymentVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusPaymentVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusPaymentVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusPaymentVO {
  final PagePlusPaymentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusPaymentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusPaymentVO {
  final List<PlusPaymentVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusPaymentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusPaymentCancelForm {
  final int? paymentId;
  final String? outTradeNo;
  final double? amount;
  final String? reason;

  PlusPaymentCancelForm({
    this.paymentId,
    this.outTradeNo,
    this.amount,
    this.reason
  });
}

class OrderShipVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final String? message;
  final String? operationTime;
  final int? orderId;
  final String? shippingCompany;
  final String? trackingNumber;
  final String? shipTime;
  final String? estimatedArrivalTime;

  OrderShipVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.message,
    this.operationTime,
    this.orderId,
    this.shippingCompany,
    this.trackingNumber,
    this.shipTime,
    this.estimatedArrivalTime
  });
}

class PlusApiResultOrderShipVO {
  final OrderShipVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOrderShipVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OrderConfirmVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final String? message;
  final String? operationTime;
  final int? orderId;
  final String? confirmTime;
  final String? estimatedShipTime;

  OrderConfirmVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.message,
    this.operationTime,
    this.orderId,
    this.confirmTime,
    this.estimatedShipTime
  });
}

class PlusApiResultOrderConfirmVO {
  final OrderConfirmVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOrderConfirmVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OrderCompleteVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final String? message;
  final String? operationTime;
  final int? orderId;
  final String? completeTime;
  final bool? reviewed;
  final int? pointsEarned;

  OrderCompleteVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.message,
    this.operationTime,
    this.orderId,
    this.completeTime,
    this.reviewed,
    this.pointsEarned
  });
}

class PlusApiResultOrderCompleteVO {
  final OrderCompleteVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOrderCompleteVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OrderCloseVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final String? message;
  final String? operationTime;
  final int? orderId;
  final String? closeReason;
  final String? closeTime;
  final bool? reopenable;

  OrderCloseVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.message,
    this.operationTime,
    this.orderId,
    this.closeReason,
    this.closeTime,
    this.reopenable
  });
}

class PlusApiResultOrderCloseVO {
  final OrderCloseVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOrderCloseVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OrderCancelVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final String? message;
  final String? operationTime;
  final int? orderId;
  final String? cancelReason;
  final bool? refundable;
  final String? refundAmount;
  final String? cancelTime;

  OrderCancelVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.message,
    this.operationTime,
    this.orderId,
    this.cancelReason,
    this.refundable,
    this.refundAmount,
    this.cancelTime
  });
}

class PlusApiResultOrderCancelVO {
  final OrderCancelVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOrderCancelVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CreateVirtualOrderForm {


  CreateVirtualOrderForm({

  });
}

class PlusApiResultVirtualOrderVO {
  final VirtualOrderVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVirtualOrderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VirtualOrderVO {
  final String? createdAt;
  final String? updatedAt;
  final int? orderId;
  final String? orderSn;
  final bool? success;
  final String? message;

  VirtualOrderVO({
    this.createdAt,
    this.updatedAt,
    this.orderId,
    this.orderSn,
    this.success,
    this.message
  });
}

class CreateVipOrderForm {


  CreateVipOrderForm({

  });
}

class PlusApiResultVipOrderVO {
  final VipOrderVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVipOrderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipOrderVO {
  final String? createdAt;
  final String? updatedAt;
  final int? orderId;
  final String? orderSn;
  final bool? success;
  final String? message;

  VipOrderVO({
    this.createdAt,
    this.updatedAt,
    this.orderId,
    this.orderSn,
    this.success,
    this.message
  });
}

class CreatePointsOrderForm {


  CreatePointsOrderForm({

  });
}

class PlusApiResultPointsOrderVO {
  final PointsOrderVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPointsOrderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PointsOrderVO {
  final String? createdAt;
  final String? updatedAt;
  final int? orderId;
  final String? orderSn;
  final bool? success;
  final String? message;

  PointsOrderVO({
    this.createdAt,
    this.updatedAt,
    this.orderId,
    this.orderSn,
    this.success,
    this.message
  });
}

class PagePlusOrderVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusOrderVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusOrderVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusOrderVO {
  final PagePlusOrderVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusOrderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusOrderVO {
  final List<PlusOrderVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusOrderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusOrderItemVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusOrderItemVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusOrderItemVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusOrderItemVO {
  final PagePlusOrderItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusOrderItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusOrderItemVO {
  final List<PlusOrderItemVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusOrderItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CreateImGroupOrderForm {


  CreateImGroupOrderForm({

  });
}

class ImGroupOrderVO {
  final String? createdAt;
  final String? updatedAt;
  final int? orderId;
  final String? orderSn;
  final bool? success;
  final String? message;

  ImGroupOrderVO({
    this.createdAt,
    this.updatedAt,
    this.orderId,
    this.orderSn,
    this.success,
    this.message
  });
}

class PlusApiResultImGroupOrderVO {
  final ImGroupOrderVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultImGroupOrderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CreateGoodsOrderForm {


  CreateGoodsOrderForm({

  });
}

class GoodsOrderVO {
  final String? createdAt;
  final String? updatedAt;
  final int? orderId;
  final String? orderSn;
  final bool? success;
  final String? message;

  GoodsOrderVO({
    this.createdAt,
    this.updatedAt,
    this.orderId,
    this.orderSn,
    this.success,
    this.message
  });
}

class PlusApiResultGoodsOrderVO {
  final GoodsOrderVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGoodsOrderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusAiToolVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusAiToolVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusAiToolVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusAiToolVO {
  final PagePlusAiToolVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusAiToolVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusAiToolVO {
  final List<PlusAiToolVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusAiToolVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusTenantVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusTenantVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusTenantVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusTenantVO {
  final PagePlusTenantVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusTenantVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusTenantVO {
  final List<PlusTenantVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusTenantVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class GetAccessTokenForm {
  final int? id;
  final List<String>? platforms;

  GetAccessTokenForm({
    this.id,
    this.platforms
  });
}

class PlusApiResultListTokenResult {
  final List<TokenResult>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListTokenResult({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TokenResult {
  final String? token;
  final String? expiresInMs;
  final String? createdAt;
  final bool? expired;

  TokenResult({
    this.token,
    this.expiresInMs,
    this.createdAt,
    this.expired
  });
}

class PagePlusTableVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusTableVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusTableVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusTableVO {
  final PagePlusTableVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusTableVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusTableVO {
  final List<PlusTableVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusTableVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusSkuVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusSkuVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusSkuVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusSkuVO {
  final PagePlusSkuVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusSkuVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusSkuVO {
  final List<PlusSkuVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusSkuVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageShortUrlVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ShortUrlVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageShortUrlVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageShortUrlVO {
  final PageShortUrlVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageShortUrlVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListShortUrlVO {
  final List<ShortUrlVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListShortUrlVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusShopVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusShopVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusShopVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusShopVO {
  final PagePlusShopVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusShopVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusShopVO {
  final List<PlusShopVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusShopVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusShareVisitRecordVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusShareVisitRecordVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusShareVisitRecordVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusShareVisitRecordVO {
  final PagePlusShareVisitRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusShareVisitRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusShareVisitRecordVO {
  final List<PlusShareVisitRecordVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusShareVisitRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusShareVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusShareVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusShareVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusShareVO {
  final PagePlusShareVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusShareVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusShareVO {
  final List<PlusShareVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusShareVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusShardingKeyVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusShardingKeyVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusShardingKeyVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusShardingKeyVO {
  final PagePlusShardingKeyVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusShardingKeyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusShardingKeyVO {
  final List<PlusShardingKeyVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusShardingKeyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResult {
  final dynamic? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResult({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ChatCompletionCreateForm {
  final String? model;
  final List<ChatCompletionMessage>? messages;
  final double? temperature;
  final int? n;
  final bool? stream;
  final List<String>? stop;
  final String? user;
  final String? tool;
  final double? topP;
  final int? maxTokens;
  final double? presencePenalty;
  final double? frequencyPenalty;
  final Map<String, int>? logitBias;
  final bool? responseFormat;
  final String? systemFingerprint;
  final ChatContext? chatContext;

  ChatCompletionCreateForm({
    this.model,
    this.messages,
    this.temperature,
    this.n,
    this.stream,
    this.stop,
    this.user,
    this.tool,
    this.topP,
    this.maxTokens,
    this.presencePenalty,
    this.frequencyPenalty,
    this.logitBias,
    this.responseFormat,
    this.systemFingerprint,
    this.chatContext
  });
}

class PagePlusSchemaVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusSchemaVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusSchemaVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusSchemaVO {
  final PagePlusSchemaVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusSchemaVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusSchemaVO {
  final List<PlusSchemaVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusSchemaVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusRolePermissionVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusRolePermissionVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusRolePermissionVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusRolePermissionVO {
  final PagePlusRolePermissionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusRolePermissionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusRolePermissionVO {
  final List<PlusRolePermissionVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusRolePermissionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusRoleVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusRoleVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusRoleVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusRoleVO {
  final PagePlusRoleVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusRoleVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusRoleVO {
  final List<PlusRoleVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusRoleVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusInvokeRecordVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusInvokeRecordVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusInvokeRecordVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusInvokeRecordVO {
  final PagePlusInvokeRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusInvokeRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusInvokeRecordVO {
  final List<PlusInvokeRecordVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusInvokeRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusUserRoleVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusUserRoleVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusUserRoleVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusUserRoleVO {
  final PagePlusUserRoleVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusUserRoleVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusUserRoleVO {
  final List<PlusUserRoleVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusUserRoleVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusAiPromptVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusAiPromptVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusAiPromptVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusAiPromptVO {
  final PagePlusAiPromptVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusAiPromptVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusAiPromptVO {
  final List<PlusAiPromptVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusAiPromptVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusProjectVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusProjectVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusProjectVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusProjectVO {
  final PagePlusProjectVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusProjectVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusProjectVO {
  final List<PlusProjectVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusProjectVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultPlusMallHomeVO {
  final PlusMallHomeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusMallHomeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusMallHomeVO {
  final String? createdAt;
  final String? updatedAt;
  final List<PlusCategoryVO>? gridCategories;
  final List<PlusProductVO>? products;
  final List<PlusProductVO>? banners;
  final List<PlusProductVO>? hotProducts;
  final List<PlusProductVO>? newProducts;
  final List<PlusProductVO>? recommendProducts;
  final List<PlusProductVO>? hotSalesProducts;

  PlusMallHomeVO({
    this.createdAt,
    this.updatedAt,
    this.gridCategories,
    this.products,
    this.banners,
    this.hotProducts,
    this.newProducts,
    this.recommendProducts,
    this.hotSalesProducts
  });
}

class PagePlusProductVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusProductVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusProductVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusProductVO {
  final PagePlusProductVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusProductVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusProductVO {
  final List<PlusProductVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusProductVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusPptTemplateSlideVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusPptTemplateSlideVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusPptTemplateSlideVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusPptTemplateSlideVO {
  final PagePlusPptTemplateSlideVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusPptTemplateSlideVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusPptTemplateSlideVO {
  final List<PlusPptTemplateSlideVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusPptTemplateSlideVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusPptTemplateRenderForm {
  final int? id;
  final String? uuid;
  final String? prompt;

  PlusPptTemplateRenderForm({
    this.id,
    this.uuid,
    this.prompt
  });
}

class PlusApiResultPlusPptProject {
  final PlusPptProject? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusPptProject({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusPptContext {
  final String? templateUrl;

  PlusPptContext({
    this.templateUrl
  });
}

class PlusPptProject {
  final String? id;
  final String? uuid;
  final String? type;
  final String? screenType;
  final String? name;
  final String? title;
  final String? owner;
  final int? ownerId;
  final int? diskId;
  final List<PlusFileObject>? files;
  final String? author;
  final String? createdAt;
  final String? lastModifiedTime;
  final String? version;
  final String? prompt;
  final String? description;
  final TagsContent? tags;
  final double? width;
  final double? height;
  final List<PlusPptSlide>? slides;
  final PlusPptTheme? theme;
  final PlusPptContext? context;
  final String? subtitle;
  final bool? includePageNumbers;
  final bool? includeFooter;
  final String? footerText;
  final String? exportFormat;

  PlusPptProject({
    this.id,
    this.uuid,
    this.type,
    this.screenType,
    this.name,
    this.title,
    this.owner,
    this.ownerId,
    this.diskId,
    this.files,
    this.author,
    this.createdAt,
    this.lastModifiedTime,
    this.version,
    this.prompt,
    this.description,
    this.tags,
    this.width,
    this.height,
    this.slides,
    this.theme,
    this.context,
    this.subtitle,
    this.includePageNumbers,
    this.includeFooter,
    this.footerText,
    this.exportFormat
  });
}

class PlusPptTheme {
  final List<String>? themeColors;
  final List<String>? subColors;
  final List<String>? exportThemeColors;
  final String? fontColor;
  final String? fontName;
  final String? backgroundColor;
  final PlusPptThemeShadow? shadow;
  final PlusPptThemeOutline? outline;

  PlusPptTheme({
    this.themeColors,
    this.subColors,
    this.exportThemeColors,
    this.fontColor,
    this.fontName,
    this.backgroundColor,
    this.shadow,
    this.outline
  });
}

class PlusPptThemeOutline {
  final int? width;
  final String? color;
  final String? style;

  PlusPptThemeOutline({
    this.width,
    this.color,
    this.style
  });
}

class PlusPptThemeShadow {
  final int? h;
  final int? v;
  final int? blur;
  final String? color;

  PlusPptThemeShadow({
    this.h,
    this.v,
    this.blur,
    this.color
  });
}

class PagePlusPptTemplateVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusPptTemplateVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusPptTemplateVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusPptTemplateVO {
  final PagePlusPptTemplateVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusPptTemplateVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusPptTemplateVO {
  final List<PlusPptTemplateVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusPptTemplateVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusPartnerVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusPartnerVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusPartnerVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusPartnerVO {
  final PagePlusPartnerVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusPartnerVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusPartnerVO {
  final List<PlusPartnerVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusPartnerVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusParticipantVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusParticipantVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusParticipantVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusParticipantVO {
  final PagePlusParticipantVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusParticipantVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusParticipantVO {
  final List<PlusParticipantVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusParticipantVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FileItemVO {
  final String? id;
  final String? object;
  final int? bytes;
  final int? createdAt;
  final String? filename;
  final String? purpose;
  final int? expiresAt;
  final String? status;
  final String? statusDetails;
  final bool? deleted;

  FileItemVO({
    this.id,
    this.object,
    this.bytes,
    this.createdAt,
    this.filename,
    this.purpose,
    this.expiresAt,
    this.status,
    this.statusDetails,
    this.deleted
  });
}

class PlusApiResultFileItemVO {
  final FileItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFileItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusGetTempSessionForm {
  final String? provider;
  final String? name;
  final String? scene;
  final BucketObject? bucket;
  final String? method;
  final int? expirationSeconds;

  PlusGetTempSessionForm({
    this.provider,
    this.name,
    this.scene,
    this.bucket,
    this.method,
    this.expirationSeconds
  });
}

class PlusApiResultPlusTempSessionVO {
  final PlusTempSessionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusTempSessionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusTempSessionVO {


  PlusTempSessionVO({

  });
}

class PlusGetPresignedUrlForm {
  final String? provider;
  final String? name;
  final String? scene;
  final BucketObject? bucket;
  final String? method;
  final int? expirationSeconds;

  PlusGetPresignedUrlForm({
    this.provider,
    this.name,
    this.scene,
    this.bucket,
    this.method,
    this.expirationSeconds
  });
}

class GetUrlResult {
  final String? url;
  final String? previewUrl;
  final String? objectKey;

  GetUrlResult({
    this.url,
    this.previewUrl,
    this.objectKey
  });
}

class PlusApiResultGetUrlResult {
  final GetUrlResult? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGetUrlResult({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusUploadForm {


  PlusUploadForm({

  });
}

class PagePlusOssBucketVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusOssBucketVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusOssBucketVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusOssBucketVO {
  final PagePlusOssBucketVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusOssBucketVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusOssBucketVO {
  final List<PlusOssBucketVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusOssBucketVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusPositionVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusPositionVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusPositionVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusPositionVO {
  final PagePlusPositionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusPositionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusPositionVO {
  final List<PlusPositionVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusPositionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusMemberRelationsVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusMemberRelationsVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusMemberRelationsVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusMemberRelationsVO {
  final PagePlusMemberRelationsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusMemberRelationsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusMemberRelationsVO {
  final List<PlusMemberRelationsVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusMemberRelationsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusOrganizationVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusOrganizationVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusOrganizationVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusOrganizationVO {
  final PagePlusOrganizationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusOrganizationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusOrganizationVO {
  final List<PlusOrganizationVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusOrganizationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusOrganizationMemberVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusOrganizationMemberVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusOrganizationMemberVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusOrganizationMemberVO {
  final PagePlusOrganizationMemberVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusOrganizationMemberVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusOrganizationMemberVO {
  final List<PlusOrganizationMemberVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusOrganizationMemberVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusNotificationVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusNotificationVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusNotificationVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusNotificationVO {
  final PagePlusNotificationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusNotificationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusNotificationVO {
  final List<PlusNotificationVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusNotificationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusNewsVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusNewsVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusNewsVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusNewsVO {
  final PagePlusNewsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusNewsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusNewsVO {
  final List<PlusNewsVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusNewsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusHostDomainVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusHostDomainVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusHostDomainVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusHostDomainVO {
  final PagePlusHostDomainVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusHostDomainVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusHostDomainVO {
  final List<PlusHostDomainVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusHostDomainVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusDnsRecordVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusDnsRecordVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusDnsRecordVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusDnsRecordVO {
  final PagePlusDnsRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusDnsRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusDnsRecordVO {
  final List<PlusDnsRecordVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusDnsRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusMusicVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusMusicVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusMusicVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusMusicVO {
  final PagePlusMusicVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusMusicVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusMusicVO {
  final List<PlusMusicVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusMusicVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusAiModelPriceVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusAiModelPriceVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusAiModelPriceVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusAiModelPriceVO {
  final PagePlusAiModelPriceVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusAiModelPriceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusAiModelPriceVO {
  final List<PlusAiModelPriceVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusAiModelPriceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusAiModelInfoVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusAiModelInfoVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusAiModelInfoVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusAiModelInfoVO {
  final PagePlusAiModelInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusAiModelInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusAiModelInfoVO {
  final List<PlusAiModelInfoVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusAiModelInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusChatMessageContentVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusChatMessageContentVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusChatMessageContentVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusChatMessageContentVO {
  final PagePlusChatMessageContentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusChatMessageContentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusChatMessageContentVO {
  final List<PlusChatMessageContentVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusChatMessageContentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusMemberLevelVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusMemberLevelVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusMemberLevelVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusMemberLevelVO {
  final PagePlusMemberLevelVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusMemberLevelVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusMemberLevelVO {
  final List<PlusMemberLevelVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusMemberLevelVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusMemberCardVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusMemberCardVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusMemberCardVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusMemberCardVO {
  final PagePlusMemberCardVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusMemberCardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusMemberCardVO {
  final List<PlusMemberCardVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusMemberCardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusKnowledgeBaseVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusKnowledgeBaseVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusKnowledgeBaseVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusKnowledgeBaseVO {
  final PagePlusKnowledgeBaseVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusKnowledgeBaseVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusKnowledgeBaseVO {
  final List<PlusKnowledgeBaseVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusKnowledgeBaseVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageInvitationRelationVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<InvitationRelationVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageInvitationRelationVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageInvitationRelationVO {
  final PageInvitationRelationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageInvitationRelationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListInvitationRelationVO {
  final List<InvitationRelationVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListInvitationRelationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageInvitationCodeVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<InvitationCodeVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageInvitationCodeVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageInvitationCodeVO {
  final PageInvitationCodeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageInvitationCodeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListInvitationCodeVO {
  final List<InvitationCodeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListInvitationCodeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusImageVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusImageVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusImageVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusImageVO {
  final PagePlusImageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusImageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusImageVO {
  final List<PlusImageVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusImageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusMessage {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusMessage>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusMessage({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusMessage {
  final PagePlusMessage? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusMessage({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusMessage {
  final int? id;
  final String? uuid;
  final String? createdAt;
  final String? updatedAt;
  final String? sendAt;
  final int? conversationId;
  final String? type;
  final Participant? sender;
  final Participant? receiver;
  final int? groupId;
  final String? msgId;
  final String? clientMsgId;
  final MessageBody? body;
  final Map<String, dynamic>? metadata;
  final String? content;

  PlusMessage({
    this.id,
    this.uuid,
    this.createdAt,
    this.updatedAt,
    this.sendAt,
    this.conversationId,
    this.type,
    this.sender,
    this.receiver,
    this.groupId,
    this.msgId,
    this.clientMsgId,
    this.body,
    this.metadata,
    this.content
  });
}

class PagePlusImGroupVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusImGroupVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusImGroupVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusImGroupVO {
  final PagePlusImGroupVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusImGroupVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusImGroupVO {
  final List<PlusImGroupVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusImGroupVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class GenerateVoiceSpeakerForm {
  final String? voiceSpeakerName;
  final String? voiceType;
  final String? text;
  final double? speed;
  final double? pitch;
  final int? volume;
  final String? model;
  final String? responseFormat;
  final String? prompt;

  GenerateVoiceSpeakerForm({
    this.voiceSpeakerName,
    this.voiceType,
    this.text,
    this.speed,
    this.pitch,
    this.volume,
    this.model,
    this.responseFormat,
    this.prompt
  });
}

class AudioMediaResourceList {
  final List<AudioMediaResource>? audios;
  final List<AssetMediaResource>? resources;

  AudioMediaResourceList({
    this.audios,
    this.resources
  });
}

class GenerateVoiceSpeakerVO {
  final String? createdAt;
  final String? updatedAt;
  final String? requestId;
  final String? taskId;
  final String? taskStatus;
  final AudioMediaResourceList? voiceResources;
  final String? voiceSpeakerId;
  final String? voiceSpeakerName;
  final String? voiceType;
  final String? voiceStyle;
  final String? model;
  final int? duration;
  final String? errorMessage;

  GenerateVoiceSpeakerVO({
    this.createdAt,
    this.updatedAt,
    this.requestId,
    this.taskId,
    this.taskStatus,
    this.voiceResources,
    this.voiceSpeakerId,
    this.voiceSpeakerName,
    this.voiceType,
    this.voiceStyle,
    this.model,
    this.duration,
    this.errorMessage
  });
}

class PlusApiResultGenerateVoiceSpeakerVO {
  final GenerateVoiceSpeakerVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGenerateVoiceSpeakerVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class GenerateVideoForm {
  final String? prompt;
  final String? negativePrompt;
  final int? n;
  final int? width;
  final int? height;
  final String? model;
  final String? responseFormat;
  final String? style;
  final String? aspectRatio;

  GenerateVideoForm({
    this.prompt,
    this.negativePrompt,
    this.n,
    this.width,
    this.height,
    this.model,
    this.responseFormat,
    this.style,
    this.aspectRatio
  });
}

class GenerateVideoVO {
  final String? createdAt;
  final String? updatedAt;
  final String? requestId;
  final String? taskId;
  final String? taskStatus;
  final VideoMediaResourceList? videos;
  final String? status;

  GenerateVideoVO({
    this.createdAt,
    this.updatedAt,
    this.requestId,
    this.taskId,
    this.taskStatus,
    this.videos,
    this.status
  });
}

class PlusApiResultGenerateVideoVO {
  final GenerateVideoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGenerateVideoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VideoMediaResourceList {
  final List<VideoMediaResource>? videos;
  final List<AssetMediaResource>? resources;

  VideoMediaResourceList({
    this.videos,
    this.resources
  });
}

class GenerateMusicForm {
  final String? prompt;
  final String? lyrics;
  final int? n;
  final String? model;
  final int? tempo;
  final String? style;
  final String? instrument;

  GenerateMusicForm({
    this.prompt,
    this.lyrics,
    this.n,
    this.model,
    this.tempo,
    this.style,
    this.instrument
  });
}

class GenerateMusicVO {
  final String? createdAt;
  final String? updatedAt;
  final String? requestId;
  final String? taskId;
  final String? taskStatus;
  final AudioMediaResourceList? audios;
  final String? lyrics;

  GenerateMusicVO({
    this.createdAt,
    this.updatedAt,
    this.requestId,
    this.taskId,
    this.taskStatus,
    this.audios,
    this.lyrics
  });
}

class PlusApiResultGenerateMusicVO {
  final GenerateMusicVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGenerateMusicVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusAiGenerationVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusAiGenerationVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusAiGenerationVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusAiGenerationVO {
  final PagePlusAiGenerationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusAiGenerationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusAiGenerationVO {
  final List<PlusAiGenerationVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusAiGenerationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class GenerateImageForm {
  final String? prompt;
  final String? negativePrompt;
  final int? n;
  final int? width;
  final int? height;
  final String? model;
  final String? responseFormat;
  final String? style;
  final String? aspectRatio;

  GenerateImageForm({
    this.prompt,
    this.negativePrompt,
    this.n,
    this.width,
    this.height,
    this.model,
    this.responseFormat,
    this.style,
    this.aspectRatio
  });
}

class GenerateImageVO {
  final String? createdAt;
  final String? updatedAt;
  final String? requestId;
  final String? taskId;
  final String? taskStatus;
  final ImageMediaResourceList? images;

  GenerateImageVO({
    this.createdAt,
    this.updatedAt,
    this.requestId,
    this.taskId,
    this.taskStatus,
    this.images
  });
}

class PlusApiResultGenerateImageVO {
  final GenerateImageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGenerateImageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusAiGenerationContentVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusAiGenerationContentVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusAiGenerationContentVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusAiGenerationContentVO {
  final PagePlusAiGenerationContentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusAiGenerationContentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusAiGenerationContentVO {
  final List<PlusAiGenerationContentVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusAiGenerationContentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class GenerateCharacterForm {
  final String? name;
  final String? description;
  final String? appearance;
  final String? personality;
  final String? background;
  final String? style;
  final String? responseFormat;
  final String? model;
  final int? n;
  final int? width;
  final int? height;
  final String? quality;
  final String? prompt;
  final String? negativePrompt;

  GenerateCharacterForm({
    this.name,
    this.description,
    this.appearance,
    this.personality,
    this.background,
    this.style,
    this.responseFormat,
    this.model,
    this.n,
    this.width,
    this.height,
    this.quality,
    this.prompt,
    this.negativePrompt
  });
}

class GenerateCharacterVO {
  final String? createdAt;
  final String? updatedAt;
  final String? requestId;
  final String? taskId;
  final String? taskStatus;
  final List<ImageMediaResource>? characterImages;
  final String? characterId;
  final String? characterName;
  final String? characterDescription;
  final String? model;
  final int? duration;
  final String? errorMessage;

  GenerateCharacterVO({
    this.createdAt,
    this.updatedAt,
    this.requestId,
    this.taskId,
    this.taskStatus,
    this.characterImages,
    this.characterId,
    this.characterName,
    this.characterDescription,
    this.model,
    this.duration,
    this.errorMessage
  });
}

class PlusApiResultGenerateCharacterVO {
  final GenerateCharacterVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGenerateCharacterVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class GenerateAudioForm {
  final String? title;
  final String? prompt;
  final String? voice;
  final String? model;
  final String? format;
  final double? speed;

  GenerateAudioForm({
    this.title,
    this.prompt,
    this.voice,
    this.model,
    this.format,
    this.speed
  });
}

class GenerateAudioVO {
  final String? createdAt;
  final String? updatedAt;
  final String? requestId;
  final String? taskId;
  final String? taskStatus;

  GenerateAudioVO({
    this.createdAt,
    this.updatedAt,
    this.requestId,
    this.taskId,
    this.taskStatus
  });
}

class PlusApiResultGenerateAudioVO {
  final GenerateAudioVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGenerateAudioVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class GenerateAudioEffectForm {
  final String? title;
  final String? prompt;
  final String? audioType;
  final String? effectType;
  final int? intensity;
  final String? effectParams;
  final String? model;
  final String? channel;

  GenerateAudioEffectForm({
    this.title,
    this.prompt,
    this.audioType,
    this.effectType,
    this.intensity,
    this.effectParams,
    this.model,
    this.channel
  });
}

class GenerateAudioEffectVO {
  final String? createdAt;
  final String? updatedAt;
  final String? requestId;
  final String? taskId;
  final String? taskStatus;

  GenerateAudioEffectVO({
    this.createdAt,
    this.updatedAt,
    this.requestId,
    this.taskId,
    this.taskStatus
  });
}

class PlusApiResultGenerateAudioEffectVO {
  final GenerateAudioEffectVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGenerateAudioEffectVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusFilePartVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusFilePartVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusFilePartVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusFilePartVO {
  final PagePlusFilePartVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusFilePartVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusFilePartVO {
  final List<PlusFilePartVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusFilePartVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusFileVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusFileVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusFileVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusFileVO {
  final PagePlusFileVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusFileVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusFileVO {
  final List<PlusFileVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusFileVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultSetPlusTreeNodePlusFileVO {
  final List<PlusTreeNodePlusFileVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSetPlusTreeNodePlusFileVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusTreeNodePlusFileVO {
  final PlusFileVO? data;
  final PlusTreeNodePlusFileVO? parent;
  final List<PlusTreeNodePlusFileVO>? children;
  final int? index;
  final bool? root;
  final bool? leaf;
  final int? childrenCount;
  final int? depth;

  PlusTreeNodePlusFileVO({
    this.data,
    this.parent,
    this.children,
    this.index,
    this.root,
    this.leaf,
    this.childrenCount,
    this.depth
  });
}

class PagePlusFileContentVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusFileContentVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusFileContentVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusFileContentVO {
  final PagePlusFileContentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusFileContentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusFileContentVO {
  final List<PlusFileContentVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusFileContentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusFeedsVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusFeedsVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusFeedsVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusFeedsVO {
  final PagePlusFeedsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusFeedsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusFeedsVO {
  final List<PlusFeedsVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusFeedsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusFeedbackVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusFeedbackVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusFeedbackVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusFeedbackVO {
  final PagePlusFeedbackVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusFeedbackVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusFeedbackVO {
  final List<PlusFeedbackVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusFeedbackVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusFavoriteVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusFavoriteVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusFavoriteVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusFavoriteVO {
  final PagePlusFavoriteVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusFavoriteVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusFavoriteVO {
  final List<PlusFavoriteVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusFavoriteVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusDiskMemberVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusDiskMemberVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusDiskMemberVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusDiskMemberVO {
  final PagePlusDiskMemberVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusDiskMemberVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusDiskMemberVO {
  final List<PlusDiskMemberVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusDiskMemberVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusDiskVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusDiskVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusDiskVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusDiskVO {
  final PagePlusDiskVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusDiskVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusDiskVO {
  final List<PlusDiskVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusDiskVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusDetailVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusDetailVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusDetailVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusDetailVO {
  final PagePlusDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusDetailVO {
  final List<PlusDetailVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusDepartmentVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusDepartmentVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusDepartmentVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusDepartmentVO {
  final PagePlusDepartmentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusDepartmentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusDepartmentVO {
  final List<PlusDepartmentVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusDepartmentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusDatasourceVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusDatasourceVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusDatasourceVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusDatasourceVO {
  final PagePlusDatasourceVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusDatasourceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusDatasourceVO {
  final List<PlusDatasourceVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusDatasourceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusCouponTemplateVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusCouponTemplateVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusCouponTemplateVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusCouponTemplateVO {
  final PagePlusCouponTemplateVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusCouponTemplateVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusCouponTemplateVO {
  final List<PlusCouponTemplateVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusCouponTemplateVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusCouponVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusCouponVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusCouponVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusCouponVO {
  final PagePlusCouponVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusCouponVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusCouponVO {
  final List<PlusCouponVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusCouponVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusConversationOpenForm {
  final String? conversationId;
  final String? uuid;
  final String? title;
  final int? userId;
  final int? agentId;
  final int? knowledgeBaseId;
  final int? dataSourceId;
  final PlusChatOptions? chatOptions;

  PlusConversationOpenForm({
    this.conversationId,
    this.uuid,
    this.title,
    this.userId,
    this.agentId,
    this.knowledgeBaseId,
    this.dataSourceId,
    this.chatOptions
  });
}

class PlusMessageFeedbackForm {
  final String? id;
  final String? conversationId;
  final String? rating;

  PlusMessageFeedbackForm({
    this.id,
    this.conversationId,
    this.rating
  });
}

class PlusConversationQueryListForm {
  final int? id;
  final String? createdAtFrom;
  final String? createdAtTo;
  final bool? initDefaults;

  PlusConversationQueryListForm({
    this.id,
    this.createdAtFrom,
    this.createdAtTo,
    this.initDefaults
  });
}

class PagePlusConversationVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusConversationVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusConversationVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusConversationVO {
  final PagePlusConversationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusConversationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusConversationVO {
  final List<PlusConversationVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusConversationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusCommentsReplyForm {
  final String? content;
  final int? userId;

  PlusCommentsReplyForm({
    this.content,
    this.userId
  });
}

class PagePlusCommentsVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusCommentsVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusCommentsVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusCommentsVO {
  final PagePlusCommentsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusCommentsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusCommentsVO {
  final List<PlusCommentsVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusCommentsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusColumnVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusColumnVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusColumnVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusColumnVO {
  final PagePlusColumnVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusColumnVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusColumnVO {
  final List<PlusColumnVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusColumnVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusCollectionVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusCollectionVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusCollectionVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusCollectionVO {
  final PagePlusCollectionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusCollectionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusCollectionVO {
  final List<PlusCollectionVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusCollectionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusCollectionItemVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusCollectionItemVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusCollectionItemVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusCollectionItemVO {
  final PagePlusCollectionItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusCollectionItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusCollectionItemVO {
  final List<PlusCollectionItemVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusCollectionItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ChatMessageQueryListForm {
  final int? id;
  final String? createdAtFrom;
  final String? createdAtTo;
  final int? conversationId;
  final String? conversationUuid;
  final String? lastSyncMessageId;

  ChatMessageQueryListForm({
    this.id,
    this.createdAtFrom,
    this.createdAtTo,
    this.conversationId,
    this.conversationUuid,
    this.lastSyncMessageId
  });
}

class PagePlusChatMessageVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusChatMessageVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusChatMessageVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusChatMessageVO {
  final PagePlusChatMessageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusChatMessageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusChatMessageVO {
  final List<PlusChatMessageVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusChatMessageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusCharacterVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusCharacterVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusCharacterVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusCharacterVO {
  final PagePlusCharacterVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusCharacterVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusCharacterVO {
  final List<PlusCharacterVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusCharacterVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusChannelResourceVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusChannelResourceVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusChannelResourceVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusChannelResourceVO {
  final PagePlusChannelResourceVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusChannelResourceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusChannelResourceVO {
  final List<PlusChannelResourceVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusChannelResourceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusChannelAccountQueryForm {
  final int? id;
  final String? createdAtFrom;
  final String? createdAtTo;
  final String? channel;
  final String? status;
  final String? resourceType;
  final List<String>? resourceTypes;

  PlusChannelAccountQueryForm({
    this.id,
    this.createdAtFrom,
    this.createdAtTo,
    this.channel,
    this.status,
    this.resourceType,
    this.resourceTypes
  });
}

class PlusApiResultListPlusChannelAccountVO {
  final List<PlusChannelAccountVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusChannelAccountVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusChannelAccountVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusChannelAccountVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusChannelAccountVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusChannelAccountVO {
  final PagePlusChannelAccountVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusChannelAccountVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusCategoryVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusCategoryVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusCategoryVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusCategoryVO {
  final PagePlusCategoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusCategoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusCategoryVO {
  final List<PlusCategoryVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusCategoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultSetPlusTreeNodePlusCategoryVO {
  final List<PlusTreeNodePlusCategoryVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSetPlusTreeNodePlusCategoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusTreeNodePlusCategoryVO {
  final PlusCategoryVO? data;
  final PlusTreeNodePlusCategoryVO? parent;
  final List<PlusTreeNodePlusCategoryVO>? children;
  final int? index;
  final bool? root;
  final bool? leaf;
  final int? childrenCount;
  final int? depth;

  PlusTreeNodePlusCategoryVO({
    this.data,
    this.parent,
    this.children,
    this.index,
    this.root,
    this.leaf,
    this.childrenCount,
    this.depth
  });
}

class PagePlusCardTemplateVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusCardTemplateVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusCardTemplateVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusCardTemplateVO {
  final PagePlusCardTemplateVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusCardTemplateVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusCardTemplateVO {
  final List<PlusCardTemplateVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusCardTemplateVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusCardVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusCardVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusCardVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusCardVO {
  final PagePlusCardVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusCardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusCardVO {
  final List<PlusCardVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusCardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PhoneVerificationForm {
  final String? phone;
  final String? code;
  final String? type;

  PhoneVerificationForm({
    this.phone,
    this.code,
    this.type
  });
}

class PlusApiResultVerificationVO {
  final VerificationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVerificationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VerificationVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final String? message;
  final String? token;

  VerificationVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.message,
    this.token
  });
}

class EmailVerificationForm {
  final String? email;
  final String? code;
  final String? type;

  EmailVerificationForm({
    this.email,
    this.code,
    this.type
  });
}

class SendVerificationCodeForm {
  final String? identifier;
  final String? method;
  final String? type;

  SendVerificationCodeForm({
    this.identifier,
    this.method,
    this.type
  });
}

class OAuthLoginRequestForm {
  final String? provider;
  final String? redirectUri;
  final String? scope;
  final String? state;

  OAuthLoginRequestForm({
    this.provider,
    this.redirectUri,
    this.scope,
    this.state
  });
}

class OAuthLoginResponse {
  final String? provider;
  final String? authUrl;
  final String? state;
  final int? expiresIn;

  OAuthLoginResponse({
    this.provider,
    this.authUrl,
    this.state,
    this.expiresIn
  });
}

class OAuthCallbackForm {
  final String? provider;
  final String? code;
  final String? state;

  OAuthCallbackForm({
    this.provider,
    this.code,
    this.state
  });
}

class TokenDTO {
  final String? token;
  final String? refreshToken;
  final int? expiresIn;
  final int? refreshExpiresIn;
  final int? userId;
  final Map<String, dynamic>? im;

  TokenDTO({
    this.token,
    this.refreshToken,
    this.expiresIn,
    this.refreshExpiresIn,
    this.userId,
    this.im
  });
}

class RoleCheckForm {
  final String? role;

  RoleCheckForm({
    this.role
  });
}

class PermissionCheckForm {
  final String? permission;

  PermissionCheckForm({
    this.permission
  });
}

class PasswordResetForm {
  final String? token;
  final String? newPassword;

  PasswordResetForm({
    this.token,
    this.newPassword
  });
}

class PasswordResetResultVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final String? message;
  final int? expiresIn;
  final String? token;

  PasswordResetResultVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.message,
    this.expiresIn,
    this.token
  });
}

class PlusApiResultPasswordResetResultVO {
  final PasswordResetResultVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPasswordResetResultVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PasswordResetRequestForm {
  final String? email;

  PasswordResetRequestForm({
    this.email
  });
}

class RegisterForm {
  final String? username;
  final String? password;
  final String? confirmPassword;
  final String? email;
  final String? phone;
  final String? captcha;
  final String? captchaId;
  final String? type;
  final String? verificationCode;
  final String? invitationCode;

  RegisterForm({
    this.username,
    this.password,
    this.confirmPassword,
    this.email,
    this.phone,
    this.captcha,
    this.captchaId,
    this.type,
    this.verificationCode,
    this.invitationCode
  });
}

class PlusApiResultRegisterResultVO {
  final RegisterResultVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultRegisterResultVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RegisterResultVO {
  final String? createdAt;
  final String? updatedAt;
  final UserVO? user;

  RegisterResultVO({
    this.createdAt,
    this.updatedAt,
    this.user
  });
}

class UserVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? username;
  final String? email;
  final String? phone;

  UserVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.username,
    this.email,
    this.phone
  });
}

class RefreshTokenForm {
  final String? refreshToken;

  RefreshTokenForm({
    this.refreshToken
  });
}

class LoginResultVO {
  final String? createdAt;
  final String? updatedAt;
  final String? token;
  final String? refreshToken;
  final int? expiresIn;
  final int? refreshExpiresIn;
  final int? userId;
  final UserVO? user;

  LoginResultVO({
    this.createdAt,
    this.updatedAt,
    this.token,
    this.refreshToken,
    this.expiresIn,
    this.refreshExpiresIn,
    this.userId,
    this.user
  });
}

class PlusApiResultLoginResultVO {
  final LoginResultVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultLoginResultVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultVoid {
  final dynamic? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVoid({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class LoginForm {
  final String? type;
  final String? email;
  final String? phone;
  final String? username;
  final String? password;
  final String? owner;
  final String? captcha;
  final String? captchaId;
  final bool? rememberMe;
  final String? verificationCode;
  final String? invitationCode;

  LoginForm({
    this.type,
    this.email,
    this.phone,
    this.username,
    this.password,
    this.owner,
    this.captcha,
    this.captchaId,
    this.rememberMe,
    this.verificationCode,
    this.invitationCode
  });
}

class ChangePasswordForm {
  final String? userId;
  final String? oldPassword;
  final String? newPassword;

  ChangePasswordForm({
    this.userId,
    this.oldPassword,
    this.newPassword
  });
}

class PagePlusAttributeVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusAttributeVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusAttributeVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusAttributeVO {
  final PagePlusAttributeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusAttributeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusAttributeVO {
  final List<PlusAttributeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusAttributeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusArticleVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusArticleVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusArticleVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusArticleVO {
  final PagePlusArticleVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusArticleVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusArticleVO {
  final List<PlusArticleVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusArticleVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusAppVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusAppVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusAppVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusAppVO {
  final PagePlusAppVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusAppVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusAppVO {
  final List<PlusAppVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusAppVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CreateJsapiSignatureForm {
  final String? url;

  CreateJsapiSignatureForm({
    this.url
  });
}

class AppSdkConfigVO {
  final String? createdAt;
  final String? updatedAt;
  final String? platform;
  final OfficialAccountSdkConfigVO? officialAccount;
  final MiniProgramSdkConfigVO? miniProgram;
  final MobileAppSdkConfigVO? app;

  AppSdkConfigVO({
    this.createdAt,
    this.updatedAt,
    this.platform,
    this.officialAccount,
    this.miniProgram,
    this.app
  });
}

class MiniProgramSdkConfigVO {
  final String? appId;
  final int? timestamp;
  final String? nonceStr;
  final String? signature;
  final List<String>? jsApiList;

  MiniProgramSdkConfigVO({
    this.appId,
    this.timestamp,
    this.nonceStr,
    this.signature,
    this.jsApiList
  });
}

class MobileAppSdkConfigVO {
  final String? packageName;
  final String? version;
  final String? appKey;
  final String? pushToken;

  MobileAppSdkConfigVO({
    this.packageName,
    this.version,
    this.appKey,
    this.pushToken
  });
}

class OfficialAccountSdkConfigVO {
  final bool? debug;
  final String? appId;
  final String? timestamp;
  final String? nonceStr;
  final String? signature;
  final List<String>? jsApiList;

  OfficialAccountSdkConfigVO({
    this.debug,
    this.appId,
    this.timestamp,
    this.nonceStr,
    this.signature,
    this.jsApiList
  });
}

class PlusApiResultAppSdkConfigVO {
  final AppSdkConfigVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAppSdkConfigVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusApiKeyVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusApiKeyVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusApiKeyVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusApiKeyVO {
  final PagePlusApiKeyVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusApiKeyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusApiKeyVO {
  final List<PlusApiKeyVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusApiKeyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusAiAgentToolVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusAiAgentToolVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusAiAgentToolVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusAiAgentToolVO {
  final PagePlusAiAgentToolVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusAiAgentToolVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusAiAgentToolVO {
  final List<PlusAiAgentToolVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusAiAgentToolVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusAiAgentQueryListForm {
  final int? id;
  final String? createdAtFrom;
  final String? createdAtTo;
  final int? userId;
  final String? keyword;
  final String? status;
  final String? dataScope;

  PlusAiAgentQueryListForm({
    this.id,
    this.createdAtFrom,
    this.createdAtTo,
    this.userId,
    this.keyword,
    this.status,
    this.dataScope
  });
}

class PagePlusAiAgentVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusAiAgentVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusAiAgentVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusAiAgentVO {
  final PagePlusAiAgentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusAiAgentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusAiAgentVO {
  final List<PlusAiAgentVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusAiAgentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusAccountVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusAccountVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusAccountVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusAccountVO {
  final PagePlusAccountVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusAccountVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusAccountVO {
  final List<PlusAccountVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusAccountVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusAccountHistoryVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusAccountHistoryVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusAccountHistoryVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusAccountHistoryVO {
  final PagePlusAccountHistoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusAccountHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusAccountHistoryVO {
  final List<PlusAccountHistoryVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusAccountHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusGetAccountForm {
  final bool? loadHistory;

  PlusGetAccountForm({
    this.loadHistory
  });
}

class PlusApiResultPlusUserProfileVO {
  final PlusUserProfileVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPlusUserProfileVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusUserProfileVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final ImageMediaResource? faceImage;
  final VideoMediaResource? faceVideo;
  final String? username;
  final String? nickname;
  final String? email;
  final String? phone;
  final String? gender;
  final String? status;
  final String? countryCode;
  final String? provinceCode;
  final String? cityCode;
  final String? districtCode;
  final String? address;
  final String? bio;
  final String? birthDate;
  final SocialInfoList? socialInfoList;

  PlusUserProfileVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.faceImage,
    this.faceVideo,
    this.username,
    this.nickname,
    this.email,
    this.phone,
    this.gender,
    this.status,
    this.countryCode,
    this.provinceCode,
    this.cityCode,
    this.districtCode,
    this.address,
    this.bio,
    this.birthDate,
    this.socialInfoList
  });
}

class UserRoleKey {
  final int? userId;
  final int? roleId;

  UserRoleKey({
    this.userId,
    this.roleId
  });
}

class FileListVO {
  final List<FileItemVO>? data;
  final String? object;

  FileListVO({
    this.data,
    this.object
  });
}

class PlusApiResultFileListVO {
  final FileListVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFileListVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePlusNotesVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PlusNotesVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePlusNotesVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePlusNotesVO {
  final PagePlusNotesVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePlusNotesVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPlusNotesVO {
  final List<PlusNotesVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPlusNotesVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListString {
  final List<String>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListString({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultUserVO {
  final UserVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUserVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AppInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? version;
  final String? description;
  final int? projectId;
  final ImageMediaResource? icon;
  final AssetMediaResourceList? resourceList;
  final String? iconUrl;
  final String? accessUrl;
  final String? status;
  final String? appType;
  final AppPlatforms? platforms;
  final String? packageName;
  final String? bundleId;
  final String? storeUrl;
  final String? downloadUrl;
  final String? buildTime;
  final String? startTime;
  final String? environment;

  AppInfoVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.version,
    this.description,
    this.projectId,
    this.icon,
    this.resourceList,
    this.iconUrl,
    this.accessUrl,
    this.status,
    this.appType,
    this.platforms,
    this.packageName,
    this.bundleId,
    this.storeUrl,
    this.downloadUrl,
    this.buildTime,
    this.startTime,
    this.environment
  });
}

class PlusApiResultAppInfoVO {
  final AppInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAppInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UploadFileRequest {
  final String? file;

  UploadFileRequest({
    this.file
  });
}

class UploadFilePostRequest {
  final String? file;

  UploadFilePostRequest({
    this.file
  });
}

class CreateUploadFileRequest {
  final String? file;

  CreateUploadFileRequest({
    this.file
  });
}
