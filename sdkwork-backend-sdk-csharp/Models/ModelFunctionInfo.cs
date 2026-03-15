using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ModelFunctionInfo
    {
        public List<ModelFunctionItem>? Functions { get; set; }
    }
}
