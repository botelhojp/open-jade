package openjade.ontology;

import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Rating
* @author ontology bean generator
* @version 2013/04/13, 16:00:58
*/
public class Rating extends ASCLMessage{ 

   /**
* Protege name: term
   */
   private String term;
   public void setTerm(String value) { 
    this.term=value;
   }
   public String getTerm() {
     return this.term;
   }

   /**
* Protege name: iteration
   */
   private int iteration;
   public void setIteration(int value) { 
    this.iteration=value;
   }
   public int getIteration() {
     return this.iteration;
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
   * valor da iteração
* Protege name: value
   */
   private float value;
   public void setValue(float value) { 
    this.value=value;
   }
   public float getValue() {
     return this.value;
   }

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

}