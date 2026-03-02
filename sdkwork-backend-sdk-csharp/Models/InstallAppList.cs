using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class InstallAppList
    {
        public List<int>? AppIdList { get; set; }
    }
}
