package openjade.core.behaviours;

import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.lang.acl.ACLMessage;
import openjade.agent.TimerAgent;
import openjade.core.OpenAgent;
import openjade.ontology.OpenJadeOntology;
import openjade.ontology.ChangeIteration;

import org.apache.log4j.Logger;

public class ChangeterationBehaviour extends CyclicTimerBehaviour {

	private static final long serialVersionUID = 1L;

	protected static Logger log = Logger.getLogger(ChangeterationBehaviour.class);

	private TimerAgent myAgent;
	
	private int round = 0;

	public ChangeterationBehaviour(Agent _agent, long sleep) {
		super(_agent, sleep, 0);
		this.myAgent = (TimerAgent) _agent;
	}

	public void run() {
		round++;
		log.debug(".............. ITERATION [" + round + "] ..............");
		ACLMessage message = new ACLMessage(ACLMessage.INFORM);
		String[] services = { OpenAgent.SERVICE_TRUST_MONITOR, OpenAgent.TIMER_LISTENER };
		try {
			for (String service : services) {
				DFAgentDescription dfd = new DFAgentDescription();
				ServiceDescription sd = new ServiceDescription();
				sd.setType(service);
				dfd.addServices(sd);
				DFAgentDescription[] results = DFService.search(myAgent, dfd);
				for (DFAgentDescription result : results) {
					message.addReceiver(result.getName());
				}
			}
		} catch (FIPAException e) {
			throw new BehaviourException(e.getMessage(), e);
		}
		message.setSender(myAgent.getAID());
		ChangeIteration action = new ChangeIteration();
		action.setRound(round);
		myAgent.fillContent(message, action, myAgent.getCodec(), OpenJadeOntology.getInstance());
		myAgent.sendMessage(message);
	}
}
