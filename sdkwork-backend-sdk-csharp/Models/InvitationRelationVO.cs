using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class InvitationRelationVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? InviterUserId { get; set; }
        public int? InviteeUserId { get; set; }
        public string? InviteCode { get; set; }
        public string? UsedTime { get; set; }
        public int? RelationLevel { get; set; }
        public string? RewardStatus { get; set; }
        public double? RewardAmount { get; set; }
        public string? RewardType { get; set; }
    }
}
