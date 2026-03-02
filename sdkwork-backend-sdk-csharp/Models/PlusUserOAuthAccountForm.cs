using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusUserOAuthAccountForm
    {
        public int? UserId { get; set; }
        public string? OauthProvider { get; set; }
        public string? OpenId { get; set; }
        public string? UnionId { get; set; }
        public string? AppId { get; set; }
        public int? ChannelAccountId { get; set; }
        public string? AccessTokenExpiresAt { get; set; }
    }
}
