using NUnit.Framework;
using ACM.BL;

namespace ACM.BLTest
{
    [TestFixture()]
    public class CustomerTest
    {
        [Test]
        public void FullNameTestValid()
        {
            // arrange
            Customer customer = new Customer();
            customer.FirstName = "Bilbo";
            customer.LastName = "Baggins";

            string expected = "Baggins, Bilbo";

            // act
            string actual = customer.FullName;

            // assert
            Assert.AreEqual(expected, actual);
        }

        [Test]
        public void FullNameFirstNameEmpty()
        {
            // arrange
            Customer customer = new Customer();
            customer.LastName = "Baggins";

            string expected = "Baggins";

            // act
            string actual = customer.FullName;

            // assert
            Assert.AreEqual(expected, actual);
        }

        [Test]
        public void FullNameLastNameEmpty()
        {
            // arrange
            Customer customer = new Customer();
            customer.FirstName = "Bilbo";

            string expected = "Bilbo";

            // act
            string actual = customer.FullName;

            // assert
            Assert.AreEqual(expected, actual);
        }

        [Test]
        public void StaticTest() 
        {
            // arrange
            var c1 = new Customer();
            c1.FirstName = "Bilbo";
            Customer.InstanceCount += 1;

            var c2 = new Customer
            {
                FirstName = "Frodo"
            };
            Customer.InstanceCount += 1;

            var c3 = new Customer
            {
                FirstName = "Rosie"
            };
            Customer.InstanceCount += 1;

            // act

            // assert
            Assert.AreEqual(3, Customer.InstanceCount);
        }

        [Test]
        public void ValidateValid() 
        {
            var customer = new Customer
            {
                LastName = "Baggins",
                EmailAddress = "fbaggins@hobbiton.me"
            };
            var expected = true;

            var actual = customer.Validate();

            Assert.AreEqual(expected, actual);
        }

        [Test]
        public void ValidateMissingLastName() 
        {
            var customer = new Customer
            {
                EmailAddress = "fbagkajf@hohfk.com"
            };
            var expected = false;

            var actual = customer.Validate();

            Assert.AreEqual(expected, actual);
        }
    }
}
