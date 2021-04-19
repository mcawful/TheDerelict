/**
 * 
 */
package com.revature.thederelict;

import com.revature.thederelict.enums.Exit;
import com.revature.thederelict.models.Bridge;
import com.revature.thederelict.models.Engine;
import com.revature.thederelict.models.Hall;
import com.revature.thederelict.models.Lab;
import com.revature.thederelict.models.Pod;
import com.revature.thederelict.models.Room;
import com.revature.thederelict.util.NavRouter;
import com.revature.thederelict.enums.Interaction;
import com.revature.thederelict.enums.Color;

import lombok.experimental.UtilityClass;

import java.util.Scanner;
import java.io.IOException;

/**
 * @author Michael McAuliffe
 *
 */
@UtilityClass
public class MainGameLoop {

	// Scanner initialization
	Scanner sc = new Scanner(System.in);

	// Room initialization
	private Room bridge = new Bridge();
	private Room hall = new Hall();
	private Room lab = new Lab();
	private Room engine = new Engine();
	private Room pod = new Pod();
	
	// Item initialization
	private List<Interaction> unusable = new ArrayList<Interaction>(Interaction.LOOK, Interaction.L);
	private List<Interaction> pointless = new ArrayList<Interaction>(Interaction.LOOK, Interaction.L, Interaction.GET, Interaction.DROP);
	private Item halfconsole = new Item("HALFCONSOLE", "half of a console", "One half of a system console stands here, still sparking and smouldering from whatever ripped the other half off.  You won't be using that any time soon.", unusable);
	private Item comstation = new Item("COMSTATION", "a damaged workstation", "What was once the communications workstation for the ship now stands dark and unresponsive but for the flashing \"OUT OF ORDER\" indicator.", unusable);
	private Item chair = new Item("CHAIR", "a broken chair", "Toppled over and snapped at the base by whatever devastated the rest of the bridge, this formerly plush brown chair is no longer usable, the seat being badly charred, with one arm missing entirely and nothing upon which to rest.  You aren\'t certain where the rest of the chair is, but you certainly won\'t be sitting in it now.", pointless);
	private Item emergencyConsole = new Item("CONSOLE", "an emergency console", "Seeming to be one of, if not the, only operable parts of the computer system, a small emergency terminal set into the wall glows with a quiet blue light but for several red warning indicators.  You may be able to learn more about what\'s happening here.", new ArrayList<Interaction>(Interaction.LOOK, Interaction.L, Interaction.USE));
	private Item cache = new Item("CACHE", "a broken maintenance cache", "Built into one of the main walls is a maintenance cache containing several tools intended for ship repairs.  Most of them appear to be melted, damaged, or broken.", unusable);
	private Item wreckage = new Item("WRECKAGE", "smouldering wreckage", "Cut off from its source by the emergency containment barriers, a small pile of smouldering wreckage sits here, twisted beyond recognition.", unusable);
	private Item suit = new Item("SUIT", "a massive space suit", "Constructed of lightweight, durable material, this space suit appears to be one of the few things that has made it through the damage to your vessel mostly unscathed.  Of course, it also appears to have been left behind by one of the alien engineers who handled your repairs the last time you docked.  You are fairly sure this would not fit any human anatomy.", pointless);
	private Item spill = new Item("SPILL", "a chemical spill", "Viscous liquid has overtaken a section of the floor here, the stench of burned metal and a distinctly sulfuric tang to the air near it proving it to be highly dangerous, if the noxious discolouration of everything it has touched were not enough of an indicator.  It may be wise to give that a wide berth.", unusable);
	private Item glass = new Item("GLASS", "broken glass", "Thrown from one of the science stations, the shattered remains of several vials, jars, beakers, and other critical containers create dangerous shrapnel easily sharp enough to cut skin.", pointless);
	private Item terminal = new Item("TERMINAL", "a small command terminal", "Like everything else in the escape pod, this command terminal is compact and limited in functionality.  Indeed, until such time as the pod is launched, all it can do is initialize the launch sequence, once the data corruption has been dealt with.", new ArrayList<Interaction>(Interaction.LOOK, Interaction.L, Interaction.USE));

	// Key Initialization
	private List<Interaction> keyInteractions = new ArrayList<Interaction>(Interaction.LOOK, Interaction.L, Interaction.GET);
	private Item chipdeck = new Key("CHIPDECK", "a vermillion datachip deck", "This deck of vermillion datachips fills your hand and contains backups of all of the research your vessel has conducted on this venture.  Though the escape pod may technically operate without this, your vessel will have been lost for nothing if you leave it behind.", keyInteractions, 6, Color.RED);
	private Item navchip = new Key("NAVCHIP", "an orange navigation chip", "An orange datachip approximately the size of your palm containing backups of system navigation charts intended for use in emergencies.", keyInteractions, 5, Color.ORANGE);
	private Item soschip = new Key("SOSCHIP", "an aggressively yellow datachip", "Two fingers wide and three tall, this datachip is on the smaller end and might have been dangerously easy to overlook if not for its intensely, aggressively yellow colouration.  The chip contains SOS broadcasts in at least 387 known languages and on 96 communication protocols.  Of course, it is also behind on updates, so there are at least 7 new protocols it\'s missing, and you aren\'t sure how many languages.  Perhaps you should have updated that before your last launch.", keyInteractions, 3, Color.YELLOW);
	private Item commandchip = new Key("COMMANDCHIP", "a viridian command chip", "Long and narrow, this viridian green datachip is approximately the size of your index finger and is utilized by engine command consoles to monitor critical status information for the engines, allowing their safe operation.", keyInteractions, 4, Color.GREEN);
	private Item idchip = new Key("IDCHIP", "a small blue identity chip", "Scarcely larger than your pinkie tip, this diminutive, navy blue datachip contains the ship\'s system IDs - critical information for communicating with possible rescue operations.", keyInteractions, 1, Color.BLUE);
	private Item scanchip = new Key("SCANCHIP", "a violet scan chart datachip", "So bright a violet as to be nearly fuchsia, this datachip is no more than one square inch in size, but contains all of the essential black box data for your ship, including local spatial scans.  In addition to being necessary to find out what happened here, the information on this chip could prevent your escape pod from meeting the same end.  It would be wise to bring this with you.", keyInteractions, 2, Color.VIOLET);
	
	public void startGameLoop() {
		
		// Exits to the Hall
		bridge.addExit(Exit.HALL);
		pod.addExit(Exit.HALL);
		lab.addExit(Exit.HALL);
		engine.addExit(Exit.HALL);
		
		// Hall exits
		hall.addExit(Exit.BRIDGE);
		hall.addExit(Exit.POD);
		hall.addExit(Exit.LAB);
		hall.addExit(Exit.ENGINE);
		
		// Load Room objects into the NavRouter
		NavRouter.addRoom(bridge);
		NavRouter.addRoom(hall);
		NavRouter.addRoom(lab);
		NavRouter.addRoom(engine);
		NavRouter.addRoom(pod);

		// Load items into bridge
		bridge.addItem(halfconsole);
		bridge.addItem(comstation);
		bridge.addItem(chair);
		bridge.addItem(emergencyConsole);

		// Load items into hall
		hall.addItem(cache);
		hall.addItem(navchip);
		hall.addItem(idchip);
		hall.addItem(wreckage);

		// Load items into engine
		engine.addItem(wreckage);
		engine.addItem(commandchip);
		engine.addItem(halfconsole);
		engine.addItem(soschip);
		engine.addItem(suit);

		// Load items into lab
		lab.addItem(wreckage);
		lab.addItem(chipdeck);
		lab.addItem(halfconsole);
		lab.addItem(spill);
		lab.addItem(scanchip);
		lab.addItem(glass);

		// Load items into pod
		pod.addItem(terminal);
		
		// TODO: add initializers  that take place BEFORE the game loop

		System.out.printLn("\*\*BEEP BEEP BEEP BEEP\*\*");
		System.out.printLn("");
		System.out.printLn("An incessant beeping sound rouses you.  With consiousness comes the awareness first of a throbbing ache at your temple, and then of the angry red pulse of emergency lighting.");
		cont();
		System.out.printLn("");
		System.out.printLn("\"...ected.  Please identify.\"");
		System.out.printLn("");
		System.out.printLn("The artificially mild voice of the ship\'s computers drifts through the bridge, its flat affect at sharp odds with the vessel\'s obvious state of disrepair.");
		cont();
		System.out.printLn("");
		System.out.printLn("\"Lifeform detected.  Please identify.\"");
		System.out.printLn("");
		System.out.printLn("It won\'t stop asking until you answer.  Your mind is a bit fuzzy, likely due to the blow you seem to have taken to your head, but all it wants is your name.  That should be easy enough.");
		System.out.printLn("");
		System.out.printLn("What is your name?");
		String name = sc.nextLine();
		Player pc = new Player(name.trim());
		System.out.printLn("\"Confirmed.  " + pc.getName().toUpperCase() + " is advised that ship systems are damaged beyond repair.  Emergency evacuation is strongly recommended.\"");
		System.out.printLn("");
		System.out.printLn("As far as greetings go, you\'ve definitely heard better.");
		System.out.printLn("");
		System.out.printLn("Carefully, you rise to your feet and take stock of your surroundings.");

		Room currentRoom = bridge;
		
		look();

		/*
		 * Indicates if the game loop should continue
		 */
		boolean continueLoop = true;
		
		while(continueLoop) {
			String action;
			String target;
			try {
				String input = sc.nextLine();
				if (input.trim().contains(" ")) {
					ArrayList<String> wordList = new ArrayList<String>();
					for(String word : input.split(" ")) {
    					wordList.add(word);
					}
					action = wordList.getItem(0).toUpperCase();
					target = wordList.getItem(1).toUpperCase();
				}
				else {
					action = input.toUpperCase();
				}
			}
			catch (IOException e) {
			};
		}
		
		// TODO: add initializers that take place AFTER the game loop

	}

	// Press any key to continue...
	private void cont() {
		System.out.printLn("Press enter to continue...");
		try {System.in.read();}
		catch(IOException e) {
		};
	}

	private void look() {
		System.out.printLn(currentRoom.getDescription());
		System.out.printLn("");
		System.out.print("In this room, you can see ");
		for (Item i : currentRoom.getInventory()) {
			system.out.print(i.getDescShort() + ", ");
		};
		System.out.print("as well as the following exit(s):");
		System.out.printLn("");
		System.out.printLn(currentRoom.getExits());
	}

	private void look(Item i) {
		System.out.printLn(i.getDescLong());
		System.out.printLn("");
	}

	private void here() {
		System.out.printLn("Items here: ");
		for (Item i : currentRoom.getInventory()) {
			System.out.printLn(i.getId() + " : " + i.getDescShort());
		}
		System.out.printLn("");
	}
}
