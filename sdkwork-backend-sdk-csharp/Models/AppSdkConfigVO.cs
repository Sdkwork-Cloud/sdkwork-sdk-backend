using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AppSdkConfigVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Platform { get; set; }
        public OfficialAccountSdkConfigVO? OfficialAccount { get; set; }
        public MiniProgramSdkConfigVO? MiniProgram { get; set; }
        public MobileAppSdkConfigVO? App { get; set; }
    }
}
