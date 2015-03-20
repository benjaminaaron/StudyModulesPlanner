package studyVisuDataPrep;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class XMLreader {
	
	public XMLreader() {
	}
	
	public void doRecursiveDOM(){
		try {
			RecursiveDOM("modulkatalog02022015shortened_formatted.xml");
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}
	}
	
	
	public void RecursiveDOM(String filepath) throws SAXException, IOException, ParserConfigurationException {
		File file = new File(filepath);
		DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbfac.newDocumentBuilder();
        Document doc = docBuilder.parse(file);
        List<String> list = new ArrayList<String>();
        parse(list, doc.getDocumentElement(), 0);
        //System.out.println(list);   
	}

    private void parse(List<String> list, Element e, int depth) {
        NodeList children = e.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node n = children.item(i);
            
            if (n.getNodeType() == Node.TEXT_NODE)
            	if(n.getTextContent().trim().length() > 0)
            		System.out.println(n.getTextContent().length() + ": " + n.getTextContent());            
            
            if (n.getNodeType() == Node.ELEMENT_NODE) {
                list.add(n.getNodeName());
                System.out.println(depth + ": <" + n.getNodeName() + ">");
                parse(list, (Element) n, depth + 1);
            }
            
            
            
            
        }
    }
    
    
    
	
	public void testing() {	
		File file = new File("modulkatalog02022015shortened_formatted.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {	
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			//doc.getDocumentElement().normalize();
			
			Element root = doc.getDocumentElement();
			System.out.println("Root element " + root.getNodeName());

			NodeList modules = root.getElementsByTagName("modul");//getChildNodes();
			
			System.out.println(modules.getLength());
			
			for(int i = 0; i < modules.getLength(); i++) {
				
				System.out.println(modules.item(i).getNodeName());
				//System.out.println(modules.item(i).getChildNodes().getLength());
			}

		} catch (Exception e) {e.printStackTrace();}
	}
	
	
	

}
