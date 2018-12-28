using NUnit.Framework;
using System;
using ACM.BL;
using System.Linq.Expressions;
using System.Collections.Generic;

namespace ACM.BLTest
{
    [TestFixture()]
    public class CustomerRepositoryTest
    {
        [Test()]
        public void RetrieveExisting()
        {
            var customerRepository = new CustomerRepository();
            var expected = new Customer(1)
            {
                EmailAddress = "fbaggins@hobbiton.me",
                FirstName = "Frodo",
                LastName = "Baggins"
            };

            var actual = customerRepository.Retrieve(1);

            Assert.AreEqual(expected.CustomerId, actual.CustomerId);
        }

        [Test]
        public void RetrieveExistingWithAddress() 
        {
            var customerRepository = new CustomerRepository();
            var expeected = new Customer(1)
            {
                EmailAddress = "fbaggins@hobbiton.me",
                FirstName = "Frodo",
                LastName = "Baggins",
                AddressList = new List<Address>() 
                {
                    new Address()
                    {
                         AddressType = 1,
                        StreetLine1 = "Bag End",
                        StreetLine2 = "Bagshot row",
                        City = "Hobbiton",
                        State = "Shire",
                        Country = "Middle Earth",
                        PostalCode = "144"
                    },
                    new Address()
                    {
                        AddressType = 2,
                        StreetLine1 = "Green Dragon",
                        City = "Bywater",
                        State = "Shire",
                        Country = "Middle Earth",
                        PostalCode = "146"
                    }
                }
            };

            var actual = customerRepository.Retrieve(1);

            Assert.AreEqual(expeected.CustomerId, actual.CustomerId);
            Assert.AreEqual(expeected.EmailAddress, actual.EmailAddress);
            Assert.AreEqual(expeected.FirstName, actual.FirstName);
            Assert.AreEqual(expeected.LastName, actual.LastName);

            for (int i = 0; i < 1; i++)
            {
                Assert.AreEqual(expeected.AddressList[i].AddressType, actual.AddressList[i].AddressType);
                Assert.AreEqual(expeected.AddressList[i].StreetLine1, actual.AddressList[i].StreetLine1);
            }
        }
    }
}
