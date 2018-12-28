using System.Collections.Generic;

namespace ACM.BL
{
    public class Customer
    {
        public Customer() : this(0)
        {
            // only needed if intend to add code inside, or add extra constructors
            // :this(0) calls the constructor below to create an AddressList
        }

        public Customer(int customerId)
        {
            this.CustomerId = customerId;
            AddressList = new List<Address>();
        }

        /*
        private string _lastName;
        public string LastName 
        {
            get
            {
                return _lastName;
            }
            set 
            {
                _lastName = value;
            }
        }
        */

        // auto implemented property
        public static int InstanceCount { get; set; }
        public string LastName { get; set; }
        public string FirstName { get; set; }
        public string EmailAddress { get; set; }
        public int CustomerId { get; private set; }
        public List<Address> AddressList { get; set; }
        public int CustomerType { get; set; }

        public string FullName
        {
            get
            {
                string fullName = LastName;
                if(!string.IsNullOrWhiteSpace(FirstName))
                {
                    if(!string.IsNullOrWhiteSpace(fullName)) 
                    {
                        fullName += ", ";
                    }
                    fullName += FirstName;
                }
                return fullName;
            }
        }

        public bool Validate()
        {
            var isValid = true;

            if (string.IsNullOrWhiteSpace(LastName)) isValid = false;
            if (string.IsNullOrWhiteSpace(EmailAddress)) isValid = false;

            return isValid;
        }
    }
}
