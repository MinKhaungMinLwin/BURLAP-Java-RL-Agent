package project;

import burlap.shell.visual.VisualExplorer;
import burlap.mdp.singleagent.SADomain;
import burlap.domain.singleagent.gridworld.GridWorldDomain;
import burlap.domain.singleagent.gridworld.GridWorldVisualizer;
import burlap.domain.singleagent.gridworld.state.GridWorldState;
import burlap.domain.singleagent.gridworld.state.GridLocation;
import burlap.domain.singleagent.gridworld.state.GridAgent;
import burlap.mdp.core.state.State;
import burlap.visualizer.Visualizer;


public class HelloWorld {
    public static void main(String[] args) {
        // 11x11 grid world
        GridWorldDomain gridworld = new GridWorldDomain(11, 11);
        gridworld.setMapToFourRooms();
        gridworld.setProbSucceedTransitionDynamics(0.9);

        // Create domain
        SADomain sad = gridworld.generateDomain();

        // Initial state
        State st = new GridWorldState(new GridAgent(0, 0), new GridLocation(10, 10, "loc0"));

        // Visualizer
        Visualizer vis = GridWorldVisualizer.getVisualizer(gridworld.getMap());
        VisualExplorer ve = new VisualExplorer(sad, vis, st);

        // Key mappings
        ve.addKeyAction("a", GridWorldDomain.ACTION_WEST, "");
        ve.addKeyAction("w", GridWorldDomain.ACTION_NORTH, "");
        ve.addKeyAction("d", GridWorldDomain.ACTION_EAST, "");
        ve.addKeyAction("s", GridWorldDomain.ACTION_SOUTH, "");

        // Start GUI
        ve.initGUI();
    }
}