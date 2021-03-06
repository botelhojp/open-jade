package openjade.ontology;

import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Rating
* @author ontology bean generator
* @version 2016/10/3, 23:54:47
*/
public class Rating extends ACLMessage{ 

   /**
* Protege name: client
   */
   private AID client;
   public void setClient(AID value) { 
    this.client=value;
   }
   public AID getClient() {
     return this.client;
   }

   /**
* Protege name: server
   */
   private AID server;
   public void setServer(AID value) { 
    this.server=value;
   }
   public AID getServer() {
     return this.server;
   }

   /**
* Protege name: round
   */
   private int round;
   public void setRound(int value) { 
    this.round=value;
   }
   public int getRound() {
     return this.round;
   }

   /**
* Protege name: index
   */
   private int index;
   public void setIndex(int value) { 
    this.index=value;
   }
   public int getIndex() {
     return this.index;
   }

   /**
   * valor da iteração
* Protege name: value
   */
   private String value;
   public void setValue(String value) { 
    this.value=value;
   }
   public String getValue() {
     return this.value;
   }

   /**
* Protege name: attributes
   */
   private List attributes = new ArrayList();
   public void addAttributes(RatingAttribute elem) { 
     List oldList = this.attributes;
     attributes.add(elem);
   }
   public boolean removeAttributes(RatingAttribute elem) {
     List oldList = this.attributes;
     boolean result = attributes.remove(elem);
     return result;
   }
   public void clearAllAttributes() {
     List oldList = this.attributes;
     attributes.clear();
   }
   public Iterator getAllAttributes() {return attributes.iterator(); }
   public List getAttributes() {return attributes; }
   public void setAttributes(List l) {attributes = l; }

}
