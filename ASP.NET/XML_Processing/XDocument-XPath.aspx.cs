using System;
using System.Web;
using System.Web.UI;
using System.Text;
using System.Xml.Linq;
using System.Xml.XPath;

namespace XML_Processing
{

	public partial class Default : System.Web.UI.Page
	{
		public void ReadNodes(object sender, EventArgs args)
		{
			StringBuilder sb = new StringBuilder();
			XDocument xDoc = XDocument.Load("App_Data/employees.xml");

			var list = xDoc.XPathSelectElements("//Employee");   // can also use "/Employees/Employee"
			foreach (XElement entry in list)
			{
				sb.AppendFormat("id={0}", entry.Element("id").Value);
				sb.Append("<br />");
				sb.AppendFormat("FirstName={0}", entry.Element("firstName").Value);
				sb.Append("<br />");
			}
		}

		public void ReadAllNodes(object sender, EventArgs args) 
		{
			StringBuilder sb = new StringBuilder();
			XDocument xDoc = XDocument.Load("App_Data/employees.xml");

			var list = xDoc.XPathSelectElements("//Employee");
			foreach (XElement entry in list) 
			{
				sb.AppendFormat("{0}<br />", entry.Name);
				foreach (XElement item in entry.Elements()) 
				{
					sb.AppendFormat("{0}, {1} <br />", item.Name, entry.Element(item.Name).Value);
				}
			}
		}

		public void GetAttributes(object sender, EventArgs args) 
		{
			StringBuilder sb = new StringBuilder();
			XDocument xDoc;

			xDoc = XDocument.Load("App_Data/employeesAttributes.xml");

			var list = xDoc.XPathSelectElements("//Employee");
			foreach (XElement entry in list) 
			{
				sb.AppendFormat("id = {0} <br />", entry.Attribute("id").Value);
				sb.AppendFormat("First Name = {0} <br />", entry.Element("firstName").Value);
			}
		}

		public void FindByAttribute(object sender, EventArgs args) 
		{
			StringBuilder sb = new StringBuilder();
			XDocument xDoc = XDocument.Load("App_Data/employeesAttributes.xml");

			var entry = xDoc.XPathSelectElement("//Employee[@id='2']");
			foreach (XElement child in entry.Elements()) 
			{
				 sb.AppendFormat("{0} - {1} <br />", child.Name, child.Value);
			}

			// select all nodes with id='2'
			/*
			var list = xDoc.XPathSelectElements("//Employee[@id='2']");
			foreach (XElement entry in list) 
			{
				foreach (XElement item in entry.Elements()) 
				{
					sb.AppendFormat("{0}-{1} <br />", item.Name, item.Value);
				}
			}
			*/
		}

	}
}
