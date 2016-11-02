private void WriteUsingXElement()
{
    var emp = 
        new XElement("Employees",
            new XElement("Employee",
            new XElement("id","99"),
            new XElement("FirstName", "Henry"),
            new XElement("LastName", "Ford")
            )
        );

    emp.Save("/App_Data/Employees.xml");
    txtResult.Text = File.ReadAllText("/App_Data/Employees.xml");
}

private void AddUsingConstructor()
{
    var xElem = XElement.Load("/App_Data/Employees.xml");

    var emp = 
        new XElement("Employee",
            new XElement("ID","99"),
            new XElement("FirstName","John"),
            new XElement("LastName","Brongo")
        );

    xElem.Add(emp);

    xElem.Save("/App_Data/Employees.xml");
    txtResult.Text = File.ReadAllText("/App_Data/Employees.xml");
}

private void AddClone()
{
    var xElem = XElement.Load("/App_Data/Employees.xml");

    // assumes at least one element exists
    // must use FirstOrDefault(), not First()
    // as we want a return value, even if is null
    var emp = (from e in xElem.Descendants("Employee")
                select e).FirstOrDefault();

    if (emp != null)
    {
        var newEmp = new XElement(emp);

        newEmp.Element("id").Value = "199";
        newEmp.Element("FirstName").Value = "Khanh";
        newEmp.Element("LastName").Value = "Vu";

        xElem.Add(newEmp);
    }
    else
    {
        var emp2 = 
            new XElement("Employee",
                new XElement("ID","199"),
                new XElement("FirstName","Khanh"),
                new XElement("LastName","Vu")
            );

        xElem.Add(emp2);
    }

    xElem.Save("/App_Data/Employees.xml");
    txtResult.Text = File.ReadAllText("/App_Data/Employees.xml");
}

private void UpdateEmployee()
{
    var xElem = XElement.Load("/App_Data/Employees.xml");

    var emp = (from e in xElem.Descendants("Employee")
                where e.Element("id").Value == "199"
                select e).SingleOrDefault();

    if (emp != null)
    {
        emp.Element("LastName").Value = "Changed Name";
    }

    xElem.Save("/App_Data/Employees.xml");
    txtResult.Text = File.ReadAllText("/App_Data/Employees.xml");
}

private void DeleteEmployee()
{
    var xElem = XElement.Load("/App_Data/Employees.xml");

    var emp = (from e in xElem.Descendants("Employee")
                where e.Element("id").Value == "199"
                select e).SingleOrDefault();

    if (emp != null)
    {
        emp.Remove();

        xElem.Save("/App_Data/Employees.xml");
    }
    txtResult.Text = File.ReadAllText("/App_Data/Employees.xml");
}