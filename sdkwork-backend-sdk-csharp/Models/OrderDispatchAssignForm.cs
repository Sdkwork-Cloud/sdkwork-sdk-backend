using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OrderDispatchAssignForm
    {
        public int? WorkerUserId { get; set; }
        public string? Remark { get; set; }
    }
}
