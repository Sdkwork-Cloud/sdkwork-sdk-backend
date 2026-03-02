package types


type FilePermission struct {
	Permissions []string `json:"permissions"`
	ReadOnly bool `json:"readOnly"`
	PermissionSet []string `json:"permissionSet"`
}
