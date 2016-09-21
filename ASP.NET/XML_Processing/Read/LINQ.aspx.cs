private void SelectXPathSingle()
{
    StringBuilder sb = new StringBuilder()
    var xElem = XElement.Load("App_Data/employees.xml");

    // get a specific employee
    var emp = xElem.XPathSelectElement("//Employee[id='1']");

    if(emp != null)
    {
        sb.AppendFormat("id={0}", emp.Element("id").Value);
        sb.AppendFormat("FirstName={0}", emp.Element("FirstName").Value);
    }
}

private void SelectLINQSingle()
{
    StringBuilder sb = new StringBuilder();
    var xElem = XElement.Load("App_Data/employees.xml");

    // get a specific employee
    var emp = (from e in xElem.Descendants("Employee")
                where e.Element("id").Value == "1"
                select e).SingleOrDefault();

    if(emp != null)
    {
        sb.AppendFormat("id={0}", emp.Element("id").Value);
    }
}

private void SelectXPathMultiple()
{
    var xElem = XElement.Load("App_Data/employees.xml");
    StringBuilder sb = new StringBuilder();

    // get all employees with lastname starting with 's'
    var emps = xElem.XPathSelectElements("//Employee[LastName[starts-with(.,'S')]]");

    foreach (var emp in emps)
    {
        sb.AppendFormat("id={0}", emp.Element("id").Value);
    }
}

private void SelectLINQMultiple()
{
    StringBuilder sb = new StringBuilder();
    var xElem = XElement.Load("App_Data/employees.xml");

    // get all employees with lastname starting with 's'
    var emps = from emp in xElem.Descendants("Employee")
                where emp.Element("LastName").Value.StartsWith("S")
                select emp;

    foreach (var emp in emps)
    {
        sb.AppendFormat("id={0}", emp.Element("id").Value);
    }
}

private void SelectNestedLINQ()
{
    // select "artist" inside "attendee" with sub nodes "entry" whose @approveStatus is "1"
    var artists = from artist in xDoc.Root.Descendants("attendee")
                from entry in artist.Elements("entry")
                where entry.Attribute("approveStatus").Value == "1"
                select artist;
}