using System;
namespace ACM.BL
{
    public enum EntityStateOption
    {
        Activate,
        Deleted
    }

    public abstract class EntityBase
    {
        public EntityStateOption EntityState { get; set; }
        public bool HasChanges { get; set; }
        public bool IsNew { get; private set; }
        public bool IsValid
        {
            get
            {
                return Validate();
            }
        }

        public abstract bool Validate();
    }
}
