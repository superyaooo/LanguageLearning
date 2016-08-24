private void SimpleWritingVerbose()
{
    XDocument xd;
    XElement root;
    XElement child;
    XElement child2;

    xd = new XDocument(
            new XDeclaration("1.0", "utf-8", "yes"),
            new XComment("Employee Records"),
            new XElement("Employees"));

    root = xd.XPathSelectElement("//Employees");

    child = new XElement("Employee");
    root.Add(child);
    child2 = new XElement("id", 1);
    child.Add(child2);
    child2 =  new XElement("FirstName", "Bob");
    child.Add(child2);

    xd.Save("Sample/Employees.xml");
}

private void SimpleWriting()
{
    XDocument xd;
    XElement root;
    XElement child;

    xd = new XDocument(
            new XDeclaration("1.0", "utf-8", "yes"),
            new XComment("Employee Records"),
            new XElement("Employees"));

    root = xd.XPathSelectElement("//Employees");

    child = new XElement("Employee",
                new XElement("id", 1),
                new XElement("FirstName", "Bob"),
                new XElement("LastName", "Doe"));

    root.Add(child);
    xd.Save("Sample/Employees.xml");
}

private void WriteAttributes()
{
    XDocument xd;
    XElement root;
    XElement child;

    xd = new XDocument(
            new XDeclaration("1.0", "utf-8", "yes"),
            new XComment("Employee Records"),
            new XElement("Employees"));

    root = xd.XPathSelectElement("//Employees");

    child = new XElement("Employee",
            new XAttribute("id", 1),
            new XElement("FirstName", "Bob"),
            new XElement("LastName", "Doe"));

    root.Add(child);
    xd.Save("Sample/Employees.xml");
}

private void NoFormatting()
{
    XDocument xd;
    XElement root;
    XElement child;

    xd = new XDocument(
            new XDeclaration("1.0", "utf-8", "yes"),
            new XComment("Employee Records"),
            new XElement("Employees"));

    root = xd.XPathSelectElement("//Employees");

    child = new XElement("Employee",
            new XAttribute("id", 1),
            new XElement("FirstName", "Bob"),
            new XElement("LastName", "Doe"));
    
    root.Add(child);
    xd.Save("Sample/Employees.xml", SaveOptions.DisableFormatting);
}